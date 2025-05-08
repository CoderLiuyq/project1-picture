package com.yupi.yu_picture_backend.service;

import cn.hutool.core.collection.CollUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yupi.yu_picture_backend.model.dto.user.UserQueryRequest;
import com.yupi.yu_picture_backend.model.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.yu_picture_backend.model.vo.LoginUserVO;
import com.yupi.yu_picture_backend.model.vo.UserVO;
import org.springframework.beans.BeanUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
* @author 20791
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2025-05-07 20:46:08
*/
public interface UserService extends IService<User> {
    // 用户注册
    long userRegister(String account, String password, String checkPassword);

    // 密码加密
    String getEncryptPassword(String password);

    //  用户登录
    LoginUserVO userLogin(String userAccount, String userPassword, HttpServletRequest request);

    //获取当前登录用户
    User getLoginUser(HttpServletRequest request);

    //移除登录态
    boolean userlogout(HttpServletRequest request);

    UserVO getUserVO(User user);

    List<UserVO> getUserVOList(List<User> userList);

    QueryWrapper<User> getQueryWrapper(UserQueryRequest userQueryRequest);
}
