package com.mz.mzshop.web;

import com.mz.mzshop.common.dto.NormalOrder;
import com.mz.mzshop.common.dto.Page;
import com.mz.mzshop.common.dto.Result;
import com.mz.mzshop.common.dto.TreeNode;
import com.mz.mzshop.pojo.vo.TbItemCatCustom;
import com.mz.mzshop.pojo.vo.TbItemCatQuery;
import com.mz.mzshop.service.ItemCatService;
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
public class ItemCatAction {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private ItemCatService itemCatService;

    @RequestMapping("/itemCatNodes")
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

    @RequestMapping("/itemCats")
    @ResponseBody
    public Result<TbItemCatCustom> listItemCatsByPage(Page page, NormalOrder order, TbItemCatQuery query){
        Result<TbItemCatCustom> result=null;
        try {
            result=itemCatService.getItemCatsByPage(page,order,query);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return result;
    }

    @RequestMapping("itemCats/batchRemove")
    @ResponseBody
    public int removeItemCatsById(@RequestParam("ids[]") List<Long> ids){
        int i=0;
        try {
            i=itemCatService.removeItemCatsById(ids);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return i;
    }
}
