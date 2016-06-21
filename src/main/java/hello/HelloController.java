package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The class flagged as <code>@RestController</code>, meaning it's ready to use by Spring MVC to
 * handle web requests. <code>@RestController</code> maps <code>'/'</code> to the <code>index()</code>
 * method. When invoked from a browser or using curl in command line, the method returns pure text.
 * That's because <code>@RestController</code> combines <code>@Controller</code> and <code>@ResponseBody</code>,
 * two annotations, that results in web requests returning data rather than a view.
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
