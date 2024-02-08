package com.cdmg_iesam.features.bank.domain;

public class Hipoteca {

    private String id;
    private String name;
    private String descripttion;
    private String initDate;
    private String endDate;
    private String interests;
    private String ammount;

    public Hipoteca(String id, String name, String descripttion, String initDate, String endDate, String interests, String ammount) {
        this.id = id;
        this.name = name;
        this.descripttion = descripttion;
        this.initDate = initDate;
        this.endDate = endDate;
        this.interests = interests;
        this.ammount = ammount;
    }

    @Override
    public String toString() {
        return "Hipoteca" + '\n' +
                "id='" + id + '\n' +
                " name='" + name + '\n' +
                " descripttion='" + descripttion + '\n' +
                " initDate='" + initDate + '\n' +
                " endDate='" + endDate + '\n' +
                " interests='" + interests + '\n' +
                " ammount='" + ammount + '\n';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescripttion() {
        return descripttion;
    }

    public void setDescripttion(String descripttion) {
        this.descripttion = descripttion;
    }

    public String getInitDate() {
        return initDate;
    }

    public void setInitDate(String initDate) {
        this.initDate = initDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getInterests() {
        return interests;
    }

    public void setInterests(String interests) {
        this.interests = interests;
    }

    public String getAmmount() {
        return ammount;
    }

    public void setAmmount(String ammount) {
        this.ammount = ammount;
    }
}
