package com.ecommerce.infrastructure.typedocument.adapters.input;

import com.ecommerce.application.typedocument.ports.input.TypeDocumentUseCase;
import com.ecommerce.commons.ResponseData;
import com.ecommerce.domain.typedocument.entities.TypeDocument;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/documents")
public class TypeDocumentController {
    private final TypeDocumentUseCase useCase;

    public TypeDocumentController(TypeDocumentUseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping(value = "/all", produces = "application/json")
    public ResponseData getAll() {
        return new ResponseData(
                useCase.getAll(),
                HttpStatus.OK.toString(),
                "Documentos recuperados satisfactoriamente"
        );
    }

    @PostMapping("/create")
    public TypeDocument create(@RequestBody TypeDocument body) {
        return ;
    }
}
