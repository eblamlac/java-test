package com.example.demo;

import com.example.demo.pojo.Goods;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
public interface Mysqlaa {
    @Select("select * from tb_door")
    List<Goods> findObjects();

    int deleteObjects(Integer...ids);
//@Delete("delete form jb-userinfo wshere id =#{id}")
//    int deleteById(Integer id);
@Select("select * from tb_door")
public List<Door> seletAll();
@Delete("delete from tb_goods where id =#{id")
    int deleteById(Integer id);

}
