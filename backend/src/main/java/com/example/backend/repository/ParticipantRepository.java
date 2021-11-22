package com.example.backend.repository;

import com.example.backend.model.Participant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface ParticipantRepository  extends JpaRepository<Participant,Long> {
}
