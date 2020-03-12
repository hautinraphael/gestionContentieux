package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Particulier;

@Repository
public interface ParticulierRepository extends JpaRepository<Particulier, Long> {

}
