package com.ecommerce.application.typedocument.ports.input;

import com.ecommerce.domain.typedocument.entities.TypeDocument;

import java.util.List;

public interface TypeDocumentUseCase {
    TypeDocument save(TypeDocument typeDocument);
    List<TypeDocument> getAll();
    TypeDocument getById(int id);
    boolean deleteById(int id);
    TypeDocument getByName(String name);
}
