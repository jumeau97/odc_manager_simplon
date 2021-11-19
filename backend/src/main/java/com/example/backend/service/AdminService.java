package com.example.backend.service;

import com.example.backend.model.Administrateur;
import com.example.backend.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    AdminRepository adminRepository;

    //La liste
    public List<Administrateur> list(){
        return adminRepository.findAll();
    }

    //Inserer un admin
    public Administrateur saveAdmin(Administrateur admin){
        Administrateur a;

        try{
            a=adminRepository.save(admin);
        }catch (Exception e){
            e.printStackTrace(System.out);
            System.out.println("Une erreur est survenue");
        }

        System.out.println("Enregistrer avec succès");
        return admin;

    }
}
