package dio.aula_spring_data_jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dio.aula_spring_data_jpa.model.User;
import dio.aula_spring_data_jpa.repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner{

    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        //insertUser();
        List<User> users = repository.findByNameContaining("Vinícius");
        for(User u: users){
            System.out.println(u);
        }

    }

    private void insertUser(){
        User user = new User();
        user.setName("Jão da Silva");
        user.setUserName("Jao");
        user.setPassword("456");
        repository.save(user);
    }

}
