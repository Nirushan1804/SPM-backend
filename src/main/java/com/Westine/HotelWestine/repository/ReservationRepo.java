package com.Westine.HotelWestine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Westine.HotelWestine.model.HallReservation;

public interface ReservationRepo extends JpaRepository<HallReservation, Integer>{

}
