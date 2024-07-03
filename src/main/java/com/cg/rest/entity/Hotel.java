package com.cg.rest.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hotel {
	@Id
	private Integer hotelId;
	private String hotelName;
	private String hotelAddress;
	
	public Hotel(Integer hotelId, String hotelName, String hotelAddress) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.hotelAddress = hotelAddress;
	}
	public Hotel() {
		super();
	}
	public Integer getHotelId() {
		return hotelId;
	}
	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getHotelAddress() {
		return hotelAddress;
	}
	public void setHotelAddress(String hotelAddress) {
		this.hotelAddress = hotelAddress;
	}
	@Override
	public String toString() {
		return "Hotel [hotelId=" + hotelId + ", hotelName=" + hotelName + ", hotelAddress=" + hotelAddress + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(hotelAddress, hotelId, hotelName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hotel other = (Hotel) obj;
		return Objects.equals(hotelAddress, other.hotelAddress) && Objects.equals(hotelId, other.hotelId)
				&& Objects.equals(hotelName, other.hotelName);
	}
	
	
}
