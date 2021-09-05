package web.service;

import model.Car;

import java.util.List;

public interface Service {
    Service getImpl = ServiceImp.carGet;

    List<Car> getCars(int count);
}
