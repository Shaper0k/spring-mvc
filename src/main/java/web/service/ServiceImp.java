package web.service;

import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServiceImp implements CarService{



    @Override
    public List<Car> getCars(int count) {
        List<Car> list = new ArrayList<>();
        list.add(new Car("BMW", 100, "red" ));
        list.add(new Car("Audi", 750,"black"));
        list.add(new Car("Porshe", 911, "yellow"));
        list.add(new Car("Reno", 500, "white" ));
        list.add(new Car("Ford", 756, "black"));
        return list.stream().limit(count).collect(Collectors.toList());
    }
}
