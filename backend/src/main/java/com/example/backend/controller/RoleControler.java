/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.backend.controller;

import com.example.backend.model.Role;
import com.example.backend.service.RoleServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
   RoleServiceImp roleserviceimp;
   
   @PostMapping("/role/add")
    public Role save (@RequestBody Role role){
        return roleserviceimp.ajouter_role(role);
    }

}
