package edu.escuelaing.eiti.apispringbootrest.service;

import edu.escuelaing.eiti.apispringbootrest.data.User;
import edu.escuelaing.eiti.apispringbootrest.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
@Service
public class UserServiceHashMap implements UserService{

    private final HashMap<String,User> map= new HashMap<String, User>();

    @Override
    public User create(UserDto userDto) {
        User nuevo=new User(userDto.getName(),userDto.getEmail(),userDto.getLastName(),userDto.getCreatedAt());
        map.put(nuevo.getId(),nuevo);
        return nuevo;
    }

    @Override
    public User findById(String id) {
        User user= map.get(id);
        return user;
    }

    @Override
    public List<User> all() {
        return new ArrayList<>(map.values());
    }

    @Override
    public Boolean deleteById(String id) {
        User user= map.remove(id);
        return true;

    }

    @Override
    public User update(UserDto userDto, String userId) {
        User nuevo=new User(userDto.getName(),userDto.getEmail(),userDto.getLastName(),userDto.getCreatedAt());
        map.put(userId,nuevo);
        return nuevo;

    }
}
