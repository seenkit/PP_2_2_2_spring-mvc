package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("Lada", "Priora", "XDF189S"));
        carList.add(new Car("Lada", "Kalina", "YTS872F"));
        carList.add(new Car("Nissan", "Qashqai", "GFD989V"));
        carList.add(new Car("BMW", "X5", "LJL179A"));
        carList.add(new Car("BMW", "M3", "BMW333M"));
    }

    @Override
    public List<Car> getCarList(int count) {
        return carList.stream().limit(count).toList();
    }
}
