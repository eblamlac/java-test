package com.example.demo;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

    /*
    * Dao数据访问
    *商品表对应的数据访问对象
    * @Mapper注解用于描述数据层接口由mybatis框架定义通过此注解描述的接口
    * 系统底层回味其创建实现类并且会创建其实现类对象然后交给spring框架管理
    * */
    @Mapper
  public interface GoodsDao{
        /*
        * 基于id执行商品数据的删除操作
        *@params id商品id
        * return 删除的行数
        * */
        @Delete("delete from user where uname={#id}")
        int deleteById(Integer id);

    }
