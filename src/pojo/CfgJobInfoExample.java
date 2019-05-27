package pojo;

import java.util.ArrayList;
import java.util.List;

public class CfgJobInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CfgJobInfoExample() {
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

        public Criteria andRequireIdIsNull() {
            addCriterion("require_id is null");
            return (Criteria) this;
        }

        public Criteria andRequireIdIsNotNull() {
            addCriterion("require_id is not null");
            return (Criteria) this;
        }

        public Criteria andRequireIdEqualTo(String value) {
            addCriterion("require_id =", value, "requireId");
            return (Criteria) this;
        }

        public Criteria andRequireIdNotEqualTo(String value) {
            addCriterion("require_id <>", value, "requireId");
            return (Criteria) this;
        }

        public Criteria andRequireIdGreaterThan(String value) {
            addCriterion("require_id >", value, "requireId");
            return (Criteria) this;
        }

        public Criteria andRequireIdGreaterThanOrEqualTo(String value) {
            addCriterion("require_id >=", value, "requireId");
            return (Criteria) this;
        }

        public Criteria andRequireIdLessThan(String value) {
            addCriterion("require_id <", value, "requireId");
            return (Criteria) this;
        }

        public Criteria andRequireIdLessThanOrEqualTo(String value) {
            addCriterion("require_id <=", value, "requireId");
            return (Criteria) this;
        }

        public Criteria andRequireIdLike(String value) {
            addCriterion("require_id like", value, "requireId");
            return (Criteria) this;
        }

        public Criteria andRequireIdNotLike(String value) {
            addCriterion("require_id not like", value, "requireId");
            return (Criteria) this;
        }

        public Criteria andRequireIdIn(List<String> values) {
            addCriterion("require_id in", values, "requireId");
            return (Criteria) this;
        }

        public Criteria andRequireIdNotIn(List<String> values) {
            addCriterion("require_id not in", values, "requireId");
            return (Criteria) this;
        }

        public Criteria andRequireIdBetween(String value1, String value2) {
            addCriterion("require_id between", value1, value2, "requireId");
            return (Criteria) this;
        }

