package pojo;

public class CfgJobInfo {
    private String cfgJobId;

    private String requireId;

    private String tenantId;

    private String projectEnName;

    private String jobflowName;

    private String jobName;

    private String nodeName;

    private String rateId;

    private Integer runCount;

    private Integer priority;

    private String jobStartTime;

    private String useFlag;

    private String execUser;

    private String logPath;

    private String holidayFlag;

    private Integer rerunInterval;

    private Integer runTime;

    private Integer waitTime;

    private String runSystem;

    private String delSign;

    private String description;

    private String createUser;

    private String createTime;

    private String updateUser;

    private String updateTime;

    public String getCfgJobId() {
        return cfgJobId;
    }

    public void setCfgJobId(String cfgJobId) {
        this.cfgJobId = cfgJobId == null ? null : cfgJobId.trim();
    }

    public String getRequireId() {
        return requireId;
    }

    public void setRequireId(String requireId) {
        this.requireId = requireId == null ? null : requireId.trim();
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId == null ? null : tenantId.trim();
    }

    public String getProjectEnName() {
        return projectEnName;
    }

    public void setProjectEnName(String projectEnName) {
        this.projectEnName = projectEnName == null ? null : projectEnName.trim();
    }

    public String getJobflowName() {
        return jobflowName;
    }

    public void setJobflowName(String jobflowName) {
        this.jobflowName = jobflowName == null ? null : jobflowName.trim();
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName == null ? null : jobName.trim();
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName == null ? null : nodeName.trim();
    }

    public String getRateId() {
        return rateId;
    }

    public void setRateId(String rateId) {
        this.rateId = rateId == null ? null : rateId.trim();
    }

    public Integer getRunCount() {
        return runCount;
    }

    public void setRunCount(Integer runCount) {
        this.runCount = runCount;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getJobStartTime() {
        return jobStartTime;
    }

    public void setJobStartTime(String jobStartTime) {
        this.jobStartTime = jobStartTime == null ? null : jobStartTime.trim();
    }

    public String getUseFlag() {
        return useFlag;
    }

    public void setUseFlag(String useFlag) {
        this.useFlag = useFlag == null ? null : useFlag.trim();
    }

    public String getExecUser() {
        return execUser;
    }

    public void setExecUser(String execUser) {
        this.execUser = execUser == null ? null : execUser.trim();
    }

    public String getLogPath() {
        return logPath;
    }

    public void setLogPath(String logPath) {
        this.logPath = logPath == null ? null : logPath.trim();
    }

    public String getHolidayFlag() {
        return holidayFlag;
    }

    public void setHolidayFlag(String holidayFlag) {
        this.holidayFlag = holidayFlag == null ? null : holidayFlag.trim();
    }

    public Integer getRerunInterval() {
        return rerunInterval;
    }

    public void setRerunInterval(Integer rerunInterval) {
        this.rerunInterval = rerunInterval;
    }

    public Integer getRunTime() {
        return runTime;
    }

    public void setRunTime(Integer runTime) {
        this.runTime = runTime;
    }

    public Integer getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(Integer waitTime) {
        this.waitTime = waitTime;
    }

    public String getRunSystem() {
        return runSystem;
    }

    public void setRunSystem(String runSystem) {
        this.runSystem = runSystem == null ? null : runSystem.trim();
    }

    public String getDelSign() {
        return delSign;
    }

    public void setDelSign(String delSign) {
        this.delSign = delSign == null ? null : delSign.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
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
}