package com.java.farzan.check;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "check",
        url = "${feign.check.url}")
public interface CheckCustomer
{
    @GetMapping("api/v1/check/{id}")
    checkResponse check(
            @PathVariable("id") String id);
}
