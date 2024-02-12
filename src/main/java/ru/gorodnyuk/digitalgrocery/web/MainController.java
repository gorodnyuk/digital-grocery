package ru.gorodnyuk.digitalgrocery.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import ru.gorodnyuk.digitalgrocery.service.ProductService;

@Controller
@RequiredArgsConstructor
public class MainController {

    private final ProductService productService;

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
