package org.group06.utils;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import org.group06.db.DatabaseConstant;
import org.group06.db.dao.DAO_ChiTietHoaDon;
import org.group06.db.dao.DAO_ChiTietPhieuDat;
import org.group06.model.entity.ChiTietHoaDon;
import org.group06.model.entity.ChiTietPhieuDat;
import org.group06.model.entity.HoaDon;
import org.group06.model.entity.PhieuDat;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class PdfCreator {

    /**
     * Tạo pdf hoá đơn bán hàng
     *
     * @param hoaDon hoá đơn bán hàng cần tạo pdf
     * @param path   đường dẫn lưu file pdf
     * @throws DocumentException
     * @throws IOException
     */
    public static void createInvoice(HoaDon hoaDon, String path) throws DocumentException, IOException {
        ArrayList<ChiTietHoaDon> dsQuanAo = new DAO_ChiTietHoaDon(DatabaseConstant.getConnection()).getAllCTQA(hoaDon.getMaHoaDon());
        double tongTien = 0;
        double VAT = 0.08;
        double khuyenMai = hoaDon.getKhuyenMai() != null ? hoaDon.getKhuyenMai().getMucGiamGia() / 100 : 0;

        // Kích thước trang A4
        float pageWidth = PageSize.A4.getWidth();
        float pageHeight = PageSize.A4.getHeight();
        Rectangle pageSize = new Rectangle(pageWidth, pageHeight);

        // Tạo đối tượng Document với kích thước trang tùy chỉnh
        Document document = new Document();

        // Tạo đường dẫn đến file PDF
        String newFilePath = path; // Tên tệp mới

        File file = new File(newFilePath);
        int counter = 1; // Bắt đầu với số 1

        // Kiểm tra xem tệp đã tồn tại hay chưa
        if (file.exists()) {
            while (file.exists()) {
                // Tạo tên tệp mới với số thứ tự tăng dần trong ngoặc ()
                newFilePath = path.replaceFirst("(\\.pdf)?$", " (" + counter + ").pdf");
                file = new File(newFilePath);
                counter++;
            }
        } else {
            // Tạo file pdf mới
            file = new File(newFilePath);
        }

        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(file.getPath()));
        document.open();

        // Cài đặt font Times New Roman
        BaseFont baseFont = BaseFont.createFont("src/main/resources/font/times.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);

        Font companyFont = new Font(baseFont, 14, Font.BOLD);
        Font codeFont = new Font(baseFont, 10, Font.BOLD);
        Font nameFont = new Font(baseFont, 10);
        Font dateFont = new Font(baseFont, 8, Font.ITALIC);

        // Thêm tên công ty và logo vào file PDF
        String companyName = "Cửa Hàng Thời Trang AM";
        Paragraph company = new Paragraph(companyName, companyFont);
        company.setAlignment(Element.ALIGN_CENTER);
        document.add(company);

        // Tạo title
        String titlePart = "Hoá Đơn Bán Hàng";
        Paragraph title = new Paragraph(titlePart, companyFont);
        title.setAlignment(Element.ALIGN_CENTER);
        document.add(title);

        // Tạo mã hóa đơn
        Chunk labelChunk = new Chunk("Hoá đơn số:  ", codeFont);
        labelChunk.setFont(new Font(codeFont.getBaseFont(), codeFont.getSize(), Font.BOLD, BaseColor.RED));
        Paragraph code = new Paragraph(labelChunk);
        Chunk codeChunk = new Chunk(hoaDon.getMaHoaDon(), codeFont);
        codeChunk.setCharacterSpacing(2);
        codeChunk.setFont(new Font(codeFont.getBaseFont(), codeFont.getSize(), Font.BOLD, BaseColor.RED));
        code.add(codeChunk);
        code.setAlignment(Element.ALIGN_CENTER);
        document.add(code);

        // Thêm khách hàng
        Paragraph name = new Paragraph("Khách hàng: " + (hoaDon.getKhachHang() != null ? hoaDon.getKhachHang().getTenKH() : "Khách vãng lai"), nameFont);
        name.setAlignment(Element.ALIGN_LEFT);
        document.add(name);

        // Thêm ngày lập hoá đơn
        Paragraph date = new Paragraph("Ngày lập hoá đơn: " + DateStandard.formatDate(hoaDon.getNgayTao()), dateFont);
        date.setAlignment(Element.ALIGN_LEFT);
        document.add(date);

        // Thêm ngày in hoá đơn
        Paragraph datePrint = new Paragraph("Ngày in hoá đơn: " + DateStandard.formatDate(DateStandard.getNgayHienTai()), dateFont);
        datePrint.setAlignment(Element.ALIGN_LEFT);
        document.add(datePrint);

        // Thêm bảng chi tiết hoá đơn gồm Tên Quần Áo, Đơn Giá, Số Lượng, Thành Tiền
        PdfPTable table = new PdfPTable(7);
        table.setWidthPercentage(100);
        table.setSpacingBefore(10f);
        table.setSpacingAfter(10f);

        // Thêm tiêu đề cho bảng
        Chunk maQA = new Chunk("Mã Quần Áo", nameFont);
        maQA.setFont(new Font(nameFont.getBaseFont(), nameFont.getSize(), Font.BOLD, BaseColor.RED));
        PdfPCell cellMaQA = new PdfPCell(new Phrase(maQA));
        cellMaQA.setHorizontalAlignment(Element.ALIGN_LEFT);

        Chunk tenQA = new Chunk("Tên Quần Áo", nameFont);
        tenQA.setFont(new Font(nameFont.getBaseFont(), nameFont.getSize(), Font.BOLD, BaseColor.RED));
        PdfPCell cellTenQA = new PdfPCell(new Phrase(tenQA));
        cellTenQA.setColspan(3);
        cellTenQA.setHorizontalAlignment(Element.ALIGN_LEFT);

        Chunk donGia = new Chunk("Đơn Giá", nameFont);
        donGia.setFont(new Font(nameFont.getBaseFont(), nameFont.getSize(), Font.BOLD, BaseColor.RED));
        PdfPCell cellDonGia = new PdfPCell(new Phrase(donGia));
        cellDonGia.setHorizontalAlignment(Element.ALIGN_RIGHT);

        Chunk soLuong = new Chunk("Số Lượng", nameFont);
        soLuong.setFont(new Font(nameFont.getBaseFont(), nameFont.getSize(), Font.BOLD, BaseColor.RED));
        PdfPCell cellSoLuong = new PdfPCell(new Phrase(soLuong));
        cellSoLuong.setHorizontalAlignment(Element.ALIGN_CENTER);

        Chunk thanhTien = new Chunk("Thành Tiền", nameFont);
        thanhTien.setFont(new Font(nameFont.getBaseFont(), nameFont.getSize(), Font.BOLD, BaseColor.RED));
        PdfPCell cellThanhTien = new PdfPCell(new Phrase(thanhTien));
        cellThanhTien.setHorizontalAlignment(Element.ALIGN_RIGHT);

        table.addCell(cellMaQA);
        table.addCell(cellTenQA);
        table.addCell(cellDonGia);
        table.addCell(cellSoLuong);
        table.addCell(cellThanhTien);

        // Thêm dữ liệu cho bảng
        for (ChiTietHoaDon item : dsQuanAo) {
            Chunk maQAChunk = new Chunk(item.getQuanAo().getMaQA(), nameFont);
            PdfPCell cellMaQAChunk = new PdfPCell(new Phrase(maQAChunk));
            cellMaQAChunk.setHorizontalAlignment(Element.ALIGN_LEFT);

            Chunk tenQAChunk = new Chunk(item.getQuanAo().getTenQA(), nameFont);
            PdfPCell cellTenQAChunk = new PdfPCell(new Phrase(tenQAChunk));
            cellTenQAChunk.setColspan(3);
            cellTenQAChunk.setHorizontalAlignment(Element.ALIGN_LEFT);

            Chunk donGiaChunk = new Chunk(NumberStandard.formatMoney(item.getGiaBan(), false), nameFont);
            PdfPCell cellDonGiaChunk = new PdfPCell(new Phrase(donGiaChunk));
            cellDonGiaChunk.setHorizontalAlignment(Element.ALIGN_RIGHT);

            Chunk soLuongChunk = new Chunk(String.valueOf(item.getSoLuong()), nameFont);
            PdfPCell cellSoLuongChunk = new PdfPCell(new Phrase(soLuongChunk));
            cellSoLuongChunk.setHorizontalAlignment(Element.ALIGN_CENTER);

            double valueThanhTien = item.getGiaBan() * item.getSoLuong();
            tongTien += valueThanhTien;

            Chunk thanhTienChunk = new Chunk(NumberStandard.formatMoney(valueThanhTien, false), nameFont);
            PdfPCell cellThanhTienChunk = new PdfPCell(new Phrase(thanhTienChunk));
            cellThanhTienChunk.setHorizontalAlignment(Element.ALIGN_RIGHT);

            table.addCell(cellMaQAChunk);
            table.addCell(cellTenQAChunk);
            table.addCell(cellDonGiaChunk);
            table.addCell(cellSoLuongChunk);
            table.addCell(cellThanhTienChunk);
        }

        // Thêm dòng tổng tiền
        Chunk tongTienChunk = new Chunk("Tổng Tiền: ", nameFont);
        tongTienChunk.setFont(new Font(nameFont.getBaseFont(), nameFont.getSize(), Font.BOLD, BaseColor.RED));
        PdfPCell cellTongTienChunk = new PdfPCell(new Phrase(tongTienChunk));
        cellTongTienChunk.setHorizontalAlignment(Element.ALIGN_RIGHT);
        cellTongTienChunk.setColspan(6);
        // Không vẽ border
        cellTongTienChunk.setBorder(Rectangle.NO_BORDER);
        table.addCell(cellTongTienChunk);

        Chunk tongTienValueChunk = new Chunk(NumberStandard.formatMoney(tongTien, false), nameFont);
        PdfPCell cellTongTienValueChunk = new PdfPCell(new Phrase(tongTienValueChunk));
        cellTongTienValueChunk.setHorizontalAlignment(Element.ALIGN_RIGHT);
        // Không vẽ border
        cellTongTienValueChunk.setBorder(Rectangle.NO_BORDER);
        table.addCell(cellTongTienValueChunk);

        // Thêm dòng thuế VAT
        Chunk VATChunk = new Chunk("Thuế VAT: ", nameFont);
        VATChunk.setFont(new Font(nameFont.getBaseFont(), nameFont.getSize(), Font.BOLD, BaseColor.RED));
        PdfPCell cellVATChunk = new PdfPCell(new Phrase(VATChunk));
        cellVATChunk.setHorizontalAlignment(Element.ALIGN_RIGHT);
        cellVATChunk.setColspan(6);
        // Không vẽ border
        cellVATChunk.setBorder(Rectangle.NO_BORDER);
        table.addCell(cellVATChunk);

        Chunk VATValueChunk = new Chunk(NumberStandard.formatMoney(tongTien * VAT, false), nameFont);
        PdfPCell cellVATValueChunk = new PdfPCell(new Phrase(VATValueChunk));
        cellVATValueChunk.setHorizontalAlignment(Element.ALIGN_RIGHT);
        // Không vẽ border
        cellVATValueChunk.setBorder(Rectangle.NO_BORDER);
        table.addCell(cellVATValueChunk);

        // Thêm dòng khuyến mãi
        Chunk khuyenMaiChunk = new Chunk("Khuyến Mãi: ", nameFont);
        khuyenMaiChunk.setFont(new Font(nameFont.getBaseFont(), nameFont.getSize(), Font.BOLD, BaseColor.RED));
        PdfPCell cellKhuyenMaiChunk = new PdfPCell(new Phrase(khuyenMaiChunk));
        cellKhuyenMaiChunk.setHorizontalAlignment(Element.ALIGN_RIGHT);
        cellKhuyenMaiChunk.setColspan(6);
        // Không vẽ border
        cellKhuyenMaiChunk.setBorder(Rectangle.NO_BORDER);
        table.addCell(cellKhuyenMaiChunk);

        Chunk khuyenMaiValueChunk = new Chunk(NumberStandard.formatMoney(tongTien * khuyenMai, false), nameFont);
        PdfPCell cellKhuyenMaiValueChunk = new PdfPCell(new Phrase(khuyenMaiValueChunk));
        cellKhuyenMaiValueChunk.setHorizontalAlignment(Element.ALIGN_RIGHT);
        // Không vẽ border
        cellKhuyenMaiValueChunk.setBorder(Rectangle.NO_BORDER);
        table.addCell(cellKhuyenMaiValueChunk);

        // Thêm dòng thành tiền
        Chunk thanhTienChunk = new Chunk("Thành Tiền: ", nameFont);
        thanhTienChunk.setFont(new Font(nameFont.getBaseFont(), nameFont.getSize(), Font.BOLD, BaseColor.RED));
        PdfPCell cellThanhTienChunk = new PdfPCell(new Phrase(thanhTienChunk));
        cellThanhTienChunk.setHorizontalAlignment(Element.ALIGN_RIGHT);
        cellThanhTienChunk.setColspan(6);
        // Không vẽ border
        cellThanhTienChunk.setBorder(Rectangle.NO_BORDER);
        table.addCell(cellThanhTienChunk);

        Chunk thanhTienValueChunk = new Chunk(NumberStandard.formatMoney((tongTien * (1 + VAT)) * (1 - khuyenMai), false), nameFont);
        PdfPCell cellThanhTienValueChunk = new PdfPCell(new Phrase(thanhTienValueChunk));
        cellThanhTienValueChunk.setHorizontalAlignment(Element.ALIGN_RIGHT);
        // Không vẽ border
        cellThanhTienValueChunk.setBorder(Rectangle.NO_BORDER);
        table.addCell(cellThanhTienValueChunk);

        document.add(table);

        // Add Footer to the document
        Paragraph footer = new Paragraph();
        footer.setAlignment(Element.ALIGN_BOTTOM);

        // Thêm separator vào footer
        Paragraph separator = new Paragraph("————————▼————————");
        separator.setAlignment(Element.ALIGN_CENTER);
        separator.setSpacingBefore(10f);
        footer.add(separator);

        // Thêm lời cảm ơn vào footer
        Paragraph thankParagraph = new Paragraph("Cảm ơn quý khách đã sử dụng dịch vụ của chúng tôi!", nameFont);
        thankParagraph.setFont(new Font(nameFont.getBaseFont(), nameFont.getSize(), Font.BOLD, BaseColor.RED));
        thankParagraph.setAlignment(Element.ALIGN_CENTER);
        footer.add(thankParagraph);

        document.add(footer);
        document.close();
    }

    /**
     * Tạo pdf phiếu đặt hàng
     *
     * @param phieuDat phiếu đặt hàng cần tạo pdf
     * @param path     đường dẫn lưu file pdf
     * @throws DocumentException
     * @throws IOException
     */
    public static void createOrder(PhieuDat phieuDat, String path) throws DocumentException, IOException {
        ArrayList<ChiTietPhieuDat> dsQuanAo = new DAO_ChiTietPhieuDat(DatabaseConstant.getConnection()).getAllByID(phieuDat.getMaPhieuDat());
        double tongTien = 0;
        double VAT = 0.08;
        double khuyenMai = phieuDat.getKhuyenMai() != null ? phieuDat.getKhuyenMai().getMucGiamGia() / 100 : 0;

        // Kích thước trang A4
        float pageWidth = PageSize.A4.getWidth();
        float pageHeight = PageSize.A4.getHeight();
        Rectangle pageSize = new Rectangle(pageWidth, pageHeight);

        // Tạo đối tượng Document với kích thước trang tùy chỉnh
        Document document = new Document();

        // Tạo đường dẫn đến file PDF
        String newFilePath = path; // Tên tệp mới

        File file = new File(newFilePath);
        int counter = 1; // Bắt đầu với số 1

        // Kiểm tra xem tệp đã tồn tại hay chưa
        if (file.exists()) {
            while (file.exists()) {
                // Tạo tên tệp mới với số thứ tự tăng dần trong ngoặc ()
                newFilePath = path.replaceFirst("(\\.pdf)?$", " (" + counter + ").pdf");
                file = new File(newFilePath);
                counter++;
            }
        } else {
            file = new File(newFilePath);
        }

        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(file.getPath()));
        document.open();

        // Cài đặt font Times New Roman
        BaseFont baseFont = BaseFont.createFont("src/main/resources/font/times.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);

        Font companyFont = new Font(baseFont, 14, Font.BOLD);
        Font codeFont = new Font(baseFont, 10, Font.BOLD);
        Font nameFont = new Font(baseFont, 10);
        Font dateFont = new Font(baseFont, 8, Font.ITALIC);

        // Thêm tên công ty và logo vào file PDF
        String companyName = "Cửa Hàng Thời Trang AM";
        Paragraph company = new Paragraph(companyName, companyFont);
        company.setAlignment(Element.ALIGN_CENTER);
        document.add(company);

        // Tạo title
        String titlePart = "Phiếu Xác Nhận Đặt Hàng";
        Paragraph title = new Paragraph(titlePart, companyFont);
        title.setAlignment(Element.ALIGN_CENTER);
        document.add(title);

        // Tạo mã hóa đơn
        Chunk labelChunk = new Chunk("Phiếu đặt hàng số:  ", codeFont);
        labelChunk.setFont(new Font(codeFont.getBaseFont(), codeFont.getSize(), Font.BOLD, BaseColor.RED));
        Paragraph code = new Paragraph(labelChunk);
        Chunk codeChunk = new Chunk(phieuDat.getMaPhieuDat(), codeFont);
        codeChunk.setCharacterSpacing(2);
        codeChunk.setFont(new Font(codeFont.getBaseFont(), codeFont.getSize(), Font.BOLD, BaseColor.RED));
        code.add(codeChunk);
        code.setAlignment(Element.ALIGN_CENTER);
        document.add(code);

        // Thêm khách hàng
        Paragraph name = new Paragraph("Khách hàng: " + phieuDat.getKhachHang().getTenKH(), nameFont);
        name.setAlignment(Element.ALIGN_LEFT);
        document.add(name);

        // Thêm ngày lập phiếu đặt
        Paragraph date = new Paragraph("Ngày lập phiếu đặt hàng: " + DateStandard.formatDate(phieuDat.getNgayTao()), dateFont);
        date.setAlignment(Element.ALIGN_LEFT);
        document.add(date);

        // Thêm ngày in phiếu đặt
        Paragraph datePrint = new Paragraph("Ngày in phiếu đặt hàng: " + DateStandard.formatDate(DateStandard.getNgayHienTai()), dateFont);
        datePrint.setAlignment(Element.ALIGN_LEFT);
        document.add(datePrint);

        // Thêm ngày nhận hàng
        Paragraph dateReceive = new Paragraph("Ngày hẹn nhận hàng: " + DateStandard.formatDate(phieuDat.getNgayNhan()), dateFont);
        dateReceive.setAlignment(Element.ALIGN_LEFT);
        document.add(dateReceive);

        // Thêm bảng chi tiết phiếu đặt gồm Tên Quần Áo, Đơn Giá, Số Lượng, Thành Tiền
        PdfPTable table = new PdfPTable(7);
        table.setWidthPercentage(100);
        table.setSpacingBefore(10f);
        table.setSpacingAfter(10f);

        // Thêm tiêu đề cho bảng
        Chunk maQA = new Chunk("Mã Quần Áo", nameFont);
        maQA.setFont(new Font(nameFont.getBaseFont(), nameFont.getSize(), Font.BOLD, BaseColor.RED));
        PdfPCell cellMaQA = new PdfPCell(new Phrase(maQA));
        cellMaQA.setHorizontalAlignment(Element.ALIGN_LEFT);

        Chunk tenQA = new Chunk("Tên Quần Áo", nameFont);
        tenQA.setFont(new Font(nameFont.getBaseFont(), nameFont.getSize(), Font.BOLD, BaseColor.RED));
        PdfPCell cellTenQA = new PdfPCell(new Phrase(tenQA));
        cellTenQA.setColspan(3);
        cellTenQA.setHorizontalAlignment(Element.ALIGN_LEFT);

        Chunk donGia = new Chunk("Đơn Giá", nameFont);
        donGia.setFont(new Font(nameFont.getBaseFont(), nameFont.getSize(), Font.BOLD, BaseColor.RED));
        PdfPCell cellDonGia = new PdfPCell(new Phrase(donGia));
        cellDonGia.setHorizontalAlignment(Element.ALIGN_RIGHT);

        Chunk soLuong = new Chunk("Số Lượng", nameFont);
        soLuong.setFont(new Font(nameFont.getBaseFont(), nameFont.getSize(), Font.BOLD, BaseColor.RED));
        PdfPCell cellSoLuong = new PdfPCell(new Phrase(soLuong));
        cellSoLuong.setHorizontalAlignment(Element.ALIGN_CENTER);

        Chunk thanhTien = new Chunk("Thành Tiền", nameFont);
        thanhTien.setFont(new Font(nameFont.getBaseFont(), nameFont.getSize(), Font.BOLD, BaseColor.RED));
        PdfPCell cellThanhTien = new PdfPCell(new Phrase(thanhTien));
        cellThanhTien.setHorizontalAlignment(Element.ALIGN_RIGHT);

        table.addCell(cellMaQA);
        table.addCell(cellTenQA);
        table.addCell(cellDonGia);
        table.addCell(cellSoLuong);
        table.addCell(cellThanhTien);

        // Thêm dữ liệu cho bảng
        for (ChiTietPhieuDat item : dsQuanAo) {
            Chunk maQAChunk = new Chunk(item.getQuanAo().getMaQA(), nameFont);
            PdfPCell cellMaQAChunk = new PdfPCell(new Phrase(maQAChunk));
            cellMaQAChunk.setHorizontalAlignment(Element.ALIGN_LEFT);

            Chunk tenQAChunk = new Chunk(item.getQuanAo().getTenQA(), nameFont);
            PdfPCell cellTenQAChunk = new PdfPCell(new Phrase(tenQAChunk));
            cellTenQAChunk.setColspan(3);
            cellTenQAChunk.setHorizontalAlignment(Element.ALIGN_LEFT);

            Chunk donGiaChunk = new Chunk(NumberStandard.formatMoney(item.getGiaBan(), false), nameFont);
            PdfPCell cellDonGiaChunk = new PdfPCell(new Phrase(donGiaChunk));
            cellDonGiaChunk.setHorizontalAlignment(Element.ALIGN_RIGHT);

            Chunk soLuongChunk = new Chunk(String.valueOf(item.getSoLuong()), nameFont);
            PdfPCell cellSoLuongChunk = new PdfPCell(new Phrase(soLuongChunk));
            cellSoLuongChunk.setHorizontalAlignment(Element.ALIGN_CENTER);

            double valueThanhTien = item.getGiaBan() * item.getSoLuong();
            tongTien += valueThanhTien;

            Chunk thanhTienChunk = new Chunk(NumberStandard.formatMoney(valueThanhTien, false), nameFont);
            PdfPCell cellThanhTienChunk = new PdfPCell(new Phrase(thanhTienChunk));
            cellThanhTienChunk.setHorizontalAlignment(Element.ALIGN_RIGHT);

            table.addCell(cellMaQAChunk);
            table.addCell(cellTenQAChunk);
            table.addCell(cellDonGiaChunk);
            table.addCell(cellSoLuongChunk);
            table.addCell(cellThanhTienChunk);
        }

        // Thêm dòng tổng tiền
        Chunk tongTienChunk = new Chunk("Tổng Tiền: ", nameFont);
        tongTienChunk.setFont(new Font(nameFont.getBaseFont(), nameFont.getSize(), Font.BOLD, BaseColor.RED));
        PdfPCell cellTongTienChunk = new PdfPCell(new Phrase(tongTienChunk));
        cellTongTienChunk.setHorizontalAlignment(Element.ALIGN_RIGHT);
        cellTongTienChunk.setColspan(6);
        // Không vẽ border
        cellTongTienChunk.setBorder(Rectangle.NO_BORDER);
        table.addCell(cellTongTienChunk);

        Chunk tongTienValueChunk = new Chunk(NumberStandard.formatMoney(tongTien, false), nameFont);
        PdfPCell cellTongTienValueChunk = new PdfPCell(new Phrase(tongTienValueChunk));
        cellTongTienValueChunk.setHorizontalAlignment(Element.ALIGN_RIGHT);
        // Không vẽ border
        cellTongTienValueChunk.setBorder(Rectangle.NO_BORDER);
        table.addCell(cellTongTienValueChunk);

        // Thêm dòng thuế VAT
        Chunk VATChunk = new Chunk("Thuế VAT: ", nameFont);
        VATChunk.setFont(new Font(nameFont.getBaseFont(), nameFont.getSize(), Font.BOLD, BaseColor.RED));
        PdfPCell cellVATChunk = new PdfPCell(new Phrase(VATChunk));
        cellVATChunk.setHorizontalAlignment(Element.ALIGN_RIGHT);
        cellVATChunk.setColspan(6);
        // Không vẽ border
        cellVATChunk.setBorder(Rectangle.NO_BORDER);
        table.addCell(cellVATChunk);

        Chunk VATValueChunk = new Chunk(NumberStandard.formatMoney(tongTien * VAT, false), nameFont);
        PdfPCell cellVATValueChunk = new PdfPCell(new Phrase(VATValueChunk));
        cellVATValueChunk.setHorizontalAlignment(Element.ALIGN_RIGHT);
        // Không vẽ border
        cellVATValueChunk.setBorder(Rectangle.NO_BORDER);
        table.addCell(cellVATValueChunk);

        // Thêm dòng khuyến mãi
        Chunk khuyenMaiChunk = new Chunk("Khuyến Mãi: ", nameFont);
        khuyenMaiChunk.setFont(new Font(nameFont.getBaseFont(), nameFont.getSize(), Font.BOLD, BaseColor.RED));
        PdfPCell cellKhuyenMaiChunk = new PdfPCell(new Phrase(khuyenMaiChunk));
        cellKhuyenMaiChunk.setHorizontalAlignment(Element.ALIGN_RIGHT);
        cellKhuyenMaiChunk.setColspan(6);
        // Không vẽ border
        cellKhuyenMaiChunk.setBorder(Rectangle.NO_BORDER);
        table.addCell(cellKhuyenMaiChunk);

        Chunk khuyenMaiValueChunk = new Chunk(NumberStandard.formatMoney(tongTien * khuyenMai, false), nameFont);
        PdfPCell cellKhuyenMaiValueChunk = new PdfPCell(new Phrase(khuyenMaiValueChunk));
        cellKhuyenMaiValueChunk.setHorizontalAlignment(Element.ALIGN_RIGHT);
        // Không vẽ border
        cellKhuyenMaiValueChunk.setBorder(Rectangle.NO_BORDER);
        table.addCell(cellKhuyenMaiValueChunk);

        // Thêm dòng thành tiền
        Chunk thanhTienChunk = new Chunk("Thành Tiền: ", nameFont);
        thanhTienChunk.setFont(new Font(nameFont.getBaseFont(), nameFont.getSize(), Font.BOLD, BaseColor.RED));
        PdfPCell cellThanhTienChunk = new PdfPCell(new Phrase(thanhTienChunk));
        cellThanhTienChunk.setHorizontalAlignment(Element.ALIGN_RIGHT);
        cellThanhTienChunk.setColspan(6);
        // Không vẽ border
        cellThanhTienChunk.setBorder(Rectangle.NO_BORDER);
        table.addCell(cellThanhTienChunk);

        Chunk thanhTienValueChunk = new Chunk(NumberStandard.formatMoney((tongTien * (1 + VAT)) * (1 - khuyenMai), false), nameFont);
        PdfPCell cellThanhTienValueChunk = new PdfPCell(new Phrase(thanhTienValueChunk));
        cellThanhTienValueChunk.setHorizontalAlignment(Element.ALIGN_RIGHT);
        // Không vẽ border
        cellThanhTienValueChunk.setBorder(Rectangle.NO_BORDER);
        table.addCell(cellThanhTienValueChunk);

        document.add(table);

        // Add Footer to the document
        Paragraph footer = new Paragraph();
        footer.setAlignment(Element.ALIGN_BOTTOM);

        // Thêm separator vào footer
        Paragraph separator = new Paragraph("————————▼————————");
        separator.setAlignment(Element.ALIGN_CENTER);
        separator.setSpacingBefore(10f);
        footer.add(separator);

        // Thêm lời cảm ơn vào footer
        Paragraph thankParagraph = new Paragraph("Cảm ơn quý khách đã sử dụng dịch vụ của chúng tôi!", nameFont);
        thankParagraph.setFont(new Font(nameFont.getBaseFont(), nameFont.getSize(), Font.BOLD, BaseColor.RED));
        thankParagraph.setAlignment(Element.ALIGN_CENTER);
        footer.add(thankParagraph);

        // Thêm note nhắc khách hàng nhận hàng đúng hẹn
        Paragraph note = new Paragraph("Quý khách vui lòng nhận hàng đúng hẹn! Xin cảm ơn!", dateFont);
        note.setFont(new Font(nameFont.getBaseFont(), nameFont.getSize(), Font.BOLD, BaseColor.RED));
        note.setAlignment(Element.ALIGN_CENTER);
        footer.add(note);

        document.add(footer);
        document.close();
    }

}
