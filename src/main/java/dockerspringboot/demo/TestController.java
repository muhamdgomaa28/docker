package dockerspringboot.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {


    @Autowired
    private DepartmentRepository departmentRepository;

    @GetMapping("test1")
    public List<String> getList11(){

        List<String> res= new ArrayList<>();
        res.add("res 1");
        res.add("res 2");
        return res;

    }

    @GetMapping("/test")
    public List<String> getList(){

        List<String> res= new ArrayList<>();
        res.add("res 1");
        res.add("res 2");
        return res;

    }


    @GetMapping("/departments")
    public List<Department> getAllDepartmets() {
        return departmentRepository.findAll();
    }

}
