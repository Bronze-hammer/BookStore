package com.bookstore.dao;

import com.bookstore.pojo.Cart;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cart record);

    int insertSelective(Cart record);

    Cart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);

    Cart selectByUserIdProductId(@Param("userId") Integer userId, @Param("productId")Integer productId);

    List<Cart> selectCartByUserId(Integer userId);

    int selectCartProductCheckedStatusByUserId(Integer userId);

    int deleteByUserIdAndProductIds(@Param("userId")Integer userId,@Param("productIds") Iterable<String> productIds);

    int updateCheckedOrUnChecked(@Param("userId")Integer userId,@Param("productId" ) Integer productId,@Param("checked") Integer checked);

    int selectProductCountByUserId(Integer userId);

    List<Cart>  selectCheckedCartByUserId(Integer userId);


}