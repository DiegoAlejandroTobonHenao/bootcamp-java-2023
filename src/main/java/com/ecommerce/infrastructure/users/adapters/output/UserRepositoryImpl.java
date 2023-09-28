package com.ecommerce.infrastructure.users.adapters.output;

import com.ecommerce.application.users.ports.output.UserRepository;
import com.ecommerce.domain.users.entities.User;
import com.ecommerce.infrastructure.users.crud.UserCrudRepository;
import com.ecommerce.infrastructure.users.mappers.UserMapper;
import com.ecommerce.infrastructure.users.models.UserDAO;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/*
 1. Llamar al crudRepository para que vaya e interactue con la base de datos
 2. Esperar el resultado anterior
 3. Despues de obtenerlo, llama al mapper, le pasa la respuesta anterior que està en DAO para
    que la convierta a objetos de dominio
 */
@Repository
public class UserRepositoryImpl implements UserRepository {
/*
    Garantiza que al crudRepository le lleguen objetos dao y que a la capa de arriba ( servicio)
    le lleguen objetos de dominio
 */
    private final UserCrudRepository crudRepository;
    private final UserMapper mapper;

    public UserRepositoryImpl(UserCrudRepository crudRepository,
                              UserMapper mapper) {
        this.crudRepository = crudRepository;
        this.mapper = mapper;
    }

    @Override
    public User save(User user) {
        UserDAO dao = mapper.domainToDao(user);
        return mapper.daoToDomain(crudRepository.save(dao));
    }

    @Override
    public List<User> getAll() {
        return mapper.daosToDomains((List<UserDAO>) crudRepository.findAll());
    }

    @Override
    public User getById(String id) {
        Optional<UserDAO> response = crudRepository.findById(id);
        if(response.isEmpty()) {
            return null;
        }
        return mapper.daoToDomain(response.get());
    }

    @Override
    public List<User> getByIdTypeDocument(String idTypeDocument) {
        return mapper.daosToDomains(crudRepository.findByIdTypeDocument(idTypeDocument));
    }

    @Override
    public Boolean deleteById(String id) {
        User user = this.getById(id);
        if(user == null) {
            return false;
        }
        crudRepository.deleteById(id);
        return true;
    }

    @Override
    public User getByDocumentNumber(String document) {
        return mapper.daoToDomain(crudRepository.findByDocumentNumber(document));
    }

    @Override
    public List<User> getUserLessThan(Integer age) {
        return mapper.daosToDomains(crudRepository.findByAgeLessThanEqual(age));
    }

    @Override
    public List<User> getUserGreaterThan(Integer age) {
        return mapper.daosToDomains(crudRepository.findByAgeGreaterThanEqual(age));
    }

    @Override
    public List<User> getUsersByOperatorAndPrefix(String operator, String prefix) {
        return mapper.daosToDomains(crudRepository.findByOperatorAndPrefix(operator, prefix));
    }
}
