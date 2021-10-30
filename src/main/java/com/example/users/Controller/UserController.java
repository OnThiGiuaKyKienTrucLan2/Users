package com.example.users.Controller;
import com.example.users.Entity.User;
import com.example.users.Service.UserService;
import com.example.users.VO.ResponseTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/users")
//@EnableEurekaClient
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    @Cacheable("Vinh")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id")
                                                            Long userId){
        return userService.getUserWithDepartment(userId);
    }
}
