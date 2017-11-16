package com.mz.mzshop.web;

import com.mz.mzshop.common.dto.Order;
import com.mz.mzshop.common.dto.Page;
import com.mz.mzshop.common.dto.Result;
import com.mz.mzshop.pojo.vo.TbItemCustom;
import com.mz.mzshop.service.ItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * User: Administrator
 * Date: 2017/11/16
 * Time: 15:20
 * Version:V1.0
 */
@Controller
public class ItemAction {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private ItemService itemService;

    @RequestMapping("/items")
    @ResponseBody
    public Result<TbItemCustom> listItemsByPage(Page page, Order order){
        Result<TbItemCustom> result=null;
        try {
            result=itemService.getItemsByPage(page,order);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return result;
    }

}
