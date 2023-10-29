package org.group06.model.entity;

public class KhachHang {

    private String maKhachHang;
    private String tenKH;
    private String soDienThoai;

    public KhachHang() {
        this.tenKH = "Khách vãng lai";
        this.soDienThoai = "0000000000";
        this.maKhachHang = "KH000";
    }

    public KhachHang(String maKhachHang, String tenKH, String soDienThoai) {
        this.maKhachHang = maKhachHang;
        this.tenKH = tenKH;
        this.soDienThoai = soDienThoai;
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

    @Override
    public String toString() {
        return "KhachHang{" +
                "maKhachHang='" + maKhachHang + '\'' +
                ", tenKH='" + tenKH + '\'' +
                ", soDienThoai='" + soDienThoai + '\'' +
                '}';
    }
}
