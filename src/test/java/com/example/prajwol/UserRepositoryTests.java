package com.example.prajwol;

import com.example.prajwol.entity.User;
import com.example.prajwol.repository.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;
import java.util.Optional;

@DataJpaTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UserRepositoryTests {
    @Autowired
    private UserRepository userRepository;
    @Test
    @Order(1)
    @Rollback(value = false)
    public void saveUserTest() {
        User user = User.builder()
                .firstName("Ram")
                .lastName("Karki")
                .email("karki@gmail.com")
                .password("test123")
                .build();
        userRepository.save(user);
        Assertions.assertThat(user.getId()).isGreaterThan(0);
    }

    @Test
    @Order(2)
    public void findByIdTest(){
        User user = userRepository.findById(1).get();
        Assertions.assertThat(user.getId()).isEqualTo(1L);
    }

    @Test
    @Order(3)
    public void getListOfUserTest(){
        List<User> userList = userRepository.findAll();
        Assertions.assertThat(userList).isNotNull();
    }

    @Test
    @Order(4)
    @Rollback(value = false)
    public void updateUserTest(){
        User user = userRepository.findById(1).get();
        user.setEmail("ramkarki@gmail.com");
        userRepository.save(user);
        Assertions.assertThat(user.getEmail()).isEqualTo("ramkarki@gmail.com");
    }

    @Test
    @Order(5)
    @Rollback(value = false)
    public void deleteUserTest(){
        User user = userRepository.findById(1).get();
        userRepository.delete(user);
        User user1 = null;
        Optional<User> optionalCustomer = userRepository.getUserByEmail("binodlamichhane@gmail.com");
        if(optionalCustomer.isPresent()){
            user1 = optionalCustomer.get();
        }
        Assertions.assertThat(user1).isNull();
    }
}
