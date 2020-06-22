/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.world;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

/**
 *
 * @author kataoka
 */
@Controller("/hello")
public class HelloController {
    
    @Get(produces = MediaType.TEXT_PLAIN)
    public String index() {
        return "Hello World";
    }
    
}
