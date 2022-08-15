package com.server.app.rest.Repo;

import com.server.app.rest.Models.Customer;
import com.server.app.rest.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, String> {
}
