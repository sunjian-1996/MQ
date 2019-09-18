package com.bbs.service;

import com.bbs.domain.BbsArticleTable;

import java.util.List;

public interface ArticleService {
    public List<BbsArticleTable> findAll(int zoneId) throws Exception;

    long publish(BbsArticleTable articleTable) throws Exception;

    BbsArticleTable getArticle(long articleId) throws Exception;

    //帖子总数
    int tiezifindAll() throws Exception;

    //今日帖子
    int jinritiezifindAll(String date) throws Exception;
//用户发帖计数
    long publishCount(String userName) throws Exception;
}
