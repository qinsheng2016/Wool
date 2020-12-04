package com.sqin.wool.mapper;

import com.sqin.wool.entity.CreditCard;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CreditCardMapper {

    List<CreditCard> getCreditCardList();

}
