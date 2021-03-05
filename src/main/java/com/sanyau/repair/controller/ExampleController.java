package com.sanyau.repair.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sanyau.repair.entity.StudentInfo;
import com.sanyau.repair.mapper.StudentInfoMapper;
import com.sanyau.repair.response.Result;
import com.sanyau.repair.service.impl.StudentInfoServiceImpl;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
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
    }

    /* 分页查询返回结果就按这个格式写 */
    @ApiOperation("分页查询")
    @GetMapping("pageStudent")
    public Result examplePage(@ApiParam(name = "current", value = "当前页", required = true) @RequestParam("current") Long current,
                              @ApiParam(name = "limit", value = "每页数据量", required = true) @RequestParam("limit") Long limit) {
        //创建page对象
        /* current: 当前页  size:每页显示size条数据*/
        Page<StudentInfo> page = new Page<>(current, limit);
        //调用方法实现分页
        //调用方法的时候，底层做了封装，把分页所有数据封装到page对象里面
        //queryWrapper为查询条件，填null即为全部查找
        studentInfoService.page(page, null);
        long total = page.getTotal();//总记录数
        List<StudentInfo> records = page.getRecords();//数据list集合
        HashMap<String, Object> map = new HashMap<>();
        map.put("total", total);
        map.put("rows", records);
        return Result.ok().data(map);
    }

    /* 使用mapper案例 */
    @ApiOperation("使用mapper根据id查找学生")
    @GetMapping("findByIdFromMapper")
    public Result findByIdFromMapper(@RequestParam("id") String id) {
        /* 用service拿到mapper */
        StudentInfoMapper studentInfoMapper = studentInfoService.getBaseMapper();
        QueryWrapper<StudentInfo> wrapper = new QueryWrapper<>();
        wrapper.eq("id", id);
        StudentInfo info = studentInfoMapper.selectOne(wrapper);
        return Result.ok().data("info", info);
    }
}
