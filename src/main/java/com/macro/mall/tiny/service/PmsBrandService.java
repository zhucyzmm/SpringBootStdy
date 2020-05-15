package com.macro.mall.tiny.service;

import com.macro.mall.tiny.mbg.model.PmsBrand;

import java.util.List;

/**
 * @Description TODO
 * @Author zhucy
 * @Date 2020/5/14 22:36
 * @Version 1.0
 */
public interface PmsBrandService {

    List<PmsBrand> listAllBrand();

    int creatBrand(PmsBrand brand);

    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum,int pageSize);

    PmsBrand getBrand(Long id);



}
