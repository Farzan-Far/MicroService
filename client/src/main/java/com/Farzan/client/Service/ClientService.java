package com.Farzan.client.Service;

import com.Farzan.client.DataModels.Request;
import com.Farzan.client.DataModels.Response;
import org.springframework.stereotype.Component;

@Component
public interface ClientService
{
    Response createClient(Request request);
}
