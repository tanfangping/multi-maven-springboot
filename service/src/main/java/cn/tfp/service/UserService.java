package cn.tfp.service;

import cn.tfp.dao.mapper.UserMapper;
import cn.tfp.model.entity.User;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService extends ServiceImpl<UserMapper, User> {
    @Autowired
    private UserMapper userMapper;

    public User getUser() {
//        return userMapper.selectById("1176796209260036097");

        // 测试自定义的mapper是否可用
        return userMapper.selectCustom("1176796209260036097");
    }
}
