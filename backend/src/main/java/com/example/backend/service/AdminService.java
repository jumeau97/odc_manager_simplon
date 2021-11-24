package com.example.backend.service;

import com.example.backend.model.Administrateur;
import com.example.backend.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

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
    public void saveAdmin(Administrateur admin){
        adminRepository.save(admin);
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
        adminRepository.deleteById(id);
    }

    public Administrateur getAnAdmin(Long id) {
        return adminRepository.findById(id).get();
    }
}
