package com.example.backend.repository;

import com.example.backend.model.Administrateur;
import com.example.backend.model.Etat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import javax.transaction.Transactional;

@RepositoryRestResource
public interface AdminRepository extends JpaRepository<Administrateur, Long> {

//    @Transactional
//    @Modifying
//    @Query("update Administrateur admin set admin.nom = :nom, admin.prenom = :prenom, admin.login = :login," +
//            "admin.password = :password, admin.email = :email, admin.etat = :etat where admin.id = :id")
//    void updateAdmin(@Param(value = "nom") String nom, @Param(value = "prenom") String prenom, @Param(value = "login") String login,
//                     @Param(value = "password") String password, @Param(value = "email") String email, @Param(value = "etat") Etat etat,
//                     @Param(value = "id") Long id);


}
