package Dio.Spring_Rest.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Dio.Spring_Rest.auth.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
}
