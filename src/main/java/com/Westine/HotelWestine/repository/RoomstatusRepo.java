package com.Westine.HotelWestine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Westine.HotelWestine.model.RoomStatus;

@Repository
public interface RoomstatusRepo extends JpaRepository<RoomStatus, Long>{

}
