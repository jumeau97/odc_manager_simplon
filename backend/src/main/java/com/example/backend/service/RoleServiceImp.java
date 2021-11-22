/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.backend.service;

import com.example.backend.model.Role;
import com.example.backend.repository.RoleRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author hady.fofana
 */

@Service
public class RoleServiceImp implements RoleService{

    @Autowired
    RoleRepository rolerepository;

    @Override
    public Role ajouter_role(Role role) {
        return rolerepository.save(role);
    }

    @Override
    public Role modifier_role(Long Id, Role role) {
        return rolerepository.save(role);
    }

    @Override
    public void suprimer_role(Long Id) {
         rolerepository.deleteById(Id);
    }

    @Override
    public List<Role> listeRole() {
        return rolerepository.findAll();
    }

    @Override
    public Optional<Role> getRoleById(Long id) {
        return rolerepository.findById(id);
    }
    
    
}
