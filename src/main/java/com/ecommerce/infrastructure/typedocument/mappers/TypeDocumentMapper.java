package com.ecommerce.infrastructure.typedocument.mappers;

import com.ecommerce.domain.typedocument.entities.TypeDocument;
import com.ecommerce.infrastructure.typedocument.models.TypeDocumentDAO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TypeDocumentMapper {

    public TypeDocument daoToDomain(TypeDocumentDAO dao) {
        return new TypeDocument(dao.getIdTypeDocument(), dao.getName());
    }

    public TypeDocumentDAO domainToDao( TypeDocument typeDocument) {
        return new TypeDocumentDAO(typeDocument.getIdTypeDocument(), typeDocument.getName());
    }

    public List<TypeDocument> daosToDomains(List<TypeDocumentDAO> daos) {
        List<TypeDocument> response = new ArrayList<>();
        for(TypeDocumentDAO d: daos) {
            response.add(daoToDomain(d));
        }
        return response;
    }

    public List<TypeDocumentDAO> domainsToDaos(List<TypeDocument> domains) {
        List<TypeDocumentDAO> response = new ArrayList<>();
        for(TypeDocument d: domains) {
            response.add(domainToDao(d));
        }
        return response;
    }
}
