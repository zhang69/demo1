package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Locale;

/**
 * Created by Administrator on 2018/1/16.
 */
@Controller
public class profileController {
    @RequestMapping("/profile")
    public String displayProfile(profileForm profileForm) {
        return "profile/profilePage";
    }
    @RequestMapping(value = "/profile", method = RequestMethod.POST)
    public String saveProfile(profileForm profileForm) {
        System.out.println("save ok" + profileForm);
        return "redirect:/profile";
    }
    @ModelAttribute("dateFormat")
    public String localeFormat(Locale locale) {
        return USLocalDateFormatter.getPattern(locale);
    }

}
