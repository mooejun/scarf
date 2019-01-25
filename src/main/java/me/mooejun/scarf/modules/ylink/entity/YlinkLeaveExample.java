package me.mooejun.scarf.modules.ylink.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YlinkLeaveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YlinkLeaveExample() {
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

        public Criteria andLeaveIdIsNull() {
            addCriterion("leave_id is null");
            return (Criteria) this;
        }

        public Criteria andLeaveIdIsNotNull() {
            addCriterion("leave_id is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveIdEqualTo(Integer value) {
            addCriterion("leave_id =", value, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdNotEqualTo(Integer value) {
            addCriterion("leave_id <>", value, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdGreaterThan(Integer value) {
            addCriterion("leave_id >", value, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("leave_id >=", value, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdLessThan(Integer value) {
            addCriterion("leave_id <", value, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdLessThanOrEqualTo(Integer value) {
            addCriterion("leave_id <=", value, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdIn(List<Integer> values) {
            addCriterion("leave_id in", values, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdNotIn(List<Integer> values) {
            addCriterion("leave_id not in", values, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdBetween(Integer value1, Integer value2) {
            addCriterion("leave_id between", value1, value2, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveIdNotBetween(Integer value1, Integer value2) {
            addCriterion("leave_id not between", value1, value2, "leaveId");
            return (Criteria) this;
        }

        public Criteria andLeaveTypeIsNull() {
            addCriterion("leave_type is null");
            return (Criteria) this;
        }

        public Criteria andLeaveTypeIsNotNull() {
            addCriterion("leave_type is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveTypeEqualTo(Integer value) {
            addCriterion("leave_type =", value, "leaveType");
            return (Criteria) this;
        }

        public Criteria andLeaveTypeNotEqualTo(Integer value) {
            addCriterion("leave_type <>", value, "leaveType");
            return (Criteria) this;
        }

        public Criteria andLeaveTypeGreaterThan(Integer value) {
            addCriterion("leave_type >", value, "leaveType");
            return (Criteria) this;
        }

        public Criteria andLeaveTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("leave_type >=", value, "leaveType");
            return (Criteria) this;
        }

        public Criteria andLeaveTypeLessThan(Integer value) {
            addCriterion("leave_type <", value, "leaveType");
            return (Criteria) this;
        }

        public Criteria andLeaveTypeLessThanOrEqualTo(Integer value) {
            addCriterion("leave_type <=", value, "leaveType");
            return (Criteria) this;
        }

        public Criteria andLeaveTypeIn(List<Integer> values) {
            addCriterion("leave_type in", values, "leaveType");
            return (Criteria) this;
        }

        public Criteria andLeaveTypeNotIn(List<Integer> values) {
            addCriterion("leave_type not in", values, "leaveType");
            return (Criteria) this;
        }

        public Criteria andLeaveTypeBetween(Integer value1, Integer value2) {
            addCriterion("leave_type between", value1, value2, "leaveType");
            return (Criteria) this;
        }

        public Criteria andLeaveTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("leave_type not between", value1, value2, "leaveType");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNull() {
            addCriterion("emp_id is null");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNotNull() {
            addCriterion("emp_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmpIdEqualTo(Integer value) {
            addCriterion("emp_id =", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotEqualTo(Integer value) {
            addCriterion("emp_id <>", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThan(Integer value) {
            addCriterion("emp_id >", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("emp_id >=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThan(Integer value) {
            addCriterion("emp_id <", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThanOrEqualTo(Integer value) {
            addCriterion("emp_id <=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdIn(List<Integer> values) {
            addCriterion("emp_id in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotIn(List<Integer> values) {
            addCriterion("emp_id not in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdBetween(Integer value1, Integer value2) {
            addCriterion("emp_id between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("emp_id not between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andSdatetimeIsNull() {
            addCriterion("sdatetime is null");
            return (Criteria) this;
        }

        public Criteria andSdatetimeIsNotNull() {
            addCriterion("sdatetime is not null");
            return (Criteria) this;
        }

        public Criteria andSdatetimeEqualTo(Date value) {
            addCriterion("sdatetime =", value, "sdatetime");
            return (Criteria) this;
        }

        public Criteria andSdatetimeNotEqualTo(Date value) {
            addCriterion("sdatetime <>", value, "sdatetime");
            return (Criteria) this;
        }

        public Criteria andSdatetimeGreaterThan(Date value) {
            addCriterion("sdatetime >", value, "sdatetime");
            return (Criteria) this;
        }

        public Criteria andSdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sdatetime >=", value, "sdatetime");
            return (Criteria) this;
        }

        public Criteria andSdatetimeLessThan(Date value) {
            addCriterion("sdatetime <", value, "sdatetime");
            return (Criteria) this;
        }

        public Criteria andSdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("sdatetime <=", value, "sdatetime");
            return (Criteria) this;
        }

        public Criteria andSdatetimeIn(List<Date> values) {
            addCriterion("sdatetime in", values, "sdatetime");
            return (Criteria) this;
        }

        public Criteria andSdatetimeNotIn(List<Date> values) {
            addCriterion("sdatetime not in", values, "sdatetime");
            return (Criteria) this;
        }

        public Criteria andSdatetimeBetween(Date value1, Date value2) {
            addCriterion("sdatetime between", value1, value2, "sdatetime");
            return (Criteria) this;
        }

        public Criteria andSdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("sdatetime not between", value1, value2, "sdatetime");
            return (Criteria) this;
        }

        public Criteria andEdatetimeIsNull() {
            addCriterion("edatetime is null");
            return (Criteria) this;
        }

        public Criteria andEdatetimeIsNotNull() {
            addCriterion("edatetime is not null");
            return (Criteria) this;
        }

        public Criteria andEdatetimeEqualTo(Date value) {
            addCriterion("edatetime =", value, "edatetime");
            return (Criteria) this;
        }

        public Criteria andEdatetimeNotEqualTo(Date value) {
            addCriterion("edatetime <>", value, "edatetime");
            return (Criteria) this;
        }

        public Criteria andEdatetimeGreaterThan(Date value) {
            addCriterion("edatetime >", value, "edatetime");
            return (Criteria) this;
        }

        public Criteria andEdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("edatetime >=", value, "edatetime");
            return (Criteria) this;
        }

        public Criteria andEdatetimeLessThan(Date value) {
            addCriterion("edatetime <", value, "edatetime");
            return (Criteria) this;
        }

        public Criteria andEdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("edatetime <=", value, "edatetime");
            return (Criteria) this;
        }

        public Criteria andEdatetimeIn(List<Date> values) {
            addCriterion("edatetime in", values, "edatetime");
            return (Criteria) this;
        }

        public Criteria andEdatetimeNotIn(List<Date> values) {
            addCriterion("edatetime not in", values, "edatetime");
            return (Criteria) this;
        }

        public Criteria andEdatetimeBetween(Date value1, Date value2) {
            addCriterion("edatetime between", value1, value2, "edatetime");
            return (Criteria) this;
        }

        public Criteria andEdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("edatetime not between", value1, value2, "edatetime");
            return (Criteria) this;
        }

        public Criteria andDaysIsNull() {
            addCriterion("days is null");
            return (Criteria) this;
        }

        public Criteria andDaysIsNotNull() {
            addCriterion("days is not null");
            return (Criteria) this;
        }

        public Criteria andDaysEqualTo(Float value) {
            addCriterion("days =", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotEqualTo(Float value) {
            addCriterion("days <>", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysGreaterThan(Float value) {
            addCriterion("days >", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysGreaterThanOrEqualTo(Float value) {
            addCriterion("days >=", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysLessThan(Float value) {
            addCriterion("days <", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysLessThanOrEqualTo(Float value) {
            addCriterion("days <=", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysIn(List<Float> values) {
            addCriterion("days in", values, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotIn(List<Float> values) {
            addCriterion("days not in", values, "days");
            return (Criteria) this;
        }

        public Criteria andDaysBetween(Float value1, Float value2) {
            addCriterion("days between", value1, value2, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotBetween(Float value1, Float value2) {
            addCriterion("days not between", value1, value2, "days");
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