package com.xumiao.gulimall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xumiao.common.utils.PageUtils;
import com.xumiao.common.utils.Query;

import com.xumiao.gulimall.product.dao.CategoryDao;
import com.xumiao.gulimall.product.entity.CategoryEntity;
import com.xumiao.gulimall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    /**
     * 获取树形结构数据
     * @return
     */
    @Override
    public List<CategoryEntity> getTreeData() {
        List<CategoryEntity> categoryEntities = baseMapper.selectList(null);
        //筛选一级分类
        return categoryEntities.stream()
                .filter(categoryEntity -> categoryEntity.getParentCid() == 0L)
                .peek(categoryEntity -> {
                    //递归获取对应的子分类
                    categoryEntity.setChildren(recursionChildCategory(categoryEntity, categoryEntities));
                })
                .sorted(Comparator.comparingInt(o -> (o.getSort() == null ? 0 : o.getSort())))
                .collect(Collectors.toList());
    }

    /**
     * 递归查找子分类
     * @param rootNode
     *         root节点
     * @param categoryEntities
     *         数据库中所有节点
     * @return
     */
    private List<CategoryEntity> recursionChildCategory(CategoryEntity rootNode, List<CategoryEntity> categoryEntities) {
        return categoryEntities.stream()
                .filter(categoryEntity -> categoryEntity.getParentCid().equals(rootNode.getCatId()))
                .peek(categoryEntity -> categoryEntity.setChildren(recursionChildCategory(categoryEntity, categoryEntities)))
                .sorted(Comparator.comparingInt(o -> (o.getSort() == null ? 0 : o.getSort())))
                .collect(Collectors.toList());
    }

}