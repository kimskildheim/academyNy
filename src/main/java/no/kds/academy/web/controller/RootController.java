package no.kds.academy.web.controller;

import no.kds.academy.Util.TrainingSessionListManupulation;
import no.kds.academy.domain.TrainingSession;
import no.kds.academy.service.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

@Controller
public class RootController {

    @Autowired
    private TrainingService trainingService;

    @RequestMapping("/")
    public String index(Model model) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
        Calendar calendar = Calendar.getInstance();
        model.addAttribute("today", dateFormat.format(calendar.getTime()));

        List<TrainingSession> listOfTrainingSessions = trainingService.findAllTrainingSessions();
        model.addAttribute("listOfTrainingSessions", listOfTrainingSessions);

        List<TrainingSession> lastThreeTrainingSessions = TrainingSessionListManupulation.listOutLastThreeTrainingsSessins(listOfTrainingSessions);
        model.addAttribute("lastThreeTrainingSessions",lastThreeTrainingSessions);

        return "index";
    }
}
