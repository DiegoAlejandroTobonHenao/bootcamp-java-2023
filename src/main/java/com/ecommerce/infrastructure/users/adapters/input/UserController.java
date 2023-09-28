package com.ecommerce.infrastructure.users.adapters.input;

import com.ecommerce.application.users.ports.input.IUserService;
import com.ecommerce.domain.users.entities.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final IUserService useCase;

    public UserController(IUserService useCase) {
        this.useCase = useCase;
    }

    @GetMapping("/all")
    public List<User> getAll() {
        return useCase.getAll();
    }

    @PostMapping("/create")
    public User save(@RequestBody User user) {
        return useCase.save(user);
    }
}
