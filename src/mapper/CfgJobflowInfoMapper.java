package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.CfgJobflowInfo;
import pojo.CfgJobflowInfoExample;

public interface CfgJobflowInfoMapper {
    long countByExample(CfgJobflowInfoExample example);

    int deleteByExample(CfgJobflowInfoExample example);

    int insert(CfgJobflowInfo record);

    int insertSelective(CfgJobflowInfo record);

    List<CfgJobflowInfo> selectByExample(CfgJobflowInfoExample example);

    int updateByExampleSelective(@Param("record") CfgJobflowInfo record, @Param("example") CfgJobflowInfoExample example);

    int updateByExample(@Param("record") CfgJobflowInfo record, @Param("example") CfgJobflowInfoExample example);
}