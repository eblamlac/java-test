package generator;

import generator.TbDoor;
import generator.TbDoorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbDoorDao {
    long countByExample(TbDoorExample example);

    int deleteByExample(TbDoorExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbDoor record);

    int insertSelective(TbDoor record);

    List<TbDoor> selectByExample(TbDoorExample example);

    TbDoor selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbDoor record, @Param("example") TbDoorExample example);

    int updateByExample(@Param("record") TbDoor record, @Param("example") TbDoorExample example);

    int updateByPrimaryKeySelective(TbDoor record);

    int updateByPrimaryKey(TbDoor record);
}