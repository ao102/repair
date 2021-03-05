package com.sanyau.repair.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sanyau.repair.entity.StudentInfo;
import com.sanyau.repair.response.Result;
import com.sanyau.repair.service.impl.StudentInfoServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student/example")
public class ExampleController {
    @Autowired
    StudentInfoServiceImpl studentInfoService;

    @ApiOperation(value = "根据Id查找学生")
    @PostMapping("findById")
    public Result findById(@RequestParam("id") String id) {
        /* 创建StudentInfo的条件查询类 */
        QueryWrapper<StudentInfo> wrapper = new QueryWrapper<>();
        /* column为数据库表的字段名,eq为equal的意思，即相等
         * wrapper更多的条件查询，请看Mybatis-plus官网：条件构造器
         * Address：https://mp.baomidou.com/guide/wrapper.html */
        wrapper.eq("id", id);
        List<StudentInfo> studentInfos = studentInfoService.list(wrapper);
        if (studentInfos.size() != 1) {
            return Result.error();
        }
        StudentInfo info = studentInfos.get(0);
        return Result.ok().data("info", info);
    }

    @ApiOperation(value = "添加学生")
    @PostMapping("inset")
    public Result exampleInsert(@RequestBody StudentInfo user) {
        /* 偷懒不写验证了 */
        boolean save = studentInfoService.save(user);
        return save ? Result.ok().data("msg", "suc") : Result.error();
//        return Result.ok().data("info",info);
    }
}
