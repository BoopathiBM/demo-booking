package com.boopathi.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boopathi.demo.BookingDTO;
import com.boopathi.demo.model.Booking;
import com.boopathi.demo.model.Customer;
import com.boopathi.demo.model.Trip;
import com.boopathi.demo.repo.BookingRepository;
import com.boopathi.demo.repo.CustomerRepository;
import com.boopathi.demo.repo.TripRepository;

@Service
public class BookingService {

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private TripRepository tripRepository;

	@Autowired
	private BookingRepository bookingRepository;


	public Booking createBooking(BookingDTO bookingDTO){

		Optional<Customer> customerOpt = customerRepository.findById(bookingDTO.getCustomerId());
		Optional<Trip> tripOpt = tripRepository.findById(bookingDTO.getTripId()); 

		if(customerOpt.isEmpty()|| tripOpt.isEmpty()){
			throw new IllegalArgumentException("invalid");
		}

		Booking booking = new Booking();
		booking.setCustomer(customerOpt.get());
		booking.setTrip(tripOpt.get());
		booking.setBookingDate(bookingDTO.getBookingDate());
		booking.setStatus("confirm");

		return (Booking) bookingRepository.save(booking);



		
	}

}
