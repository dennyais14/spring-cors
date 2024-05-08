package com.develhope.cors01;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
@CrossOrigin(origins = "http://localhost:4210")
public class CorsController {
    @RequestMapping(method = RequestMethod.GET, path = "/name")
    public String getName(@RequestParam(value = "name", defaultValue = "default") String name) {
        return name;
    }

    @RequestMapping(method = RequestMethod.POST, path = "/name")
    public String postName(@RequestBody String name) {
        return new StringBuilder(name).reverse().toString();
    }
}