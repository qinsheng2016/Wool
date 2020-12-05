package com.sqin.wool.controller;

import com.sqin.wool.entity.CreditCard;
import com.sqin.wool.mapper.CreditCardMapper;
import com.sqin.wool.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CreditCardController {

    @Autowired
    private LogService log;

    protected LogService getLogService() {
        return log;
    }

    @Autowired
    private CreditCardMapper creditCardMapper;

    @RequestMapping("/getCreditCardList")
    @ResponseBody
    public List<CreditCard> getCreditCardList(){
        List<CreditCard> creditCards = creditCardMapper.getCreditCardList();
        log.info(getClass(), creditCards.toString());
        return creditCards;
    }
}
