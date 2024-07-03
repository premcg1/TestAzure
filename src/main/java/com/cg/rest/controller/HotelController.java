package com.cg.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.rest.entity.Hotel;
import com.cg.rest.service.HotelService;

@Controller
@RequestMapping("/public")
public class HotelController {
	@Autowired
	HotelService hotelService;
	@GetMapping("/hotels")
	public ResponseEntity<List<Hotel>> getAllHotels(){
		return new ResponseEntity<List<Hotel>>(hotelService.getAllHotels(), HttpStatus.OK);
	}
	@GetMapping("/hotels/{name}")
	public ResponseEntity<List<Hotel>> getHotelsByName(@PathVariable("name") String name) throws Exception{
		return new ResponseEntity<List<Hotel>>(hotelService.searchByName(name), HttpStatus.OK);
	}
	@GetMapping("/hotel/{id}")
	public ResponseEntity<Hotel> getById(@PathVariable("id") int id) throws Exception{
		return new ResponseEntity<Hotel>(hotelService.searchHotel(id), HttpStatus.OK);
	}
	@PostMapping("/hotels")
	public ResponseEntity<Hotel> addHotel(@RequestBody Hotel hotel) throws Exception{
		return new ResponseEntity<Hotel>(hotelService.addHotel(hotel), HttpStatus.ACCEPTED);
	}
	@PutMapping("/hotel/{id}")
	public ResponseEntity<Hotel> updateHotelById(@RequestBody Hotel hotel,@PathVariable("id") int id) throws Exception{
		return new ResponseEntity<Hotel>(hotelService.updateHotel(hotel, id), HttpStatus.OK);
	}
	@DeleteMapping("/hotel/{id}")
	public ResponseEntity<String> deleteById(@PathVariable("id") int id) throws Exception{
		return new ResponseEntity<String>(hotelService.deleteHotel(id), HttpStatus.NO_CONTENT);
	}
	
	
}
