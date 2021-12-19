package com.example.clay;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
@SpringBootTest
public class ConnectTest {
    @Autowired
    private DataSource dataSource1;
    @Test
    public void testConnetion() throws Exception{
        Connection conn =dataSource1.getConnection();
        System.out
                .println(conn);
    }
}
