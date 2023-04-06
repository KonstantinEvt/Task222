package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {
    private List<Car> carsIn = new ArrayList<>();

    {
        carsIn.add(new Car("model1", 1, 1));
        carsIn.add(new Car("model2", 2, 2));
        carsIn.add(new Car("model3", 3, 3));
        carsIn.add(new Car("model4", 4, 4));
        carsIn.add(new Car("model5", 5, 5));
    }

    @Override
    public List<Car> getCars(Long num) {
        return carsIn.stream().limit(num).toList();
    }
}
