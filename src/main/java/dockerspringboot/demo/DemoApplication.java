package dockerspringboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication {
    @GetMapping("/koko")
    public List<String> getList(){

        List<String> res= new ArrayList<>();
        res.add("res 1");
        res.add("res 2");
        return res;

    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
