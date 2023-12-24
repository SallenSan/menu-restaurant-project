package com.example.menu.controller;

import com.example.menu.food.Food;
import com.example.menu.food.FoodRepository;
import com.example.menu.food.FoodResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController// Which means that this class, will be a controller of the application
@RequestMapping("food")//is a versatile annotation in the Spring Framework used in controllers to map web requests to specific handler methods.
public class FoodController {
    /* In this controller, it's where is gonna be the requests
    which will enable us, add information and to get information
    from the database
     */
    @Autowired
    private FoodRepository repository;
    @GetMapping
    public List<FoodResponseDTO> getAll(){
        List<FoodResponseDTO> foodList = repository.findAll().stream().map(FoodResponseDTO::new).toList();
        return foodList;
    }

}
