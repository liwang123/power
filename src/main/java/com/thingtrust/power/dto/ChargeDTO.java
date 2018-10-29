package com.thingtrust.power.dto;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 
 * @author wangli
 * @date 2018-10-24
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ChargeDTO {
		/**
     * 
     */
	 private Integer id; 
		/**
     * 联系人
     */
	 private String name; 
		/**
     * 联系方式
     */
	 private String phone; 
		/**
     * 地址
     */
	 private String address; 
		/**
     * 电费
     */
	 private BigDecimal charge;
		/**
     * 缴费时间
     */
	 private String payTime;
		/**
     * 预缴电费
     */
	 private BigDecimal prepay;
		/**
     * 物业地址
     */
	 private String propertyDdress; 
		/**
     * 缴费状态
     */
	 private String status;
		/**
     * 时间类型
     */
	 private String timeType;
		/**
     * 区域类型
     */
	 private String type;
		/**
     * 缴费时间
     */
	 private String finsishTime;
	}