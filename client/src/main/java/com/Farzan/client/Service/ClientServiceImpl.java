package com.Farzan.client.Service;

import com.Farzan.client.DataModels.Request;
import com.Farzan.client.DataModels.Response;
import com.Farzan.client.Domain.Client;
import com.Farzan.client.Repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService
{
    private final Repo repository;

    @Autowired
    public ClientServiceImpl(Repo repository)
    {
        this.repository = repository;
    }

    @Override
    public Response createClient(Request request)
    {

        Client client = Client.builder().
                        name(request.name()).
                        family(request.family()).
                        nationalID(request.nationalID()).
                        email(request.email()).
                        build();

        repository.save(client);

        return new Response("New Client has been Registered");

    }
}
