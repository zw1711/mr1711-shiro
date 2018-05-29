package com.mr.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ${zw} on 2018/5/28.
 */
@Controller
@RequestMapping("department")
public class DepartmentController {


    @RequiresPermissions("department:list")
    @RequestMapping("list")
    public String list(){
        System.out.println("调用了部门管理系统");
        return "department";
    }

    @RequiresPermissions("department:save")
    @RequestMapping("save")
    public String save(){
        System.out.println("调用了部门增加系统");
        return "department";
    }

    @RequiresPermissions("department:delete")
    @RequestMapping("delete")
    public String delete(){
        System.out.println("调用了部门删除系统");
        return "department";
    }

    @RequiresPermissions("department:update")
    @RequestMapping("update")
    public String update(){
        System.out.println("调用了部门修改系统");
        return "department";
    }


}
