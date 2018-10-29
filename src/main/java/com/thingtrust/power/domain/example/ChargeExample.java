package com.thingtrust.power.domain.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *  查询条件example类
 * @author wangli
 * @date 2018-10-26
 */
public class ChargeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChargeExample() {
        oredCriteria = new ArrayList<>();
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

	        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria)this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria)this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria)this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria)this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria)this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria)this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria)this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria)this;
        }
		
				public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria)this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria)this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria)this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria)this;
        }
				
			        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria)this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria)this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria)this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria)this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria)this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria)this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria)this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria)this;
        }
		
				
				public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria)this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria)this;
        }
			        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria)this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria)this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria)this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria)this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria)this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria)this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria)this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria)this;
        }
		
				
				public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria)this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria)this;
        }
			        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria)this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria)this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria)this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria)this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria)this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria)this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria)this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria)this;
        }
		
				
				public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria)this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria)this;
        }
			        public Criteria andChargeIsNull() {
            addCriterion("charge is null");
            return (Criteria)this;
        }

        public Criteria andChargeIsNotNull() {
            addCriterion("charge is not null");
            return (Criteria)this;
        }

        public Criteria andChargeEqualTo(BigDecimal value) {
            addCriterion("charge =", value, "charge");
            return (Criteria)this;
        }

        public Criteria andChargeNotEqualTo(BigDecimal value) {
            addCriterion("charge <>", value, "charge");
            return (Criteria)this;
        }

        public Criteria andChargeIn(List<BigDecimal> values) {
            addCriterion("charge in", values, "charge");
            return (Criteria)this;
        }

        public Criteria andChargeNotIn(List<BigDecimal> values) {
            addCriterion("charge not in", values, "charge");
            return (Criteria)this;
        }

        public Criteria andChargeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("charge between", value1, value2, "charge");
            return (Criteria)this;
        }

        public Criteria andChargeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("charge not between", value1, value2, "charge");
            return (Criteria)this;
        }
		
				public Criteria andChargeGreaterThan(BigDecimal value) {
            addCriterion("charge >", value, "charge");
            return (Criteria)this;
        }

        public Criteria andChargeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("charge >=", value, "charge");
            return (Criteria)this;
        }

        public Criteria andChargeLessThan(BigDecimal value) {
            addCriterion("charge <", value, "charge");
            return (Criteria)this;
        }

        public Criteria andChargeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("charge <=", value, "charge");
            return (Criteria)this;
        }
				
			        public Criteria andPayTimeIsNull() {
            addCriterion("pay_time is null");
            return (Criteria)this;
        }

        public Criteria andPayTimeIsNotNull() {
            addCriterion("pay_time is not null");
            return (Criteria)this;
        }

        public Criteria andPayTimeEqualTo(Integer value) {
            addCriterion("pay_time =", value, "payTime");
            return (Criteria)this;
        }

        public Criteria andPayTimeNotEqualTo(Integer value) {
            addCriterion("pay_time <>", value, "payTime");
            return (Criteria)this;
        }

        public Criteria andPayTimeIn(List<Integer> values) {
            addCriterion("pay_time in", values, "payTime");
            return (Criteria)this;
        }

        public Criteria andPayTimeNotIn(List<Integer> values) {
            addCriterion("pay_time not in", values, "payTime");
            return (Criteria)this;
        }

        public Criteria andPayTimeBetween(Integer value1, Integer value2) {
            addCriterion("pay_time between", value1, value2, "payTime");
            return (Criteria)this;
        }

        public Criteria andPayTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_time not between", value1, value2, "payTime");
            return (Criteria)this;
        }
		
				public Criteria andPayTimeGreaterThan(Integer value) {
            addCriterion("pay_time >", value, "payTime");
            return (Criteria)this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_time >=", value, "payTime");
            return (Criteria)this;
        }

        public Criteria andPayTimeLessThan(Integer value) {
            addCriterion("pay_time <", value, "payTime");
            return (Criteria)this;
        }

        public Criteria andPayTimeLessThanOrEqualTo(Integer value) {
            addCriterion("pay_time <=", value, "payTime");
            return (Criteria)this;
        }
				
			        public Criteria andBillTimeIsNull() {
            addCriterion("bill_time is null");
            return (Criteria)this;
        }

        public Criteria andBillTimeIsNotNull() {
            addCriterion("bill_time is not null");
            return (Criteria)this;
        }

        public Criteria andBillTimeEqualTo(Date value) {
            addCriterion("bill_time =", value, "billTime");
            return (Criteria)this;
        }

        public Criteria andBillTimeNotEqualTo(Date value) {
            addCriterion("bill_time <>", value, "billTime");
            return (Criteria)this;
        }

        public Criteria andBillTimeIn(List<Date> values) {
            addCriterion("bill_time in", values, "billTime");
            return (Criteria)this;
        }

        public Criteria andBillTimeNotIn(List<Date> values) {
            addCriterion("bill_time not in", values, "billTime");
            return (Criteria)this;
        }

        public Criteria andBillTimeBetween(Date value1, Date value2) {
            addCriterion("bill_time between", value1, value2, "billTime");
            return (Criteria)this;
        }

        public Criteria andBillTimeNotBetween(Date value1, Date value2) {
            addCriterion("bill_time not between", value1, value2, "billTime");
            return (Criteria)this;
        }
		
				public Criteria andBillTimeGreaterThan(Date value) {
            addCriterion("bill_time >", value, "billTime");
            return (Criteria)this;
        }

        public Criteria andBillTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("bill_time >=", value, "billTime");
            return (Criteria)this;
        }

        public Criteria andBillTimeLessThan(Date value) {
            addCriterion("bill_time <", value, "billTime");
            return (Criteria)this;
        }

        public Criteria andBillTimeLessThanOrEqualTo(Date value) {
            addCriterion("bill_time <=", value, "billTime");
            return (Criteria)this;
        }
				
			        public Criteria andPrepayIsNull() {
            addCriterion("prepay is null");
            return (Criteria)this;
        }

        public Criteria andPrepayIsNotNull() {
            addCriterion("prepay is not null");
            return (Criteria)this;
        }

        public Criteria andPrepayEqualTo(BigDecimal value) {
            addCriterion("prepay =", value, "prepay");
            return (Criteria)this;
        }

        public Criteria andPrepayNotEqualTo(BigDecimal value) {
            addCriterion("prepay <>", value, "prepay");
            return (Criteria)this;
        }

        public Criteria andPrepayIn(List<BigDecimal> values) {
            addCriterion("prepay in", values, "prepay");
            return (Criteria)this;
        }

        public Criteria andPrepayNotIn(List<BigDecimal> values) {
            addCriterion("prepay not in", values, "prepay");
            return (Criteria)this;
        }

        public Criteria andPrepayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("prepay between", value1, value2, "prepay");
            return (Criteria)this;
        }

        public Criteria andPrepayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("prepay not between", value1, value2, "prepay");
            return (Criteria)this;
        }
		
				public Criteria andPrepayGreaterThan(BigDecimal value) {
            addCriterion("prepay >", value, "prepay");
            return (Criteria)this;
        }

        public Criteria andPrepayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("prepay >=", value, "prepay");
            return (Criteria)this;
        }

        public Criteria andPrepayLessThan(BigDecimal value) {
            addCriterion("prepay <", value, "prepay");
            return (Criteria)this;
        }

        public Criteria andPrepayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("prepay <=", value, "prepay");
            return (Criteria)this;
        }
				
			        public Criteria andPropertyDdressIsNull() {
            addCriterion("property_ddress is null");
            return (Criteria)this;
        }

        public Criteria andPropertyDdressIsNotNull() {
            addCriterion("property_ddress is not null");
            return (Criteria)this;
        }

        public Criteria andPropertyDdressEqualTo(String value) {
            addCriterion("property_ddress =", value, "propertyDdress");
            return (Criteria)this;
        }

        public Criteria andPropertyDdressNotEqualTo(String value) {
            addCriterion("property_ddress <>", value, "propertyDdress");
            return (Criteria)this;
        }

        public Criteria andPropertyDdressIn(List<String> values) {
            addCriterion("property_ddress in", values, "propertyDdress");
            return (Criteria)this;
        }

        public Criteria andPropertyDdressNotIn(List<String> values) {
            addCriterion("property_ddress not in", values, "propertyDdress");
            return (Criteria)this;
        }

        public Criteria andPropertyDdressBetween(String value1, String value2) {
            addCriterion("property_ddress between", value1, value2, "propertyDdress");
            return (Criteria)this;
        }

        public Criteria andPropertyDdressNotBetween(String value1, String value2) {
            addCriterion("property_ddress not between", value1, value2, "propertyDdress");
            return (Criteria)this;
        }
		
				
				public Criteria andPropertyDdressLike(String value) {
            addCriterion("property_ddress like", value, "propertyDdress");
            return (Criteria)this;
        }

        public Criteria andPropertyDdressNotLike(String value) {
            addCriterion("property_ddress not like", value, "propertyDdress");
            return (Criteria)this;
        }
			        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria)this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria)this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria)this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria)this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria)this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria)this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria)this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria)this;
        }
		
				public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria)this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria)this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria)this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria)this;
        }
				
			        public Criteria andTimeTypeIsNull() {
            addCriterion("time_type is null");
            return (Criteria)this;
        }

        public Criteria andTimeTypeIsNotNull() {
            addCriterion("time_type is not null");
            return (Criteria)this;
        }

        public Criteria andTimeTypeEqualTo(Integer value) {
            addCriterion("time_type =", value, "timeType");
            return (Criteria)this;
        }

        public Criteria andTimeTypeNotEqualTo(Integer value) {
            addCriterion("time_type <>", value, "timeType");
            return (Criteria)this;
        }

        public Criteria andTimeTypeIn(List<Integer> values) {
            addCriterion("time_type in", values, "timeType");
            return (Criteria)this;
        }

        public Criteria andTimeTypeNotIn(List<Integer> values) {
            addCriterion("time_type not in", values, "timeType");
            return (Criteria)this;
        }

        public Criteria andTimeTypeBetween(Integer value1, Integer value2) {
            addCriterion("time_type between", value1, value2, "timeType");
            return (Criteria)this;
        }

        public Criteria andTimeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("time_type not between", value1, value2, "timeType");
            return (Criteria)this;
        }
		
				public Criteria andTimeTypeGreaterThan(Integer value) {
            addCriterion("time_type >", value, "timeType");
            return (Criteria)this;
        }

        public Criteria andTimeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("time_type >=", value, "timeType");
            return (Criteria)this;
        }

        public Criteria andTimeTypeLessThan(Integer value) {
            addCriterion("time_type <", value, "timeType");
            return (Criteria)this;
        }

        public Criteria andTimeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("time_type <=", value, "timeType");
            return (Criteria)this;
        }
				
			        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria)this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria)this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria)this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria)this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria)this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria)this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria)this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria)this;
        }
		
				public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria)this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria)this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria)this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria)this;
        }
				
			        public Criteria andFinsishTimeIsNull() {
            addCriterion("finsish_time is null");
            return (Criteria)this;
        }

        public Criteria andFinsishTimeIsNotNull() {
            addCriterion("finsish_time is not null");
            return (Criteria)this;
        }

        public Criteria andFinsishTimeEqualTo(Date value) {
            addCriterion("finsish_time =", value, "finsishTime");
            return (Criteria)this;
        }

        public Criteria andFinsishTimeNotEqualTo(Date value) {
            addCriterion("finsish_time <>", value, "finsishTime");
            return (Criteria)this;
        }

        public Criteria andFinsishTimeIn(List<Date> values) {
            addCriterion("finsish_time in", values, "finsishTime");
            return (Criteria)this;
        }

        public Criteria andFinsishTimeNotIn(List<Date> values) {
            addCriterion("finsish_time not in", values, "finsishTime");
            return (Criteria)this;
        }

        public Criteria andFinsishTimeBetween(Date value1, Date value2) {
            addCriterion("finsish_time between", value1, value2, "finsishTime");
            return (Criteria)this;
        }

        public Criteria andFinsishTimeNotBetween(Date value1, Date value2) {
            addCriterion("finsish_time not between", value1, value2, "finsishTime");
            return (Criteria)this;
        }
		
				public Criteria andFinsishTimeGreaterThan(Date value) {
            addCriterion("finsish_time >", value, "finsishTime");
            return (Criteria)this;
        }

        public Criteria andFinsishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("finsish_time >=", value, "finsishTime");
            return (Criteria)this;
        }

        public Criteria andFinsishTimeLessThan(Date value) {
            addCriterion("finsish_time <", value, "finsishTime");
            return (Criteria)this;
        }

        public Criteria andFinsishTimeLessThanOrEqualTo(Date value) {
            addCriterion("finsish_time <=", value, "finsishTime");
            return (Criteria)this;
        }
				
			        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria)this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria)this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria)this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria)this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria)this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria)this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria)this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria)this;
        }
		
				public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria)this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria)this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria)this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria)this;
        }
				
			        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria)this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria)this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria)this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria)this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria)this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria)this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria)this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria)this;
        }
		
				public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria)this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria)this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria)this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria)this;
        }
				
			    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }

        public Criteria andFieldLike(final String fieldName, final String keyword) {
            addCriterion(fieldName + " like ", keyword, fieldName);
            return this;
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