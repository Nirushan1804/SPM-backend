package com.Westine.HotelWestine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Westine.HotelWestine.model.Room;
import com.Westine.HotelWestine.repository.RoomRepo;

@Service
public class RoomServiceImpl implements RoomService{

	@Autowired
	private RoomRepo roomrepo;
	@Override
	public Room saveRoom(Room room) {
		// TODO Auto-generated method stub
		return Room.save(room);
	}
}
