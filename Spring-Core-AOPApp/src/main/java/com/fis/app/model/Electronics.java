package com.fis.app.model;

import java.awt.List;
import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype")

	
public class Electronics implements Serializable,Comparable<Electronics> {

		@Value("1")
		private int deviceId;
		@Value("80000")
		private int price;
		@Value("8")
		private int Rating;
		@Value("Black")
		private String color;
		@Autowired
		private Memory m;
		private List deviceTypeList;
		public Electronics() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public Electronics(int deviceId, int price,int Rating, String color,Memory m,List deviceTypeList) {
			super();
			this. deviceId = deviceId;
			this.price= price;
			this.color= color;
			this.Rating= Rating;
			this.m=m;
			this.deviceTypeList=deviceTypeList;
		}

		public int getDeviceId() {
			return deviceId;
		}

		public void setDeviceId(int deviceId) {
			this.deviceId = deviceId;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public int getRating() {
			return Rating;
		}

		public void setRating(int rating) {
			Rating = rating;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public Memory getM() {
			return m;
		}

		public void setM(Memory m) {
			this.m = m;
		}

		public List getDeviceTypeList() {
			return deviceTypeList;
		}

		public void setDeviceTypeList(List deviceTypeList) {
			this.deviceTypeList = deviceTypeList;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + Rating;
			result = prime * result + ((color == null) ? 0 : color.hashCode());
			result = prime * result + deviceId;
			result = prime * result + ((m == null) ? 0 : m.hashCode());
			result = prime * result + price;
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
			Electronics other = (Electronics) obj;
			if (Rating != other.Rating)
				return false;
			if (color == null) {
				if (other.color != null)
					return false;
			} else if (!color.equals(other.color))
				return false;
			if (deviceId != other.deviceId)
				return false;
			if (m == null) {
				if (other.m != null)
					return false;
			} else if (!m.equals(other.m))
				return false;
			if (price != other.price)
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Electronics [deviceId=" + deviceId + ", price=" + price + ", Rating=" + Rating + ", color=" + color
					+ ", m=" + m + "]";
		}
		
		public void doInIt()
		{
			System.out.println(" do init called ");
			// provide path to the file 
		}
		
		public void doDestroy()
		{
			// write data to the file
			System.out.println(" do destroy  called ");
		}

		public int compareTo(Electronics o) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		

}
