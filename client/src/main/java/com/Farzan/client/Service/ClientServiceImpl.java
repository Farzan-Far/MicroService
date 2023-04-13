package com.Farzan.client.Service;

import com.Farzan.client.DataModels.Request;
import com.Farzan.client.DataModels.Response;
import com.Farzan.client.Domain.Client;
import com.Farzan.client.Repository.Repo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.module.ResolutionException;
import java.util.List;
import java.util.Optional;

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

        Client client = new Client();

        client.setName(request.getName());
        client.setFamily(request.getFamily());
        client.setNationalID(request.getNationalID());
        client.setEmail(request.getEmail());
        client.setCountry(request.getCountry());

        repository.save(client);

        return new Response("New Client has been Registered");
    }
    @Override
    public Optional<Client> findByNationalID(String id)
    {
        return repository.findById(id);
    }

    @Override
    public List<Client> getAllclient()
    {
        return repository.findAll();
    }

    @Override
    public Response deleteClient(String id)
    {
        if (repository.getById(id).getNationalID().equals(id))
        {
            repository.deleteById(id);
        }
        else throw new ResolutionException();
        return new Response("The Client has been deleted");
    }

    @Override
    public Response updateClient(Request request) throws Exception
    {
        Optional<Client> client = repository.findById(request.getNationalID());
        if (client.isPresent())
        {
            Client client1 = client.get();

            client1.setName(request.getName());
            client1.setFamily(request.getFamily());
            client1.setNationalID(request.getNationalID());
            client1.setEmail(request.getEmail());
            client1.setCountry(request.getCountry());

            repository.save(client1);
        }
        else throw new Exception();

        return new Response("The Client has been updated.");
    }
}
