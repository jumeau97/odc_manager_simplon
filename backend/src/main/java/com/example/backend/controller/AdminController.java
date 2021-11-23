package com.example.backend.controller;

import com.example.backend.model.Administrateur;
import com.example.backend.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/odcmanager/api/admin")
public class AdminController {

    @Autowired
    AdminService adminService;

    //l'insertion
    @PostMapping("/add")
    public String saveAnAdmin(@RequestBody Administrateur admin){
        adminService.saveAdmin(admin);
        return "Administrateur ajouté avec succèss...";
    }

    //Recuperer un administrateur par son ID
    @GetMapping("/{id}")
    public Administrateur getAnAdmin(@PathVariable("id") Long id) {
        return adminService.getAnAdmin(id);
    }

    //la liste globale
    @GetMapping("/all")
    public List<Administrateur> list(){
        return adminService.list();
    }

    //la modification
    @PutMapping("/update/{id}")
    public String update(@PathVariable(name = "id") Long id, @RequestBody Administrateur admin){
        adminService.updateAdmin(id, admin);
        return "Administrateur modifié avec succèss...";
    }

    //Suppression
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable(name = "id") Long id){
        adminService.deleteAdmin(id);
    }

}
