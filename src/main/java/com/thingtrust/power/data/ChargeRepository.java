package com.thingtrust.power.data;

import com.thingtrust.power.common.mybatis.data.CrudRepository;
import com.thingtrust.power.domain.Charge;
import com.thingtrust.power.domain.example.ChargeExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *  数据访问类
 * @author wangli
 * @date 2018-10-23
 */
@Repository
public interface ChargeRepository
    extends CrudRepository<Charge, ChargeExample, Integer> {
	List<Charge> selectByPage(@Param("offset") int offset, @Param("length") int length);
}
