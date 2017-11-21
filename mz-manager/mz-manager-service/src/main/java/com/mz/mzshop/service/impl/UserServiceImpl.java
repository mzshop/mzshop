package com.mz.mzshop.service.impl;

import com.mz.mzshop.dao.TbUserCustomMapper;
import com.mz.mzshop.dao.TbUserMapper;
import com.mz.mzshop.pojo.po.TbUser;
import com.mz.mzshop.pojo.po.TbUserExample;
import com.mz.mzshop.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User: Administrator
 * Date: 2017/11/21
 * Time: 17:23
 * Version:V1.0
 */
@Service
public class UserServiceImpl implements UserService{
    Logger logger= LoggerFactory.getLogger(this.getClass());
    @Autowired
    private TbUserMapper userDao;
    @Autowired
    private TbUserCustomMapper userCustomDao;

    @Override
    public TbUser findByNameAndPwd(TbUser tbUser) {
        TbUser findUser=null;
        try {
            TbUserExample example=new TbUserExample();
            example.createCriteria().andUsernameEqualTo(tbUser.getUsername()).andPasswordEqualTo(tbUser.getPassword());
            List<TbUser> tbUsers = userDao.selectByExample(example);
            findUser= tbUsers.get(0);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return findUser;
    }
}
