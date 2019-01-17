package com.atguigu.providerticket.controller;

import com.atguigu.providerticket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @date 2019-01-16 21:10
 */
@RestController
public class TicketController {

  @Autowired
  TicketService ticketService;

  @Value("${server.port}")
  private String port;

  @GetMapping("/ticket")
  public String getTicket(){
    System.out.println("------------serverport:"+port);
    return ticketService.getTicket()+port;
  }

}
