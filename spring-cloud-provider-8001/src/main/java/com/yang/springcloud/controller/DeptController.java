package com.yang.springcloud.controller;


import com.yang.springcloud.entity.Dept;
import com.yang.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {
      @Autowired
      private DeptService deptService;

      @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
      public boolean add(@RequestBody Dept dept){
          return deptService.addDept(dept);
      }

    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id){
        return deptService.findById(id);
    }

    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
    public List<Dept> list(){
        return deptService.findAll();
    }
}