        public Criteria andRequireIdNotBetween(String value1, String value2) {
            addCriterion("require_id not between", value1, value2, "requireId");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNull() {
            addCriterion("tenant_id is null");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNotNull() {
            addCriterion("tenant_id is not null");
            return (Criteria) this;
        }

        public Criteria andTenantIdEqualTo(String value) {
            addCriterion("tenant_id =", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotEqualTo(String value) {
            addCriterion("tenant_id <>", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThan(String value) {
            addCriterion("tenant_id >", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThanOrEqualTo(String value) {
            addCriterion("tenant_id >=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThan(String value) {
            addCriterion("tenant_id <", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThanOrEqualTo(String value) {
            addCriterion("tenant_id <=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLike(String value) {
            addCriterion("tenant_id like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotLike(String value) {
            addCriterion("tenant_id not like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdIn(List<String> values) {
            addCriterion("tenant_id in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotIn(List<String> values) {
            addCriterion("tenant_id not in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdBetween(String value1, String value2) {
            addCriterion("tenant_id between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotBetween(String value1, String value2) {
            addCriterion("tenant_id not between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andProjectEnNameIsNull() {
            addCriterion("project_en_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectEnNameIsNotNull() {
            addCriterion("project_en_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectEnNameEqualTo(String value) {
            addCriterion("project_en_name =", value, "projectEnName");
            return (Criteria) this;
        }

        public Criteria andProjectEnNameNotEqualTo(String value) {
            addCriterion("project_en_name <>", value, "projectEnName");
            return (Criteria) this;
        }

        public Criteria andProjectEnNameGreaterThan(String value) {
            addCriterion("project_en_name >", value, "projectEnName");
            return (Criteria) this;
        }

        public Criteria andProjectEnNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_en_name >=", value, "projectEnName");
            return (Criteria) this;
        }

        public Criteria andProjectEnNameLessThan(String value) {
            addCriterion("project_en_name <", value, "projectEnName");
            return (Criteria) this;
        }

        public Criteria andProjectEnNameLessThanOrEqualTo(String value) {
            addCriterion("project_en_name <=", value, "projectEnName");
            return (Criteria) this;
        }

        public Criteria andProjectEnNameLike(String value) {
            addCriterion("project_en_name like", value, "projectEnName");
            return (Criteria) this;
        }

        public Criteria andProjectEnNameNotLike(String value) {
            addCriterion("project_en_name not like", value, "projectEnName");
            return (Criteria) this;
        }

        public Criteria andProjectEnNameIn(List<String> values) {
            addCriterion("project_en_name in", values, "projectEnName");
            return (Criteria) this;
        }

        public Criteria andProjectEnNameNotIn(List<String> values) {
            addCriterion("project_en_name not in", values, "projectEnName");
            return (Criteria) this;
        }

        public Criteria andProjectEnNameBetween(String value1, String value2) {
            addCriterion("project_en_name between", value1, value2, "projectEnName");
            return (Criteria) this;
        }

        public Criteria andProjectEnNameNotBetween(String value1, String value2) {
            addCriterion("project_en_name not between", value1, value2, "projectEnName");
            return (Criteria) this;
        }

        public Criteria andJobflowNameIsNull() {
            addCriterion("jobflow_name is null");
            return (Criteria) this;
        }

        public Criteria andJobflowNameIsNotNull() {
            addCriterion("jobflow_name is not null");
            return (Criteria) this;
        }

        public Criteria andJobflowNameEqualTo(String value) {
            addCriterion("jobflow_name =", value, "jobflowName");
            return (Criteria) this;
        }

        public Criteria andJobflowNameNotEqualTo(String value) {
            addCriterion("jobflow_name <>", value, "jobflowName");
            return (Criteria) this;
        }

        public Criteria andJobflowNameGreaterThan(String value) {
            addCriterion("jobflow_name >", value, "jobflowName");
            return (Criteria) this;
        }

        public Criteria andJobflowNameGreaterThanOrEqualTo(String value) {
            addCriterion("jobflow_name >=", value, "jobflowName");
            return (Criteria) this;
        }

        public Criteria andJobflowNameLessThan(String value) {
            addCriterion("jobflow_name <", value, "jobflowName");
            return (Criteria) this;
        }

        public Criteria andJobflowNameLessThanOrEqualTo(String value) {
            addCriterion("jobflow_name <=", value, "jobflowName");
            return (Criteria) this;
        }

        public Criteria andJobflowNameLike(String value) {
            addCriterion("jobflow_name like", value, "jobflowName");
            return (Criteria) this;
        }

        public Criteria andJobflowNameNotLike(String value) {
            addCriterion("jobflow_name not like", value, "jobflowName");
            return (Criteria) this;
        }

        public Criteria andJobflowNameIn(List<String> values) {
            addCriterion("jobflow_name in", values, "jobflowName");
            return (Criteria) this;
        }

        public Criteria andJobflowNameNotIn(List<String> values) {
            addCriterion("jobflow_name not in", values, "jobflowName");
            return (Criteria) this;
        }

        public Criteria andJobflowNameBetween(String value1, String value2) {
            addCriterion("jobflow_name between", value1, value2, "jobflowName");
            return (Criteria) this;
        }

        public Criteria andJobflowNameNotBetween(String value1, String value2) {
            addCriterion("jobflow_name not between", value1, value2, "jobflowName");
            return (Criteria) this;
        }

        public Criteria andJobNameIsNull() {
            addCriterion("job_name is null");
            return (Criteria) this;
        }

        public Criteria andJobNameIsNotNull() {
            addCriterion("job_name is not null");
            return (Criteria) this;
        }

        public Criteria andJobNameEqualTo(String value) {
            addCriterion("job_name =", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotEqualTo(String value) {
            addCriterion("job_name <>", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameGreaterThan(String value) {
            addCriterion("job_name >", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameGreaterThanOrEqualTo(String value) {
            addCriterion("job_name >=", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLessThan(String value) {
            addCriterion("job_name <", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLessThanOrEqualTo(String value) {
            addCriterion("job_name <=", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLike(String value) {
            addCriterion("job_name like", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotLike(String value) {
            addCriterion("job_name not like", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameIn(List<String> values) {
            addCriterion("job_name in", values, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotIn(List<String> values) {
            addCriterion("job_name not in", values, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameBetween(String value1, String value2) {
            addCriterion("job_name between", value1, value2, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotBetween(String value1, String value2) {
            addCriterion("job_name not between", value1, value2, "jobName");
            return (Criteria) this;
        }

        public Criteria andNodeNameIsNull() {
            addCriterion("node_name is null");
            return (Criteria) this;
        }

        public Criteria andNodeNameIsNotNull() {
            addCriterion("node_name is not null");
            return (Criteria) this;
        }

        public Criteria andNodeNameEqualTo(String value) {
            addCriterion("node_name =", value, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameNotEqualTo(String value) {
            addCriterion("node_name <>", value, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameGreaterThan(String value) {
            addCriterion("node_name >", value, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameGreaterThanOrEqualTo(String value) {
            addCriterion("node_name >=", value, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameLessThan(String value) {
            addCriterion("node_name <", value, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameLessThanOrEqualTo(String value) {
            addCriterion("node_name <=", value, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameLike(String value) {
            addCriterion("node_name like", value, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameNotLike(String value) {
            addCriterion("node_name not like", value, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameIn(List<String> values) {
            addCriterion("node_name in", values, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameNotIn(List<String> values) {
            addCriterion("node_name not in", values, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameBetween(String value1, String value2) {
            addCriterion("node_name between", value1, value2, "nodeName");
            return (Criteria) this;
        }

        public Criteria andNodeNameNotBetween(String value1, String value2) {
            addCriterion("node_name not between", value1, value2, "nodeName");
            return (Criteria) this;
        }

        public Criteria andRateIdIsNull() {
            addCriterion("rate_id is null");
            return (Criteria) this;
        }

        public Criteria andRateIdIsNotNull() {
            addCriterion("rate_id is not null");
            return (Criteria) this;
        }

        public Criteria andRateIdEqualTo(String value) {
            addCriterion("rate_id =", value, "rateId");
            return (Criteria) this;
        }

        public Criteria andRateIdNotEqualTo(String value) {
            addCriterion("rate_id <>", value, "rateId");
            return (Criteria) this;
        }

        public Criteria andRateIdGreaterThan(String value) {
            addCriterion("rate_id >", value, "rateId");
            return (Criteria) this;
        }

        public Criteria andRateIdGreaterThanOrEqualTo(String value) {
            addCriterion("rate_id >=", value, "rateId");
            return (Criteria) this;
        }

        public Criteria andRateIdLessThan(String value) {
            addCriterion("rate_id <", value, "rateId");
            return (Criteria) this;
        }

        public Criteria andRateIdLessThanOrEqualTo(String value) {
            addCriterion("rate_id <=", value, "rateId");
            return (Criteria) this;
        }

        public Criteria andRateIdLike(String value) {
            addCriterion("rate_id like", value, "rateId");
            return (Criteria) this;
        }

        public Criteria andRateIdNotLike(String value) {
            addCriterion("rate_id not like", value, "rateId");
            return (Criteria) this;
        }

        public Criteria andRateIdIn(List<String> values) {
            addCriterion("rate_id in", values, "rateId");
            return (Criteria) this;
        }

        public Criteria andRateIdNotIn(List<String> values) {
            addCriterion("rate_id not in", values, "rateId");
            return (Criteria) this;
        }

        public Criteria andRateIdBetween(String value1, String value2) {
            addCriterion("rate_id between", value1, value2, "rateId");
            return (Criteria) this;
        }

        public Criteria andRateIdNotBetween(String value1, String value2) {
            addCriterion("rate_id not between", value1, value2, "rateId");
            return (Criteria) this;
        }

        public Criteria andRunCountIsNull() {
            addCriterion("run_count is null");
            return (Criteria) this;
        }

        public Criteria andRunCountIsNotNull() {
            addCriterion("run_count is not null");
            return (Criteria) this;
        }

        public Criteria andRunCountEqualTo(Integer value) {
            addCriterion("run_count =", value, "runCount");
            return (Criteria) this;
        }

        public Criteria andRunCountNotEqualTo(Integer value) {
            addCriterion("run_count <>", value, "runCount");
            return (Criteria) this;
        }

        public Criteria andRunCountGreaterThan(Integer value) {
            addCriterion("run_count >", value, "runCount");
            return (Criteria) this;
        }

        public Criteria andRunCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("run_count >=", value, "runCount");
            return (Criteria) this;
        }

        public Criteria andRunCountLessThan(Integer value) {
            addCriterion("run_count <", value, "runCount");
            return (Criteria) this;
        }

        public Criteria andRunCountLessThanOrEqualTo(Integer value) {
            addCriterion("run_count <=", value, "runCount");
            return (Criteria) this;
        }

        public Criteria andRunCountIn(List<Integer> values) {
            addCriterion("run_count in", values, "runCount");
            return (Criteria) this;
        }

        public Criteria andRunCountNotIn(List<Integer> values) {
            addCriterion("run_count not in", values, "runCount");
            return (Criteria) this;
        }

        public Criteria andRunCountBetween(Integer value1, Integer value2) {
            addCriterion("run_count between", value1, value2, "runCount");
            return (Criteria) this;
        }

        public Criteria andRunCountNotBetween(Integer value1, Integer value2) {
            addCriterion("run_count not between", value1, value2, "runCount");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNull() {
            addCriterion("priority is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNotNull() {
            addCriterion("priority is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityEqualTo(Integer value) {
            addCriterion("priority =", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotEqualTo(Integer value) {
            addCriterion("priority <>", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThan(Integer value) {
            addCriterion("priority >", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(Integer value) {
            addCriterion("priority >=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThan(Integer value) {
            addCriterion("priority <", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThanOrEqualTo(Integer value) {
            addCriterion("priority <=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityIn(List<Integer> values) {
            addCriterion("priority in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotIn(List<Integer> values) {
            addCriterion("priority not in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityBetween(Integer value1, Integer value2) {
            addCriterion("priority between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotBetween(Integer value1, Integer value2) {
            addCriterion("priority not between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andJobStartTimeIsNull() {
            addCriterion("job_start_time is null");
            return (Criteria) this;
        }

        public Criteria andJobStartTimeIsNotNull() {
            addCriterion("job_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andJobStartTimeEqualTo(String value) {
            addCriterion("job_start_time =", value, "jobStartTime");
            return (Criteria) this;
        }

        public Criteria andJobStartTimeNotEqualTo(String value) {
            addCriterion("job_start_time <>", value, "jobStartTime");
            return (Criteria) this;
        }

        public Criteria andJobStartTimeGreaterThan(String value) {
            addCriterion("job_start_time >", value, "jobStartTime");
            return (Criteria) this;
        }

        public Criteria andJobStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("job_start_time >=", value, "jobStartTime");
            return (Criteria) this;
        }

        public Criteria andJobStartTimeLessThan(String value) {
            addCriterion("job_start_time <", value, "jobStartTime");
            return (Criteria) this;
        }

        public Criteria andJobStartTimeLessThanOrEqualTo(String value) {
            addCriterion("job_start_time <=", value, "jobStartTime");
            return (Criteria) this;
        }

        public Criteria andJobStartTimeLike(String value) {
            addCriterion("job_start_time like", value, "jobStartTime");
            return (Criteria) this;
        }

        public Criteria andJobStartTimeNotLike(String value) {
            addCriterion("job_start_time not like", value, "jobStartTime");
            return (Criteria) this;
        }

        public Criteria andJobStartTimeIn(List<String> values) {
            addCriterion("job_start_time in", values, "jobStartTime");
            return (Criteria) this;
        }

        public Criteria andJobStartTimeNotIn(List<String> values) {
            addCriterion("job_start_time not in", values, "jobStartTime");
            return (Criteria) this;
        }

        public Criteria andJobStartTimeBetween(String value1, String value2) {
            addCriterion("job_start_time between", value1, value2, "jobStartTime");
            return (Criteria) this;
        }

        public Criteria andJobStartTimeNotBetween(String value1, String value2) {
            addCriterion("job_start_time not between", value1, value2, "jobStartTime");
            return (Criteria) this;
        }

        public Criteria andUseFlagIsNull() {
            addCriterion("use_flag is null");
            return (Criteria) this;
        }

        public Criteria andUseFlagIsNotNull() {
            addCriterion("use_flag is not null");
            return (Criteria) this;
        }

        public Criteria andUseFlagEqualTo(String value) {
            addCriterion("use_flag =", value, "useFlag");
            return (Criteria) this;
        }

        public Criteria andUseFlagNotEqualTo(String value) {
            addCriterion("use_flag <>", value, "useFlag");
            return (Criteria) this;
        }

        public Criteria andUseFlagGreaterThan(String value) {
            addCriterion("use_flag >", value, "useFlag");
            return (Criteria) this;
        }

        public Criteria andUseFlagGreaterThanOrEqualTo(String value) {
            addCriterion("use_flag >=", value, "useFlag");
            return (Criteria) this;
        }

        public Criteria andUseFlagLessThan(String value) {
            addCriterion("use_flag <", value, "useFlag");
            return (Criteria) this;
        }

        public Criteria andUseFlagLessThanOrEqualTo(String value) {
            addCriterion("use_flag <=", value, "useFlag");
            return (Criteria) this;
        }

        public Criteria andUseFlagLike(String value) {
            addCriterion("use_flag like", value, "useFlag");
            return (Criteria) this;
        }

        public Criteria andUseFlagNotLike(String value) {
            addCriterion("use_flag not like", value, "useFlag");
            return (Criteria) this;
        }

        public Criteria andUseFlagIn(List<String> values) {
            addCriterion("use_flag in", values, "useFlag");
            return (Criteria) this;
        }

        public Criteria andUseFlagNotIn(List<String> values) {
            addCriterion("use_flag not in", values, "useFlag");
            return (Criteria) this;
        }

        public Criteria andUseFlagBetween(String value1, String value2) {
            addCriterion("use_flag between", value1, value2, "useFlag");
            return (Criteria) this;
        }

        public Criteria andUseFlagNotBetween(String value1, String value2) {
            addCriterion("use_flag not between", value1, value2, "useFlag");
            return (Criteria) this;
        }

        public Criteria andExecUserIsNull() {
            addCriterion("exec_user is null");
            return (Criteria) this;
        }

        public Criteria andExecUserIsNotNull() {
            addCriterion("exec_user is not null");
            return (Criteria) this;
        }

        public Criteria andExecUserEqualTo(String value) {
            addCriterion("exec_user =", value, "execUser");
            return (Criteria) this;
        }

        public Criteria andExecUserNotEqualTo(String value) {
            addCriterion("exec_user <>", value, "execUser");
            return (Criteria) this;
        }

        public Criteria andExecUserGreaterThan(String value) {
            addCriterion("exec_user >", value, "execUser");
            return (Criteria) this;
        }

        public Criteria andExecUserGreaterThanOrEqualTo(String value) {
            addCriterion("exec_user >=", value, "execUser");
            return (Criteria) this;
        }

        public Criteria andExecUserLessThan(String value) {
            addCriterion("exec_user <", value, "execUser");
            return (Criteria) this;
        }

        public Criteria andExecUserLessThanOrEqualTo(String value) {
            addCriterion("exec_user <=", value, "execUser");
            return (Criteria) this;
        }

        public Criteria andExecUserLike(String value) {
            addCriterion("exec_user like", value, "execUser");
            return (Criteria) this;
        }

        public Criteria andExecUserNotLike(String value) {
            addCriterion("exec_user not like", value, "execUser");
            return (Criteria) this;
        }

        public Criteria andExecUserIn(List<String> values) {
            addCriterion("exec_user in", values, "execUser");
            return (Criteria) this;
        }

        public Criteria andExecUserNotIn(List<String> values) {
            addCriterion("exec_user not in", values, "execUser");
            return (Criteria) this;
        }

        public Criteria andExecUserBetween(String value1, String value2) {
            addCriterion("exec_user between", value1, value2, "execUser");
            return (Criteria) this;
        }

        public Criteria andExecUserNotBetween(String value1, String value2) {
            addCriterion("exec_user not between", value1, value2, "execUser");
            return (Criteria) this;
        }

        public Criteria andLogPathIsNull() {
            addCriterion("log_path is null");
            return (Criteria) this;
        }

        public Criteria andLogPathIsNotNull() {
            addCriterion("log_path is not null");
            return (Criteria) this;
        }

        public Criteria andLogPathEqualTo(String value) {
            addCriterion("log_path =", value, "logPath");
            return (Criteria) this;
        }

        public Criteria andLogPathNotEqualTo(String value) {
            addCriterion("log_path <>", value, "logPath");
            return (Criteria) this;
        }

        public Criteria andLogPathGreaterThan(String value) {
            addCriterion("log_path >", value, "logPath");
            return (Criteria) this;
        }

        public Criteria andLogPathGreaterThanOrEqualTo(String value) {
            addCriterion("log_path >=", value, "logPath");
            return (Criteria) this;
        }

        public Criteria andLogPathLessThan(String value) {
            addCriterion("log_path <", value, "logPath");
            return (Criteria) this;
        }

        public Criteria andLogPathLessThanOrEqualTo(String value) {
            addCriterion("log_path <=", value, "logPath");
            return (Criteria) this;
        }

        public Criteria andLogPathLike(String value) {
            addCriterion("log_path like", value, "logPath");
            return (Criteria) this;
        }

        public Criteria andLogPathNotLike(String value) {
            addCriterion("log_path not like", value, "logPath");
            return (Criteria) this;
        }

        public Criteria andLogPathIn(List<String> values) {
            addCriterion("log_path in", values, "logPath");
            return (Criteria) this;
        }

        public Criteria andLogPathNotIn(List<String> values) {
            addCriterion("log_path not in", values, "logPath");
            return (Criteria) this;
        }

        public Criteria andLogPathBetween(String value1, String value2) {
            addCriterion("log_path between", value1, value2, "logPath");
            return (Criteria) this;
        }

        public Criteria andLogPathNotBetween(String value1, String value2) {
            addCriterion("log_path not between", value1, value2, "logPath");
            return (Criteria) this;
        }

        public Criteria andHolidayFlagIsNull() {
            addCriterion("holiday_flag is null");
            return (Criteria) this;
        }

        public Criteria andHolidayFlagIsNotNull() {
            addCriterion("holiday_flag is not null");
            return (Criteria) this;
        }

        public Criteria andHolidayFlagEqualTo(String value) {
            addCriterion("holiday_flag =", value, "holidayFlag");
            return (Criteria) this;
        }

        public Criteria andHolidayFlagNotEqualTo(String value) {
            addCriterion("holiday_flag <>", value, "holidayFlag");
            return (Criteria) this;
        }

        public Criteria andHolidayFlagGreaterThan(String value) {
            addCriterion("holiday_flag >", value, "holidayFlag");
            return (Criteria) this;
        }

        public Criteria andHolidayFlagGreaterThanOrEqualTo(String value) {
            addCriterion("holiday_flag >=", value, "holidayFlag");
            return (Criteria) this;
        }

        public Criteria andHolidayFlagLessThan(String value) {
            addCriterion("holiday_flag <", value, "holidayFlag");
            return (Criteria) this;
        }

        public Criteria andHolidayFlagLessThanOrEqualTo(String value) {
            addCriterion("holiday_flag <=", value, "holidayFlag");
            return (Criteria) this;
        }

        public Criteria andHolidayFlagLike(String value) {
            addCriterion("holiday_flag like", value, "holidayFlag");
            return (Criteria) this;
        }

        public Criteria andHolidayFlagNotLike(String value) {
            addCriterion("holiday_flag not like", value, "holidayFlag");
            return (Criteria) this;
        }

        public Criteria andHolidayFlagIn(List<String> values) {
            addCriterion("holiday_flag in", values, "holidayFlag");
            return (Criteria) this;
        }

        public Criteria andHolidayFlagNotIn(List<String> values) {
            addCriterion("holiday_flag not in", values, "holidayFlag");
            return (Criteria) this;
        }

        public Criteria andHolidayFlagBetween(String value1, String value2) {
            addCriterion("holiday_flag between", value1, value2, "holidayFlag");
            return (Criteria) this;
        }

        public Criteria andHolidayFlagNotBetween(String value1, String value2) {
            addCriterion("holiday_flag not between", value1, value2, "holidayFlag");
            return (Criteria) this;
        }

        public Criteria andRerunIntervalIsNull() {
            addCriterion("rerun_interval is null");
            return (Criteria) this;
        }

        public Criteria andRerunIntervalIsNotNull() {
            addCriterion("rerun_interval is not null");
            return (Criteria) this;
        }

        public Criteria andRerunIntervalEqualTo(Integer value) {
            addCriterion("rerun_interval =", value, "rerunInterval");
            return (Criteria) this;
        }

        public Criteria andRerunIntervalNotEqualTo(Integer value) {
            addCriterion("rerun_interval <>", value, "rerunInterval");
            return (Criteria) this;
        }

        public Criteria andRerunIntervalGreaterThan(Integer value) {
            addCriterion("rerun_interval >", value, "rerunInterval");
            return (Criteria) this;
        }

        public Criteria andRerunIntervalGreaterThanOrEqualTo(Integer value) {
            addCriterion("rerun_interval >=", value, "rerunInterval");
            return (Criteria) this;
        }

        public Criteria andRerunIntervalLessThan(Integer value) {
            addCriterion("rerun_interval <", value, "rerunInterval");
            return (Criteria) this;
        }

        public Criteria andRerunIntervalLessThanOrEqualTo(Integer value) {
            addCriterion("rerun_interval <=", value, "rerunInterval");
            return (Criteria) this;
        }

        public Criteria andRerunIntervalIn(List<Integer> values) {
            addCriterion("rerun_interval in", values, "rerunInterval");
            return (Criteria) this;
        }

        public Criteria andRerunIntervalNotIn(List<Integer> values) {
            addCriterion("rerun_interval not in", values, "rerunInterval");
            return (Criteria) this;
        }

        public Criteria andRerunIntervalBetween(Integer value1, Integer value2) {
            addCriterion("rerun_interval between", value1, value2, "rerunInterval");
            return (Criteria) this;
        }

        public Criteria andRerunIntervalNotBetween(Integer value1, Integer value2) {
            addCriterion("rerun_interval not between", value1, value2, "rerunInterval");
            return (Criteria) this;
        }

        public Criteria andRunTimeIsNull() {
            addCriterion("run_time is null");
            return (Criteria) this;
        }

        public Criteria andRunTimeIsNotNull() {
            addCriterion("run_time is not null");
            return (Criteria) this;
        }

        public Criteria andRunTimeEqualTo(Integer value) {
            addCriterion("run_time =", value, "runTime");
            return (Criteria) this;
        }

        public Criteria andRunTimeNotEqualTo(Integer value) {
            addCriterion("run_time <>", value, "runTime");
            return (Criteria) this;
        }

        public Criteria andRunTimeGreaterThan(Integer value) {
            addCriterion("run_time >", value, "runTime");
            return (Criteria) this;
        }

        public Criteria andRunTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("run_time >=", value, "runTime");
            return (Criteria) this;
        }

        public Criteria andRunTimeLessThan(Integer value) {
            addCriterion("run_time <", value, "runTime");
            return (Criteria) this;
        }

        public Criteria andRunTimeLessThanOrEqualTo(Integer value) {
            addCriterion("run_time <=", value, "runTime");
            return (Criteria) this;
        }

        public Criteria andRunTimeIn(List<Integer> values) {
            addCriterion("run_time in", values, "runTime");
            return (Criteria) this;
        }

        public Criteria andRunTimeNotIn(List<Integer> values) {
            addCriterion("run_time not in", values, "runTime");
            return (Criteria) this;
        }

        public Criteria andRunTimeBetween(Integer value1, Integer value2) {
            addCriterion("run_time between", value1, value2, "runTime");
            return (Criteria) this;
        }

        public Criteria andRunTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("run_time not between", value1, value2, "runTime");
            return (Criteria) this;
        }

        public Criteria andWaitTimeIsNull() {
            addCriterion("wait_time is null");
            return (Criteria) this;
        }

        public Criteria andWaitTimeIsNotNull() {
            addCriterion("wait_time is not null");
            return (Criteria) this;
        }

        public Criteria andWaitTimeEqualTo(Integer value) {
            addCriterion("wait_time =", value, "waitTime");
            return (Criteria) this;
        }

        public Criteria andWaitTimeNotEqualTo(Integer value) {
            addCriterion("wait_time <>", value, "waitTime");
            return (Criteria) this;
        }

        public Criteria andWaitTimeGreaterThan(Integer value) {
            addCriterion("wait_time >", value, "waitTime");
            return (Criteria) this;
        }

        public Criteria andWaitTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("wait_time >=", value, "waitTime");
            return (Criteria) this;
        }

        public Criteria andWaitTimeLessThan(Integer value) {
            addCriterion("wait_time <", value, "waitTime");
            return (Criteria) this;
        }

        public Criteria andWaitTimeLessThanOrEqualTo(Integer value) {
            addCriterion("wait_time <=", value, "waitTime");
            return (Criteria) this;
        }

        public Criteria andWaitTimeIn(List<Integer> values) {
            addCriterion("wait_time in", values, "waitTime");
            return (Criteria) this;
        }

        public Criteria andWaitTimeNotIn(List<Integer> values) {
            addCriterion("wait_time not in", values, "waitTime");
            return (Criteria) this;
        }

        public Criteria andWaitTimeBetween(Integer value1, Integer value2) {
            addCriterion("wait_time between", value1, value2, "waitTime");
            return (Criteria) this;
        }

        public Criteria andWaitTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("wait_time not between", value1, value2, "waitTime");
            return (Criteria) this;
        }

        public Criteria andRunSystemIsNull() {
            addCriterion("run_system is null");
            return (Criteria) this;
        }

        public Criteria andRunSystemIsNotNull() {
            addCriterion("run_system is not null");
            return (Criteria) this;
        }

        public Criteria andRunSystemEqualTo(String value) {
            addCriterion("run_system =", value, "runSystem");
            return (Criteria) this;
        }

        public Criteria andRunSystemNotEqualTo(String value) {
            addCriterion("run_system <>", value, "runSystem");
            return (Criteria) this;
        }

        public Criteria andRunSystemGreaterThan(String value) {
            addCriterion("run_system >", value, "runSystem");
            return (Criteria) this;
        }

        public Criteria andRunSystemGreaterThanOrEqualTo(String value) {
            addCriterion("run_system >=", value, "runSystem");
            return (Criteria) this;
        }

        public Criteria andRunSystemLessThan(String value) {
            addCriterion("run_system <", value, "runSystem");
            return (Criteria) this;
        }

        public Criteria andRunSystemLessThanOrEqualTo(String value) {
            addCriterion("run_system <=", value, "runSystem");
            return (Criteria) this;
        }

        public Criteria andRunSystemLike(String value) {
            addCriterion("run_system like", value, "runSystem");
            return (Criteria) this;
        }

        public Criteria andRunSystemNotLike(String value) {
            addCriterion("run_system not like", value, "runSystem");
            return (Criteria) this;
        }

        public Criteria andRunSystemIn(List<String> values) {
            addCriterion("run_system in", values, "runSystem");
            return (Criteria) this;
        }

        public Criteria andRunSystemNotIn(List<String> values) {
            addCriterion("run_system not in", values, "runSystem");
            return (Criteria) this;
        }

        public Criteria andRunSystemBetween(String value1, String value2) {
            addCriterion("run_system between", value1, value2, "runSystem");
            return (Criteria) this;
        }

        public Criteria andRunSystemNotBetween(String value1, String value2) {
            addCriterion("run_system not between", value1, value2, "runSystem");
            return (Criteria) this;
        }

        public Criteria andDelSignIsNull() {
            addCriterion("del_sign is null");
            return (Criteria) this;
        }

        public Criteria andDelSignIsNotNull() {
            addCriterion("del_sign is not null");
            return (Criteria) this;
        }

        public Criteria andDelSignEqualTo(String value) {
            addCriterion("del_sign =", value, "delSign");
            return (Criteria) this;
        }

        public Criteria andDelSignNotEqualTo(String value) {
            addCriterion("del_sign <>", value, "delSign");
            return (Criteria) this;
        }

        public Criteria andDelSignGreaterThan(String value) {
            addCriterion("del_sign >", value, "delSign");
            return (Criteria) this;
        }

        public Criteria andDelSignGreaterThanOrEqualTo(String value) {
            addCriterion("del_sign >=", value, "delSign");
            return (Criteria) this;
        }

        public Criteria andDelSignLessThan(String value) {
            addCriterion("del_sign <", value, "delSign");
            return (Criteria) this;
        }

        public Criteria andDelSignLessThanOrEqualTo(String value) {
            addCriterion("del_sign <=", value, "delSign");
            return (Criteria) this;
        }

        public Criteria andDelSignLike(String value) {
            addCriterion("del_sign like", value, "delSign");
            return (Criteria) this;
        }

        public Criteria andDelSignNotLike(String value) {
            addCriterion("del_sign not like", value, "delSign");
            return (Criteria) this;
        }

        public Criteria andDelSignIn(List<String> values) {
            addCriterion("del_sign in", values, "delSign");
            return (Criteria) this;
        }

        public Criteria andDelSignNotIn(List<String> values) {
            addCriterion("del_sign not in", values, "delSign");
            return (Criteria) this;
        }

        public Criteria andDelSignBetween(String value1, String value2) {
            addCriterion("del_sign between", value1, value2, "delSign");
            return (Criteria) this;
        }

        public Criteria andDelSignNotBetween(String value1, String value2) {
            addCriterion("del_sign not between", value1, value2, "delSign");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
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