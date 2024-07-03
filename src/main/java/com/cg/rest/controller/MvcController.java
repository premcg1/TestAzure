package com.cg.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;
import com.cg.rest.entity.Hotel;
import com.cg.rest.service.HotelService;



@Controller
@RequestMapping("/home")
public class MvcController {
	@Autowired
	HotelService hotelService;
	@GetMapping("/insert")
	public String insertPage() {
		return "insert";
	}
	@ RequestMapping(value="/inserting", method=RequestMethod.POST)
    public String  getRegistrationProcess(@ModelAttribute Hotel hotel, Model model) throws Exception
    {
   	 
   	    
   	    Hotel h=hotelService.addHotel(hotel);
   	     model.addAttribute("result", h);
   	 
   	  return "success";
    }
	@GetMapping("/all")
    public String getAllRecords(Model model) {
        List<Hotel> records = hotelService.getAllHotels();
        System.out.println(records.size());
        // Add records to the model to pass them to the view
        model.addAttribute("records", records);
        
        return "getAll"; 
    }
	@GetMapping("/search")
	public String search() {
		return "search";
	}
	@GetMapping("/searchHotel")
    public String searchHotel(@RequestParam("id") Integer hotelId, Model model) throws Exception {
        Hotel hotel = hotelService.searchHotel(hotelId);
        model.addAttribute("hotel",hotel);
        return "searchResult";
}
	@GetMapping("/delete")
	public String delete() {
		return "delete";
	}
	@GetMapping("/deleteHotel")
    public String deleteHotel(@RequestParam("id") Integer hotelId, Model model) throws Exception {
        String s = hotelService.deleteHotel(hotelId);
        model.addAttribute("isDeleted",s);
        return "deleteResult";
}
	@GetMapping("/update")
	public String updateHotel() {
		return "update";
	}
	@PostMapping("/updateHotel")
    public String  update(@ModelAttribute Hotel hotel, Model model) throws Exception
    {
   	 	Hotel h1=hotelService.updateHotel(hotel, hotel.getHotelId());
   	    model.addAttribute("result", h1);
   	  return "updateResult";
    }
	@GetMapping("/viewmenu")
	public String getHomePage() {
		return "menu";
	}
}