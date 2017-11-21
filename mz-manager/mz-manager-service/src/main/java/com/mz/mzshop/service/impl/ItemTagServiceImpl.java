package com.mz.mzshop.service.impl;

import com.mz.mzshop.common.dto.NormalOrder;
import com.mz.mzshop.common.dto.Page;
import com.mz.mzshop.common.dto.Result;
import com.mz.mzshop.dao.TbItemTagCustomMapper;
import com.mz.mzshop.dao.TbItemTagMapper;
import com.mz.mzshop.pojo.po.TbItemCat;
import com.mz.mzshop.pojo.po.TbItemCatExample;
import com.mz.mzshop.pojo.po.TbItemTag;
import com.mz.mzshop.pojo.po.TbItemTagExample;
import com.mz.mzshop.pojo.vo.TbItemTagCustom;
import com.mz.mzshop.pojo.vo.TbItemTagQuery;
import com.mz.mzshop.service.ItemTagService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User: Administrator
 * Date: 2017/11/17
 * Time: 19:33
 * Version:V1.0
 */
@Service
public class ItemTagServiceImpl implements ItemTagService {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private TbItemTagMapper itemTagDao;
    @Autowired
    private TbItemTagCustomMapper itemTagCustomDao;




    @Override
    public Result<TbItemTagCustom> getItemTagsByPage(Page page, NormalOrder order, TbItemTagQuery query) {
        Result<TbItemTagCustom> result=null;
        try {
            result=new Result<TbItemTagCustom>();
            result.setTotal(itemTagCustomDao.countItemTags(query));
            result.setRows(itemTagCustomDao.listItemTagsByPage(page,order,query));
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int removeItemTagsById(List<Long> ids) {
        int i=0;
        try {
            TbItemTagExample example = new TbItemTagExample();
            TbItemTagExample.Criteria criteria = example.createCriteria();
            criteria.andIdIn(ids);
            TbItemTag record = new TbItemTag();
            record.setStatus((byte) 2);
            itemTagDao.updateByExampleSelective(record,example);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return i;
    }
}
