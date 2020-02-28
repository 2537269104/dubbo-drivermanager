package com.liuhao.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.liuhao.pojo.City;
import com.liuhao.pojo.Driver;
import com.liuhao.pojo.DriverBreak;

public interface DriverManagerService {

	List<Driver> getDriverList(String name);
    /**
     * 根据司机的id查询违规的具体信息
     * @param id
     * @return
     */
	List<DriverBreak> selectBreakList(Integer id);
	
	/**
	 * 根据pid查询城市的集合
	 * @param i
	 * @return
	 */
	List<City> selectByPid(int i);
	/**
	 * 对驾驶证的表进行添加数据
	 * @param driver
	 * @return
	 */
	boolean insert(Driver driver);
	
	/**
	 * 对驾驶证的表进行修改
	 * @param id
	 * @return
	 */
	Driver selectDriverById(Integer id);
	/**
	 * 根据id进行修改
	 * @param driver
	 * @return
	 */
	boolean update(Driver driver);
	/**
	 * 列表+分页
	 * @param name
	 * @param pageNum
	 * @return
	 */
	PageInfo<Driver> getPageInfo(String name, Integer pageNum);

}
