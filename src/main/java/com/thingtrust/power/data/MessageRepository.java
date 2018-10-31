package com.thingtrust.power.data;

import com.thingtrust.power.common.mybatis.data.CrudRepository;
import com.thingtrust.power.domain.Message;
import com.thingtrust.power.domain.example.MessageExample;
import org.springframework.stereotype.Repository;

						/**
 *  数据访问类
 * @author wangli
 * @date 2018-10-30
 */
@Repository
public interface MessageRepository
    extends CrudRepository<Message, MessageExample, Integer> {
}
