package com.cdmg_iesam.features.bank.domain;

public class Transactions {

    private String id;
    private String description;
    private int ammount;

    public Transactions(String id, String description, int ammount) {
        this.id = id;
        this.description = description;
        this.ammount = ammount;
    }

    @Override
    public String toString() {
        return "Transactions" + '\n' +
                "id='" + id + '\n' +
                " description='" + description + '\n' +
                " ammount=" + ammount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmmount() {
        return ammount;
    }

    public void setAmmount(int ammount) {
        this.ammount = ammount;
    }
}
