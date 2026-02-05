package com.app.ecom.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Gera get e set para os objetos
@NoArgsConstructor // Gera um construtor Vazio
//@AllArgsConstructor // Gera um construtor para o objeto com todos os params
@Entity(name = "user_table") // Troca nome da entidade
//@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private UserRole role =  UserRole.CUSTOMER;

//    public User() {
//        //Necessário para instancia do JPA. Sem isso não rola.
//        //Isso é um dos requisitos para entidades. Sempre ter um constructor vazio
//    }
//
//    public User(Long id, String firstName, String lastName) {
//        this.id = id;
//        this.firstName = firstName;
//        this.lastName = lastName;
//    }
}
