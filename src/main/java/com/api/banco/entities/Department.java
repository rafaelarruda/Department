package com.api.banco.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "tb_department")
public class Department {

    @Id  // Chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;


    // Construtor
    public Department() {
    }
}
