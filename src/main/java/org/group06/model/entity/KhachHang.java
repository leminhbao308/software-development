package org.group06.model.entity;

public class KhachHang {

    private String maKhachHang;
    private String tenKH;
    private String soDienThoai;
    private String email;
    private int diemTichLuy;
    private String hang;
    

    public KhachHang() {
        this.maKhachHang = "KH000";
        this.tenKH = "Khách vãng lai";
        this.soDienThoai = "0000000000";
        this.email = null;
        this.diemTichLuy = 0;
        this.hang = null;
    }
        
    public KhachHang(String maKhachHang, String tenKH, String soDienThoai, String email) {
        this.maKhachHang = maKhachHang;
        this.tenKH = tenKH;
        this.soDienThoai = soDienThoai;
        this.email = email;
    }

    public KhachHang(String maKhachHang, String tenKH, String soDienThoai, String email, int diemTichLuy, String hang) {
        this.maKhachHang = maKhachHang;
        this.tenKH = tenKH;
        this.soDienThoai = soDienThoai;
        this.email = email;
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
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDiemTichLuy() {
        return diemTichLuy;
    }

    public void setDiemTichLuy(int diemTichLuy) {
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
        return "KhachHang{" +
                "maKhachHang='" + maKhachHang + '\'' +
                ", tenKH='" + tenKH + '\'' +
                ", soDienThoai='" + soDienThoai + '\'' +
                ", email='" + email + '\'' +
                ", diemTichLuy=" + diemTichLuy +
                ", hang='" + hang + '\'' +
                '}';
    }
}
