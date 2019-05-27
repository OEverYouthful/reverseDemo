package pojo;

public class CfgJobflowBatch {
    private String cfgJobflowId;

    private String planStartTime;

    private String batch;

    private String description;

    private String createUser;

    private String createTime;

    private String updateUset;

    private String updateTime;

    public String getCfgJobflowId() {
        return cfgJobflowId;
    }

    public void setCfgJobflowId(String cfgJobflowId) {
        this.cfgJobflowId = cfgJobflowId == null ? null : cfgJobflowId.trim();
    }

    public String getPlanStartTime() {
        return planStartTime;
    }

    public void setPlanStartTime(String planStartTime) {
        this.planStartTime = planStartTime == null ? null : planStartTime.trim();
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch == null ? null : batch.trim();
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

    public String getUpdateUset() {
        return updateUset;
    }

    public void setUpdateUset(String updateUset) {
        this.updateUset = updateUset == null ? null : updateUset.trim();
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }
}