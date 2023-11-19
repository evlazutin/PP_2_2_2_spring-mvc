package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;


@Controller
public class CarController {

    @Autowired
    private CarServiceImpl carServiceImpl;

    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", required = false) Integer value, Model model) {
        if (value == null) {
            model.addAttribute("cars", carServiceImpl.getAllCars());
        } else
            model.addAttribute("cars", carServiceImpl.getCars(value));
        return "cars";
    }
}
