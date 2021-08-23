package edu.escuelaing.eiti.apispringbootrest.controller;

import edu.escuelaing.eiti.apispringbootrest.data.User;
import edu.escuelaing.eiti.apispringbootrest.dto.UserDto;
import edu.escuelaing.eiti.apispringbootrest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/v1/user" )
public class UserController
{
    private final UserService userService;

    public UserController( UserService userService )
    {
        this.userService = userService;
    }


    @GetMapping
    public ResponseEntity<List<User>> all()
    {
        //TODO implement this method using UserService
       return new ResponseEntity<>(userService.all(), HttpStatus.OK);
    }

    @GetMapping( "/{id}" )
    public ResponseEntity<User> findById(@PathVariable String id )
    {
        //TODO implement this method using UserService
        return new ResponseEntity<>(userService.findById(id), HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<User> create( @RequestBody UserDto userDto )
    {
        //TODO implement this method using UserService
        return new ResponseEntity<>(userService.create(userDto), HttpStatus.OK);
    }

    @PutMapping( "/{id}" )
    public ResponseEntity<User> update( @RequestBody UserDto userDto, @PathVariable String id )
    {
        //TODO implement this method using UserService
        return new ResponseEntity<>(userService.update(userDto,id), HttpStatus.OK);
    }

    @DeleteMapping( "/{id}" )
    public ResponseEntity<Boolean> delete( @PathVariable String id )
    {
        //TODO implement this method using UserService
        return new ResponseEntity<>(userService.deleteById(id), HttpStatus.OK);
    }
}
