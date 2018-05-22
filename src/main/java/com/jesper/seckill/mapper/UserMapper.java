package com.jesper.seckill.mapper;

import com.jesper.seckill.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by jiangyunxiong on 2018/5/21.
 */
@Mapper
public interface UserMapper {

    @Select("select * from sk_user where id = #{id}")
    public User getById(@Param("id")long id);
}
