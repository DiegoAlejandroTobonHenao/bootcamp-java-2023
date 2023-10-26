package com.ecommerce.infrastructure.users.crud;

import com.ecommerce.infrastructure.users.models.ResponseStoreProcedure;
import com.ecommerce.infrastructure.users.models.UserDAO;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/*
Funcion netamente interactuar con la base de datos y realizar las consultas
 */
public interface UserCrudRepository extends CrudRepository<UserDAO, String> {
    UserDAO findByDocumentNumber(String document);
    List<UserDAO> findByAgeLessThanEqual(int age);
    List<UserDAO> findByAgeGreaterThanEqual(int age);
    List<UserDAO> findByOperatorAndPrefix(String operator, String prefix);
    List<UserDAO> findByIdTypeDocument(String idTypeDocument);

    /*
    @Query(value = "SELECT * " +
            "FROM TBL_USERS " +
            "INNER JOIN TBL_TYPES_DOCUMENT ON TBL_USERS.id_type_document = TBL_TYPES_DOCUMENT.id; " +
            "WHERE TBL_TYPES_DOCUMENT.name = :0",
            nativeQuery = true)
    List<UserDAO> getUsersWithTypeDocumentName(String nameDocument);

    */
}

