package com.thingtrust.power.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * 
 * @author wangli
 * @date 2018-10-30
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Message {
		/**
     * 
     */
	 private Integer id; 
		/**
     * 
     */
	 private String name; 
		/**
     * 联系人关联
     */
	 private Integer chargeId; 
		/**
     * 
     */
	 private LocalDateTime createTime;
		/**
     * 
     */
	 private LocalDateTime updateTime;
	}