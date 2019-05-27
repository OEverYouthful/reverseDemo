package pojo;

public class CfgJobExecRate {
    private String cfgJobId;

    private String rateType;

    private String execWeek;

    private String execDay;

    private String execMonth;

    private String execYear;

    private String dayWeekRel;

    private String paramValue;

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

    public String getRateType() {
        return rateType;
    }

    public void setRateType(String rateType) {
        this.rateType = rateType == null ? null : rateType.trim();
    }

    public String getExecWeek() {
        return execWeek;
    }

    public void setExecWeek(String execWeek) {
        this.execWeek = execWeek == null ? null : execWeek.trim();
    }

    public String getExecDay() {
        return execDay;
    }

    public void setExecDay(String execDay) {
        this.execDay = execDay == null ? null : execDay.trim();
    }

    public String getExecMonth() {
        return execMonth;
    }

    public void setExecMonth(String execMonth) {
        this.execMonth = execMonth == null ? null : execMonth.trim();
    }

    public String getExecYear() {
        return execYear;
    }

    public void setExecYear(String execYear) {
        this.execYear = execYear == null ? null : execYear.trim();
    }

    public String getDayWeekRel() {
        return dayWeekRel;
    }

    public void setDayWeekRel(String dayWeekRel) {
        this.dayWeekRel = dayWeekRel == null ? null : dayWeekRel.trim();
    }

    public String getParamValue() {
        return paramValue;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue == null ? null : paramValue.trim();
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