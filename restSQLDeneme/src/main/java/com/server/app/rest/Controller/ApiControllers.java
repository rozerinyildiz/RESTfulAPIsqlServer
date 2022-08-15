package com.server.app.rest.Controller;

import com.server.app.rest.Models.DeviceLocation;
import com.server.app.rest.Models.User;
import com.server.app.rest.Repo.CustomerRepo;
import com.server.app.rest.Repo.DeviceLocationRepo;
import com.server.app.rest.Repo.DeviceRepo;
import com.server.app.rest.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiControllers {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private DeviceRepo deviceRepo;

    @Autowired
    private DeviceLocationRepo deviceLocationRepo;

    // first connect the page, except this- / - get error
    @GetMapping(value = "/")
    public String getPage(){

        return "Welcome";
    }



    //get a list from users
    @GetMapping(value = "/users")
    public List<User> getUsers(){
        return userRepo.findAll();
    }

    @PostMapping(value = "/deviceLocations")
    public String saveDeviceLocation(@RequestBody DeviceLocation deviceLocation){
        deviceLocationRepo.save(deviceLocation);
        return "Saved device location...";
    }


    //add user
    @PostMapping(value = "/save")
    public String saveUser(@RequestBody User user){
        userRepo.save(user);
        return "Saved...";
    }
    /*
    //update user
    @PutMapping(value = "update/{id}")
    public String updateUser(@PathVariable String id, @RequestBody User user){
        User updateUser = userRepo.findById(id).get();
        updateUser.setFirstName(user.getFirstName());
        updateUser.setLastName(user.getLastName());
        updateUser.setOccupation(user.getOccupation());
        userRepo.save(updateUser);
        return "Updated...";
    }
    //delete user
    @DeleteMapping(value = "/delete/{id}")
    public String deleteUser(@PathVariable String id){
        User deleteUser = userRepo.findById(id).get();
        userRepo.delete(deleteUser);
        return "Delete user with the id: "+ id;

    }

     */
}
