package com.java.farzan.Controller;

import com.java.farzan.Response.checkResponse;
import com.java.farzan.Service.checkService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/check")
@Slf4j
@AllArgsConstructor
public class checkController
{
    private final checkService service;
    @GetMapping(path = "{id}")
    public checkResponse check(@PathVariable("id") String id)
    {
        boolean checkFraud = service.isFraudulentClient(id);
        return new checkResponse(checkFraud);
    }
}
