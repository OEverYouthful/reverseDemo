package pojo;

import java.util.ArrayList;
import java.util.List;

public class CfgJobExecRateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CfgJobExecRateExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCfgJobIdIsNull() {
            addCriterion("cfg_job_id is null");
            return (Criteria) this;
        }

        public Criteria andCfgJobIdIsNotNull() {
            addCriterion("cfg_job_id is not null");
            return (Criteria) this;
        }

        public Criteria andCfgJobIdEqualTo(String value) {
            addCriterion("cfg_job_id =", value, "cfgJobId");
            return (Criteria) this;
        }

        public Criteria andCfgJobIdNotEqualTo(String value) {
            addCriterion("cfg_job_id <>", value, "cfgJobId");
            return (Criteria) this;
        }

        public Criteria andCfgJobIdGreaterThan(String value) {
            addCriterion("cfg_job_id >", value, "cfgJobId");
            return (Criteria) this;
        }

        public Criteria andCfgJobIdGreaterThanOrEqualTo(String value) {
            addCriterion("cfg_job_id >=", value, "cfgJobId");
            return (Criteria) this;
        }

        public Criteria andCfgJobIdLessThan(String value) {
            addCriterion("cfg_job_id <", value, "cfgJobId");
            return (Criteria) this;
        }

        public Criteria andCfgJobIdLessThanOrEqualTo(String value) {
            addCriterion("cfg_job_id <=", value, "cfgJobId");
            return (Criteria) this;
        }

        public Criteria andCfgJobIdLike(String value) {
            addCriterion("cfg_job_id like", value, "cfgJobId");
            return (Criteria) this;
        }

        public Criteria andCfgJobIdNotLike(String value) {
            addCriterion("cfg_job_id not like", value, "cfgJobId");
            return (Criteria) this;
        }

        public Criteria andCfgJobIdIn(List<String> values) {
            addCriterion("cfg_job_id in", values, "cfgJobId");
            return (Criteria) this;
        }

        public Criteria andCfgJobIdNotIn(List<String> values) {
            addCriterion("cfg_job_id not in", values, "cfgJobId");
            return (Criteria) this;
        }

        public Criteria andCfgJobIdBetween(String value1, String value2) {
            addCriterion("cfg_job_id between", value1, value2, "cfgJobId");
            return (Criteria) this;
        }

        public Criteria andCfgJobIdNotBetween(String value1, String value2) {
            addCriterion("cfg_job_id not between", value1, value2, "cfgJobId");
            return (Criteria) this;
        }

        public Criteria andRateTypeIsNull() {
            addCriterion("rate_type is null");
            return (Criteria) this;
        }

        public Criteria andRateTypeIsNotNull() {
            addCriterion("rate_type is not null");
            return (Criteria) this;
        }

        public Criteria andRateTypeEqualTo(String value) {
            addCriterion("rate_type =", value, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeNotEqualTo(String value) {
            addCriterion("rate_type <>", value, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeGreaterThan(String value) {
            addCriterion("rate_type >", value, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("rate_type >=", value, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeLessThan(String value) {
            addCriterion("rate_type <", value, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeLessThanOrEqualTo(String value) {
            addCriterion("rate_type <=", value, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeLike(String value) {
            addCriterion("rate_type like", value, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeNotLike(String value) {
            addCriterion("rate_type not like", value, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeIn(List<String> values) {
            addCriterion("rate_type in", values, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeNotIn(List<String> values) {
            addCriterion("rate_type not in", values, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeBetween(String value1, String value2) {
            addCriterion("rate_type between", value1, value2, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeNotBetween(String value1, String value2) {
            addCriterion("rate_type not between", value1, value2, "rateType");
            return (Criteria) this;
        }

        public Criteria andExecWeekIsNull() {
            addCriterion("exec_week is null");
            return (Criteria) this;
        }

        public Criteria andExecWeekIsNotNull() {
            addCriterion("exec_week is not null");
            return (Criteria) this;
        }

        public Criteria andExecWeekEqualTo(String value) {
            addCriterion("exec_week =", value, "execWeek");
            return (Criteria) this;
        }

        public Criteria andExecWeekNotEqualTo(String value) {
            addCriterion("exec_week <>", value, "execWeek");
            return (Criteria) this;
        }

        public Criteria andExecWeekGreaterThan(String value) {
            addCriterion("exec_week >", value, "execWeek");
            return (Criteria) this;
        }

        public Criteria andExecWeekGreaterThanOrEqualTo(String value) {
            addCriterion("exec_week >=", value, "execWeek");
            return (Criteria) this;
        }

        public Criteria andExecWeekLessThan(String value) {
            addCriterion("exec_week <", value, "execWeek");
            return (Criteria) this;
        }

        public Criteria andExecWeekLessThanOrEqualTo(String value) {
            addCriterion("exec_week <=", value, "execWeek");
            return (Criteria) this;
        }

        public Criteria andExecWeekLike(String value) {
            addCriterion("exec_week like", value, "execWeek");
            return (Criteria) this;
        }

        public Criteria andExecWeekNotLike(String value) {
            addCriterion("exec_week not like", value, "execWeek");
            return (Criteria) this;
        }

        public Criteria andExecWeekIn(List<String> values) {
            addCriterion("exec_week in", values, "execWeek");
            return (Criteria) this;
        }

        public Criteria andExecWeekNotIn(List<String> values) {
            addCriterion("exec_week not in", values, "execWeek");
            return (Criteria) this;
        }

        public Criteria andExecWeekBetween(String value1, String value2) {
            addCriterion("exec_week between", value1, value2, "execWeek");
            return (Criteria) this;
        }

        public Criteria andExecWeekNotBetween(String value1, String value2) {
            addCriterion("exec_week not between", value1, value2, "execWeek");
            return (Criteria) this;
        }

        public Criteria andExecDayIsNull() {
            addCriterion("exec_day is null");
            return (Criteria) this;
        }

        public Criteria andExecDayIsNotNull() {
            addCriterion("exec_day is not null");
            return (Criteria) this;
        }

        public Criteria andExecDayEqualTo(String value) {
            addCriterion("exec_day =", value, "execDay");
            return (Criteria) this;
        }

        public Criteria andExecDayNotEqualTo(String value) {
            addCriterion("exec_day <>", value, "execDay");
            return (Criteria) this;
        }

        public Criteria andExecDayGreaterThan(String value) {
            addCriterion("exec_day >", value, "execDay");
            return (Criteria) this;
        }

        public Criteria andExecDayGreaterThanOrEqualTo(String value) {
            addCriterion("exec_day >=", value, "execDay");
            return (Criteria) this;
        }

        public Criteria andExecDayLessThan(String value) {
            addCriterion("exec_day <", value, "execDay");
            return (Criteria) this;
        }

        public Criteria andExecDayLessThanOrEqualTo(String value) {
            addCriterion("exec_day <=", value, "execDay");
            return (Criteria) this;
        }

        public Criteria andExecDayLike(String value) {
            addCriterion("exec_day like", value, "execDay");
            return (Criteria) this;
        }

        public Criteria andExecDayNotLike(String value) {
            addCriterion("exec_day not like", value, "execDay");
            return (Criteria) this;
        }

        public Criteria andExecDayIn(List<String> values) {
            addCriterion("exec_day in", values, "execDay");
            return (Criteria) this;
        }

        public Criteria andExecDayNotIn(List<String> values) {
            addCriterion("exec_day not in", values, "execDay");
            return (Criteria) this;
        }

        public Criteria andExecDayBetween(String value1, String value2) {
            addCriterion("exec_day between", value1, value2, "execDay");
            return (Criteria) this;
        }

        public Criteria andExecDayNotBetween(String value1, String value2) {
            addCriterion("exec_day not between", value1, value2, "execDay");
            return (Criteria) this;
        }

        public Criteria andExecMonthIsNull() {
            addCriterion("exec_month is null");
            return (Criteria) this;
        }

        public Criteria andExecMonthIsNotNull() {
            addCriterion("exec_month is not null");
            return (Criteria) this;
        }

        public Criteria andExecMonthEqualTo(String value) {
            addCriterion("exec_month =", value, "execMonth");
            return (Criteria) this;
        }

        public Criteria andExecMonthNotEqualTo(String value) {
            addCriterion("exec_month <>", value, "execMonth");
            return (Criteria) this;
        }

        public Criteria andExecMonthGreaterThan(String value) {
            addCriterion("exec_month >", value, "execMonth");
            return (Criteria) this;
        }

        public Criteria andExecMonthGreaterThanOrEqualTo(String value) {
            addCriterion("exec_month >=", value, "execMonth");
            return (Criteria) this;
        }

        public Criteria andExecMonthLessThan(String value) {
            addCriterion("exec_month <", value, "execMonth");
            return (Criteria) this;
        }

        public Criteria andExecMonthLessThanOrEqualTo(String value) {
            addCriterion("exec_month <=", value, "execMonth");
            return (Criteria) this;
        }

        public Criteria andExecMonthLike(String value) {
            addCriterion("exec_month like", value, "execMonth");
            return (Criteria) this;
        }

        public Criteria andExecMonthNotLike(String value) {
            addCriterion("exec_month not like", value, "execMonth");
            return (Criteria) this;
        }

        public Criteria andExecMonthIn(List<String> values) {
            addCriterion("exec_month in", values, "execMonth");
            return (Criteria) this;
        }

        public Criteria andExecMonthNotIn(List<String> values) {
            addCriterion("exec_month not in", values, "execMonth");
            return (Criteria) this;
        }

        public Criteria andExecMonthBetween(String value1, String value2) {
            addCriterion("exec_month between", value1, value2, "execMonth");
            return (Criteria) this;
        }

        public Criteria andExecMonthNotBetween(String value1, String value2) {
            addCriterion("exec_month not between", value1, value2, "execMonth");
            return (Criteria) this;
        }

        public Criteria andExecYearIsNull() {
            addCriterion("exec_year is null");
            return (Criteria) this;
        }

        public Criteria andExecYearIsNotNull() {
            addCriterion("exec_year is not null");
            return (Criteria) this;
        }

        public Criteria andExecYearEqualTo(String value) {
            addCriterion("exec_year =", value, "execYear");
            return (Criteria) this;
        }

        public Criteria andExecYearNotEqualTo(String value) {
            addCriterion("exec_year <>", value, "execYear");
            return (Criteria) this;
        }

        public Criteria andExecYearGreaterThan(String value) {
            addCriterion("exec_year >", value, "execYear");
            return (Criteria) this;
        }

        public Criteria andExecYearGreaterThanOrEqualTo(String value) {
            addCriterion("exec_year >=", value, "execYear");
            return (Criteria) this;
        }

        public Criteria andExecYearLessThan(String value) {
            addCriterion("exec_year <", value, "execYear");
            return (Criteria) this;
        }

        public Criteria andExecYearLessThanOrEqualTo(String value) {
            addCriterion("exec_year <=", value, "execYear");
            return (Criteria) this;
        }

        public Criteria andExecYearLike(String value) {
            addCriterion("exec_year like", value, "execYear");
            return (Criteria) this;
        }

        public Criteria andExecYearNotLike(String value) {
            addCriterion("exec_year not like", value, "execYear");
            return (Criteria) this;
        }

        public Criteria andExecYearIn(List<String> values) {
            addCriterion("exec_year in", values, "execYear");
            return (Criteria) this;
        }

        public Criteria andExecYearNotIn(List<String> values) {
            addCriterion("exec_year not in", values, "execYear");
            return (Criteria) this;
        }

        public Criteria andExecYearBetween(String value1, String value2) {
            addCriterion("exec_year between", value1, value2, "execYear");
            return (Criteria) this;
        }

        public Criteria andExecYearNotBetween(String value1, String value2) {
            addCriterion("exec_year not between", value1, value2, "execYear");
            return (Criteria) this;
        }

        public Criteria andDayWeekRelIsNull() {
            addCriterion("day_week_rel is null");
            return (Criteria) this;
        }

        public Criteria andDayWeekRelIsNotNull() {
            addCriterion("day_week_rel is not null");
            return (Criteria) this;
        }

        public Criteria andDayWeekRelEqualTo(String value) {
            addCriterion("day_week_rel =", value, "dayWeekRel");
            return (Criteria) this;
        }

        public Criteria andDayWeekRelNotEqualTo(String value) {
            addCriterion("day_week_rel <>", value, "dayWeekRel");
            return (Criteria) this;
        }

        public Criteria andDayWeekRelGreaterThan(String value) {
            addCriterion("day_week_rel >", value, "dayWeekRel");
            return (Criteria) this;
        }

        public Criteria andDayWeekRelGreaterThanOrEqualTo(String value) {
            addCriterion("day_week_rel >=", value, "dayWeekRel");
            return (Criteria) this;
        }

        public Criteria andDayWeekRelLessThan(String value) {
            addCriterion("day_week_rel <", value, "dayWeekRel");
            return (Criteria) this;
        }

        public Criteria andDayWeekRelLessThanOrEqualTo(String value) {
            addCriterion("day_week_rel <=", value, "dayWeekRel");
            return (Criteria) this;
        }

        public Criteria andDayWeekRelLike(String value) {
            addCriterion("day_week_rel like", value, "dayWeekRel");
            return (Criteria) this;
        }

        public Criteria andDayWeekRelNotLike(String value) {
            addCriterion("day_week_rel not like", value, "dayWeekRel");
            return (Criteria) this;
        }

        public Criteria andDayWeekRelIn(List<String> values) {
            addCriterion("day_week_rel in", values, "dayWeekRel");
            return (Criteria) this;
        }

        public Criteria andDayWeekRelNotIn(List<String> values) {
            addCriterion("day_week_rel not in", values, "dayWeekRel");
            return (Criteria) this;
        }

        public Criteria andDayWeekRelBetween(String value1, String value2) {
            addCriterion("day_week_rel between", value1, value2, "dayWeekRel");
            return (Criteria) this;
        }

        public Criteria andDayWeekRelNotBetween(String value1, String value2) {
            addCriterion("day_week_rel not between", value1, value2, "dayWeekRel");
            return (Criteria) this;
        }

        public Criteria andParamValueIsNull() {
            addCriterion("param_value is null");
            return (Criteria) this;
        }

        public Criteria andParamValueIsNotNull() {
            addCriterion("param_value is not null");
            return (Criteria) this;
        }

        public Criteria andParamValueEqualTo(String value) {
            addCriterion("param_value =", value, "paramValue");
            return (Criteria) this;
        }

        public Criteria andParamValueNotEqualTo(String value) {
            addCriterion("param_value <>", value, "paramValue");
            return (Criteria) this;
        }

        public Criteria andParamValueGreaterThan(String value) {
            addCriterion("param_value >", value, "paramValue");
            return (Criteria) this;
        }

        public Criteria andParamValueGreaterThanOrEqualTo(String value) {
            addCriterion("param_value >=", value, "paramValue");
            return (Criteria) this;
        }

        public Criteria andParamValueLessThan(String value) {
            addCriterion("param_value <", value, "paramValue");
            return (Criteria) this;
        }

        public Criteria andParamValueLessThanOrEqualTo(String value) {
            addCriterion("param_value <=", value, "paramValue");
            return (Criteria) this;
        }

        public Criteria andParamValueLike(String value) {
            addCriterion("param_value like", value, "paramValue");
            return (Criteria) this;
        }

        public Criteria andParamValueNotLike(String value) {
            addCriterion("param_value not like", value, "paramValue");
            return (Criteria) this;
        }

        public Criteria andParamValueIn(List<String> values) {
            addCriterion("param_value in", values, "paramValue");
            return (Criteria) this;
        }

        public Criteria andParamValueNotIn(List<String> values) {
            addCriterion("param_value not in", values, "paramValue");
            return (Criteria) this;
        }

        public Criteria andParamValueBetween(String value1, String value2) {
            addCriterion("param_value between", value1, value2, "paramValue");
            return (Criteria) this;
        }

        public Criteria andParamValueNotBetween(String value1, String value2) {
            addCriterion("param_value not between", value1, value2, "paramValue");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("create_user like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("create_user not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("create_time like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("create_time not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("update_user is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("update_user is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(String value) {
            addCriterion("update_user =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(String value) {
            addCriterion("update_user <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(String value) {
            addCriterion("update_user >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("update_user >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(String value) {
            addCriterion("update_user <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("update_user <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLike(String value) {
            addCriterion("update_user like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotLike(String value) {
            addCriterion("update_user not like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<String> values) {
            addCriterion("update_user in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<String> values) {
            addCriterion("update_user not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(String value1, String value2) {
            addCriterion("update_user between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(String value1, String value2) {
            addCriterion("update_user not between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(String value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(String value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(String value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(String value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(String value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLike(String value) {
            addCriterion("update_time like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotLike(String value) {
            addCriterion("update_time not like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<String> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<String> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(String value1, String value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(String value1, String value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}