package com.lc.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lc.common.CommonPage;
import com.lc.common.CommonResult;
import com.lc.common.IdUtils;
import com.lc.model.Vo.ArticleVo;
import com.lc.model.entity.Article;
import com.lc.service.ArticleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ArticleController
 * @Description 文章 控制器
 * @Author licai
 * @Date 2020-08-28 13:54
 * @Version 1.0
 */
@Api(value = "ArticleController", tags = "文章相关api控制器")
@RestController
public class ArticleController {
    @Autowired
    ArticleService articleService;


    /**
     *
     * @Description: 查询列表
     * @author: licai
     * @date:  14:06  
     * @param: [articleVo]
     * @return: com.lc.common.CommonResult
     *
     */
    @RequestMapping(value = "/api/lc/SELECTLISTARTICLE", method = RequestMethod.POST)
    @ApiOperation(value = "获取列表", notes = "获取列表")
    public CommonResult selectArticleList(@RequestBody ArticleVo articleVo) {
        try {
            PageHelper.startPage(articleVo.getPageNum(), articleVo.getPageSize());
            Article article = new Article();
            BeanUtils.copyProperties(articleVo, article);
            return CommonResult.success(CommonPage.restPage(articleService.selectList(article)));
        } catch (Exception e){
            return CommonResult.failed();
        }
    }
    
    /**
     *
     * @Description: 新增
     * @author: licai
     * @date:  14:06  
     * @param: [article]
     * @return: com.lc.common.CommonResult
     *
     */
    @PostMapping("/api/lc/INSERTARTICLE")
    @ApiOperation(value = "新增", notes = "新增")
    public CommonResult tinserArticle(@RequestBody Article article) {
        try {
            article.setId(IdUtils.getRandomIdByUUID());
            articleService.insertSelective(article);
            return CommonResult.success("新增成功！");
        } catch (Exception e) {
            return CommonResult.failed(e.toString());
        }
    }
    
}
