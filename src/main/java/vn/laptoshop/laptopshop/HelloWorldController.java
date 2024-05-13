package vn.laptoshop.laptopshop;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HelloWorldController {
    @GetMapping("/")
    public String index() {
        return "hello";
    }
}
