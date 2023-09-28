package com.ecommerce.infrastructure.users.mappers;

import com.ecommerce.domain.users.entities.User;
import com.ecommerce.infrastructure.users.models.UserDAO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


/*
convertir de Dao a dominio y de dominio a Dao
 */
@Component
public class UserMapper {
    public UserDAO domainToDao(User user) {
        return new UserDAO(
                user.getIdUser(),
                user.getName(),
                user.getLastName(),
                user.getAge(),
                user.getCityOfBirth(),
                user.getIdTypeDocument(),
                user.getDocumentNumber(),
                user.getPrefix(),
                user.getOperator(),
                user.getCellphoneNumber()
        );
    }

    public User daoToDomain(UserDAO dao) {
        return new User(
                dao.getIdUser(),
                dao.getName(),
                dao.getLastName(),
                dao.getAge(),
                dao.getCityOfBirth(),
                dao.getIdTypeDocument(),
                dao.getDocumentNumber(),
                dao.getPrefix(),
                dao.getOperator(),
                dao.getCellphoneNumber()
        );
    }

    public List<User> daosToDomains(List<UserDAO> daos) {
        List<User> response = new ArrayList<>();
        for(UserDAO d: daos) {
            response.add(daoToDomain(d));
        }
        return response;
    }

    public List<UserDAO> domainsToDaos(List<User> domains) {
        List<UserDAO> response = new ArrayList<>();
        for(User d: domains) {
            response.add(domainToDao(d));
        }
        return response;
    }
}
