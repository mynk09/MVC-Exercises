package com.stackroute;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller

public class UserController {

    @RequestMapping("/welcome")
    public ModelAndView welcome(HttpServletRequest request, HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        User user = new User(id,name);

        ModelAndView modelview = new ModelAndView();
        modelview.setViewName("welcome.jsp");
        modelview.addObject("user",user.toString());

        return modelview;
    }
}