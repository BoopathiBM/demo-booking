package com.boopathi.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boopathi.demo.BookingDTO;
import com.boopathi.demo.model.Booking;
import com.boopathi.demo.service.BookingService;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {

	@Autowired
	private BookingService bookingService;


	@PostMapping("/book")
	public ResponseEntity<String> createBooking(@RequestBody BookingDTO bookingDTO ){
		
			Booking booking = bookingService.createBooking(bookingDTO);
			return ResponseEntity.ok("Booking successful.  Id:" + booking.getId());
		
		
	}

}
