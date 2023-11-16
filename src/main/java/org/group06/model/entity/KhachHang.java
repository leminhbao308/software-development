package org.group06.model.entity;

public class KhachHang {

    private String maKhachHang;
    private String tenKH;
    private String soDienThoai;
    private double diemTichLuy;
    private String hang;

    public KhachHang() {
        this.tenKH = "Khách vãng lai";
        this.soDienThoai = "0000000000";
        this.maKhachHang = "KH000";
        this.diemTichLuy = 0;
        this.hang = "";
    }
        
    public KhachHang(String maKhachHang, String tenKH, String soDienThoai) {
        this.maKhachHang = maKhachHang;
        this.tenKH = tenKH;
        this.soDienThoai = soDienThoai;
    }

    public KhachHang(String maKhachHang, String tenKH, String soDienThoai, double diemTichLuy, String hang) {
        this.maKhachHang = maKhachHang;
        this.tenKH = tenKH;
        this.soDienThoai = soDienThoai;
        this.diemTichLuy = diemTichLuy;
        this.hang = hang;
    }

    public KhachHang(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public double getDiemTichLuy() {
        return diemTichLuy;
    }

    public void setDiemTichLuy(double diemTichLuy) {
        this.diemTichLuy = diemTichLuy;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    @Override
    public String toString() {
        return "KhachHang{"
                + "maKhachHang='" + maKhachHang + '\''
                + ", tenKH='" + tenKH + '\''
                + ", soDienThoai='" + soDienThoai + '\''
                + ", diemTichLuy=" + diemTichLuy
                + ", hang='" + hang + '\''
                + '}';
    }
}
