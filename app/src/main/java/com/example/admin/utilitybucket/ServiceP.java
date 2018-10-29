package com.example.admin.utilitybucket;

class ServiceP {
    private String name;
    private String phone;
    private String service;
    private String address;
    private String exp;

    ServiceP()
    {

    }
    ServiceP(String name,String phone,String service,String address,String exp)
    {
        this.name=name;
        this.phone=phone;
        this.service=service;
        this.address=address;
        this.exp=exp;
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

    public String getExp()
    {return exp;}
    public  void setExp(String exp)
    {this.exp=exp;}





}
