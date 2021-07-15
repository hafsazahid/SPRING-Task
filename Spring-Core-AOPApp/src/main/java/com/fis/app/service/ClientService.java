package com.fis.app.service;

import org.springframework.stereotype.Component;

@Component
public class ClientService {

	public void doBookProduct()
	{
		
		System.out.println(" Product code executing .... ");
		
	}
	
	public void doMakePayment()
	{
	
		System.out.println(" makePayment code executing .... ");
		
	}
	
	public void doMakePayment(String paymentType)
	{
	
		System.out.println(" makePayment code executing .... "+paymentType);
	
	}

	
	
}
