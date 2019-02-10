package com.thingtrust.power.entity;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * 
 * @author wangli
 * @date 2018-10-26
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ChargeEntity {
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
		@DateTimeFormat(pattern = "yyyy-MM-dd")
	 private LocalDate payTime;
		/**
     * 缴费时间
     */
	 private LocalDateTime billTime;
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
	 private Integer status; 
		/**
     * 时间类型
     */
	 private Integer timeType; 
		/**
     * 区域类型
     */
	 private Integer type; 
		/**
     * 完成时间
     */
	 private LocalDateTime finsishTime;
		/**
     * 
     */
	 private LocalDateTime createTime;
		/**
     * 
     */
	 private LocalDateTime updateTime;
	}