package com.xlh.mybatis.mapper;

import com.xlh.mybatis.pojo.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    /**
     * 根据用户id查询
     * @param userId 用户id
     * @return 用户列表
     */
    User selectById(Long userId);

    //增加
    /**
     *
     * @param user 用户信息
     * @return
     */
    int insert(User user);

    // 删除

    /**
     *  根据用户id删除
     * @param userID 用户id
     * @return
     */
    int deleteById(Long userID);
    // 修改

    /**
     * 根据用户id修改
     * @param user  id用户id是不变的，通
     * @return
     */
    int updateById(User user);

    /**
     * 通过指定用户id 修改用户名
     * @param userId 用户id
     * @param userName 用户名
     * @return
     * 两个参数的时候要回注解 @Param(这个里起名字)这个名字在
     * BindingException: Parameter 'id' not found
     */
    int updateUserNameById(@Param("userId") Long userId,
                           @Param("userName") String userName);

    /**
     * 通过 Map集合参数
     * @param map
     * @return
     */
    int updateUserNameByIdWithMap(Map map);

    //查询

    /**
     * 根据用户名查询
     * @param userName 用户名(模糊匹配一些字)
     * @return
     */
    List<User> selectListByUserName(String userName);

    /**
     *
     * @param user userName用户名：（模糊匹配）
     *             phone手机号（全部信息）
     *            createTime-updateTime：(范围匹配createTime)
     * @return
     */
    List<User> selectListByUser(User user);
}
