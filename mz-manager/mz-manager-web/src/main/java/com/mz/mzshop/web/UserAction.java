package com.mz.mzshop.web;

import com.mz.mzshop.pojo.po.TbUser;
import com.mz.mzshop.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * User: Administrator
 * Date: 2017/11/21
 * Time: 16:54
 * Version:V1.0
 */
@Controller
public class UserAction {
    Logger logger= LoggerFactory.getLogger(this.getClass());
    @Autowired
    private UserService userService;

    @RequestMapping("login")
    @ResponseBody
    public TbUser doLogin(TbUser tbUser, HttpSession session){
        TbUser findUser=null;
        try {
            findUser=userService.findByNameAndPwd(tbUser);
            if(findUser!=null){
                session.setAttribute("findUser",findUser);
            }
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return findUser;
    }

}
