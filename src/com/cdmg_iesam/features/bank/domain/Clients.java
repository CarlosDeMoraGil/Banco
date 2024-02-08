package com.cdmg_iesam.features.bank.domain;

public class Clients {

    private String id;
    private String name;
    private String surname;
    private String address;
    private String population;
    private String postalCode;

    public Clients(String id, String name, String surname, String address, String population, String postalCode) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.population = population;
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "Clients" + '\n' +
                "id='" + id + '\n' +
                " name='" + name + '\n' +
                " surname='" + surname + '\n' +
                " address='" + address + '\n' +
                " population='" + population + '\n' +
                " postalCode='" + postalCode + '\n';
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
