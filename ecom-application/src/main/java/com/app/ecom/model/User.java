package com.app.ecom.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

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
    private UserRole role = UserRole.CUSTOMER;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    //Cascade - Serve para propagar as operações para o objetos referenciados
    //Orphan Removal - previne que o item delete apenas o usuario e o endereço não
    //Nesse caso se deletar um usuário ... não faz sentido que um endereço exista
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    @CreationTimestamp
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;

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
