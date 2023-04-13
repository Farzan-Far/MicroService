package com.Farzan.client.Repository;


import com.Farzan.client.Domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repo extends JpaRepository<Client,String>
{

}
