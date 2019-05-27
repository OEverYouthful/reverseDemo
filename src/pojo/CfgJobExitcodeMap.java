package pojo;

public class CfgJobExitcodeMap {
    private String cfgJobcodeId;

    private String exitCode;

    private String status;

    private Integer rerunNum;

    private String actionType;

    private String actionValue;

    private String createUser;

    private String createTime;

    private String updateUser;

    private String updateTime;

    public String getCfgJobcodeId() {
        return cfgJobcodeId;
    }

    public void setCfgJobcodeId(String cfgJobcodeId) {
        this.cfgJobcodeId = cfgJobcodeId == null ? null : cfgJobcodeId.trim();
    }

    public String getExitCode() {
        return exitCode;
    }

    public void setExitCode(String exitCode) {
        this.exitCode = exitCode == null ? null : exitCode.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getRerunNum() {
        return rerunNum;
    }

    public void setRerunNum(Integer rerunNum) {
        this.rerunNum = rerunNum;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType == null ? null : actionType.trim();
    }

    public String getActionValue() {
        return actionValue;
    }

    public void setActionValue(String actionValue) {
        this.actionValue = actionValue == null ? null : actionValue.trim();
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