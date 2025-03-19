package com.boopathi.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boopathi.demo.model.Trip;

@Repository
public interface TripRepository extends JpaRepository<Trip, Long> {

}
