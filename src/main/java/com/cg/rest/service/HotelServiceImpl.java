package com.cg.rest.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.rest.entity.Hotel;
import com.cg.rest.repository.HotelRepository;
@Service
public class HotelServiceImpl implements HotelService{
	@Autowired
	HotelRepository hotelRepository;
	//public static List<Hotel> list=new ArrayList<>();
//	static {
//		list.add(new Hotel(1,"Surya Hotel","Vijayawada"));
//		list.add(new Hotel(4,"Amiha Hotel","Spain"));
//		list.add(new Hotel(7,"Vengamamba","Mrugadha"));
//		list.add(new Hotel(9,"Supriya Restaurent","Egattur"));
//		list.add(new Hotel(11,"Bhai Biryani","Navalur"));
//		list.add(new Hotel(12,"Amiha Hotel","Japan"));
//		list.add(new Hotel(16,"Amiha Hotel","India"));
//	}
	@Override
	public Hotel addHotel(Hotel hotel) throws Exception {
		Hotel h=hotelRepository.findByHotelId(hotel.getHotelId());
		if(h==null) {
			hotelRepository.save(hotel);
			return hotel;
		}else {
			return null;
		}
	}

	@Override
	public String deleteHotel(int id) throws Exception {
		Hotel h=hotelRepository.findByHotelId(id);
		if(h!=null) {
			hotelRepository.deleteById(id);
			return "Successfully Deleted";
		}else {
			return null;
		}
	}

	@Override
	public Hotel searchHotel(int id) throws Exception{
		// TODO Auto-generated method stub
		Hotel h=hotelRepository.findByHotelId(id);
		if(h==null) {
			return null;
		}
		else return h;
	}

	@Override
	public Hotel updateHotel(Hotel hotel, int id) throws Exception {
		Hotel h=hotelRepository.findByHotelId(id);
		if(h==null) {
			return null;
		}else {
			hotelRepository.save(hotel);
			return h;
		}
		
	}

	@Override
	public List<Hotel> searchByName(String name) throws Exception {
		List<Hotel> h=hotelRepository.findByHotelName(name);
		if(h.size()==0) {
			throw new Exception("Hotel name Doesn't Exist");
		}else {
			return h;
		}
	}

	@Override
	public List<Hotel> getAllHotels() {
		// TODO Auto-generated method stub
		return hotelRepository.findAll();
	}

}
