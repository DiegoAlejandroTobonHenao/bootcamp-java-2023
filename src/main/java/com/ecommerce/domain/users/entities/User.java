package com.ecommerce.domain.users.entities;


import com.ecommerce.domain.typedocument.entities.TypeDocument;

public class User {
    private String idUser;
    private String name;
    private String lastName;
    private Integer age;
    private String cityOfBirth;
    private Integer idTypeDocument;
    private String documentNumber;
    private String prefix;
    private String operator;
    private String cellphoneNumber;

    private TypeDocument typeDocument;

    public void setAge(Integer age) {
        this.age = age;
    }

    public TypeDocument getTypeDocument() {
        return typeDocument;
    }

    public void setTypeDocument(TypeDocument typeDocument) {
        this.typeDocument = typeDocument;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
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

    public Integer getIdTypeDocument() {
        return idTypeDocument;
    }

    public void setIdTypeDocument(Integer idTypeDocument) {
        this.idTypeDocument = idTypeDocument;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getCellphoneNumber() {
        return cellphoneNumber;
    }

    public void setCellphoneNumber(String cellphoneNumber) {
        this.cellphoneNumber = cellphoneNumber;
    }

    public User(String idUser,
                String name,
                String lastName,
                int age,
                String cityOfBirth,
                Integer idTypeDocument,
                String documentNumber,
                String prefix,
                String operator,
                String cellphoneNumber) {
        this.idUser = idUser;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.cityOfBirth = cityOfBirth;
        this.idTypeDocument = idTypeDocument;
        this.documentNumber = documentNumber;
        this.prefix = prefix;
        this.operator = operator;
        this.cellphoneNumber = cellphoneNumber;
    }
}
