package ru.javaops.bootjava.restaurantvoting;

import lombok.AllArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.javaops.bootjava.restaurantvoting.repository.RestaurantRepository;
import ru.javaops.bootjava.restaurantvoting.repository.UserRepository;

@SpringBootApplication
@AllArgsConstructor
public class RestaurantVotingApplication implements ApplicationRunner {
    private UserRepository userRepository;
    private RestaurantRepository restaurantRepository;

    public static void main(String[] args) {
        SpringApplication.run(RestaurantVotingApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
      //  System.out.println(userRepository.findByLastNameContainingIgnoreCase("last"));
        System.out.println(restaurantRepository.findByRestaurantIgnoreCase("restaurant"));
    }
}
