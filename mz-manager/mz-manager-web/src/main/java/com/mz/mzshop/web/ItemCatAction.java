package com.mz.mzshop.web;

import com.mz.mzshop.common.dto.TreeNode;
import com.mz.mzshop.service.ItemCatService;
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
 * Time: 19:29
 * Version:V1.0
 */
@Controller
public class ItemCatAction {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private ItemCatService itemCatService;

    @RequestMapping("/itemCats")
    @ResponseBody
    public List<TreeNode> listItemCats(){
        List<TreeNode> list=null;
        try {
            list = itemCatService.getItemCats();

        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return list;
    }
}
