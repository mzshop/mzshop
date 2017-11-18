package com.mz.mzshop.service.impl;

import com.mz.mzshop.common.dto.TreeNode;
import com.mz.mzshop.dao.TbItemActivityMapper;
import com.mz.mzshop.dao.TbItemMapper;
import com.mz.mzshop.pojo.po.TbItemActivity;
import com.mz.mzshop.pojo.po.TbItemActivityExample;
import com.mz.mzshop.pojo.po.TbItemCat;
import com.mz.mzshop.pojo.po.TbItemCatExample;
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
    private TbItemActivityMapper tbItemActivityDao;


    @Override
    public List<TreeNode> getItemActivity() {
        List<TreeNode> list =null;
        try {
            list=new ArrayList<TreeNode>();
            TbItemActivityExample example=new TbItemActivityExample();
            TbItemActivityExample.Criteria criteria=example.createCriteria();
            criteria.andStatusEqualTo(1);
            List<TbItemActivity> tbItemActivities = tbItemActivityDao.selectByExample(example);
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
}
