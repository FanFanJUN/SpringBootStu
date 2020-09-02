package com.lc.service.impl;

import com.lc.cache.BaseCache;
import com.lc.dao.ArticleMapper;
import com.lc.model.Bo.ArticleBo;
import com.lc.model.Vo.ArticleVo;
import com.lc.model.entity.Article;
import com.lc.model.entity.SysDic;
import com.lc.service.ArticleService;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @ClassName ArticleServiceImpl
 * @Description TODO
 * @Author licai
 * @Date 2020-08-28 13:51
 * @Version 1.0
 */
@Service
public class ArticleServiceImpl implements ArticleService {
    @Resource
    ArticleMapper articleMapper;
    
    private final static String DIC_article_category = "article_category";
    
    @Override
    public int deleteByPrimaryKey(String id) {
        return 0;
    }

    @Override
    public int insert(Article record) {
        return 0;
    }

    @Override
    public int insertSelective(Article record) {
        return articleMapper.insertSelective(record);
    }

    @Override
    public Article selectByPrimaryKey(String id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Article record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(Article record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Article record) {
        return 0;
    }

    @Override
    public List selectList(Article article) {
        
        return articleMapper.selectList(article);
    }

    @Override
    public List<ArticleBo> selectNum() {
        BaseCache baseCache = new BaseCache();
        SysDic sysDic = new SysDic();
        sysDic.setDictionaryCategoryNo(DIC_article_category);
        List<SysDic> listValue = baseCache.getListValue(sysDic);

//        List<String> stringList = new ArrayList<>();
//        if (!CollectionUtils.isEmpty(listValue)) {
//            stringList = listValue.stream().map(x -> x.getDictionaryNo()).collect(Collectors.toList());
//        }
        ArrayList<ArticleBo> returnList = new ArrayList<>();

        for (SysDic dic:
             listValue) {
            Article article1 = new Article();
            article1.setArticleCategory(dic.getDictionaryNo());
            Integer num = articleMapper.selectNum(article1);

            ArticleBo articleBo = new ArticleBo();
            articleBo.setTotalTitel(num.toString());
            articleBo.setArticleCategoryName(dic.getDictionaryNm());
            returnList.add(articleBo);
        }
        return returnList;
    }
}
