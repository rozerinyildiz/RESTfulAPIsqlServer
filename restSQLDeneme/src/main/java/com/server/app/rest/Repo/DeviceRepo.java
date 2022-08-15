package com.server.app.rest.Repo;

import com.server.app.rest.Models.Device;
import com.server.app.rest.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepo extends JpaRepository<Device, String> {
}
