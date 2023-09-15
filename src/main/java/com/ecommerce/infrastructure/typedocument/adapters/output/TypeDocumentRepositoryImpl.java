package com.ecommerce.infrastructure.typedocument.adapters.output;

import com.ecommerce.application.typedocument.ports.output.TypeDocumentRepository;
import com.ecommerce.domain.typedocument.entities.TypeDocument;
import com.ecommerce.infrastructure.typedocument.crud.TypeDocumentCRUD;
import com.ecommerce.infrastructure.typedocument.mappers.TypeDocumentMapper;
import com.ecommerce.infrastructure.typedocument.models.TypeDocumentDAO;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class TypeDocumentRepositoryImpl implements TypeDocumentRepository {

    private TypeDocumentCRUD typeDocumentCRUD;
    private TypeDocumentMapper mapper;

    public TypeDocumentRepositoryImpl(TypeDocumentCRUD typeDocumentCRUD, TypeDocumentMapper mapper) {
        this.typeDocumentCRUD = typeDocumentCRUD;
        this.mapper = mapper;
    }

    @Override
    public TypeDocument save(TypeDocument typeDocument) {
        TypeDocumentDAO dao = mapper.domainToDao(typeDocument);
        return mapper.daoToDomain(typeDocumentCRUD.save(dao));
    }

    @Override
    public List<TypeDocument> getAll() {
        return mapper.daosToDomains((List<TypeDocumentDAO>) typeDocumentCRUD.findAll());
    }

    @Override
    public TypeDocument getById(int id) {
        Optional<TypeDocumentDAO> dao = typeDocumentCRUD.findById(id);
        if(dao.isEmpty()) {
            return null;
        }
        // Forma opcional de hacer ( tiene mas rendimiento)
        //return dao.map(typeDocumentDAO -> mapper.daoToDomain(typeDocumentDAO)).orElse(null);
        return mapper.daoToDomain(dao.get());
    }

    @Override
    public boolean deleteById(int id) {
        TypeDocument response = this.getById(id);
        if(response == null) {
            return false;
        }
        typeDocumentCRUD.deleteById(id);
        return true;
    }

    @Override
    public TypeDocument getByName(String name) {
        return mapper.daoToDomain(typeDocumentCRUD.findByName(name));
    }

    @Override
    public TypeDocument update(int id, TypeDocument typeDocument) {
        TypeDocumentDAO dao = mapper.domainToDao(typeDocument);
        return mapper.daoToDomain(typeDocumentCRUD.save(dao));
    }
}
