package edu.escuelaing.eiti.apispringbootrest.service;

import edu.escuelaing.eiti.apispringbootrest.data.User;
import edu.escuelaing.eiti.apispringbootrest.dto.UserDto;

import java.util.HashMap;
import java.util.List;

public interface UserService {
    User create(UserDto userDto );

    User findById( String id );

    List<User> all();

    Boolean deleteById( String id );

    User update( UserDto userDto, String userId );

}
