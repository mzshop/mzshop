package com.mz.mzshop.service;

import com.mz.mzshop.pojo.po.TbUser; /**
 * User: Administrator
 * Date: 2017/11/21
 * Time: 17:04
 * Version:V1.0
 */
public interface UserService {
    TbUser findByNameAndPwd(TbUser tbUser);
}
