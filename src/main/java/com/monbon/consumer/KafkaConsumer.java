package com.monbon.consumer;


import com.monbon.model.CookieVo;
import com.monbon.service.dao.NoCookieDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @Autowired
    NoCookieDAO noCookieDAO;

    @KafkaListener(topics="jhna-topic", containerFactory = "cookieVoKafkaListenerFactory")
    public void consumeJson(CookieVo cookieVo) {
        String name = cookieVo.getName();

        System.out.println("DB CONN >  " + noCookieDAO.test(cookieVo));
    }
}
