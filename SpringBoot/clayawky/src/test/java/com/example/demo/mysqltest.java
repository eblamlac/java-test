package com.example.demo;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import javax.sql.DataSource;
import java.sql.Connection;
import java.util.List;

@SpringBootTest
public class mysqltest {

   @Autowired
   private DataSource dataSource;
    @Autowired
    private SqlSessionFactory sqlSessionFactory;
   @Test
    public void testfactory(){
    //创建工厂对象sqlSessionFactory
   SqlSession test=sqlSessionFactory.openSession();
   System.out.println(test.getConnection());
   Mysqlaa a=test.getMapper(Mysqlaa.class);
   test.commit();
   List<Door> tt=a.seletAll();
   for(Door t:tt)
       System.out.println(t);
   test.close();
}

    @Test
    public void testConnetion() throws Exception{
      Connection conn =dataSource.getConnection();
      System.out
               .println(conn);

   }
  @Autowired
  private Mysqlaa mysql;

@Test
void testDeleteObjects(){
    int rows = mysql.deleteObjects(1);
}
   @Test
    void testSelect(){

       List<Door> list = mysql.seletAll();
       for(Door test : list){
           System.out.println(test.toString());
       }
   }
}
