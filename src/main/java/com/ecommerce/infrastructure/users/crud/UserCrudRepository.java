package com.ecommerce.infrastructure.users.crud;

import com.ecommerce.infrastructure.users.models.UserDAO;
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
}
