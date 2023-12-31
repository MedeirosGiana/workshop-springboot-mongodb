package com.workshop.mongodb.servicies;

import com.workshop.mongodb.domain.User;
import com.workshop.mongodb.dto.UserDTO;
import com.workshop.mongodb.repository.UserRepository;
import com.workshop.mongodb.servicies.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public User findById(String id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public User insert(User obj){
        return  repository.insert(obj);
    }
    public void delete(String id) {
        findById(id);
       repository.deleteById(id);
    }
    public User update(User obj){
        User newObj = findById(obj.getId());
        updateData(newObj,obj);
        return  repository.save(newObj);
    }

    private void updateData(User newObj, User obj) {
        newObj.setName(obj.getName());
        newObj.setEmail(obj.getEmail());
    }

    public User fromDTO(UserDTO objDTO){
        return  new User(objDTO.getId(),objDTO.getName(),objDTO.getEmail());
    }
}
