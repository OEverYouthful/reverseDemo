package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.CfgJobflowBatch2;
import pojo.CfgJobflowBatch2Example;

public interface CfgJobflowBatch2Mapper {
    long countByExample(CfgJobflowBatch2Example example);

    int deleteByExample(CfgJobflowBatch2Example example);

    int insert(CfgJobflowBatch2 record);

    int insertSelective(CfgJobflowBatch2 record);

    List<CfgJobflowBatch2> selectByExample(CfgJobflowBatch2Example example);

    int updateByExampleSelective(@Param("record") CfgJobflowBatch2 record, @Param("example") CfgJobflowBatch2Example example);

    int updateByExample(@Param("record") CfgJobflowBatch2 record, @Param("example") CfgJobflowBatch2Example example);
}