package com.sanyau.repair.service.impl;

import com.sanyau.repair.entity.StudentInfo;
import com.sanyau.repair.mapper.StudentInfoMapper;
import com.sanyau.repair.service.IStudentInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author WildSky
 * @since 2021-03-04
 */
@Service
public class StudentInfoServiceImpl extends ServiceImpl<StudentInfoMapper, StudentInfo> implements IStudentInfoService {

}
