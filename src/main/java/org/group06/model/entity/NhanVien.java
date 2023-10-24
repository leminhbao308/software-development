package org.group06.model.entity;

public class NhanVien {
    private String maNV;
    private String matKhau;
    private String tenNV;
    private boolean gioiTinh;
    private String cccd;
    private String diaChi;
    private String soDienThoai;
    private String trangThai;
    private String chucVu;

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
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

    public String isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public NhanVien() {
    }

    public NhanVien(String maNV, String matKhau, String tenNV, boolean gioiTinh, String cccd, String diaChi, String soDienThoai, String trangThai, String chucVu) {
        this.maNV = maNV;
        this.matKhau = matKhau;
        this.tenNV = tenNV;
        this.gioiTinh = gioiTinh;
        this.cccd = cccd;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.trangThai = trangThai;
        this.chucVu = chucVu;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "maNV='" + maNV + '\'' +
                ", matKhau='" + matKhau + '\'' +
                ", tenNV='" + tenNV + '\'' +
                ", gioiTinh=" + gioiTinh +
                ", cccd='" + cccd + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", soDienThoai='" + soDienThoai + '\'' +
                ", trangThai=" + trangThai +
                ", viTri='" + chucVu + '\'' +
                '}';
    }
}
