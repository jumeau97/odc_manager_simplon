package com.example.backend.controller;

import com.example.backend.exceptions.ErrorCodes;
import com.example.backend.exceptions.InvalidEntityException;
import com.example.backend.model.Administrateur;
import com.example.backend.service.AdminService;
import com.example.backend.validator.AdministratorValidator;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/odcmanager/api")
@Slf4j
public class AdminController {

    @Autowired
    AdminService adminService;

    //la liste globale
    @GetMapping("/list")
    public ResponseEntity<?> list(){ 
    return new ResponseEntity<>(adminService.list(), HttpStatus.OK);
}

    //l'insertion
    @PostMapping("/save")
    public @ResponseBody ResponseEntity<?> save(@RequestBody Administrateur admin){
    	List<String>errors= AdministratorValidator.validator(admin)
    	if(!errors.isEmpty()) {
    		log.error("Administrateur is not valid {}",admin);
    		throw new InvalidEntityException("l'administrateur n'est pas valide",ErrorCodes.ADMINISTRATEUR_INVALID,errors);
    	}
    return new ResponseEntity<>(adminService.saveAdmin(admin), HttpStatus.OK);
    }

    //la modification
    @PutMapping("/update/{id}")
    public @ResponseBody ResponseEntity<?> update(@RequestBody Administrateur admin,@PathVariable(name = "id") Long id){
        return new ResponseEntity<>(adminService.updateAdmin(id, admin), HttpStatus.OK);
    }

    //Suppression
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable(name = "id") Long id){
        adminService.deleteAdmin(id);
    }

    //public @ResponseBody ResponseEntity<?> deleteAdmin(@PathVariable(value = "id") Long id){
        //return new ResponseEntity<>(adminService.deleteAdmin(id), HttpStatus.OK);

}
