package me.mooejun.scarf.modules.ylink.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YlinkOverExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YlinkOverExample() {
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

        public Criteria andOverIdIsNull() {
            addCriterion("over_id is null");
            return (Criteria) this;
        }

        public Criteria andOverIdIsNotNull() {
            addCriterion("over_id is not null");
            return (Criteria) this;
        }

        public Criteria andOverIdEqualTo(Integer value) {
            addCriterion("over_id =", value, "overId");
            return (Criteria) this;
        }

        public Criteria andOverIdNotEqualTo(Integer value) {
            addCriterion("over_id <>", value, "overId");
            return (Criteria) this;
        }

        public Criteria andOverIdGreaterThan(Integer value) {
            addCriterion("over_id >", value, "overId");
            return (Criteria) this;
        }

        public Criteria andOverIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("over_id >=", value, "overId");
            return (Criteria) this;
        }

        public Criteria andOverIdLessThan(Integer value) {
            addCriterion("over_id <", value, "overId");
            return (Criteria) this;
        }

        public Criteria andOverIdLessThanOrEqualTo(Integer value) {
            addCriterion("over_id <=", value, "overId");
            return (Criteria) this;
        }

        public Criteria andOverIdIn(List<Integer> values) {
            addCriterion("over_id in", values, "overId");
            return (Criteria) this;
        }

        public Criteria andOverIdNotIn(List<Integer> values) {
            addCriterion("over_id not in", values, "overId");
            return (Criteria) this;
        }

        public Criteria andOverIdBetween(Integer value1, Integer value2) {
            addCriterion("over_id between", value1, value2, "overId");
            return (Criteria) this;
        }

        public Criteria andOverIdNotBetween(Integer value1, Integer value2) {
            addCriterion("over_id not between", value1, value2, "overId");
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

        public Criteria andCdatetimeIsNull() {
            addCriterion("cdatetime is null");
            return (Criteria) this;
        }

        public Criteria andCdatetimeIsNotNull() {
            addCriterion("cdatetime is not null");
            return (Criteria) this;
        }

        public Criteria andCdatetimeEqualTo(Date value) {
            addCriterion("cdatetime =", value, "cdatetime");
            return (Criteria) this;
        }

        public Criteria andCdatetimeNotEqualTo(Date value) {
            addCriterion("cdatetime <>", value, "cdatetime");
            return (Criteria) this;
        }

        public Criteria andCdatetimeGreaterThan(Date value) {
            addCriterion("cdatetime >", value, "cdatetime");
            return (Criteria) this;
        }

        public Criteria andCdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cdatetime >=", value, "cdatetime");
            return (Criteria) this;
        }

        public Criteria andCdatetimeLessThan(Date value) {
            addCriterion("cdatetime <", value, "cdatetime");
            return (Criteria) this;
        }

        public Criteria andCdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("cdatetime <=", value, "cdatetime");
            return (Criteria) this;
        }

        public Criteria andCdatetimeIn(List<Date> values) {
            addCriterion("cdatetime in", values, "cdatetime");
            return (Criteria) this;
        }

        public Criteria andCdatetimeNotIn(List<Date> values) {
            addCriterion("cdatetime not in", values, "cdatetime");
            return (Criteria) this;
        }

        public Criteria andCdatetimeBetween(Date value1, Date value2) {
            addCriterion("cdatetime between", value1, value2, "cdatetime");
            return (Criteria) this;
        }

        public Criteria andCdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("cdatetime not between", value1, value2, "cdatetime");
            return (Criteria) this;
        }

        public Criteria andHoursIsNull() {
            addCriterion("hours is null");
            return (Criteria) this;
        }

        public Criteria andHoursIsNotNull() {
            addCriterion("hours is not null");
            return (Criteria) this;
        }

        public Criteria andHoursEqualTo(Integer value) {
            addCriterion("hours =", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursNotEqualTo(Integer value) {
            addCriterion("hours <>", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursGreaterThan(Integer value) {
            addCriterion("hours >", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursGreaterThanOrEqualTo(Integer value) {
            addCriterion("hours >=", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursLessThan(Integer value) {
            addCriterion("hours <", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursLessThanOrEqualTo(Integer value) {
            addCriterion("hours <=", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursIn(List<Integer> values) {
            addCriterion("hours in", values, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursNotIn(List<Integer> values) {
            addCriterion("hours not in", values, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursBetween(Integer value1, Integer value2) {
            addCriterion("hours between", value1, value2, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursNotBetween(Integer value1, Integer value2) {
            addCriterion("hours not between", value1, value2, "hours");
            return (Criteria) this;
        }

        public Criteria andHolidayflagIsNull() {
            addCriterion("holidayflag is null");
            return (Criteria) this;
        }

        public Criteria andHolidayflagIsNotNull() {
            addCriterion("holidayflag is not null");
            return (Criteria) this;
        }

        public Criteria andHolidayflagEqualTo(Integer value) {
            addCriterion("holidayflag =", value, "holidayflag");
            return (Criteria) this;
        }

        public Criteria andHolidayflagNotEqualTo(Integer value) {
            addCriterion("holidayflag <>", value, "holidayflag");
            return (Criteria) this;
        }

        public Criteria andHolidayflagGreaterThan(Integer value) {
            addCriterion("holidayflag >", value, "holidayflag");
            return (Criteria) this;
        }

        public Criteria andHolidayflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("holidayflag >=", value, "holidayflag");
            return (Criteria) this;
        }

        public Criteria andHolidayflagLessThan(Integer value) {
            addCriterion("holidayflag <", value, "holidayflag");
            return (Criteria) this;
        }

        public Criteria andHolidayflagLessThanOrEqualTo(Integer value) {
            addCriterion("holidayflag <=", value, "holidayflag");
            return (Criteria) this;
        }

        public Criteria andHolidayflagIn(List<Integer> values) {
            addCriterion("holidayflag in", values, "holidayflag");
            return (Criteria) this;
        }

        public Criteria andHolidayflagNotIn(List<Integer> values) {
            addCriterion("holidayflag not in", values, "holidayflag");
            return (Criteria) this;
        }

        public Criteria andHolidayflagBetween(Integer value1, Integer value2) {
            addCriterion("holidayflag between", value1, value2, "holidayflag");
            return (Criteria) this;
        }

        public Criteria andHolidayflagNotBetween(Integer value1, Integer value2) {
            addCriterion("holidayflag not between", value1, value2, "holidayflag");
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