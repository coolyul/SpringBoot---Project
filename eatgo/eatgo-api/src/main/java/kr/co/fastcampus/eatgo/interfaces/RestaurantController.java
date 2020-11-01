package kr.co.fastcampus.eatgo.interfaces;

import kr.co.fastcampus.eatgo.application.RestaurantService;
import kr.co.fastcampus.eatgo.domain.MenuItem;
import kr.co.fastcampus.eatgo.domain.MenuItemRepository;
import kr.co.fastcampus.eatgo.domain.Restaurant;
import kr.co.fastcampus.eatgo.domain.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestaurantController {



    @Autowired
    private RestaurantService restaurantService;

    @GetMapping("/restaurants")
    public List<Restaurant> list(){
        List<Restaurant> restaurants = restaurantService.getRestaurants();

        return restaurants;
    }


    @GetMapping("/restaurants/{id}")
    public Restaurant detail(@PathVariable("id") Long id){          // id가 1004일때 1004페이지 뜨게

        // 기본 정보 + 메뉴 정보를 한꺼번에 돌려주는 것
        Restaurant restaurant = restaurantService.getRestaurant(id);

//

        return restaurant;
    }
}