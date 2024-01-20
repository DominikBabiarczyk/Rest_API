package pl.babiarczyk.appwithlogin_v2.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Example {
    @GetMapping("/login")
    public String method(){
        return "NumbersBetween";
    }
}
