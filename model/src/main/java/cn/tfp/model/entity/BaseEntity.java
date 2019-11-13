package cn.tfp.model.entity;

import cn.tfp.model.handle.Long2StringHandle;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BaseEntity {

	// 由于前端js对long类型的支持不好，会出线数据不正确的问题，所以一般返回给前端的都是string，而不是long，但是数据库中要使用bigInt来存，
	//如果使用varchar类型，会比较占空间
	@TableId(type=IdType.ID_WORKER)
	@JsonSerialize(using= Long2StringHandle.class)
	private Long id;
	
	@TableField(fill = FieldFill.INSERT) // 新增执行
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime createdTime;
	
	@TableField(fill = FieldFill.INSERT_UPDATE) // 新增和修改执行
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime updatedTime;
	
	@TableField(fill = FieldFill.INSERT) // 新增执行
	private String createdBy;
	
	@TableField(fill = FieldFill.INSERT_UPDATE) // 新增和修改执行
	private String updatedBy;
}
