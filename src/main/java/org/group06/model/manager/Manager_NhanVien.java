package org.group06.model.manager;

import org.group06.db.dao.DAO_NhanVien;
import org.group06.model.entity.NhanVien;

import java.sql.Connection;
import java.util.ArrayList;

public class Manager_NhanVien implements Manager_Interface<NhanVien>{

    private ArrayList<NhanVien> dsNhanVien;

    public Manager_NhanVien(Connection connection) {
        dsNhanVien = new DAO_NhanVien(connection).getAll();
    }

    /**
     * Lấy tất cả các đối tượng trong danh sách
     *
     * @return danh sách đối tượng
     */
    @Override
    public ArrayList<NhanVien> getAll() {
        return dsNhanVien;
    }

    /**
     * Thêm đối tượng vào danh sách
     *
     * @param nhanVien đối tượng cần thêm
     * @return true nếu thêm thành công, false nếu thêm thất bại
     */
    @Override
    public boolean add(NhanVien nhanVien) {
        return dsNhanVien.add(nhanVien);
    }

    /**
     * Cập nhật đối tượng trong danh sách
     *
     * @param nhanVien đối tượng cần cập nhật
     * @return true nếu cập nhật thành công, false nếu cập nhật thất bại
     */
    @Override
    public boolean update(NhanVien nhanVien) {
        for (NhanVien nv : dsNhanVien) {
            if (nv.getMaNV().equals(nhanVien.getMaNV())) {
                nv = nhanVien;
                return true;
            }
        }
        return false;
    }

    /**
     * Xóa đối tượng trong danh sách
     *
     * @param nhanVien đối tượng cần xóa
     * @return true nếu xóa thành công, false nếu xóa thất bại
     */
    @Override
    public boolean delete(NhanVien nhanVien) {
        return dsNhanVien.remove(nhanVien);
    }

    /**
     * Lấy đối tượng theo ID (Mã, SĐT,...)
     *
     * @param id ID của đối tượng cần lấy
     * @return đối tượng cần lấy, null nếu không tìm thấy
     */
    @Override
    public NhanVien getByID(String id) {
        for (NhanVien nv : dsNhanVien) {
            if (nv.getMaNV().equals(id)) {
                return nv;
            }
        }
        return null;
    }
}
