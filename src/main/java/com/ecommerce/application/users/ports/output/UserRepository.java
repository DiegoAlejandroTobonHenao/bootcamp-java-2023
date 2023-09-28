package com.ecommerce.application.users.ports.output;

import com.ecommerce.domain.users.entities.User;

import java.util.List;

public interface UserRepository {
    User save(User user);
    List<User> getAll();
    User getById(String id);
    List<User> getByIdTypeDocument(String idTypeDocument);
    Boolean deleteById(String id);
    User getByDocumentNumber(String document);
    List<User> getUserLessThan(Integer age);
    List<User> getUserGreaterThan(Integer age);
    List<User> getUsersByOperatorAndPrefix(String operator, String prefix);
}
