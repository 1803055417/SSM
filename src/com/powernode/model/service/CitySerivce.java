package com.powernode.model.service;

import com.powernode.entity.City;
import com.powernode.model.dao.CityDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: SSM007
 * @Package: com.powernode.model.service
 * @Description: java类作用描述
 * @Author: 倪云锋
 * @CreateDate: 2020/12/8 16:14
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Service
public class CitySerivce implements ICityService {
@Autowired
    CityDao cityDao;
    @Override
    public List<City> list() {
        return cityDao.selectAll();
    }
}
