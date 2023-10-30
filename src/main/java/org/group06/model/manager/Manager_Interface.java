package org.group06.model.manager;

import java.util.ArrayList;

public interface Manager_Interface<T> {

    /**
     * Lấy tất cả các đối tượng trong danh sách
     * @return danh sách đối tượng
     */
    public ArrayList<T> getAll();

    /**
     * Thêm đối tượng vào danh sách
     * @param t đối tượng cần thêm
     * @return true nếu thêm thành công, false nếu thêm thất bại
     */
    public boolean add(T t);

    /**
     * Cập nhật đối tượng trong danh sách
     * @param t đối tượng cần cập nhật
     * @return true nếu cập nhật thành công, false nếu cập nhật thất bại
     */
    public boolean update(T t);

    /**
     * Xóa đối tượng trong danh sách
     * @param t đối tượng cần xóa
     * @return true nếu xóa thành công, false nếu xóa thất bại
     */
    public boolean delete(T t);

    /**
     * Lấy đối tượng theo ID (Mã, SĐT,...)
     * @param id ID của đối tượng cần lấy
     * @return đối tượng cần lấy, null nếu không tìm thấy
     */
    public T getByID(String id);
}
