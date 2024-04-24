package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.bean.VehicleBean;
import com.example.dao.VehicleDao;
import com.example.service.VehicleService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class VehicleController
{
	
	@Autowired
	VehicleService vser;
	
	@RequestMapping(path="/")
	public String home()
	{
		return "AddVehicle.jsp";
	}
		
	@PostMapping(path="/addVehicle")
	public String addVehicle(@RequestBody VehicleBean vehicle)
	{
		vser.addVehicle(vehicle);
		return "Details Saved";
	}
	
	
	
//	@GetMapping(path ="/viewVehicle")
//	public ModelAndView viewVehicle()
//	{
//		List<VehicleBean> det=vser.viewVehicle();
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("ViewVehicle.jsp");
//		mv.addObject("result",det);
//		return mv;
//	}
	

	@GetMapping("/vehicles")
	public List<VehicleBean> viewVehicle(Model model)
	{
		List<VehicleBean> vehiclestotal =vser.viewVehicle();
		int totalVehicles = vehiclestotal.size();
		model.addAttribute("vehiclestotal",vehiclestotal);
		model.addAttribute("totalVehicles",totalVehicles);
		return vehiclestotal;
	}
	
//	@GetMapping(path="/showvehicles")
//	public List<VehicleBean> viewVehicle()
//	{
//		List<VehicleBean> vehicles=vser.viewVehicle();
//		return vehicles;
//	}
}
