package com.java.farzan.Service;

import com.java.farzan.Domain.check;
import com.java.farzan.Repository.repo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class checkService
{
    private final repo repository;
    public boolean isFraudulentClient(String client)
    {
        repository.save(check.builder().
                clientNationalID(client).
                isFraudster(false).
                time(LocalDateTime.now())
                .build()
        );
        return false;
    }
}
