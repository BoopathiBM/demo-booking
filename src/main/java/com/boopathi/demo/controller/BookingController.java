package com.boopathi.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boopathi.demo.dto.BookingRequestDTO;
import com.boopathi.demo.model.Booking;
import com.boopathi.demo.service.BookingService;


@RestController
@RequestMapping("/api/bookings")
public class BookingController {

	@Autowired
	private BookingService bookingService;

	public BookingController(BookingService bookingService){
		this.bookingService = bookingService;
	}


	@PostMapping("/book")
	public ResponseEntity<Booking> createBooking(@RequestBody BookingRequestDTO bookingDTO ){
		
			Booking booking = bookingService.createBooking(bookingDTO);
			return ResponseEntity.ok(booking);
		
	}

	@GetMapping
	public List<Booking> getAllBookings(){
		return bookingService.getAllBookings();
		
	}


}
