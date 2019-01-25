package me.mooejun.scarf.modules.ylink.entity;

import java.util.ArrayList;
import java.util.List;

public class YlinkEmpExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YlinkEmpExample() {
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

        public Criteria andEmpNoIsNull() {
            addCriterion("emp_no is null");
            return (Criteria) this;
        }

        public Criteria andEmpNoIsNotNull() {
            addCriterion("emp_no is not null");
            return (Criteria) this;
        }

        public Criteria andEmpNoEqualTo(String value) {
            addCriterion("emp_no =", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoNotEqualTo(String value) {
            addCriterion("emp_no <>", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoGreaterThan(String value) {
            addCriterion("emp_no >", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoGreaterThanOrEqualTo(String value) {
            addCriterion("emp_no >=", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoLessThan(String value) {
            addCriterion("emp_no <", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoLessThanOrEqualTo(String value) {
            addCriterion("emp_no <=", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoLike(String value) {
            addCriterion("emp_no like", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoNotLike(String value) {
            addCriterion("emp_no not like", value, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoIn(List<String> values) {
            addCriterion("emp_no in", values, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoNotIn(List<String> values) {
            addCriterion("emp_no not in", values, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoBetween(String value1, String value2) {
            addCriterion("emp_no between", value1, value2, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNoNotBetween(String value1, String value2) {
            addCriterion("emp_no not between", value1, value2, "empNo");
            return (Criteria) this;
        }

        public Criteria andEmpNameIsNull() {
            addCriterion("emp_name is null");
            return (Criteria) this;
        }

        public Criteria andEmpNameIsNotNull() {
            addCriterion("emp_name is not null");
            return (Criteria) this;
        }

        public Criteria andEmpNameEqualTo(String value) {
            addCriterion("emp_name =", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotEqualTo(String value) {
            addCriterion("emp_name <>", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameGreaterThan(String value) {
            addCriterion("emp_name >", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameGreaterThanOrEqualTo(String value) {
            addCriterion("emp_name >=", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLessThan(String value) {
            addCriterion("emp_name <", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLessThanOrEqualTo(String value) {
            addCriterion("emp_name <=", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLike(String value) {
            addCriterion("emp_name like", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotLike(String value) {
            addCriterion("emp_name not like", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameIn(List<String> values) {
            addCriterion("emp_name in", values, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotIn(List<String> values) {
            addCriterion("emp_name not in", values, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameBetween(String value1, String value2) {
            addCriterion("emp_name between", value1, value2, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotBetween(String value1, String value2) {
            addCriterion("emp_name not between", value1, value2, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpProjectIsNull() {
            addCriterion("emp_project is null");
            return (Criteria) this;
        }

        public Criteria andEmpProjectIsNotNull() {
            addCriterion("emp_project is not null");
            return (Criteria) this;
        }

        public Criteria andEmpProjectEqualTo(String value) {
            addCriterion("emp_project =", value, "empProject");
            return (Criteria) this;
        }

        public Criteria andEmpProjectNotEqualTo(String value) {
            addCriterion("emp_project <>", value, "empProject");
            return (Criteria) this;
        }

        public Criteria andEmpProjectGreaterThan(String value) {
            addCriterion("emp_project >", value, "empProject");
            return (Criteria) this;
        }

        public Criteria andEmpProjectGreaterThanOrEqualTo(String value) {
            addCriterion("emp_project >=", value, "empProject");
            return (Criteria) this;
        }

        public Criteria andEmpProjectLessThan(String value) {
            addCriterion("emp_project <", value, "empProject");
            return (Criteria) this;
        }

        public Criteria andEmpProjectLessThanOrEqualTo(String value) {
            addCriterion("emp_project <=", value, "empProject");
            return (Criteria) this;
        }

        public Criteria andEmpProjectLike(String value) {
            addCriterion("emp_project like", value, "empProject");
            return (Criteria) this;
        }

        public Criteria andEmpProjectNotLike(String value) {
            addCriterion("emp_project not like", value, "empProject");
            return (Criteria) this;
        }

        public Criteria andEmpProjectIn(List<String> values) {
            addCriterion("emp_project in", values, "empProject");
            return (Criteria) this;
        }

        public Criteria andEmpProjectNotIn(List<String> values) {
            addCriterion("emp_project not in", values, "empProject");
            return (Criteria) this;
        }

        public Criteria andEmpProjectBetween(String value1, String value2) {
            addCriterion("emp_project between", value1, value2, "empProject");
            return (Criteria) this;
        }

        public Criteria andEmpProjectNotBetween(String value1, String value2) {
            addCriterion("emp_project not between", value1, value2, "empProject");
            return (Criteria) this;
        }

        public Criteria andEmpSexIsNull() {
            addCriterion("emp_sex is null");
            return (Criteria) this;
        }

        public Criteria andEmpSexIsNotNull() {
            addCriterion("emp_sex is not null");
            return (Criteria) this;
        }

        public Criteria andEmpSexEqualTo(String value) {
            addCriterion("emp_sex =", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexNotEqualTo(String value) {
            addCriterion("emp_sex <>", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexGreaterThan(String value) {
            addCriterion("emp_sex >", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexGreaterThanOrEqualTo(String value) {
            addCriterion("emp_sex >=", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexLessThan(String value) {
            addCriterion("emp_sex <", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexLessThanOrEqualTo(String value) {
            addCriterion("emp_sex <=", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexLike(String value) {
            addCriterion("emp_sex like", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexNotLike(String value) {
            addCriterion("emp_sex not like", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexIn(List<String> values) {
            addCriterion("emp_sex in", values, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexNotIn(List<String> values) {
            addCriterion("emp_sex not in", values, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexBetween(String value1, String value2) {
            addCriterion("emp_sex between", value1, value2, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexNotBetween(String value1, String value2) {
            addCriterion("emp_sex not between", value1, value2, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpLevelIsNull() {
            addCriterion("emp_level is null");
            return (Criteria) this;
        }

        public Criteria andEmpLevelIsNotNull() {
            addCriterion("emp_level is not null");
            return (Criteria) this;
        }

        public Criteria andEmpLevelEqualTo(Integer value) {
            addCriterion("emp_level =", value, "empLevel");
            return (Criteria) this;
        }

        public Criteria andEmpLevelNotEqualTo(Integer value) {
            addCriterion("emp_level <>", value, "empLevel");
            return (Criteria) this;
        }

        public Criteria andEmpLevelGreaterThan(Integer value) {
            addCriterion("emp_level >", value, "empLevel");
            return (Criteria) this;
        }

        public Criteria andEmpLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("emp_level >=", value, "empLevel");
            return (Criteria) this;
        }

        public Criteria andEmpLevelLessThan(Integer value) {
            addCriterion("emp_level <", value, "empLevel");
            return (Criteria) this;
        }

        public Criteria andEmpLevelLessThanOrEqualTo(Integer value) {
            addCriterion("emp_level <=", value, "empLevel");
            return (Criteria) this;
        }

        public Criteria andEmpLevelIn(List<Integer> values) {
            addCriterion("emp_level in", values, "empLevel");
            return (Criteria) this;
        }

        public Criteria andEmpLevelNotIn(List<Integer> values) {
            addCriterion("emp_level not in", values, "empLevel");
            return (Criteria) this;
        }

        public Criteria andEmpLevelBetween(Integer value1, Integer value2) {
            addCriterion("emp_level between", value1, value2, "empLevel");
            return (Criteria) this;
        }

        public Criteria andEmpLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("emp_level not between", value1, value2, "empLevel");
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