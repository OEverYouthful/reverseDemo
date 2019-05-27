package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.CfgJobExecRate;
import pojo.CfgJobExecRateExample;

public interface CfgJobExecRateMapper {
    long countByExample(CfgJobExecRateExample example);

    int deleteByExample(CfgJobExecRateExample example);

    int insert(CfgJobExecRate record);

    int insertSelective(CfgJobExecRate record);

    List<CfgJobExecRate> selectByExample(CfgJobExecRateExample example);

    int updateByExampleSelective(@Param("record") CfgJobExecRate record, @Param("example") CfgJobExecRateExample example);

    int updateByExample(@Param("record") CfgJobExecRate record, @Param("example") CfgJobExecRateExample example);
}