package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.CfgHolidayJobRel;
import pojo.CfgHolidayJobRelExample;

public interface CfgHolidayJobRelMapper {
    long countByExample(CfgHolidayJobRelExample example);

    int deleteByExample(CfgHolidayJobRelExample example);

    int insert(CfgHolidayJobRel record);

    int insertSelective(CfgHolidayJobRel record);

    List<CfgHolidayJobRel> selectByExample(CfgHolidayJobRelExample example);

    int updateByExampleSelective(@Param("record") CfgHolidayJobRel record, @Param("example") CfgHolidayJobRelExample example);

    int updateByExample(@Param("record") CfgHolidayJobRel record, @Param("example") CfgHolidayJobRelExample example);
}