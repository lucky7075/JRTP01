package com.example.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class VehicleBean 
{
	@Id
	private String VehicleNo;
	private String VehicleName;
	private String SeatingCapacity;
	private String DriverID;
	private String VehicleType;
	private int FarePerKm;
	public String getVehicleNo() {
		return VehicleNo;
	}
	public void setVehicleNo(String vehicleNo) {
		VehicleNo = vehicleNo;
	}
	public String getVehicleName() {
		return VehicleName;
	}
	public void setVehicleName(String vehicleName) {
		VehicleName = vehicleName;
	}
	public String getSeatingCapacity() {
		return SeatingCapacity;
	}
	public void setSeatingCapacity(String seatingCapacity) {
		SeatingCapacity = seatingCapacity;
	}
	public String getDriverID() {
		return DriverID;
	}
	public void setDriverID(String driverID) {
		DriverID = driverID;
	}
	public String getVehicleType() {
		return VehicleType;
	}
	public void setVehicleType(String vehicleType) {
		VehicleType = vehicleType;
	}
	public int getFarePerKm() {
		return FarePerKm;
	}
	public void setFarePerKm(int farePerKm) {
		FarePerKm = farePerKm;
	}
	@Override
	public String toString() {
		return "VehicleBean [VehicleNo=" + VehicleNo + ", VehicleName=" + VehicleName + ", SeatingCapacity="
				+ SeatingCapacity + ", DriverID=" + DriverID + ", VehicleType=" + VehicleType + ", FarePerKm="
				+ FarePerKm + "]";
	}
	
	
}
