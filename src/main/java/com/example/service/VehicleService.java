package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.VehicleDao;
import com.example.bean.VehicleBean;

@Service
public class VehicleService
{
	
	@Autowired
	VehicleDao vdao;
	
	public List<VehicleBean> viewVehicle()
	{
		return vdao.findAll();
	}
	
	public String addVehicle(VehicleBean vbean) 
	{
		vdao.save(vbean);
		return "";
	}
}
