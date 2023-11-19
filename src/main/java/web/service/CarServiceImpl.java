package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Toyota", 1));
        cars.add(new Car("Nissan", 2));
        cars.add(new Car("Honda", 3));
        cars.add(new Car("Mazda", 4));
        cars.add(new Car("LADA", 5));
        cars.add(new Car("UAZ", 6));
        cars.add(new Car("UAZ BUHANKA", 7));

    }

    @Override
    public List<Car> getCars(int value) {
        if (value < 5) {
            return cars.stream().limit(value).toList();
        } else
            return cars;
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }
}
