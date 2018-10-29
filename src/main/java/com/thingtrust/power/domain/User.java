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
public class User {
		/**
     * 
     */
	 private Integer id; 
		/**
     * 
     */
	 private String username; 
		/**
     * 
     */
	 private String password; 
		/**
     * 
     */
	 private LocalDateTime creatTime;
		/**
     * 
     */
	 private LocalDateTime updateTime;
	}