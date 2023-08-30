package org.group06.model.manager;

import org.group06.model.entity.Customer;

import java.util.ArrayList;

public class CustomerManager {
    private ArrayList<Customer> customers;

    public CustomerManager() {
        this.customers = new ArrayList<>();
    }

    public CustomerManager(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public static void main(String[] args) {
        ArrayList<Customer> c1 = new ArrayList<>();
        c1.add(new Customer("NV01", "Le Minh Bao", "hcm", "012345678", 100.0));
        c1.add(new Customer("NV02", "Le Minh Beo", "hcm", "012345678", 103.0));
        c1.add(new Customer("NV03", "Le Minh Lon", "hcm", "012345678", 1023.0));
        c1.add(new Customer("NV04", "Le Minh Nho", "hcm", "012345678", 1450.0));

        CustomerManager cm = new CustomerManager(c1);

        System.out.println("Danh sach cac khach hang");
        for (Customer c : cm.getCustomers()) {
            System.out.println(c.toString());
        }

        System.out.println("Thuc Hien them mot khach hang");
        cm.addCustomer(new Customer("NV05", "Le Minh Nho", "hcm", "012345678", 1450.0));
        System.out.println("Danh sach cac khach hang sau cap nhat");

        for (Customer c : cm.getCustomers()) {
            System.out.println(c.toString());
        }

        System.out.println("Thuc Hien xoa mot khach hang");
        if (cm.removeCustomer("NV05")) {
            System.out.println("Xoa thanh cong!");
        }
        System.out.println("Danh sach cac khach hang sau cap nhat");

        for (Customer c : cm.getCustomers()) {
            System.out.println(c.toString());
        }

        System.out.println("Thuc Hien cap nhat ten mot khach hang");
        if (cm.updateCustomer("NV03", "Le Hoang Nam")) {
            System.out.println("Cap nhat thanh cong!");
        }
        System.out.println("Danh sach cac khach hang sau cap nhat");

        for (Customer c : cm.getCustomers()) {
            System.out.println(c.toString());
        }
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public boolean addCustomer(Customer customer) {
        return customers.add(customer);
    }

    public boolean removeCustomer(String customerID) {
        for (Customer c : customers) {
            if (c.getMaKhachHang().equals(customerID)) {
                return customers.remove(c);
            }
        }
        return false;
    }

    public boolean updateCustomer(String customerID, String data) {
        for (Customer c : customers) {
            if (c.getMaKhachHang().equals(customerID)) {
                c.setTen(data);
                return true;
            }
        }
        return false;
    }
}

