package com.senior.mapper;

import com.senior.entity.Major;
import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.senior.entity.User;

// 在对应的mapper上面实现基本的接口
@Repository // 代表持久层
public interface MajorMapper extends BaseMapper<Major> {
}
