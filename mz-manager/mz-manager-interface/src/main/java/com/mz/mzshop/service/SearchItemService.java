package com.mz.mzshop.service;

import org.apache.solr.client.solrj.SolrServerException;

import java.io.IOException;

/**
 * User: Administrator
 * Date: 2017/11/28
 * Time: 20:47
 * Version:V1.0
 */
public interface SearchItemService {
    void importAllItems() throws IOException, SolrServerException;
}
