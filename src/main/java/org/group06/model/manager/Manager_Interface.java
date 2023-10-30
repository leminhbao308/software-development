package org.group06.model.manager;

import java.util.ArrayList;

public interface Manager_Interface<T> {

    /**
     * Lấy tất cả các đối tượng trong danh sách
     * @return danh sách đối tượng
     */
    public ArrayList<T> getAll();
    public boolean add(T t);

    public boolean update(T t);

    public boolean delete(T t);

    public T getByID(String id);

    public boolean save();
}
