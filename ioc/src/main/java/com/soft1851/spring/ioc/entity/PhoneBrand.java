package com.soft1851.spring.ioc.entity;

public class PhoneBrand {
    private String brand;

    public PhoneBrand(String brand) {
        this.brand = brand;
    }

    public PhoneBrand() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "PhoneBrand{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
