package pojo;

import java.util.ArrayList;
import java.util.List;

public class CfgJobCmdMapExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CfgJobCmdMapExample() {
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

        public Criteria andCfgJobCmdIdIsNull() {
            addCriterion("cfg_job_cmd_id is null");
            return (Criteria) this;
        }

        public Criteria andCfgJobCmdIdIsNotNull() {
            addCriterion("cfg_job_cmd_id is not null");
            return (Criteria) this;
        }

        public Criteria andCfgJobCmdIdEqualTo(String value) {
            addCriterion("cfg_job_cmd_id =", value, "cfgJobCmdId");
            return (Criteria) this;
        }

        public Criteria andCfgJobCmdIdNotEqualTo(String value) {
            addCriterion("cfg_job_cmd_id <>", value, "cfgJobCmdId");
            return (Criteria) this;
        }

        public Criteria andCfgJobCmdIdGreaterThan(String value) {
            addCriterion("cfg_job_cmd_id >", value, "cfgJobCmdId");
            return (Criteria) this;
        }

        public Criteria andCfgJobCmdIdGreaterThanOrEqualTo(String value) {
            addCriterion("cfg_job_cmd_id >=", value, "cfgJobCmdId");
            return (Criteria) this;
        }

        public Criteria andCfgJobCmdIdLessThan(String value) {
            addCriterion("cfg_job_cmd_id <", value, "cfgJobCmdId");
            return (Criteria) this;
        }

        public Criteria andCfgJobCmdIdLessThanOrEqualTo(String value) {
            addCriterion("cfg_job_cmd_id <=", value, "cfgJobCmdId");
            return (Criteria) this;
        }

        public Criteria andCfgJobCmdIdLike(String value) {
            addCriterion("cfg_job_cmd_id like", value, "cfgJobCmdId");
            return (Criteria) this;
        }

        public Criteria andCfgJobCmdIdNotLike(String value) {
            addCriterion("cfg_job_cmd_id not like", value, "cfgJobCmdId");
            return (Criteria) this;
        }

        public Criteria andCfgJobCmdIdIn(List<String> values) {
            addCriterion("cfg_job_cmd_id in", values, "cfgJobCmdId");
            return (Criteria) this;
        }

        public Criteria andCfgJobCmdIdNotIn(List<String> values) {
            addCriterion("cfg_job_cmd_id not in", values, "cfgJobCmdId");
            return (Criteria) this;
        }

        public Criteria andCfgJobCmdIdBetween(String value1, String value2) {
            addCriterion("cfg_job_cmd_id between", value1, value2, "cfgJobCmdId");
            return (Criteria) this;
        }

        public Criteria andCfgJobCmdIdNotBetween(String value1, String value2) {
            addCriterion("cfg_job_cmd_id not between", value1, value2, "cfgJobCmdId");
            return (Criteria) this;
        }

        public Criteria andRelationIsNull() {
            addCriterion("relation is null");
            return (Criteria) this;
        }

        public Criteria andRelationIsNotNull() {
            addCriterion("relation is not null");
            return (Criteria) this;
        }

        public Criteria andRelationEqualTo(String value) {
            addCriterion("relation =", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotEqualTo(String value) {
            addCriterion("relation <>", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationGreaterThan(String value) {
            addCriterion("relation >", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationGreaterThanOrEqualTo(String value) {
            addCriterion("relation >=", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationLessThan(String value) {
            addCriterion("relation <", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationLessThanOrEqualTo(String value) {
            addCriterion("relation <=", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationLike(String value) {
            addCriterion("relation like", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotLike(String value) {
            addCriterion("relation not like", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationIn(List<String> values) {
            addCriterion("relation in", values, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotIn(List<String> values) {
            addCriterion("relation not in", values, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationBetween(String value1, String value2) {
            addCriterion("relation between", value1, value2, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotBetween(String value1, String value2) {
            addCriterion("relation not between", value1, value2, "relation");
            return (Criteria) this;
        }

        public Criteria andJobTypeIsNull() {
            addCriterion("job_type is null");
            return (Criteria) this;
        }

        public Criteria andJobTypeIsNotNull() {
            addCriterion("job_type is not null");
            return (Criteria) this;
        }

        public Criteria andJobTypeEqualTo(String value) {
            addCriterion("job_type =", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeNotEqualTo(String value) {
            addCriterion("job_type <>", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeGreaterThan(String value) {
            addCriterion("job_type >", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeGreaterThanOrEqualTo(String value) {
            addCriterion("job_type >=", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeLessThan(String value) {
            addCriterion("job_type <", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeLessThanOrEqualTo(String value) {
            addCriterion("job_type <=", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeLike(String value) {
            addCriterion("job_type like", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeNotLike(String value) {
            addCriterion("job_type not like", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeIn(List<String> values) {
            addCriterion("job_type in", values, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeNotIn(List<String> values) {
            addCriterion("job_type not in", values, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeBetween(String value1, String value2) {
            addCriterion("job_type between", value1, value2, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeNotBetween(String value1, String value2) {
            addCriterion("job_type not between", value1, value2, "jobType");
            return (Criteria) this;
        }

        public Criteria andLibPathIsNull() {
            addCriterion("lib_path is null");
            return (Criteria) this;
        }

        public Criteria andLibPathIsNotNull() {
            addCriterion("lib_path is not null");
            return (Criteria) this;
        }

        public Criteria andLibPathEqualTo(String value) {
            addCriterion("lib_path =", value, "libPath");
            return (Criteria) this;
        }

        public Criteria andLibPathNotEqualTo(String value) {
            addCriterion("lib_path <>", value, "libPath");
            return (Criteria) this;
        }

        public Criteria andLibPathGreaterThan(String value) {
            addCriterion("lib_path >", value, "libPath");
            return (Criteria) this;
        }

        public Criteria andLibPathGreaterThanOrEqualTo(String value) {
            addCriterion("lib_path >=", value, "libPath");
            return (Criteria) this;
        }

        public Criteria andLibPathLessThan(String value) {
            addCriterion("lib_path <", value, "libPath");
            return (Criteria) this;
        }

        public Criteria andLibPathLessThanOrEqualTo(String value) {
            addCriterion("lib_path <=", value, "libPath");
            return (Criteria) this;
        }

        public Criteria andLibPathLike(String value) {
            addCriterion("lib_path like", value, "libPath");
            return (Criteria) this;
        }

        public Criteria andLibPathNotLike(String value) {
            addCriterion("lib_path not like", value, "libPath");
            return (Criteria) this;
        }

        public Criteria andLibPathIn(List<String> values) {
            addCriterion("lib_path in", values, "libPath");
            return (Criteria) this;
        }

        public Criteria andLibPathNotIn(List<String> values) {
            addCriterion("lib_path not in", values, "libPath");
            return (Criteria) this;
        }

        public Criteria andLibPathBetween(String value1, String value2) {
            addCriterion("lib_path between", value1, value2, "libPath");
            return (Criteria) this;
        }

        public Criteria andLibPathNotBetween(String value1, String value2) {
            addCriterion("lib_path not between", value1, value2, "libPath");
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