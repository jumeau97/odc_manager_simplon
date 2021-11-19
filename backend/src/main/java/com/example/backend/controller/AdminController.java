package com.example.backend.controller;

import com.example.backend.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("odcmanager/api")
public class AdminController {

    @Autowired
    AdminService adminService;
    
@GetMapping("/list")
    public ResponseEntity<?> list(){
    return new ResponseEntity<>(adminService.list(), HttpStatus.OK);
}

}
