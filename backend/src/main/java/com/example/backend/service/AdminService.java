package com.example.backend.service;

import com.example.backend.model.Administrateur;
import com.example.backend.model.payload.AuthResponse;
import com.example.backend.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    //Mettre à jour l'infos d'un administrateur
    public Administrateur updateAdmin(Long id, Administrateur admin){
        Administrateur ad;
         ad= adminRepository.getById(id);
       // System.out.println("l'id recuperer"+a);
        try{
            if(ad!=null){
                ad.setNom(admin.getNom());
                ad.setPrenom(admin.getPrenom());
                ad.setLogin(admin.getLogin());
                ad.setPassword(admin.getPassword());
                ad.setEmail(admin.getEmail());
                ad.setEtat(admin.getEtat());
                adminRepository.save(ad);

                System.out.println("insertion reussie");
            }
        }catch(Exception e){
            e.printStackTrace(System.out);
            System.out.println("une erreur s'est produite");

        }
        System.out.println("Modification reussie");
        return admin;

    }

    //supprimer l'info d'un administrateur

    public void deleteAdmin(Long id){

        try{
            adminRepository.deleteById(id);
            System.out.println("suppresion reussie");
        }catch (Exception e){
            e.printStackTrace(System.out);
            System.out.println("une erreur est survenu");
        }


    }

    public Optional<Administrateur>  adminById(Long id){
       Optional<Administrateur> a;
        a=adminRepository.findById(id);


        try{
            if (a==null){
                System.out.println("vide");
            }

        }catch (Exception e){
            e.printStackTrace(System.out);

        }
        return a;
    }

    //Authentification

    public AuthResponse Auth(String login, String password){
        Administrateur a;


        try{
            a=adminRepository.findByLoginAndPassword(login,password);
            if(a==null){
            return AuthResponse.error();
            }
        }catch (Exception e){
            e.printStackTrace(System.out);
        }
        return AuthResponse.success();
    }
}
