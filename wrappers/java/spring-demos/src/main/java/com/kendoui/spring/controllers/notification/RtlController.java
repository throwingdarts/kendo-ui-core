package com.kendoui.spring.controllers.notification;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("notification-templates-controller")
@RequestMapping(value="/web/notification/")
public class TemplatesController {
    
    @RequestMapping(value = {"/", "/rtl"}, method = RequestMethod.GET)
    public String index() {       
        return "web/notification/rtl";
    }    
}