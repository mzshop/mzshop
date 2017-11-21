package com.mz.mzshop.dao;

import com.mz.mzshop.pojo.po.TbUser;

import java.util.List;

/**
 * User: Administrator
 * Date: 2017/11/21
 * Time: 18:42
 * Version:V1.0
 */
public interface TbUserCustomMapper {
    List<TbUser> selectByItem(TbUser tbUser);
}
