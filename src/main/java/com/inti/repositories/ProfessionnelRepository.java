package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Professionnel;

@Repository
public interface ProfessionnelRepository extends JpaRepository<Professionnel, Long> {

}
