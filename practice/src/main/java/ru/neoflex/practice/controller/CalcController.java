package ru.neoflex.practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

// Аннотация @RestController указывает, что данный класс является REST контроллером.
// Т.е. в данном классе будет реализована логика обработки клиентских запросов
@RestController
public class CalcController {

    // Аннотация @GetMapping указывает, что данный метод обрабатывает GET запросы по адресу /plus/{a}/{b}
    // {a} и {b} - это параметры, которые мы получаем в URL
    @GetMapping("/plus/{a}/{b}")
    public Integer plus(@PathVariable("a") Integer a, @PathVariable("b") Integer b) {
        // Возвращаем сумму параметров
        return a + b;
    }

    // Аннотация @GetMapping указывает, что данный метод обрабатывает GET запросы по адресу /minus/{a}/{b}
    // {a} и {b} - это параметры, которые мы получаем в URL
    @GetMapping("/minus/{a}/{b}")
    public Integer minus(@PathVariable("a") Integer a, @PathVariable("b") Integer b) {
        // Возвращаем разницу параметров
        return a - b;
    }
}
