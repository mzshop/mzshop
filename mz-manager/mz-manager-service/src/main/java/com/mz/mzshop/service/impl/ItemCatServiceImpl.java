package com.mz.mzshop.service.impl;

import com.mz.mzshop.common.dto.NormalOrder;
import com.mz.mzshop.common.dto.Page;
import com.mz.mzshop.common.dto.Result;
import com.mz.mzshop.common.dto.TreeNode;
import com.mz.mzshop.dao.TbItemCatCustomMapper;
import com.mz.mzshop.dao.TbItemCatMapper;
import com.mz.mzshop.pojo.po.TbItemCat;
import com.mz.mzshop.pojo.po.TbItemCatExample;
import com.mz.mzshop.pojo.vo.TbItemCatCustom;
import com.mz.mzshop.pojo.vo.TbItemCatQuery;
import com.mz.mzshop.service.ItemCatService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Administrator
 * Date: 2017/11/17
 * Time: 19:33
 * Version:V1.0
 */
@Service
public class ItemCatServiceImpl implements ItemCatService {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private TbItemCatMapper itemCatDao;
    @Autowired
    private TbItemCatCustomMapper itemCatCustomDao;


    @Override
    public List<TreeNode> getItemCats() {
        List<TreeNode> list =null;
        try {
            list=new ArrayList<TreeNode>();
            TbItemCatExample example=new TbItemCatExample();
            TbItemCatExample.Criteria criteria=example.createCriteria();
            criteria.andStatusEqualTo(1);
            List<TbItemCat> tbItemCats = itemCatDao.selectByExample(example);
            for (int i=0;i<tbItemCats.size();i++){
                TreeNode treeNode = new TreeNode();
                treeNode.setId(tbItemCats.get(i).getId());
                treeNode.setText(tbItemCats.get(i).getName());
                treeNode.setState("open");
                list.add(treeNode);
            }
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public Result<TbItemCatCustom> getItemCatsByPage(Page page, NormalOrder order, TbItemCatQuery query) {
        Result<TbItemCatCustom> result=null;
        try {
            result=new Result<TbItemCatCustom>();
            result.setTotal(itemCatCustomDao.countItemCats(query));
            result.setRows(itemCatCustomDao.listItemCatsByPage(page,order,query));
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int removeItemCatsById(List<Long> ids) {
        int i=0;
        try {
            TbItemCatExample example = new TbItemCatExample();
            TbItemCatExample.Criteria criteria = example.createCriteria();
            criteria.andIdIn(ids);
            TbItemCat record = new TbItemCat();
            record.setStatus(2);
            itemCatDao.updateByExampleSelective(record,example);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return i;
    }
}
