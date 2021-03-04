package com.sanyau.repair.handler.mybatis;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Date;

@Slf4j
@Component
@Configuration
/* student_info表下的自动填充配置 */
public class StudentInfoMetaObjectHandler implements MetaObjectHandler {
    //使用mp实现添加操作，这个方法执行
    @Override
    public void insertFill(MetaObject metaObject) {
        /* 注意：fieIdName是填入注解下的变量名，数据库的字段名！ */
        this.strictInsertFill(metaObject, "createTime", Date.class, new Date());
//        this.strictInsertFill(metaObject, "modifyTime", Date.class, new Date());
//        this.strictUpdateFill(metaObject, "create_time", () -> LocalDateTime.now(), LocalDateTime.class);
    }
    //使用mp实现更新操作，这个方法执行
    @Override
    public void updateFill(MetaObject metaObject) {
        this.strictInsertFill(metaObject, "modifyTime", Date.class, new Date());
    }
}
