package pojo;

import java.util.ArrayList;
import java.util.List;

public class CfgJobflowInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CfgJobflowInfoExample() {
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

        public Criteria andGroupIdIsNull() {
            addCriterion("group_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("group_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(String value) {
            addCriterion("group_id =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(String value) {
            addCriterion("group_id <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(String value) {
            addCriterion("group_id >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("group_id >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(String value) {
            addCriterion("group_id <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(String value) {
            addCriterion("group_id <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLike(String value) {
            addCriterion("group_id like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotLike(String value) {
            addCriterion("group_id not like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<String> values) {
            addCriterion("group_id in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<String> values) {
            addCriterion("group_id not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(String value1, String value2) {
            addCriterion("group_id between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(String value1, String value2) {
            addCriterion("group_id not between", value1, value2, "groupId");
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

        public Criteria andPorjectNameEnIsNull() {
            addCriterion("porject_name_en is null");
            return (Criteria) this;
        }

        public Criteria andPorjectNameEnIsNotNull() {
            addCriterion("porject_name_en is not null");
            return (Criteria) this;
        }

        public Criteria andPorjectNameEnEqualTo(String value) {
            addCriterion("porject_name_en =", value, "porjectNameEn");
            return (Criteria) this;
        }

        public Criteria andPorjectNameEnNotEqualTo(String value) {
            addCriterion("porject_name_en <>", value, "porjectNameEn");
            return (Criteria) this;
        }

        public Criteria andPorjectNameEnGreaterThan(String value) {
            addCriterion("porject_name_en >", value, "porjectNameEn");
            return (Criteria) this;
        }

        public Criteria andPorjectNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("porject_name_en >=", value, "porjectNameEn");
            return (Criteria) this;
        }

        public Criteria andPorjectNameEnLessThan(String value) {
            addCriterion("porject_name_en <", value, "porjectNameEn");
            return (Criteria) this;
        }

        public Criteria andPorjectNameEnLessThanOrEqualTo(String value) {
            addCriterion("porject_name_en <=", value, "porjectNameEn");
            return (Criteria) this;
        }

        public Criteria andPorjectNameEnLike(String value) {
            addCriterion("porject_name_en like", value, "porjectNameEn");
            return (Criteria) this;
        }

        public Criteria andPorjectNameEnNotLike(String value) {
            addCriterion("porject_name_en not like", value, "porjectNameEn");
            return (Criteria) this;
        }

        public Criteria andPorjectNameEnIn(List<String> values) {
            addCriterion("porject_name_en in", values, "porjectNameEn");
            return (Criteria) this;
        }

        public Criteria andPorjectNameEnNotIn(List<String> values) {
            addCriterion("porject_name_en not in", values, "porjectNameEn");
            return (Criteria) this;
        }

        public Criteria andPorjectNameEnBetween(String value1, String value2) {
            addCriterion("porject_name_en between", value1, value2, "porjectNameEn");
            return (Criteria) this;
        }

        public Criteria andPorjectNameEnNotBetween(String value1, String value2) {
            addCriterion("porject_name_en not between", value1, value2, "porjectNameEn");
            return (Criteria) this;
        }

        public Criteria andApplicationIdIsNull() {
            addCriterion("application_id is null");
            return (Criteria) this;
        }

        public Criteria andApplicationIdIsNotNull() {
            addCriterion("application_id is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationIdEqualTo(String value) {
            addCriterion("application_id =", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdNotEqualTo(String value) {
            addCriterion("application_id <>", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdGreaterThan(String value) {
            addCriterion("application_id >", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdGreaterThanOrEqualTo(String value) {
            addCriterion("application_id >=", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdLessThan(String value) {
            addCriterion("application_id <", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdLessThanOrEqualTo(String value) {
            addCriterion("application_id <=", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdLike(String value) {
            addCriterion("application_id like", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdNotLike(String value) {
            addCriterion("application_id not like", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdIn(List<String> values) {
            addCriterion("application_id in", values, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdNotIn(List<String> values) {
            addCriterion("application_id not in", values, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdBetween(String value1, String value2) {
            addCriterion("application_id between", value1, value2, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdNotBetween(String value1, String value2) {
            addCriterion("application_id not between", value1, value2, "applicationId");
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

        public Criteria andActivateDateIsNull() {
            addCriterion("activate_date is null");
            return (Criteria) this;
        }

        public Criteria andActivateDateIsNotNull() {
            addCriterion("activate_date is not null");
            return (Criteria) this;
        }

        public Criteria andActivateDateEqualTo(String value) {
            addCriterion("activate_date =", value, "activateDate");
            return (Criteria) this;
        }

        public Criteria andActivateDateNotEqualTo(String value) {
            addCriterion("activate_date <>", value, "activateDate");
            return (Criteria) this;
        }

        public Criteria andActivateDateGreaterThan(String value) {
            addCriterion("activate_date >", value, "activateDate");
            return (Criteria) this;
        }

        public Criteria andActivateDateGreaterThanOrEqualTo(String value) {
            addCriterion("activate_date >=", value, "activateDate");
            return (Criteria) this;
        }

        public Criteria andActivateDateLessThan(String value) {
            addCriterion("activate_date <", value, "activateDate");
            return (Criteria) this;
        }

        public Criteria andActivateDateLessThanOrEqualTo(String value) {
            addCriterion("activate_date <=", value, "activateDate");
            return (Criteria) this;
        }

        public Criteria andActivateDateLike(String value) {
            addCriterion("activate_date like", value, "activateDate");
            return (Criteria) this;
        }

        public Criteria andActivateDateNotLike(String value) {
            addCriterion("activate_date not like", value, "activateDate");
            return (Criteria) this;
        }

        public Criteria andActivateDateIn(List<String> values) {
            addCriterion("activate_date in", values, "activateDate");
            return (Criteria) this;
        }

        public Criteria andActivateDateNotIn(List<String> values) {
            addCriterion("activate_date not in", values, "activateDate");
            return (Criteria) this;
        }

        public Criteria andActivateDateBetween(String value1, String value2) {
            addCriterion("activate_date between", value1, value2, "activateDate");
            return (Criteria) this;
        }

        public Criteria andActivateDateNotBetween(String value1, String value2) {
            addCriterion("activate_date not between", value1, value2, "activateDate");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeIsNull() {
            addCriterion("plan_start_time is null");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeIsNotNull() {
            addCriterion("plan_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeEqualTo(String value) {
            addCriterion("plan_start_time =", value, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeNotEqualTo(String value) {
            addCriterion("plan_start_time <>", value, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeGreaterThan(String value) {
            addCriterion("plan_start_time >", value, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("plan_start_time >=", value, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeLessThan(String value) {
            addCriterion("plan_start_time <", value, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeLessThanOrEqualTo(String value) {
            addCriterion("plan_start_time <=", value, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeLike(String value) {
            addCriterion("plan_start_time like", value, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeNotLike(String value) {
            addCriterion("plan_start_time not like", value, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeIn(List<String> values) {
            addCriterion("plan_start_time in", values, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeNotIn(List<String> values) {
            addCriterion("plan_start_time not in", values, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeBetween(String value1, String value2) {
            addCriterion("plan_start_time between", value1, value2, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andPlanStartTimeNotBetween(String value1, String value2) {
            addCriterion("plan_start_time not between", value1, value2, "planStartTime");
            return (Criteria) this;
        }

        public Criteria andPlanEndTimeIsNull() {
            addCriterion("plan_end_time is null");
            return (Criteria) this;
        }

        public Criteria andPlanEndTimeIsNotNull() {
            addCriterion("plan_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andPlanEndTimeEqualTo(String value) {
            addCriterion("plan_end_time =", value, "planEndTime");
            return (Criteria) this;
        }

        public Criteria andPlanEndTimeNotEqualTo(String value) {
            addCriterion("plan_end_time <>", value, "planEndTime");
            return (Criteria) this;
        }

        public Criteria andPlanEndTimeGreaterThan(String value) {
            addCriterion("plan_end_time >", value, "planEndTime");
            return (Criteria) this;
        }

        public Criteria andPlanEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("plan_end_time >=", value, "planEndTime");
            return (Criteria) this;
        }

        public Criteria andPlanEndTimeLessThan(String value) {
            addCriterion("plan_end_time <", value, "planEndTime");
            return (Criteria) this;
        }

        public Criteria andPlanEndTimeLessThanOrEqualTo(String value) {
            addCriterion("plan_end_time <=", value, "planEndTime");
            return (Criteria) this;
        }

        public Criteria andPlanEndTimeLike(String value) {
            addCriterion("plan_end_time like", value, "planEndTime");
            return (Criteria) this;
        }

        public Criteria andPlanEndTimeNotLike(String value) {
            addCriterion("plan_end_time not like", value, "planEndTime");
            return (Criteria) this;
        }

        public Criteria andPlanEndTimeIn(List<String> values) {
            addCriterion("plan_end_time in", values, "planEndTime");
            return (Criteria) this;
        }

        public Criteria andPlanEndTimeNotIn(List<String> values) {
            addCriterion("plan_end_time not in", values, "planEndTime");
            return (Criteria) this;
        }

        public Criteria andPlanEndTimeBetween(String value1, String value2) {
            addCriterion("plan_end_time between", value1, value2, "planEndTime");
            return (Criteria) this;
        }

        public Criteria andPlanEndTimeNotBetween(String value1, String value2) {
            addCriterion("plan_end_time not between", value1, value2, "planEndTime");
            return (Criteria) this;
        }

        public Criteria andBatchIntervalTimeIsNull() {
            addCriterion("batch_interval_time is null");
            return (Criteria) this;
        }

        public Criteria andBatchIntervalTimeIsNotNull() {
            addCriterion("batch_interval_time is not null");
            return (Criteria) this;
        }

        public Criteria andBatchIntervalTimeEqualTo(Integer value) {
            addCriterion("batch_interval_time =", value, "batchIntervalTime");
            return (Criteria) this;
        }

        public Criteria andBatchIntervalTimeNotEqualTo(Integer value) {
            addCriterion("batch_interval_time <>", value, "batchIntervalTime");
            return (Criteria) this;
        }

        public Criteria andBatchIntervalTimeGreaterThan(Integer value) {
            addCriterion("batch_interval_time >", value, "batchIntervalTime");
            return (Criteria) this;
        }

        public Criteria andBatchIntervalTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("batch_interval_time >=", value, "batchIntervalTime");
            return (Criteria) this;
        }

        public Criteria andBatchIntervalTimeLessThan(Integer value) {
            addCriterion("batch_interval_time <", value, "batchIntervalTime");
            return (Criteria) this;
        }

        public Criteria andBatchIntervalTimeLessThanOrEqualTo(Integer value) {
            addCriterion("batch_interval_time <=", value, "batchIntervalTime");
            return (Criteria) this;
        }

        public Criteria andBatchIntervalTimeIn(List<Integer> values) {
            addCriterion("batch_interval_time in", values, "batchIntervalTime");
            return (Criteria) this;
        }

        public Criteria andBatchIntervalTimeNotIn(List<Integer> values) {
            addCriterion("batch_interval_time not in", values, "batchIntervalTime");
            return (Criteria) this;
        }

        public Criteria andBatchIntervalTimeBetween(Integer value1, Integer value2) {
            addCriterion("batch_interval_time between", value1, value2, "batchIntervalTime");
            return (Criteria) this;
        }

        public Criteria andBatchIntervalTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("batch_interval_time not between", value1, value2, "batchIntervalTime");
            return (Criteria) this;
        }

        public Criteria andTimeZoneEnIsNull() {
            addCriterion("time_zone_en is null");
            return (Criteria) this;
        }

        public Criteria andTimeZoneEnIsNotNull() {
            addCriterion("time_zone_en is not null");
            return (Criteria) this;
        }

        public Criteria andTimeZoneEnEqualTo(String value) {
            addCriterion("time_zone_en =", value, "timeZoneEn");
            return (Criteria) this;
        }

        public Criteria andTimeZoneEnNotEqualTo(String value) {
            addCriterion("time_zone_en <>", value, "timeZoneEn");
            return (Criteria) this;
        }

        public Criteria andTimeZoneEnGreaterThan(String value) {
            addCriterion("time_zone_en >", value, "timeZoneEn");
            return (Criteria) this;
        }

        public Criteria andTimeZoneEnGreaterThanOrEqualTo(String value) {
            addCriterion("time_zone_en >=", value, "timeZoneEn");
            return (Criteria) this;
        }

        public Criteria andTimeZoneEnLessThan(String value) {
            addCriterion("time_zone_en <", value, "timeZoneEn");
            return (Criteria) this;
        }

        public Criteria andTimeZoneEnLessThanOrEqualTo(String value) {
            addCriterion("time_zone_en <=", value, "timeZoneEn");
            return (Criteria) this;
        }

        public Criteria andTimeZoneEnLike(String value) {
            addCriterion("time_zone_en like", value, "timeZoneEn");
            return (Criteria) this;
        }

        public Criteria andTimeZoneEnNotLike(String value) {
            addCriterion("time_zone_en not like", value, "timeZoneEn");
            return (Criteria) this;
        }

        public Criteria andTimeZoneEnIn(List<String> values) {
            addCriterion("time_zone_en in", values, "timeZoneEn");
            return (Criteria) this;
        }

        public Criteria andTimeZoneEnNotIn(List<String> values) {
            addCriterion("time_zone_en not in", values, "timeZoneEn");
            return (Criteria) this;
        }

        public Criteria andTimeZoneEnBetween(String value1, String value2) {
            addCriterion("time_zone_en between", value1, value2, "timeZoneEn");
            return (Criteria) this;
        }

        public Criteria andTimeZoneEnNotBetween(String value1, String value2) {
            addCriterion("time_zone_en not between", value1, value2, "timeZoneEn");
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

        public Criteria andParallelFlagIsNull() {
            addCriterion("parallel_flag is null");
            return (Criteria) this;
        }

        public Criteria andParallelFlagIsNotNull() {
            addCriterion("parallel_flag is not null");
            return (Criteria) this;
        }

        public Criteria andParallelFlagEqualTo(String value) {
            addCriterion("parallel_flag =", value, "parallelFlag");
            return (Criteria) this;
        }

        public Criteria andParallelFlagNotEqualTo(String value) {
            addCriterion("parallel_flag <>", value, "parallelFlag");
            return (Criteria) this;
        }

        public Criteria andParallelFlagGreaterThan(String value) {
            addCriterion("parallel_flag >", value, "parallelFlag");
            return (Criteria) this;
        }

        public Criteria andParallelFlagGreaterThanOrEqualTo(String value) {
            addCriterion("parallel_flag >=", value, "parallelFlag");
            return (Criteria) this;
        }

        public Criteria andParallelFlagLessThan(String value) {
            addCriterion("parallel_flag <", value, "parallelFlag");
            return (Criteria) this;
        }

        public Criteria andParallelFlagLessThanOrEqualTo(String value) {
            addCriterion("parallel_flag <=", value, "parallelFlag");
            return (Criteria) this;
        }

        public Criteria andParallelFlagLike(String value) {
            addCriterion("parallel_flag like", value, "parallelFlag");
            return (Criteria) this;
        }

        public Criteria andParallelFlagNotLike(String value) {
            addCriterion("parallel_flag not like", value, "parallelFlag");
            return (Criteria) this;
        }

        public Criteria andParallelFlagIn(List<String> values) {
            addCriterion("parallel_flag in", values, "parallelFlag");
            return (Criteria) this;
        }

        public Criteria andParallelFlagNotIn(List<String> values) {
            addCriterion("parallel_flag not in", values, "parallelFlag");
            return (Criteria) this;
        }

        public Criteria andParallelFlagBetween(String value1, String value2) {
            addCriterion("parallel_flag between", value1, value2, "parallelFlag");
            return (Criteria) this;
        }

        public Criteria andParallelFlagNotBetween(String value1, String value2) {
            addCriterion("parallel_flag not between", value1, value2, "parallelFlag");
            return (Criteria) this;
        }

        public Criteria andMaxParallesIsNull() {
            addCriterion("max_paralles is null");
            return (Criteria) this;
        }

        public Criteria andMaxParallesIsNotNull() {
            addCriterion("max_paralles is not null");
            return (Criteria) this;
        }

        public Criteria andMaxParallesEqualTo(Integer value) {
            addCriterion("max_paralles =", value, "maxParalles");
            return (Criteria) this;
        }

        public Criteria andMaxParallesNotEqualTo(Integer value) {
            addCriterion("max_paralles <>", value, "maxParalles");
            return (Criteria) this;
        }

        public Criteria andMaxParallesGreaterThan(Integer value) {
            addCriterion("max_paralles >", value, "maxParalles");
            return (Criteria) this;
        }

        public Criteria andMaxParallesGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_paralles >=", value, "maxParalles");
            return (Criteria) this;
        }

        public Criteria andMaxParallesLessThan(Integer value) {
            addCriterion("max_paralles <", value, "maxParalles");
            return (Criteria) this;
        }

        public Criteria andMaxParallesLessThanOrEqualTo(Integer value) {
            addCriterion("max_paralles <=", value, "maxParalles");
            return (Criteria) this;
        }

        public Criteria andMaxParallesIn(List<Integer> values) {
            addCriterion("max_paralles in", values, "maxParalles");
            return (Criteria) this;
        }

        public Criteria andMaxParallesNotIn(List<Integer> values) {
            addCriterion("max_paralles not in", values, "maxParalles");
            return (Criteria) this;
        }

        public Criteria andMaxParallesBetween(Integer value1, Integer value2) {
            addCriterion("max_paralles between", value1, value2, "maxParalles");
            return (Criteria) this;
        }

        public Criteria andMaxParallesNotBetween(Integer value1, Integer value2) {
            addCriterion("max_paralles not between", value1, value2, "maxParalles");
            return (Criteria) this;
        }

        public Criteria andInstTimeRuleIsNull() {
            addCriterion("inst_time_rule is null");
            return (Criteria) this;
        }

        public Criteria andInstTimeRuleIsNotNull() {
            addCriterion("inst_time_rule is not null");
            return (Criteria) this;
        }

        public Criteria andInstTimeRuleEqualTo(String value) {
            addCriterion("inst_time_rule =", value, "instTimeRule");
            return (Criteria) this;
        }

        public Criteria andInstTimeRuleNotEqualTo(String value) {
            addCriterion("inst_time_rule <>", value, "instTimeRule");
            return (Criteria) this;
        }

        public Criteria andInstTimeRuleGreaterThan(String value) {
            addCriterion("inst_time_rule >", value, "instTimeRule");
            return (Criteria) this;
        }

        public Criteria andInstTimeRuleGreaterThanOrEqualTo(String value) {
            addCriterion("inst_time_rule >=", value, "instTimeRule");
            return (Criteria) this;
        }

        public Criteria andInstTimeRuleLessThan(String value) {
            addCriterion("inst_time_rule <", value, "instTimeRule");
            return (Criteria) this;
        }

        public Criteria andInstTimeRuleLessThanOrEqualTo(String value) {
            addCriterion("inst_time_rule <=", value, "instTimeRule");
            return (Criteria) this;
        }

        public Criteria andInstTimeRuleLike(String value) {
            addCriterion("inst_time_rule like", value, "instTimeRule");
            return (Criteria) this;
        }

        public Criteria andInstTimeRuleNotLike(String value) {
            addCriterion("inst_time_rule not like", value, "instTimeRule");
            return (Criteria) this;
        }

        public Criteria andInstTimeRuleIn(List<String> values) {
            addCriterion("inst_time_rule in", values, "instTimeRule");
            return (Criteria) this;
        }

        public Criteria andInstTimeRuleNotIn(List<String> values) {
            addCriterion("inst_time_rule not in", values, "instTimeRule");
            return (Criteria) this;
        }

        public Criteria andInstTimeRuleBetween(String value1, String value2) {
            addCriterion("inst_time_rule between", value1, value2, "instTimeRule");
            return (Criteria) this;
        }

        public Criteria andInstTimeRuleNotBetween(String value1, String value2) {
            addCriterion("inst_time_rule not between", value1, value2, "instTimeRule");
            return (Criteria) this;
        }

        public Criteria andTimeSkewIsNull() {
            addCriterion("time_skew is null");
            return (Criteria) this;
        }

        public Criteria andTimeSkewIsNotNull() {
            addCriterion("time_skew is not null");
            return (Criteria) this;
        }

        public Criteria andTimeSkewEqualTo(String value) {
            addCriterion("time_skew =", value, "timeSkew");
            return (Criteria) this;
        }

        public Criteria andTimeSkewNotEqualTo(String value) {
            addCriterion("time_skew <>", value, "timeSkew");
            return (Criteria) this;
        }

        public Criteria andTimeSkewGreaterThan(String value) {
            addCriterion("time_skew >", value, "timeSkew");
            return (Criteria) this;
        }

        public Criteria andTimeSkewGreaterThanOrEqualTo(String value) {
            addCriterion("time_skew >=", value, "timeSkew");
            return (Criteria) this;
        }

        public Criteria andTimeSkewLessThan(String value) {
            addCriterion("time_skew <", value, "timeSkew");
            return (Criteria) this;
        }

        public Criteria andTimeSkewLessThanOrEqualTo(String value) {
            addCriterion("time_skew <=", value, "timeSkew");
            return (Criteria) this;
        }

        public Criteria andTimeSkewLike(String value) {
            addCriterion("time_skew like", value, "timeSkew");
            return (Criteria) this;
        }

        public Criteria andTimeSkewNotLike(String value) {
            addCriterion("time_skew not like", value, "timeSkew");
            return (Criteria) this;
        }

        public Criteria andTimeSkewIn(List<String> values) {
            addCriterion("time_skew in", values, "timeSkew");
            return (Criteria) this;
        }

        public Criteria andTimeSkewNotIn(List<String> values) {
            addCriterion("time_skew not in", values, "timeSkew");
            return (Criteria) this;
        }

        public Criteria andTimeSkewBetween(String value1, String value2) {
            addCriterion("time_skew between", value1, value2, "timeSkew");
            return (Criteria) this;
        }

        public Criteria andTimeSkewNotBetween(String value1, String value2) {
            addCriterion("time_skew not between", value1, value2, "timeSkew");
            return (Criteria) this;
        }

        public Criteria andBatchNumIsNull() {
            addCriterion("batch_num is null");
            return (Criteria) this;
        }

        public Criteria andBatchNumIsNotNull() {
            addCriterion("batch_num is not null");
            return (Criteria) this;
        }

        public Criteria andBatchNumEqualTo(Integer value) {
            addCriterion("batch_num =", value, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumNotEqualTo(Integer value) {
            addCriterion("batch_num <>", value, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumGreaterThan(Integer value) {
            addCriterion("batch_num >", value, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("batch_num >=", value, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumLessThan(Integer value) {
            addCriterion("batch_num <", value, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumLessThanOrEqualTo(Integer value) {
            addCriterion("batch_num <=", value, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumIn(List<Integer> values) {
            addCriterion("batch_num in", values, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumNotIn(List<Integer> values) {
            addCriterion("batch_num not in", values, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumBetween(Integer value1, Integer value2) {
            addCriterion("batch_num between", value1, value2, "batchNum");
            return (Criteria) this;
        }

        public Criteria andBatchNumNotBetween(Integer value1, Integer value2) {
            addCriterion("batch_num not between", value1, value2, "batchNum");
            return (Criteria) this;
        }

        public Criteria andMinTurnTimeIsNull() {
            addCriterion("min_turn_time is null");
            return (Criteria) this;
        }

        public Criteria andMinTurnTimeIsNotNull() {
            addCriterion("min_turn_time is not null");
            return (Criteria) this;
        }

        public Criteria andMinTurnTimeEqualTo(String value) {
            addCriterion("min_turn_time =", value, "minTurnTime");
            return (Criteria) this;
        }

        public Criteria andMinTurnTimeNotEqualTo(String value) {
            addCriterion("min_turn_time <>", value, "minTurnTime");
            return (Criteria) this;
        }

        public Criteria andMinTurnTimeGreaterThan(String value) {
            addCriterion("min_turn_time >", value, "minTurnTime");
            return (Criteria) this;
        }

        public Criteria andMinTurnTimeGreaterThanOrEqualTo(String value) {
            addCriterion("min_turn_time >=", value, "minTurnTime");
            return (Criteria) this;
        }

        public Criteria andMinTurnTimeLessThan(String value) {
            addCriterion("min_turn_time <", value, "minTurnTime");
            return (Criteria) this;
        }

        public Criteria andMinTurnTimeLessThanOrEqualTo(String value) {
            addCriterion("min_turn_time <=", value, "minTurnTime");
            return (Criteria) this;
        }

        public Criteria andMinTurnTimeLike(String value) {
            addCriterion("min_turn_time like", value, "minTurnTime");
            return (Criteria) this;
        }

        public Criteria andMinTurnTimeNotLike(String value) {
            addCriterion("min_turn_time not like", value, "minTurnTime");
            return (Criteria) this;
        }

        public Criteria andMinTurnTimeIn(List<String> values) {
            addCriterion("min_turn_time in", values, "minTurnTime");
            return (Criteria) this;
        }

        public Criteria andMinTurnTimeNotIn(List<String> values) {
            addCriterion("min_turn_time not in", values, "minTurnTime");
            return (Criteria) this;
        }

        public Criteria andMinTurnTimeBetween(String value1, String value2) {
            addCriterion("min_turn_time between", value1, value2, "minTurnTime");
            return (Criteria) this;
        }

        public Criteria andMinTurnTimeNotBetween(String value1, String value2) {
            addCriterion("min_turn_time not between", value1, value2, "minTurnTime");
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