package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;

@Controller
public class CarController {

    private final CarDao carDao;

    public CarController(CarDao carDao) {
        this.carDao = carDao;
    }

    @GetMapping("/cars")
    public String listCars(Model model) {
        model.addAttribute("cars", carDao.getCarList());
        return "cars";
    }
    @GetMapping(value = "/cars", params = "count")
    public String listCars(@RequestParam int count, Model model) {
        if ((Integer)count !=null) {
            model.addAttribute("cars", carDao.showCount(count));
        }
        return "cars";
    }
}