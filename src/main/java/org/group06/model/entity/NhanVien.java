package org.group06.model.entity;

public class NhanVien {
    private String maNV;
    private String matKhau;
    private String tenNV;
    private boolean gioiTinh;
    private String cccd;
    private String diaChi;
    private String soDienThoai;
    private boolean trangThai;
    private String viTri;
    private int caLamViec;

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

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public int getCaLamViec() {
        return caLamViec;
    }

    public void setCaLamViec(int caLamViec) {
        this.caLamViec = caLamViec;
    }

    public NhanVien() {
        this.setTenNV("Tài Khoản");
    }

    public NhanVien(String maNV, String matKhau, String tenNV, boolean gioiTinh, String cccd, String diaChi, String soDienThoai, boolean trangThai, String viTri, int caLamViec) {
        this.maNV = maNV;
        this.matKhau = matKhau;
        this.tenNV = tenNV;
        this.gioiTinh = gioiTinh;
        this.cccd = cccd;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.trangThai = trangThai;
        this.viTri = viTri;
        this.caLamViec = caLamViec;
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
                ", viTri='" + viTri + '\'' +
                ", caLamViec=" + caLamViec +
                '}';
    }
}
