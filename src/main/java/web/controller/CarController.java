package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.Service;


@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCar (@RequestParam (value = "count", required = false) Integer count , ModelMap model){

        Service carService = Service.getImpl;
        count = count == null ? 5 : count;
        model.addAttribute("cars",carService.getCars(count));

        return "cars";
    }
}
