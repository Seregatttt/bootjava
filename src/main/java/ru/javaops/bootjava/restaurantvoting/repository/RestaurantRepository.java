package ru.javaops.bootjava.restaurantvoting.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.transaction.annotation.Transactional;
import ru.javaops.bootjava.restaurantvoting.model.Restaurant;
import ru.javaops.bootjava.restaurantvoting.model.User;

import java.util.List;
import java.util.Optional;

@Transactional(readOnly = true)
public interface RestaurantRepository extends JpaRepository<Restaurant, Integer> {

    @RestResource(rel = "by-name", path = "by-name")
    @Query("SELECT u FROM Restaurant u WHERE lower(u.name) like LOWER(:name)")
    Optional<Restaurant> findByRestaurantIgnoreCase(String name);
}