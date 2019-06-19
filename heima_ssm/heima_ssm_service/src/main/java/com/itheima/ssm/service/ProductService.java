package com.itheima.ssm.service;

import com.itheima.ssm.dao.Product;

import java.util.List;

public interface ProductService {

    /**
     * 查询所有
     * @return
     */
    public List<Product> findAll() throws Exception;

}
