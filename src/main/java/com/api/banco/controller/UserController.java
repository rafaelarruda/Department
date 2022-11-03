package com.api.banco.controller;

import com.api.banco.entities.User;
import com.api.banco.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// permite o acesso no navegador
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired   // Injeção de Dependência
    private UserRepository repository;


    // Visualizar um lista com os dados do User
    @GetMapping  // visualizar no http
    public List<User> findAll() {
        List<User> result = repository.findAll();
        return result;
    }


    // visualizar no http somente o id adicionado
    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        User result = repository.findById(id).get();
        return result;
    }


    // ADicionando e Salvando dados novos na Classe USER
    @PostMapping
    public User insert(@RequestBody User user) {
        User result = repository.save(user);
        return result;
    }
}
