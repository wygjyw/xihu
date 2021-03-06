package com.demo.xihu;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.domain.User;
import com.demo.service.UserService;
import com.demo.xihu.LoginCommand;

@Controller
@RequestMapping(value = "/")
public class HomeController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login.html")
    public String loginPage() {
        return "login";
    }

    @RequestMapping(value = "/loginCheck.html")
    public ModelAndView loginCheck(HttpServletRequest request, LoginCommand loginCommand) {
        boolean isValidUser =
                userService.hasMatchUser(loginCommand.getUserName(),
                        loginCommand.getPassword());
        if (!isValidUser) {
            return new ModelAndView("login", "error", "�û������������");
        } else {
            User user = userService.findUserByUserName(loginCommand
                    .getUserName());
            user.setLastLogIP(request.getLocalAddr());
            user.setLastLogDate(new Date());
            userService.loginSuccess(user);
            request.getSession().setAttribute("user", user);
            return new ModelAndView("main");
        }
    }
}

