package com.fis.app.model;

public class DeviceType {
	
	
	private int deviceTypeId;
	private int  deviceTypeRating;
	public DeviceType() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DeviceType(int deviceTypeId, int deviceTypeRating) {
		super();
		this.deviceTypeId = deviceTypeId;
		this.deviceTypeRating = deviceTypeRating;
	}
	public int getDeviceTypeId() {
		return deviceTypeId;
	}
	public void setDeviceTypeId(int deviceTypeId) {
		this.deviceTypeId = deviceTypeId;
	}
	public int getDeviceTypeRating() {
		return deviceTypeRating;
	}
	public void setDeviceTypeRating(int deviceTypeRating) {
		this.deviceTypeRating = deviceTypeRating;
	}
	@Override
	public String toString() {
		return "DeviceType [deviceTypeId=" + deviceTypeId + ", deviceTypeRating=" + deviceTypeRating + "]";
	}
	
	
}
