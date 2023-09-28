package com.ecommerce.infrastructure.typedocument.adapters.input;

import com.ecommerce.application.typedocument.ports.input.TypeDocumentUseCase;
import com.ecommerce.domain.typedocument.entities.TypeDocument;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/documents")
public class TypeDocumentController {
    private final TypeDocumentUseCase useCase;

    public TypeDocumentController(TypeDocumentUseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping("/all")
    public List<TypeDocument> getAll() {
        return useCase.getAll();
    }

    @PostMapping("/create")
    public TypeDocument create(@RequestBody TypeDocument body) {
        return useCase.save(body);
    }
}
