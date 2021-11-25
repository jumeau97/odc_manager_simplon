package com.example.backend.repository;

import com.example.backend.model.Participant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipantRepository  extends JpaRepository<Participant,Long> {
    public Participant getByTelephone(Integer telephone);
}
