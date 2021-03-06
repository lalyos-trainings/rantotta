package com.eggs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

public class Menu {
    @Valid
    private Restaurant restaurant;
    private Map<String, Food> foodMap = new HashMap<String, Food>();

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Valid
    public List<Food> getFoodList() {
        ArrayList list = new ArrayList(foodMap.values());
        return list;
    }

    public void setFoods(List<Food> foodList) {
        for (Food food : foodList) {
            addFood(food);
        }
    }

    public void setFoodMap(Map<String, Food> foodMap) {
        this.foodMap = foodMap;
    }

    public void addFood(Food food) {
        foodMap.put(food.getId(), food);

    }
}
