package com.Westine.HotelWestine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Westine.HotelWestine.model.Booking;

public interface BookingRepo extends JpaRepository<Booking, Long>{

}
