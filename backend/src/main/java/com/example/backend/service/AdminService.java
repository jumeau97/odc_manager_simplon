package com.example.backend.service;

import com.example.backend.model.Administrateur;
import com.example.backend.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    AdminRepository adminRepository;

    public List<Administrateur> list(){
        return adminRepository.findAll();
    }
}
