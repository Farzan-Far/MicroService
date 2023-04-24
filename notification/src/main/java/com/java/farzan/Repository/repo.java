package com.java.farzan.Repository;

import com.java.farzan.Domain.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repo extends JpaRepository<Notification, String>
{
}
