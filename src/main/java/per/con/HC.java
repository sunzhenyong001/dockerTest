package per.con;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.reflect.generics.scope.MethodScope;

@RestController
public class HC {

    @RequestMapping("/s")
    public String s(){
        return "s";
    }
}
