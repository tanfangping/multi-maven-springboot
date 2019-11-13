package cn.tfp.dao.mapper;

import cn.tfp.model.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface UserMapper extends BaseMapper<User> {

    User selectCustom(String id);
}
