package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.CfgJobCmdMap;
import pojo.CfgJobCmdMapExample;

public interface CfgJobCmdMapMapper {
    long countByExample(CfgJobCmdMapExample example);

    int deleteByExample(CfgJobCmdMapExample example);

    int insert(CfgJobCmdMap record);

    int insertSelective(CfgJobCmdMap record);

    List<CfgJobCmdMap> selectByExampleWithBLOBs(CfgJobCmdMapExample example);

    List<CfgJobCmdMap> selectByExample(CfgJobCmdMapExample example);

    int updateByExampleSelective(@Param("record") CfgJobCmdMap record, @Param("example") CfgJobCmdMapExample example);

    int updateByExampleWithBLOBs(@Param("record") CfgJobCmdMap record, @Param("example") CfgJobCmdMapExample example);

    int updateByExample(@Param("record") CfgJobCmdMap record, @Param("example") CfgJobCmdMapExample example);
}