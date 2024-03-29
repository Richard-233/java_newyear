package com.team.miniprogram.model.dao;

import com.team.miniprogram.model.pojo.Product;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miniprogram_product
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miniprogram_product
     *
     * @mbg.generated
     */
    int insert(Product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miniprogram_product
     *
     * @mbg.generated
     */
    int insertSelective(Product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miniprogram_product
     *
     * @mbg.generated
     */
    Product selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miniprogram_product
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miniprogram_product
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Product record);

    List<Product> list();

    List<Product> search(@Param("keyword") String keyword);
}
