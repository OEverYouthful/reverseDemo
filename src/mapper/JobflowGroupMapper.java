package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.JobflowGroup;
import pojo.JobflowGroupExample;

public interface JobflowGroupMapper {
    long countByExample(JobflowGroupExample example);

    int deleteByExample(JobflowGroupExample example);

    int insert(JobflowGroup record);

    int insertSelective(JobflowGroup record);

    List<JobflowGroup> selectByExample(JobflowGroupExample example);

    int updateByExampleSelective(@Param("record") JobflowGroup record, @Param("example") JobflowGroupExample example);

    int updateByExample(@Param("record") JobflowGroup record, @Param("example") JobflowGroupExample example);
}