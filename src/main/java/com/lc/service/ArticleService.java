package com.lc.service;

import com.lc.model.Bo.ArticleBo;
import com.lc.model.Vo.ArticleVo;
import com.lc.model.entity.Article;

import java.util.List;
import java.util.Map;

/**
 * @ClassName ArticleService
 * @Description service
 * @Author licai
 * @Date 2020-08-28 13:50
 * @Version 1.0
 */
public interface ArticleService {
    int deleteByPrimaryKey(String id);

    int insert(Article record);

    int insertSelective(Article record);

    Article selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKeyWithBLOBs(Article record);

    int updateByPrimaryKey(Article record);

    List<Article> selectList(Article article);

    List<ArticleBo> selectNum();
}
