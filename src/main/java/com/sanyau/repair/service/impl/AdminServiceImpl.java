package com.sanyau.repair.service.impl;

import com.sanyau.repair.entity.Admin;
import com.sanyau.repair.mapper.AdminMapper;
import com.sanyau.repair.service.IAdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author WildSky
 * @since 2021-03-06
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements IAdminService {

}
