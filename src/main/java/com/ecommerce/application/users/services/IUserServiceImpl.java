package com.ecommerce.application.users.services;

import com.ecommerce.application.typedocument.ports.output.TypeDocumentRepository;
import com.ecommerce.application.users.ports.input.IUserService;
import com.ecommerce.application.users.ports.output.UserRepository;
import com.ecommerce.domain.typedocument.entities.TypeDocument;
import com.ecommerce.domain.users.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class IUserServiceImpl implements IUserService {
    private final UserRepository repository;
    private final TypeDocumentRepository typeDocumentRepository;

    public IUserServiceImpl(UserRepository repository,
                            TypeDocumentRepository typeDocumentRepository) {
        this.repository = repository;
        this.typeDocumentRepository = typeDocumentRepository;
    }

    @Override
    public User save(User user) {
        // validaciones de datos
        if(validateIdTypeDocument(user.getIdTypeDocument())) {
            User userResponse = repository.save(user);
            TypeDocument typeDocument = getypeDocument(user.getIdTypeDocument());
            userResponse.setTypeDocument(typeDocument);
            return userResponse;
        }
        throw new RuntimeException("No existe ningun tipo de documento con ese ID");
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

    private Boolean validateIdTypeDocument(Integer idTypeDocument) {
        TypeDocument response = typeDocumentRepository.getById(idTypeDocument);
        if (Objects.isNull(response)) {
            return false;
        }
        return true;
    }

    private TypeDocument getypeDocument(Integer idTypeDocument) {
        TypeDocument response = typeDocumentRepository.getById(idTypeDocument);
        return response;
    }
}
