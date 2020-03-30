package com.springbootlearning.market.service.impl;

import com.springbootlearning.market.dao.GoodsTypeDao;
import com.springbootlearning.market.pojo.dto.ResponseDTO;
import com.springbootlearning.market.pojo.entity.GoodsType;
import com.springbootlearning.market.pojo.vo.GoodsTypeVO;
import com.springbootlearning.market.service.IGoodsTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author YHZ
 * @date 2020/3/27
 */
@Service
public class GoodsTypeServiceImpl implements IGoodsTypeService {

    @Resource
    GoodsTypeDao goodsTypeDao;

    @Override
    public ResponseDTO add(GoodsType record) {
        int i = goodsTypeDao.insertSelective(record);
        if (i == 1){
            return ResponseDTO.successWithoutData("增加商品类型成功");
        }else{
            return ResponseDTO.failWithoutData("增加商品失败");
        }
    }

    @Override
    public List<GoodsTypeVO> selectTypeByParentTypeId(Integer pId) {

        //查询一级类型类型
        List<GoodsTypeVO> parents = goodsTypeDao.selectTypeByParentTypeId(pId);

        /*//查询每一个一级类型的子类，并将其增加到当前一级类型的children属性中
        //有多少个一级类型就需查询多少次，极大降低性能
        for (GoodsTypeVO gt : parents
             ) {
            List<GoodsTypeVO> children = goodsTypeDao.selectTypeByParentTypeId(gt.getGoodsTypeId());
            gt.setChildren(children);
        }
        //lambda表达式和上面的foreach等价
        parents.forEach(x->{
            x.setChildren(goodsTypeDao.selectTypeByParentTypeId(x.getGoodsTypeId()));
        });*/

        //优化：根据一级类型在一次查询中将所有一级类型的所有子类全部查询出来
        List<GoodsTypeVO> children = goodsTypeDao.selectTypeByParentTypeIds(parents);
        //对查询出来的所有子类children根据父类型id进行分组，使用java的流式处理
        //返回值含义：根据父类型的id作为key，所有子类作为value
        Map<String, List<GoodsTypeVO>> collect = children.stream().collect(Collectors.groupingBy(GoodsTypeVO::getParentTypeId));
        //for循环将查询出的子类型赋值给一级类型的children属性
        parents.forEach(x->{
            List<GoodsTypeVO> childrens = collect.get(x.getGoodsTypeId().toString());
            x.setChildren(childrens);
        });
        return parents;
    }
}
