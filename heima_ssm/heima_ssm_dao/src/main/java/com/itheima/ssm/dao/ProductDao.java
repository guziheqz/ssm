package com.itheima.ssm.dao;

import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProductDao {

    /**
     * 查询所有
     * @return
     */
    @Select("select * from product")
    public List<Product> findAll() throws Exception;
}
