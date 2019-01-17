package com.atguigu.consumeruser.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description:
 * @date 2019-01-17 11:55
 */
@FeignClient("PROVIDER-TICKET")
public interface DcClient {

  @GetMapping("/ticket")
  String consumer();

}