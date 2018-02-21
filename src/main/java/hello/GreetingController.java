package hello;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
    
    @GetMapping("/home")
    public String getHome() {
        return "Hello World";
    }
    
    @GetMapping("/getCityNames")
    public List<String> getCitiesName() {
        
    	List<String> cities = new ArrayList();
    	
    	cities.add("Mumbai");
    	cities.add("Delhi");
    	cities.add("Chennai");
    	cities.add("Kolkata");
    	return cities;
    }
    
   
    
    
    
}
