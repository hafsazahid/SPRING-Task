package com.fis.app.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


	
 @Component     
 public class Memory
 {
	 
	  @Value("999")
	  private int ramSize;

	public Memory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Memory(int ramSize) {
		super();
		this.ramSize = ramSize;
	}

	public int getRamSize() {
		return ramSize;
	}

	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}

	@Override
	public String toString() {
		return "Memory [ramSize=" + ramSize + "]";
	}
	  
}