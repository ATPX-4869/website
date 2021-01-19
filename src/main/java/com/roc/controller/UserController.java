package com.roc.controller;


import com.roc.common.R;
import com.roc.entity.User;
import com.roc.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author killer
 * @since 2021-01-18
 */
@RestController
@AllArgsConstructor
@Slf4j
@RequestMapping("/user")
public class UserController {


    private final UserService userService;

    @PostMapping("/register")
    public R register(User user){
        return R.ok(userService.save(user));
    }

    @GetMapping("/getUser")
    public R getUser(Long id){
        int a=1/0;
        return R.ok(userService.getById(id));
    }

}

