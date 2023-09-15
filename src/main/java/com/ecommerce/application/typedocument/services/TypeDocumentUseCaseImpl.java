package com.ecommerce.application.typedocument.services;

import com.ecommerce.application.typedocument.ports.input.TypeDocumentUseCase;
import com.ecommerce.application.typedocument.ports.output.TypeDocumentRepository;
import com.ecommerce.domain.typedocument.entities.TypeDocument;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeDocumentUseCaseImpl implements TypeDocumentUseCase {

    private TypeDocumentRepository repository;

    public TypeDocumentUseCaseImpl(TypeDocumentRepository repository) {
        this.repository = repository;
    }

    @Override
    public TypeDocument save(TypeDocument typeDocument) {
        return repository.save(typeDocument);
    }

    @Override
    public List<TypeDocument> getAll() {
        return repository.getAll();
    }

    @Override
    public TypeDocument getById(int id) {
        return repository.getById(id);
    }

    @Override
    public boolean deleteById(int id) {
        return repository.deleteById(id);
    }

    @Override
    public TypeDocument getByName(String name) {
        return repository.getByName(name);
    }
}
