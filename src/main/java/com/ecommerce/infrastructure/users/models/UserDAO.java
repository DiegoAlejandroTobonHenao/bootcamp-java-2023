package com.ecommerce.infrastructure.users.models;

import com.ecommerce.infrastructure.typedocument.models.TypeDocumentDAO;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "TBL_USERS")
public class UserDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_user")
    private String idUser;
    private String name;
    @Column(name = "last_name")
    private String lastName;
    private Integer age;
    @Column(name = "city_of_birth")
    private String cityOfBirth;
    @Column(name = "id_type_document")
    private Integer idTypeDocument;
    @Column(name = "document_number")
    private String documentNumber;
    private String prefix;
    private String operator;
    @Column(name = "cellphone_number")
    private String cellphoneNumber;
    @Column(name = "update_at")
    private Date updatedAt;
    @Column(name = "created_at")
    private Date createdAt;
    @Column(name = "is_active")
    private boolean isActive;

    @ManyToOne
    @JoinColumn(name = "id_type_document", insertable = false, updatable = false)
    private TypeDocumentDAO typeDocumentDAO;

    public TypeDocumentDAO getTypeDocumentDAO() {
        return typeDocumentDAO;
    }

    public void setTypeDocumentDAO(TypeDocumentDAO typeDocumentDAO) {
        this.typeDocumentDAO = typeDocumentDAO;
    }

    public UserDAO(String idUser,
                   String name,
                   String lastName,
                   Integer age,
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
        this.isActive = true;
        this.createdAt = new Date();
        this.updatedAt = new Date();
    }

    public UserDAO() {
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
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

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
