package bongda.Controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.security.Principal;

@Controller
public class UserController {
    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String adminPage(Model model, Principal principal) {
        return "admin/index";
    }

    @RequestMapping(value = {"/login","/"}, method = RequestMethod.GET)
    public String loginPage(Model model) {

        return "login/login";
    }
    @RequestMapping(value = "/trang-chu/home", method = RequestMethod.GET)
    public String trangchuPage(Model model, Principal principal) {
        return "web/index";
    }
    @RequestMapping(value = "/403", method = RequestMethod.GET)
    public String trangchuPage1(Model model, Principal principal) {
        return "403Page";
    }


}
