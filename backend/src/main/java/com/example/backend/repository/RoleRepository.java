/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.backend.repository;


import com.example.backend.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;



/**
 *
 * @author hady.fofana
 */
public interface RoleRepository extends JpaRepository<Role,Long>{
    
}
