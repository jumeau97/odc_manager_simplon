/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.backend.controller;

import com.example.backend.model.Role;
import com.example.backend.service.RoleServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author hady.fofana
 */

@RestController
@RequestMapping("/odcmanager/api/role")
public class RoleControler {

    @Autowired
    RoleServiceImp roleimp;

    @PostMapping("/add")
    public Role save (@RequestBody Role role){
        return roleimp.ajouter_role(role);
    }

    @GetMapping("/all")
    public List<Role> listeRole(){
        return roleimp.listeRole();
    }

    @GetMapping("/{id}")
    public Optional<Role> getRoleById(@PathVariable Long id){
        return roleimp.getRoleById(id);
    }

    @DeleteMapping ("/delete/{id}")
    public String supprimer(@PathVariable Long id){
        roleimp.suprimer_role(id);
        return "Rôle supprimé avec succèss...";
    }

    @PutMapping ("/update/{id}")
    public String update(@RequestBody Role role, @PathVariable Long id){
        roleimp.modifier_role(id, role);
        return "Rôle modifié avec succèss...";
    }
}
