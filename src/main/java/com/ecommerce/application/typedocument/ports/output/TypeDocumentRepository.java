package com.ecommerce.application.typedocument.ports.output;

import com.ecommerce.application.typedocument.ports.input.TypeDocumentUseCase;
import com.ecommerce.domain.typedocument.entities.TypeDocument;

import java.util.List;

public interface TypeDocumentRepository {
    TypeDocument save(TypeDocument typeDocument);
    List<TypeDocument> getAll();
    TypeDocument getById(int id);
    boolean deleteById(int id);
    TypeDocument getByName(String name);
    TypeDocument update(int id, TypeDocument typeDocument);
}
