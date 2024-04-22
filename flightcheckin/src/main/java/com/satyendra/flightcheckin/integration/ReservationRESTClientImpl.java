package com.satyendra.flightcheckin.integration;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.satyendra.flightcheckin.integration.dto.Reservation;
import com.satyendra.flightcheckin.integration.dto.ReservationUpdateRequest;

@Component
public class ReservationRESTClientImpl implements ReservationRESTClient {

	private static final String Reservation_Rest_Url = "http://localhost:8080/flightreservation/reservations";

	@Override
	public Reservation findReservation(Long id) {
		RestTemplate restTemplate=new RestTemplate();
		Reservation reservation=restTemplate.getForObject(Reservation_Rest_Url+"/"+id,Reservation.class);
		return reservation;
	}

	@Override
	public Reservation updateReservation(ReservationUpdateRequest request) {
		RestTemplate restTemplate=new RestTemplate();
		Reservation reservation=restTemplate.postForObject(Reservation_Rest_Url,request,Reservation.class);
		return reservation;
	}

}
