package org.group06.model.entity;

public class Customer {
    private String maKhachHang, ten, diaChi, soDienThoai;
    private Double tongThanhToan;

    public Customer() {
    }

    public Customer(String maKhachHang, String ten, String diaChi, String soDienThoai, Double tongThanhToan) {
        this.maKhachHang = maKhachHang;
        this.ten = ten;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.tongThanhToan = tongThanhToan;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public Double getTongThanhToan() {
        return tongThanhToan;
    }

    public void setTongThanhToan(Double tongThanhToan) {
        this.tongThanhToan = tongThanhToan;
    }

    public boolean capNhatTongThanhToan(Double tienMoi) {
        try {
            this.tongThanhToan += tienMoi;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "maKhachHang='" + maKhachHang + '\'' +
                ", ten='" + ten + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", soDienThoai='" + soDienThoai + '\'' +
                ", tongThanhToan=" + tongThanhToan +
                '}';
    }
}
