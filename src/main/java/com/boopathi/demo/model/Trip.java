package com.boopathi.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Getter
@Setter
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String destination;
    private String date;
    private Double price;

    @JsonIgnore
	@OneToMany(mappedBy = "trip", cascade = CascadeType.ALL)
    private List<Booking> bookings;
}
