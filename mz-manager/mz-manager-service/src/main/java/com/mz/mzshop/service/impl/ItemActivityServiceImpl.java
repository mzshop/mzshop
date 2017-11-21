package com.mz.mzshop.service.impl;

import com.mz.mzshop.common.dto.NormalOrder;
import com.mz.mzshop.common.dto.Page;
import com.mz.mzshop.common.dto.Result;
import com.mz.mzshop.common.dto.TreeNode;
import com.mz.mzshop.dao.TbItemActivityCustomMapper;
import com.mz.mzshop.dao.TbItemActivityMapper;
import com.mz.mzshop.pojo.po.*;
import com.mz.mzshop.pojo.vo.TbItemActivityCustom;
import com.mz.mzshop.pojo.vo.TbItemCatQuery;
import com.mz.mzshop.service.ItemActivityService;
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
public class ItemActivityServiceImpl implements ItemActivityService {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private TbItemActivityMapper itemActivityDao;
    @Autowired
    private TbItemActivityCustomMapper tbItemActivityCustomDao;


    @Override
    public List<TreeNode> getItemActivity() {
        List<TreeNode> list =null;
        try {
            list=new ArrayList<TreeNode>();
            TbItemActivityExample example=new TbItemActivityExample();
            TbItemActivityExample.Criteria criteria=example.createCriteria();
            criteria.andStatusEqualTo(1);
            List<TbItemActivity> tbItemActivities = itemActivityDao.selectByExample(example);
            for (int i=0;i<tbItemActivities.size();i++){
                TreeNode treeNode = new TreeNode();
                treeNode.setId(tbItemActivities.get(i).getId());
                treeNode.setText(tbItemActivities.get(i).getName());
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
    public Result<TbItemActivityCustom> getItemActivityByPage(Page page, NormalOrder order, TbItemCatQuery query) {
        Result<TbItemActivityCustom> result=null;
        try {
            result=new Result<TbItemActivityCustom>();
            result.setTotal(tbItemActivityCustomDao.countItemActivity(query));
            result.setRows(tbItemActivityCustomDao.listItemActivityByPage(page,order,query));
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int removeItemActivityById(List<Long> ids) {
        int i=0;
        try {
            TbItemActivityExample example = new TbItemActivityExample();
            TbItemActivityExample.Criteria criteria = example.createCriteria();
            criteria.andIdIn(ids);
            TbItemActivity record = new TbItemActivity();
            record.setStatus(2);
            itemActivityDao.updateByExampleSelective(record,example);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return i;
    }
}
