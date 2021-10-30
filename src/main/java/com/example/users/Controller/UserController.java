package com.example.users.Controller;
import com.example.users.Entity.User;
import com.example.users.Service.UserService;
import com.example.users.VO.ResponseTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
//@EnableEurekaClient
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id")
                                                            Long userId){
        for(int i = 0;i<10;i++){
            System.out.println( i + "" +userService.getUserWithDepartment(userId));
        }
        return userService.getUserWithDepartment(userId);
    }
}
