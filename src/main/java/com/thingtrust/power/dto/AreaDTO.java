package com.thingtrust.power.dto;

import lombok.*;

import java.time.LocalDateTime;

/**
 * 
 * @author wangli
 * @date 2018-10-23
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class AreaDTO {
		/**
     * 
     */
	 private Integer id; 
		/**
     * 区域
     */
	 private String name; 

		/**
     * 发送时间
     */
	 private String updateTime;
	}