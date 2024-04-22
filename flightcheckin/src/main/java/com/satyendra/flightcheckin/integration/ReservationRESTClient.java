package com.satyendra.flightcheckin.integration;

import com.satyendra.flightcheckin.integration.dto.Reservation;
import com.satyendra.flightcheckin.integration.dto.ReservationUpdateRequest;

public interface ReservationRESTClient {
	
	public Reservation findReservation(Long id);
	public Reservation updateReservation(ReservationUpdateRequest request);

}
