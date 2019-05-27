package pojo;

public class CfgJobCmdMap {
    private String cfgJobId;

    private String cfgJobCmdId;

    private String relation;

    private String jobType;

    private String libPath;

    private String createUser;

    private String createTime;

    private String updateUser;

    private String updateTime;

    private String cmd;

    public String getCfgJobId() {
        return cfgJobId;
    }

    public void setCfgJobId(String cfgJobId) {
        this.cfgJobId = cfgJobId == null ? null : cfgJobId.trim();
    }

    public String getCfgJobCmdId() {
        return cfgJobCmdId;
    }

    public void setCfgJobCmdId(String cfgJobCmdId) {
        this.cfgJobCmdId = cfgJobCmdId == null ? null : cfgJobCmdId.trim();
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation == null ? null : relation.trim();
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType == null ? null : jobType.trim();
    }

    public String getLibPath() {
        return libPath;
    }

    public void setLibPath(String libPath) {
        this.libPath = libPath == null ? null : libPath.trim();
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }

    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd == null ? null : cmd.trim();
    }
}