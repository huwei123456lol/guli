package com.guli.example.guli_product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.guli.example.guli_product.entity.BrandEntity;
import com.guli.example.guli_product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;

@MapperScan("com.guli.example.guli_product.dao")
@SpringBootTest
class GuliProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setDescript("这是一个测试数据");
//        brandEntity.setName("test");
//        brandService.save(brandEntity);
//        System.out.println("保存成功！");
        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        list.forEach((i)->System.out.println(i));
    }

}
