package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDao {
    private static List<Car> carList = new ArrayList<>();

     {
        carList.add(new Car("KIA", "black", 122200));
        carList.add(new Car("opel", "blue", 900000));
        carList.add(new Car("infinity", "red", 2002000));
        carList.add(new Car("hynday", "grey", 666000));
        carList.add(new Car("Lada", "gren", 222555));
    }

    public  List<Car> getCarList() {
        return carList;
    }
    public List<Car> showCount (int count){
         return carList.stream().limit(count).collect(Collectors.toList());
    }
}