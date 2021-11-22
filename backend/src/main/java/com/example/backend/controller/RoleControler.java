/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.backend.controller;

import com.example.backend.model.Role;
import com.example.backend.service.RoleService;
import com.example.backend.service.RoleServiceImp;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author hady.fofana
 */
@RestController
@RequestMapping("/api")
public class RoleControler {

   @Autowired
  RoleServiceImp roleimp;
   
   @PostMapping("/role/add")
    public Role save (@RequestBody Role role){
        return roleimp.ajouter_role(role);
    }
    
    @GetMapping("/role/all")
   public List <Role> listeRole(){
       return roleimp.listeRole();
   }
   
   @GetMapping("/role/detail/{id}")
   public Optional<Role> getRoleById(@PathVariable Long id){
       return roleimp.getRoleById(id);
   }
   
    @DeleteMapping ("/role/delete/{id}")
    public void supprimer(@PathVariable Long id){
        roleimp.suprimer_role(id);
        
    }
    
    @PutMapping ("/role/update/{id}")
    public Role update(@RequestBody Role role, @PathVariable Long id){
        return roleimp.modifier_role(id, role);
    }
    
    
}
