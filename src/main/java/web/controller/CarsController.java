package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {
    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Lada", "Priora", "XDF189S"));
        carList.add(new Car("Lada", "Kalina", "YTS872F"));
        carList.add(new Car("Nissan", "Qashqai", "GFD989V"));
        carList.add(new Car("BMW", "X5", "LJL179A"));
        carList.add(new Car("BMW", "M3", "BMW333M"));

        model.addAttribute("list", carService.getCarList(carList, count));
        return "cars";
    }

}
