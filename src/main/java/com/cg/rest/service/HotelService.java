package com.cg.rest.service;

import java.util.List;

import com.cg.rest.entity.Hotel;

public interface HotelService {
	public Hotel addHotel(Hotel hotel) throws Exception;
	public List<Hotel> getAllHotels();
	public String deleteHotel(int id)throws Exception;
	public Hotel searchHotel(int id)throws Exception;
	public Hotel updateHotel(Hotel hotel,int id)throws Exception;
	public List<Hotel> searchByName(String name)throws Exception;
}
