package com.thingtrust.power.data;

import com.thingtrust.power.common.mybatis.data.CrudRepository;
import com.thingtrust.power.domain.Area;
import com.thingtrust.power.domain.example.AreaExample;
import org.springframework.stereotype.Repository;

					/**
 *  数据访问类
 * @author wangli
 * @date 2018-10-23
 */
@Repository
public interface AreaRepository
    extends CrudRepository<Area, AreaExample, Integer> {
}
