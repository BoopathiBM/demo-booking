package com.boopathi.demo;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookingDTO {

	private Long customerId;
	private Long tripId;
	private LocalDate bookingDate;

}
