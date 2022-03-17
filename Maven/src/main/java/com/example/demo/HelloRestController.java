package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    @GetMapping("/{name}")
    public String sayHello(@PathVariable String name){
        return "Hello World, " + name;
    }
    @GetMapping("/converte/{numero}")
    public String numerosRomanos(@PathVariable int numero){
        String[] unidades = new String[]{"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String[] dezenas = new String[]{"","X","XX","XXX","XL","L","LX","LXX","XC"};
        String[] centenas = new String[]{"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] milhar = new String[]{"","M","MM","MMM"};

        return milhar[numero/1000] +
                centenas[(numero%1000)/100]+
                dezenas[(numero%100)/10] +
                unidades[numero%10];
    }


}
