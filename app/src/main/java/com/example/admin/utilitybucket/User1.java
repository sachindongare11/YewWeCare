package com.example.admin.utilitybucket;

public class User1 {
    private String name;
    private String phone;
    private String service;
    private String address;

    public User1()
    {

    }

    public User1(String name, String phone, String service, String address) {
        this.name = name;
        this.phone = phone;
        this.service = service;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
