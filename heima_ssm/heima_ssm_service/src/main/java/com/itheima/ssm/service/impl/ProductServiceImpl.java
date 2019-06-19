package com.itheima.ssm.service.impl;

import com.itheima.ssm.dao.Product;
import com.itheima.ssm.dao.ProductDao;
import com.itheima.ssm.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ProductServiceImpl implements ProductService {


    @Autowired
    private ProductDao productDao;

    /**
     * 查询所有
     * @return
     */
    @Override
    public List<Product> findAll() throws Exception {

        return productDao.findAll();
    }
}
