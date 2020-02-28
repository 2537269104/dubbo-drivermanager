package com.liuhao.service.impl;

import java.util.List;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liuhao.mapper.DriverManagerMapper;
import com.liuhao.pojo.City;
import com.liuhao.pojo.Driver;
import com.liuhao.pojo.DriverBreak;
import com.liuhao.service.DriverManagerService;
@Service(interfaceClass = DriverManagerService.class)
public class DriverManagerServiceImpl implements DriverManagerService {

	@Autowired
	private DriverManagerMapper driverManagerMapper;
	
	@Override
	public List<Driver> getDriverList(String name) {
		// TODO Auto-generated method stub
		return driverManagerMapper.selectDriverList(name);
	}

	@Override
	public List<DriverBreak> selectBreakList(Integer id) {
		// TODO Auto-generated method stub
		return driverManagerMapper.selectBreakList(id);
	}

	@Override
	public List<City> selectByPid(int i) {
		// TODO Auto-generated method stub
		return driverManagerMapper.selectByPid(i);
	}

	@Override
	public boolean insert(Driver driver) {
		// TODO Auto-generated method stub
		return driverManagerMapper.insert(driver)>0;
	}

	@Override
	public Driver selectDriverById(Integer id) {
		// TODO Auto-generated method stub
		return driverManagerMapper.selectDriverById(id);
	}

	@Override
	public boolean update(Driver driver) {
		// TODO Auto-generated method stub
		return driverManagerMapper.update(driver)>0;
	}

	@Override
	public PageInfo<Driver> getPageInfo(String name, Integer pageNum) {
		PageHelper.startPage(pageNum, 3);
		List<Driver> driverList = driverManagerMapper.selectDriverList(name);
		
		PageInfo<Driver> pageInfo = new PageInfo<>(driverList);
		
		return pageInfo;
	}

}
