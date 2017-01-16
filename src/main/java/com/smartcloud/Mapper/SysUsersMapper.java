package com.smartcloud.Mapper;

import com.smartcloud.pojo.SysUsers;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by Administrator on 2017/1/16.
 */
@Mapper
public interface SysUsersMapper {
    @Select("select * from sys_users where name = #{name}")
    SysUsers findUserByName(@Param("name")String name);
}
