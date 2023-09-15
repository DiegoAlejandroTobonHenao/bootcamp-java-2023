package com.ecommerce.domain.users.entities;

import com.ecommerce.domain.users.vo.CellphoneInformation;

public class User {
    private int idUser;
    private String name;
    private String lastName;
    private int age;
    private String cityOfBirth;
    private int idTypeDocument;
    private String documentNumber;
    private CellphoneInformation information;

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCityOfBirth() {
        return cityOfBirth;
    }

    public void setCityOfBirth(String cityOfBirth) {
        this.cityOfBirth = cityOfBirth;
    }

    public int getIdTypeDocument() {
        return idTypeDocument;
    }

    public void setIdTypeDocument(int idTypeDocument) {
        this.idTypeDocument = idTypeDocument;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public CellphoneInformation getInformation() {
        return information;
    }

    public void setInformation(CellphoneInformation information) {
        this.information = information;
    }
}
