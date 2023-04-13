package com.Farzan.client.Service;

import com.Farzan.client.DataModels.Request;
import com.Farzan.client.DataModels.Response;
import com.Farzan.client.Domain.Client;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface ClientService
{
    Response createClient(Request request);

    Optional<Client> findByNationalID(String id);

    List<Client> getAllclient();

    Response deleteClient(String id);

    Response updateClient(Request request) throws Exception;
}
