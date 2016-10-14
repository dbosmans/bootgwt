package be.dbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.io.IOException;

/**
 * Created by diederikbosmans on 14/05/16.
 */

@RestController
@EnableAutoConfiguration
public class Main  {


    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

   @RequestMapping(method = RequestMethod.POST, value = "/upload")
   public @ResponseBody String home(@RequestParam("zeFile") MultipartFile file) {

       try {
          return  "######" + new String(file.getBytes());
       } catch (IOException e) {
           return e.toString();
       }

    }
}
