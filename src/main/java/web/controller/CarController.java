package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarServiceImp;



@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCar (@RequestParam (value = "count", required = false) Integer count , ModelMap model){

        CarServiceImp carServiceImp = new CarServiceImp();
        switch (count) {
            case 1:
                model.addAttribute("cars", carServiceImp.getCars(1));
                break;
            case 2:
                model.addAttribute("cars", carServiceImp.getCars(2));
                break;
            case 3:
                model.addAttribute("cars",carServiceImp.getCars(3));
                break;
            case 4:
                model.addAttribute("cars",carServiceImp.getCars(4));
                break;

            default:
                model.addAttribute("cars",carServiceImp.getCars(5));
                break;

        }
        return "cars";
    }
}
