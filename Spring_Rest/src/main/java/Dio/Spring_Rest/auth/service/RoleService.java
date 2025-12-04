package Dio.Spring_Rest.auth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Dio.Spring_Rest.auth.entity.Role;
import Dio.Spring_Rest.auth.repository.RoleRepository;

@Service
public class RoleService {

    @Autowired
    private RoleRepository repository;

    public Role save(Role role){
        
        return repository.save(role);
        
    }

    public Role findById(Long id){

        return repository.findById(id).orElse(null);
    }

    public List<Role> findAll(){
        return repository.findAll();
    }
}
