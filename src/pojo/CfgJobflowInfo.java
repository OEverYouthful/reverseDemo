package pojo;

public class CfgJobflowInfo {
    private String groupId;

    private String requireId;

    private String tenantId;

    private String porjectNameEn;

    private String applicationId;

    private String jobflowName;

    private String activateDate;

    private String planStartTime;

    private String planEndTime;

    private Integer batchIntervalTime;

    private String timeZoneEn;

    private String useFlag;

    private String parallelFlag;

    private Integer maxParalles;

    private String instTimeRule;

    private String timeSkew;

    private Integer batchNum;

    private String minTurnTime;

    private String delSign;

    private String description;

    private String createUser;

    private String createTime;

    private String updateUser;

    private String updateTime;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
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

    public String getPorjectNameEn() {
        return porjectNameEn;
    }

    public void setPorjectNameEn(String porjectNameEn) {
        this.porjectNameEn = porjectNameEn == null ? null : porjectNameEn.trim();
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId == null ? null : applicationId.trim();
    }

    public String getJobflowName() {
        return jobflowName;
    }

    public void setJobflowName(String jobflowName) {
        this.jobflowName = jobflowName == null ? null : jobflowName.trim();
    }

    public String getActivateDate() {
        return activateDate;
    }

    public void setActivateDate(String activateDate) {
        this.activateDate = activateDate == null ? null : activateDate.trim();
    }

    public String getPlanStartTime() {
        return planStartTime;
    }

    public void setPlanStartTime(String planStartTime) {
        this.planStartTime = planStartTime == null ? null : planStartTime.trim();
    }

    public String getPlanEndTime() {
        return planEndTime;
    }

    public void setPlanEndTime(String planEndTime) {
        this.planEndTime = planEndTime == null ? null : planEndTime.trim();
    }

    public Integer getBatchIntervalTime() {
        return batchIntervalTime;
    }

    public void setBatchIntervalTime(Integer batchIntervalTime) {
        this.batchIntervalTime = batchIntervalTime;
    }

    public String getTimeZoneEn() {
        return timeZoneEn;
    }

    public void setTimeZoneEn(String timeZoneEn) {
        this.timeZoneEn = timeZoneEn == null ? null : timeZoneEn.trim();
    }

    public String getUseFlag() {
        return useFlag;
    }

    public void setUseFlag(String useFlag) {
        this.useFlag = useFlag == null ? null : useFlag.trim();
    }

    public String getParallelFlag() {
        return parallelFlag;
    }

    public void setParallelFlag(String parallelFlag) {
        this.parallelFlag = parallelFlag == null ? null : parallelFlag.trim();
    }

    public Integer getMaxParalles() {
        return maxParalles;
    }

    public void setMaxParalles(Integer maxParalles) {
        this.maxParalles = maxParalles;
    }

    public String getInstTimeRule() {
        return instTimeRule;
    }

    public void setInstTimeRule(String instTimeRule) {
        this.instTimeRule = instTimeRule == null ? null : instTimeRule.trim();
    }

    public String getTimeSkew() {
        return timeSkew;
    }

    public void setTimeSkew(String timeSkew) {
        this.timeSkew = timeSkew == null ? null : timeSkew.trim();
    }

    public Integer getBatchNum() {
        return batchNum;
    }

    public void setBatchNum(Integer batchNum) {
        this.batchNum = batchNum;
    }

    public String getMinTurnTime() {
        return minTurnTime;
    }

    public void setMinTurnTime(String minTurnTime) {
        this.minTurnTime = minTurnTime == null ? null : minTurnTime.trim();
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