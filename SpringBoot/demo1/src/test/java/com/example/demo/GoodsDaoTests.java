package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class GoodsDaoTests {
    @Autowired
    private  GoodsDao goodsDao;
    @Test
    void testDeleteById(){
int row =goodsDao.deleteById(556);
System.out.println("rows="+row);
    }
}
