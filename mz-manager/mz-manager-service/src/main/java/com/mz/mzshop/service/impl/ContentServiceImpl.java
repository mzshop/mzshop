package com.mz.mzshop.service.impl;


import com.mz.mzshop.common.dto.Page2;
import com.mz.mzshop.common.jedis.JedisClient;
import com.mz.mzshop.common.util.JsonUtils;
import com.mz.mzshop.dao.*;
import com.mz.mzshop.pojo.po.*;
import com.mz.mzshop.pojo.vo.TbItemCustom2;
import com.mz.mzshop.service.ContentService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Date: 2017/11/20
 * Time: 15:29
 * Version:V1.0
 */
@Service
public class ContentServiceImpl implements ContentService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private TbContentMapper contentDao;
    @Autowired
    private JedisClient jedisClient;
    @Autowired
    TbNoticeMapper tbNoticeMapper;

    @Autowired
    TbItemCatMapper tbItemCatMapper;

    @Autowired
    TbItemActivityMapper tbItemActivityMapper;

    @Autowired
    TbItemMapper tbItemMapper;
    @Autowired
    TbItemCustomMapper tbItemCustomMapper;

    @Override
    public List<TbContent> listContentsByCid(Long id) {
        List<TbContent> list = null;
        //查询缓存部分
        try {
            String json = jedisClient.hget("MZ_CONTENT_LIST", id + "");
            System.out.println("json数据为"+json);
            if(StringUtils.isNotBlank(json)){
               list= JsonUtils.jsonToList(json, TbContent.class);
                System.out.println("进入到集群查询中");
                System.out.println("集群中读出来为"+list);
                return list;
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        //主体业务部分
        //创建模板
        TbContentExample example = new TbContentExample();
        TbContentExample.Criteria criteria = example.createCriteria();
        criteria.andCategoryIdEqualTo(id);
        //执行查询
        list = contentDao.selectByExample(example);
        try{

            jedisClient.hset("MZ_CONTENT_LIST",id+"",JsonUtils.objectToJson(list));
        }catch (Exception e){
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return list;
    }
//查询TbNotice到首页上中下部分，例如：小编说：这些年，小折每天坚持为大家更新超值宝贝... 感谢您多年来的支持！
    @Override
    public TbNotice tbNoticeByStatus(int i) {
        TbNoticeExample example = new TbNoticeExample();
        TbNoticeExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo((byte) i);
        List<TbNotice> tbNotices = tbNoticeMapper.selectByExample(example);
        return tbNotices.get(0);
    }

    @Override
    public List<TbItemCat> listTbItemCat(int i) {
        TbItemCatExample example = new TbItemCatExample();
        TbItemCatExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(i);
        List<TbItemCat> tbItemCats = tbItemCatMapper.selectByExample(example);
        return tbItemCats;
    }

    @Override
    public List<TbItemActivity> listTbItemActivity(int i) {
        TbItemActivityExample example = new TbItemActivityExample();
        TbItemActivityExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(i);
        List<TbItemActivity> tbItemActivities = tbItemActivityMapper.selectByExample(example);


        return tbItemActivities;
    }

    @Override
    public List<TbItemCustom2> listTbItemByAid(int i) {
        /*TbItemExample example = new TbItemExample();
        TbItemExample.Criteria criteria = example.createCriteria();
        criteria.andAidEqualTo(i);
        List<TbItem> list = tbItemMapper.selectByExample(example);*/
        List<TbItemCustom2> tbItems = tbItemCustomMapper.listItemByAid(i);
        return tbItems;
    }

    @Override
    public List<TbItem> listItemByCid(Page2 page2) {
        return tbItemCustomMapper.listItemsByCat(page2) ;
    }

    @Override
    public Integer getTotalCountsForItem(Page2 page2) {
        return tbItemCustomMapper.coutItemsByCat(page2);
    }

}
