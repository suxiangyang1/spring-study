package com.soft1851.spring.ioc.entity;

import java.util.List;

public class People {
    private String name;
    private List<String> hobbies;
    private List<PhoneBrand> phoneBrands;

    public People(String name, List<String> hobbies, List<PhoneBrand> phoneBrands) {
        this.name = name;
        this.hobbies = hobbies;
        this.phoneBrands = phoneBrands;
    }

    public People() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public List<PhoneBrand> getPhoneBrands() {
        return phoneBrands;
    }

    public void setPhoneBrands(List<PhoneBrand> phoneBrands) {
        this.phoneBrands = phoneBrands;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", hobbies=" + hobbies +
                ", phoneBrands=" + phoneBrands +
                '}';
    }
}
