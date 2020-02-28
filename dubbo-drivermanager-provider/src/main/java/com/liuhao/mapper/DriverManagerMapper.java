package com.liuhao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.liuhao.pojo.City;
import com.liuhao.pojo.Driver;
import com.liuhao.pojo.DriverBreak;

public interface DriverManagerMapper {

	List<Driver> selectDriverList(@Param("name")String name);

	List<DriverBreak> selectBreakList(@Param("id")Integer id);

	List<City> selectByPid(@Param("i")int i);

	int insert(@Param("driver")Driver driver);

	Driver selectDriverById(@Param("id")Integer id);

	int update(@Param("driver")Driver driver);

}
