package com.example.haha;
import com.tedo.pojp.Emp;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.testng.annotations.Test;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class mybatistest {
    private static SqlSession session1 = null;
    private static SqlSessionFactory factory = null;

    static {
        try {
            //读取mybatis的核心配置文件(mybatis-config.xml)
            InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
            //基于配置信息获取一个sqlSessionFactory工厂对象
            factory = new SqlSessionFactoryBuilder().build(in);
            session1 = factory.openSession(false);//表示自动提交事务
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 练习2：新增员工信息刘德华歌手8888
     **/
    @Test
    public void lala() throws IOException {
        //执行sql语句返回执行结果
        int rows = session1.update("EmpMapper.insert");
        System.out.println("影响行数" + rows);
        List<Emp> list = session1.selectList("EmpMapper.findAll");
        for (Emp emp : list)
            System.out.println(emp.toString());
        session1.commit();
    }

    /**
     * 练习3修改刘德华的数据工资为888888
     **/
    @Test
    public void update() throws IOException {
        int rows = session1.update("EmpMapper.update");
        System.out.println("影响的行数" + rows);
        List<Emp> list = session1.selectList("EmpMapper.findAll");
        for (Emp emp : list)
            System.out.println(emp.toString());
    }

    @Test
    public void nani() throws IOException {
////读取mybatis的核心配置文件(mybatis-config.xml)
//  InputStream in= Resources.getResourceAsStream("mybatis-config.xml");
//    //基于配置信息获取一个sqlSessionFactory工厂对象
//    SqlSessionFactory factory= new SqlSessionFactoryBuilder().build(in);
        //通过工程对象获取一个sqlSession对象
        SqlSession session = factory.openSession(true);//默认是false，表示需要手动提交事务
        //执行SQL语句（EmpMapper.xml）接受处理后的结果
        List<Emp> list = session.selectList("EmpMapper.findAll");
        //5.输出结果
        for (Emp emp : list)
            System.out.println(emp.toString());
    }


    /************************************************Mybatis占位符操作*******************************************************/
    @Test
    public void nani11() {
        SqlSession session = factory.openSession(true);
        Integer id = 1;
        List<Emp> list = session.selectList("EmpMapper.findById", id);
        for (Emp emp : list)
            System.out.println(emp.toString());
    }


    @Test
    public void testaa() {
    SqlSession session =factory.openSession(true);
        Map map=new HashMap<String,Object>();
       map.put("name","刘德华123");
       map.put("job","歌手");
       map.put("salary",2100000);
       session.update("EmpMapper.updatetest",map);
    }

}