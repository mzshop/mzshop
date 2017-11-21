package com.mz.mzshop.web;

import com.mz.mzshop.common.dto.Order;
import com.mz.mzshop.common.dto.Page;
import com.mz.mzshop.common.dto.Result;
import com.mz.mzshop.pojo.vo.TbItemCustom;
import com.mz.mzshop.pojo.vo.TbItemQuery;
import com.mz.mzshop.service.ItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


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
    public Result<TbItemCustom> listItemsByPage(Page page, Order order, TbItemQuery query){
        Result<TbItemCustom> result=null;
        try {
            result=itemService.getItemsByPage(page,order,query);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return result;
    }

    @RequestMapping("items/batchRemove")
    @ResponseBody
    public int removeItemById(@RequestParam("ids[]") List<Long> ids){
        int i=0;
        try {
            i=itemService.removeItemById(ids);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return i;
    }

    @RequestMapping("items/batchDown")
    @ResponseBody
    public int downItemById(@RequestParam("ids[]") List<Long> ids){
        int i=0;
        try {
            i=itemService.downItemById(ids);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return i;
    }

    @RequestMapping("items/batchUp")
    @ResponseBody
    public int upItemById(@RequestParam("ids[]") List<Long> ids){
        int i=0;
        try {
            i=itemService.upItemById(ids);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return i;
    }

//    @RequestMapping(value="/addItem",method = RequestMethod.POST)
//    @ResponseBody
//    public int addItem(TbItem tbItem){
//        int i=0;
//        try {
//            i=itemService.saveItem(tbItem);
//        }catch (Exception e){
//            logger.error(e.getMessage(),e);
//            e.printStackTrace();
//        }
//        return i;
//    }
}
