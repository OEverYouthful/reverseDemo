package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.CfgJobExitcodeMap;
import pojo.CfgJobExitcodeMapExample;

public interface CfgJobExitcodeMapMapper {
    long countByExample(CfgJobExitcodeMapExample example);

    int deleteByExample(CfgJobExitcodeMapExample example);

    int insert(CfgJobExitcodeMap record);

    int insertSelective(CfgJobExitcodeMap record);

    List<CfgJobExitcodeMap> selectByExample(CfgJobExitcodeMapExample example);

    int updateByExampleSelective(@Param("record") CfgJobExitcodeMap record, @Param("example") CfgJobExitcodeMapExample example);

    int updateByExample(@Param("record") CfgJobExitcodeMap record, @Param("example") CfgJobExitcodeMapExample example);
}