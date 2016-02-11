package no.kds.academy.web.controller;

import no.kds.academy.service.DataForMainPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RootController {

    @Autowired
    private DataForMainPageService dataForMainPageService;

    @RequestMapping("/")
    public String index(Model model) {

        model.addAllAttributes(dataForMainPageService.getTrainingSessionData());
        model.addAllAttributes(dataForMainPageService.getTodayDate());

        return "index";
    }
}
