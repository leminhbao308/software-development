package org.group06.model.entity;

/**
 * @author Le Hoang Nam
 */
public class QuanAo {
    private String maQA;
    private String tenQA;
    private String loaiQuanAo;
    private String kichThuoc;
    private int soLuong;
    private double giaNhap;
    private double loiNhuan;
    private NhaCungCap nhaCungCap;
    private boolean trangThai;
    private String hinhAnh;


    public QuanAo() {
        this.maQA = "Chưa xác định";
        this.tenQA = "Chưa xác định";
        this.loaiQuanAo = "Chưa xác định";
        this.kichThuoc = "Chưa xác định";
        this.soLuong = 0;
        this.giaNhap = 0;
        this.loiNhuan = 0;
        this.nhaCungCap = new NhaCungCap();
        this.trangThai = false;
        this.hinhAnh = "Chưa xác định";
    }

    /**
     * @param maQA       mã quần áo xử lý tự động phát sinh theo quy tắc đã quy định
     * @param tenQA      tên quần áo, định dạng viết In Hoa chữ cái đầu
     * @param loaiQuanAo loại quần áo
     * @param kichThuoc  kích thước
     * @param soLuong    số lượng quần áo
     * @param giaNhap    giá nhập
     * @param loiNhuan   tiền lời
     * @param nhaCungCap nhà cung cấp sản phẩm
     * @param trangThai  trạng thái của sản phẩm là còn hay hết, còn kinh doanh hay không
     * @param hinhAnh    đường dẫn của hình ảnh
     */
    public QuanAo(String maQA, String tenQA, String loaiQuanAo, String kichThuoc, int soLuong, double giaNhap, double loiNhuan, NhaCungCap nhaCungCap, boolean trangThai, String hinhAnh) {
        this.setMaQA(maQA);
        this.setTenQA(tenQA);
        this.setLoaiQuanAo(loaiQuanAo);
        this.setKichThuoc(kichThuoc);
        this.setSoLuong(soLuong);
        this.setGiaNhap(giaNhap);
        this.setLoiNhuan(loiNhuan);
        this.setNhaCungCap(nhaCungCap);
        this.setTrangThai(trangThai);
        this.setHinhAnh(hinhAnh);
    }

    public String getMaQA() {
        return maQA;
    }

    public void setMaQA(String maQA) {
        this.maQA = maQA;
    }

    public String getTenQA() {
        return tenQA;
    }

    public void setTenQA(String tenQA) {
        this.tenQA = tenQA;
    }

    public String getLoaiQuanAo() {
        return loaiQuanAo;
    }

    public void setLoaiQuanAo(String loaiQuanAo) {
        this.loaiQuanAo = loaiQuanAo;
    }

    public String getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(String kichThuoc) {
        this.kichThuoc = kichThuoc;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(double giaNhap) {
        this.giaNhap = giaNhap;
    }

    public double getLoiNhuan() {
        return loiNhuan;
    }

    public void setLoiNhuan(double loiNhuan) {
        this.loiNhuan = loiNhuan;
    }

    public NhaCungCap getNhaCungCap() {
        return nhaCungCap;
    }

    public void setNhaCungCap(NhaCungCap nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    @Override
    public String toString() {
        return "QuanAo{" + "maQA='" + maQA + '\'' + ", tenQA='" + tenQA + '\'' + ", loaiQuanAo='" + loaiQuanAo + '\'' + ", kichThuoc='" + kichThuoc + '\'' + ", soLuong=" + soLuong + ", giaNhap=" + giaNhap + ", loiNhuan=" + loiNhuan + ", nhaCungCap=" + nhaCungCap + ", trangThai=" + trangThai + ", hinhAnh='" + hinhAnh + '\'' + '}';
    }
}

