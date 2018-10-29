package com.thingtrust.power.data;




import com.thingtrust.power.common.mybatis.data.CrudRepository;
import com.thingtrust.power.domain.User;
import com.thingtrust.power.domain.example.UserExample;
import org.springframework.stereotype.Repository;

/**
*  数据访问类
* @author wangli
* @date 2018-10-09
*/
@Repository
public interface UserRepository
extends CrudRepository<User, UserExample, Integer> {
}
