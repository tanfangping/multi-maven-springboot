package cn.tfp.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user")
public class User extends BaseEntity{
    @TableField("name")
    private String name;

    @TableField("phone")
    private String phone;
}
