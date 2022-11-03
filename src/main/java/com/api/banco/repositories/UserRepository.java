package com.api.banco.repositories;

import com.api.banco.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

// Acesso ao banco de dados
public interface UserRepository extends JpaRepository<User, Long> {
}
