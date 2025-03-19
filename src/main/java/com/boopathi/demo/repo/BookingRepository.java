package com.boopathi.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boopathi.demo.model.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking,Long> {

}
