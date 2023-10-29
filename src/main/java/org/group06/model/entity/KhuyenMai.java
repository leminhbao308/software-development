package org.group06.model.entity;

import java.sql.Date;

/**
 * @author Le Hoang Nam
 */
public class KhuyenMai {
    private String maKhuyenMai;
    private String tenCTKM;
    private double mucGiamGia;
    private Date ngayBatDau;
    private Date ngayKetThuc;
    private int soLuotSuDung;

    public KhuyenMai() {
        this.maKhuyenMai = "Không";
        this.tenCTKM = "Không";
        this.mucGiamGia = 0;
        this.ngayBatDau = new Date(System.currentTimeMillis());
        this.ngayKetThuc = this.ngayBatDau;
        this.soLuotSuDung = 0;
    }

    /**
     * @param maKhuyenMai  mã khuyến mãi
     * @param tenCTKM      tên chương trình khuyến mãi
     * @param mucGiamGia   mức giảm giá
     * @param ngayBatDau   ngày bắt đầu chương trình giảm giá, được khởi tạo là ngày hiện hành
     * @param ngayKetThuc  ngày kết thúc chương trình giảm giá, được khởi tạo mặc định bằng ngày bắt đầu
     * @param soLuotSuDung số lượng mã khuyến mãi được sử dụng
     */
    public KhuyenMai(String maKhuyenMai, String tenCTKM, double mucGiamGia, Date ngayBatDau, Date ngayKetThuc, int soLuotSuDung) {
        this.setMaKhuyenMai(maKhuyenMai);
        this.setTenCTKM(tenCTKM);
        this.setMucGiamGia(mucGiamGia);
        this.setNgayBatDau(ngayBatDau);
        this.setNgayKetThuc(ngayKetThuc);
        this.setSoLuotSuDung(soLuotSuDung);
    }

    public String getMaKhuyenMai() {
        return maKhuyenMai;
    }

    public void setMaKhuyenMai(String maKhuyenMai) {
        this.maKhuyenMai = maKhuyenMai;
    }

    public String getTenCTKM() {
        return tenCTKM;
    }

    public void setTenCTKM(String tenCTKM) {
        this.tenCTKM = tenCTKM;
    }

    public double getMucGiamGia() {
        return mucGiamGia;
    }

    public void setMucGiamGia(double mucGiamGia) {
        this.mucGiamGia = mucGiamGia;
    }

    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public int getSoLuotSuDung() {
        return soLuotSuDung;
    }

    public void setSoLuotSuDung(int soLuotSuDung) {
        this.soLuotSuDung = soLuotSuDung;
    }

    @Override
    public String toString() {
        return "KhuyenMai{" +
                "maKhuyenMai='" + maKhuyenMai + '\'' +
                ", tenCTKhuyenMai='" + tenCTKM + '\'' +
                ", mucGiamGia=" + mucGiamGia +
                ", ngayBatDau=" + ngayBatDau +
                ", ngayKetThuc=" + ngayKetThuc +
                ", soLuotSuDung=" + soLuotSuDung +
                '}';
    }
}
