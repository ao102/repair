package com.sanyau.repair.service.impl;

import com.sanyau.repair.entity.Type;
import com.sanyau.repair.mapper.TypeMapper;
import com.sanyau.repair.service.ITypeService;
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
public class TypeServiceImpl extends ServiceImpl<TypeMapper, Type> implements ITypeService {

}
