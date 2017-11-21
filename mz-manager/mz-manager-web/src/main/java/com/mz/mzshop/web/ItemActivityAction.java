package com.mz.mzshop.web;

import com.mz.mzshop.common.dto.NormalOrder;
import com.mz.mzshop.common.dto.Page;
import com.mz.mzshop.common.dto.Result;
import com.mz.mzshop.common.dto.TreeNode;
import com.mz.mzshop.pojo.vo.TbItemActivityCustom;
import com.mz.mzshop.pojo.vo.TbItemCatQuery;
import com.mz.mzshop.service.ItemActivityService;
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
 * Date: 2017/11/17
 * Time: 19:29
 * Version:V1.0
 */
@Controller
public class ItemActivityAction {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private ItemActivityService itemActivityService;

    @RequestMapping("/itemActivityNodes")
    @ResponseBody
    public List<TreeNode> listItemActivity(){
        List<TreeNode> list=null;
        try {
            list = itemActivityService.getItemActivity();

        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return list;
    }

    @RequestMapping("/itemActivity")
    @ResponseBody
    public Result<TbItemActivityCustom> listItemCatsByPage(Page page, NormalOrder order, TbItemCatQuery query){
        Result<TbItemActivityCustom> result=null;
        try {
            result=itemActivityService.getItemActivityByPage(page,order,query);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return result;
    }

    @RequestMapping("itemActivity/batchRemove")
    @ResponseBody
    public int removeItemActivityById(@RequestParam("ids[]") List<Long> ids){
        int i=0;
        try {
            i=itemActivityService.removeItemActivityById(ids);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return i;
    }
}
