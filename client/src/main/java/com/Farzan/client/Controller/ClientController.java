package com.Farzan.client.Controller;

import com.Farzan.client.DataModels.Request;
import com.Farzan.client.DataModels.Response;
import com.Farzan.client.Service.ClientServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/client")
@Slf4j
public class ClientController
{
    private final ClientServiceImpl service ;

    @Autowired
    public ClientController(ClientServiceImpl service)
    {
        this.service = service;
    }

    @PostMapping("/add")
    public ResponseEntity<Response> creat(@RequestBody Request request) throws Exception
    {
        try {
            Response response = service.createClient(request);
            log.info("New Client registered {}",request);
            return new ResponseEntity<>(response, HttpStatus.CREATED);

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }


}
