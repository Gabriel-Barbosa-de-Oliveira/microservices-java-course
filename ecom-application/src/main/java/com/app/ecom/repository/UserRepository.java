package com.app.ecom.repository;

import com.app.ecom.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    //Adiciona o tipo de dado a ser manipulado pelo JPA
    //Nesse caso vai mexer na primrary key user com id do tipo long
    //Não é necessario escrever codigo nenhum aqui. JPA toma conta disso
}
