package com.fis.app.model;

import java.util.List;

public class CarSeat {
	  private int SeatNumber;
	public CarSeat() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CarSeat(int SeatNumber) {
		super();
		this.SeatNumber= SeatNumber;
	}



	public int getSeatNumber() {
		return SeatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		SeatNumber = seatNumber;
	}

	@Override
	public String toString() {
		return "CarSeat [SeatNumber=" + SeatNumber + "]";
	}
	
}
  
