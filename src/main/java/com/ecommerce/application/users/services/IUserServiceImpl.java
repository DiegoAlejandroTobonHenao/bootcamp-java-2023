package com.ecommerce.application.users.services;

import com.ecommerce.application.users.ports.input.IUserService;
import com.ecommerce.application.users.ports.output.UserRepository;
import com.ecommerce.domain.users.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IUserServiceImpl implements IUserService {
    private final UserRepository repository;

    public IUserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public User save(User user) {
        // validaciones de datos
        return repository.save(user);
    }

    @Override
    public List<User> getAll() {
        return repository.getAll();
    }

    @Override
    public User getById(String id) {
        return repository.getById(id);
    }

    @Override
    public List<User> getByIdTypeDocument(String idTypeDocument) {
        return repository.getByIdTypeDocument(idTypeDocument);
    }

    @Override
    public Boolean deleteById(String id) {
        return repository.deleteById(id);
    }

    @Override
    public User getByDocumentNumber(String document) {
        return repository.getByDocumentNumber(document);
    }

    @Override
    public List<User> getUserLessThan(Integer age) {
        return repository.getUserLessThan(age);
    }

    @Override
    public List<User> getUserGreaterThan(Integer age) {
        return repository.getUserGreaterThan(age);
    }

    @Override
    public List<User> getUsersByOperatorAndPrefix(String operator, String prefix) {
        return repository.getUsersByOperatorAndPrefix(operator, prefix);
    }
}
