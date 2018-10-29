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
 * @date 2018-10-23
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Area {
		/**
     * 
     */
	 private Integer id; 
		/**
     * 区域
     */
	 private String name; 
		/**
     * 
     */
	 private LocalDateTime createTime;
		/**
     * 
     */
	 private LocalDateTime updateTime;
	}