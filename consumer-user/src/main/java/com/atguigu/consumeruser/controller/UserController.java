package com.atguigu.consumeruser.controller;

import com.atguigu.consumeruser.feign.DcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description:
 * @date 2019-01-16 21:33
 */
@RestController
public class UserController {

  @Autowired
  RestTemplate restTemplate;

  @Autowired
  DcClient dcClient;


  @GetMapping("/buy")
  public String buyTicket(String name) {
    String forObject = restTemplate.getForObject("http://PROVIDER-TICKET/ticket", String.class);

    return name + " 购买了" +forObject;
  }


  @GetMapping("/buy2")
  public String buyTicket2(String name) {
    String consumer = dcClient.consumer();

    return name + " 购买了22" +consumer;
  }

}
