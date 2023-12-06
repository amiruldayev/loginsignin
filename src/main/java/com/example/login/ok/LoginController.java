package com.example.login.ok;

import com.example.login.Repository.UserRepository;
import com.example.login.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/signin")
    public String signin(){
        return "signin";
    }

    @PostMapping("/signin")
    public String sign(@RequestParam("name") String name,
                       @RequestParam("surname") String surname,
                       @RequestParam("login") String login,
                       @RequestParam("password") String password){
        User user = new User();
        user.setName(name);
        user.setSurname(surname);
        user.setLogin(login);
        user.setPassword(password);

        userRepository.save(user);
        return "redirect:/login";


    }
}
