package com.example.demo.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Controler {

    @GetMapping("/")
    public String home( Model model) {
        model.addAttribute("title", "Laborghini - итальянская компания, производитель дорогих спортивных автомобилей под маркой Lamborghini. Находится в коммуне Сант-Агата-Болоньезе, около Болоньи. Компания основана в 1963 году Ферруччо Ламборгини; на тот момент он уже был владельцем крупной компании по производству тракторов.");
        return "home";


    }
    @GetMapping("VWE")
    public String VWE( Model model){
        model.addAttribute("vw" , "Volkswagen — немецкая автомобильная марка, одна из многих, принадлежащих концерну Volkswagen AG. Под этой маркой в 2019 году было реализовано 6 млн 620 тыс. автомобилей. Штаб-квартира — в Вольфсбурге. Там же находится и Автомузей Volkswagen");
        return "VWE";

}
//Описание класса

    class Person{

        String name = "никита";        // имя
        int age = 19;                 // возраст
        void displayInfo(){
            System.out.printf("Name: %s \tAge: %d\n", name, age);
        }
    }
}