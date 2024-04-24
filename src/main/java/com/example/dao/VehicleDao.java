package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bean.VehicleBean;

@Repository
public interface VehicleDao extends JpaRepository<VehicleBean, String>
{
	
}
