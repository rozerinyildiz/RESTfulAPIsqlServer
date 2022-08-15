package com.server.app.rest.Repo;

import com.server.app.rest.Models.DeviceLocation;
import com.server.app.rest.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceLocationRepo extends JpaRepository<DeviceLocation, Long> {
}
