package com.ecommerce.infrastructure.typedocument.crud;

import com.ecommerce.infrastructure.typedocument.models.TypeDocumentDAO;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TypeDocumentCRUD extends CrudRepository<TypeDocumentDAO, Integer> {

    //@Query(value = "SELECT * FROM tbl_types_document WHERE id_type_document = :0", nativeQuery = true)
    TypeDocumentDAO findByName(String name);

}
