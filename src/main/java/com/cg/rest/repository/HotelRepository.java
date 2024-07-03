package com.cg.rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.rest.entity.Hotel;
@Repository
public interface HotelRepository extends JpaRepository<Hotel, Integer>{
	Hotel findByHotelId(Integer id);
	List<Hotel> findByHotelName(String s);
}
