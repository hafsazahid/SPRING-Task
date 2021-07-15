package com.fis.app.model;

import java.io.Serializable;

import java.util.List;
import java.util.Objects;

public class Car implements Serializable,Comparable<Car> {

	private int carNumber;
	private String carName;
	private Engine e;
	private MusicSystem ms;
    private List<CarSeat> carSeats;
	
	
	public Car(int carNumber, String carName, Engine e, MusicSystem ms, List<CarSeat> carSeats) {
		super();
		this.carNumber = carNumber;
		this.carName = carName;
		this.e = e;
		this.ms = ms;
		this.carSeats = carSeats;
	}
	public Car() {
		
		super();
		System.out.println(" Constructor called");
	}
	
	
	
	
	public List<CarSeat> getCarSeats() {
		return carSeats;
	}
	public void setCarSeats(List<CarSeat> carSeats) {
		this.carSeats = carSeats;
	}
	public MusicSystem getMs() {
		return ms;
	}
	public void setMs(MusicSystem ms) {
		this.ms = ms;
	}
	public Engine getE() {
		return e;
	}
	public void setE(Engine e) {
		this.e = e;
	}
	public int getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(int carNumber) {
		this.carNumber = carNumber;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carName == null) ? 0 : carName.hashCode());
		result = prime * result + carNumber;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (carName == null) {
			if (other.carName != null)
				return false;
		} else if (!carName.equals(other.carName))
			return false;
		if (carNumber != other.carNumber)
			return false;
		return true;
	}
	
	
	
	public int compareTo(Car car) {
		return this.carName.compareTo(car.carName);
	}
	@Override
	public String toString() {
		return "Car [carNumber=" + carNumber + ", carName=" + carName + ", e=" + e + ", ms=" + ms + ", carSeats="
				+ carSeats + "]";
	}
	
	
	// -----------  Spring life cycle methods -------
	
	
}//end class
