package com.yang.springcloud.dao;


import com.yang.springcloud.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
//@Repository
public interface DeptDao {
    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();

}
