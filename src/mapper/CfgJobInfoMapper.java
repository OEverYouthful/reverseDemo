package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.CfgJobInfo;
import pojo.CfgJobInfoExample;

public interface CfgJobInfoMapper {
    long countByExample(CfgJobInfoExample example);

    int deleteByExample(CfgJobInfoExample example);

    int insert(CfgJobInfo record);

    int insertSelective(CfgJobInfo record);

    List<CfgJobInfo> selectByExample(CfgJobInfoExample example);

    int updateByExampleSelective(@Param("record") CfgJobInfo record, @Param("example") CfgJobInfoExample example);

    int updateByExample(@Param("record") CfgJobInfo record, @Param("example") CfgJobInfoExample example);
}