package com.Farzan.client.Controller;

import com.Farzan.client.DataModels.Request;
import com.Farzan.client.DataModels.Response;
import com.Farzan.client.Domain.Client;
import com.Farzan.client.Service.ClientServiceImpl;
import com.sun.jdi.InternalException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.module.ResolutionException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/client")
@Slf4j
@AllArgsConstructor
public class ClientController
{
    private final ClientServiceImpl service ;

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
    @PostMapping("/find")
    public Optional<Client> findClient(@RequestBody Request request)
    {
        try {
            return service.findByNationalID(request.getNationalID());
        } catch (Exception e) {
            throw new InternalException(e.getMessage());
        }
    }

    @GetMapping("/all")
    public ResponseEntity<List<Client>> findAllClient() throws Exception {
        try {
            List<Client> clients = service.getAllclient();
            return new ResponseEntity<>(clients,HttpStatus.OK);

        } catch (Exception e)
        {
            throw new Exception(e.getMessage());
        }
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Response> deleteClient(@RequestBody Request id)
    {
        try {
            Response response = service.deleteClient(id.getNationalID());
            return new ResponseEntity<>(response,HttpStatus.ACCEPTED);
        } catch (Exception e) {
            throw new ResolutionException(e.getMessage());
        }
    }

    @PostMapping("/update")
    public ResponseEntity<Response> updateClient(@RequestBody Request request)
            throws Exception
    {
        try {
            Response response = service.updateClient(request);
            return new ResponseEntity<>(response,HttpStatus.ACCEPTED);
        } catch (Exception e)
        {
            throw new Exception(e.getMessage());
        }
    }

}
