package com.mr.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ${zw} on 2018/5/28.
 */
@Controller
@RequestMapping("employee")
public class EmployeeController {


    @RequiresPermissions("employee:list")
    @RequestMapping("list")
    public String list(){
        System.out.println("调用了员工管理系统");
        return "employee";
    }

    @RequiresPermissions("employee:save")
    @RequestMapping("save")
    public String save(){
        System.out.println("调用了员工增加系统");
        return "employee";
    }

    @RequiresPermissions("employee:delete")
    @RequestMapping("delete")
    public String delete(){
        System.out.println("调用了员工删除系统");
        return "employee";
    }

    @RequiresPermissions("employee:update")
    @RequestMapping("update")
    public String update(){
        System.out.println("调用了员工修改系统");
        return "employee";
    }



}
