package com.cyan.service.inteface;

import java.util.List;

import com.cyan.pojo.Users;

public interface UsersService {

//====增

    /*插入所有字段 - 主键自增,插入User用户表*/
    int insert(Users record);

    /*插入或更新所有字段 - 主键自增,插入User用户表,主键存在就执行更新*/
    int insertOrUpdate(Users record);

    /*选择插入所有User用户表字段 - 主键自增,插入User用户表*/
    int insertSelective(Users record);

    /*选择插入或更新所有User用户表字段 - 主键自增,插入User用户表,主键存在就执行更新*/
    int insertOrUpdateSelective(Users record);

    /*批量插入User用户表*/
    int batchInsert(List<Users> list);

    // 用户注册
    boolean register(Users user);

//====删

    /*删除指定ID的User用户表信息*/
    int deleteByPrimaryKey(Integer id);

//====改

    /*修改User用户表*/
    int updateByPrimaryKey(Users record);

    /*选择修改User用户表*/
    int updateByPrimaryKeySelective(Users record);

    /*批量修改User用户表*/
    int updateBatch(List<Users> list);

    /*批量选择修改User用户表*/
    int updateBatchSelective(List<Users> list);

//====查

    /*查询指定ID的User用户表信息*/
    Users selectByPrimaryKey(Integer id);

    /*查询用户登录*/
    Users login(String usernameOrEmail, String password);

    /*查询所有用户*/
    List<Users> selectAll();
}
