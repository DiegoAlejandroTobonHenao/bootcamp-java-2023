package com.ecommerce.infrastructure.typedocument.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "TBL_TYPES_DOCUMENT")
public class TypeDocumentDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_type_document")
    private Integer idTypeDocument;
    private String name;
    @Column(name = "update_at")
    private Date updatedAt;
    @Column(name = "created_at")
    private Date createdAt;
    @Column(name = "is_active")
    private boolean isActive;

    public TypeDocumentDAO(Integer idTypeDocument, String name) {
        this.idTypeDocument = idTypeDocument;
        this.name = name;
        this.createdAt = new Date();
        this.updatedAt = new Date();
        this.isActive = true;
    }

    public TypeDocumentDAO() {
    }

    public int getIdTypeDocument() {
        return idTypeDocument;
    }

    public void setIdTypeDocument(int idTypeDocument) {
        this.idTypeDocument = idTypeDocument;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
