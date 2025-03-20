package com.boopathi.demo.dto;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookingRequestDTO {

	private Long customerId;
	private Long tripId;
	private LocalDate bookingDate;

}
