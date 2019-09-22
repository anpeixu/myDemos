package com.anpx.dao;

import com.anpx.vo.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImp implements UserMapper{
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;
    public List<User> findAll() {
        List<User> list = sqlSessionTemplate.selectList("com.anpx.dao.UserMapper.list");

        return list;
    }
}
