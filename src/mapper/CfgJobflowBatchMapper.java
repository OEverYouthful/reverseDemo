package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.CfgJobflowBatch;
import pojo.CfgJobflowBatchExample;

public interface CfgJobflowBatchMapper {
    long countByExample(CfgJobflowBatchExample example);

    int deleteByExample(CfgJobflowBatchExample example);

    int insert(CfgJobflowBatch record);

    int insertSelective(CfgJobflowBatch record);

    List<CfgJobflowBatch> selectByExample(CfgJobflowBatchExample example);

    int updateByExampleSelective(@Param("record") CfgJobflowBatch record, @Param("example") CfgJobflowBatchExample example);

    int updateByExample(@Param("record") CfgJobflowBatch record, @Param("example") CfgJobflowBatchExample example);
}