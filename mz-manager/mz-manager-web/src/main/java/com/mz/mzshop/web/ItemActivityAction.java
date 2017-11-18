package com.mz.mzshop.web;

import com.mz.mzshop.common.dto.TreeNode;
import com.mz.mzshop.service.ItemActivityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * User: Administrator
 * Date: 2017/11/17
 * Time: 21:12
 * Version:V1.0
 */
@Controller
public class ItemActivityAction {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private ItemActivityService ias;

    @RequestMapping("itemActivity")
    @ResponseBody
    public List<TreeNode> listItemActivity(){
        List<TreeNode> list=null;
        try {
            list=ias.getItemActivity();
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return list;
    }
}
