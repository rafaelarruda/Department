package com.api.banco.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;


    @ManyToOne  // muitos usuários para 1 departamento
    @JoinColumn(name="department_id")  // Chave Estrangeira
    private Department department;


    // Construtor vazio
    public User() {
    }
}
