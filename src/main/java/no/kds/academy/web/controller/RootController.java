package no.kds.academy.web.controller;

import no.kds.academy.Util.TrainingSessionListManupulation;
import no.kds.academy.domain.TrainingSession;
import no.kds.academy.repository.TrainingSessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class RootController {

    @Autowired
    private TrainingSessionRepository trainingSessionRepository;

    @RequestMapping("/")
    public String index(Model model) {

        List<TrainingSession> listOfTrainingSessions = trainingSessionRepository.findAll();
        model.addAttribute("listOfTrainingSessions", listOfTrainingSessions);

        List<TrainingSession> lastThreeTraininsSessions = TrainingSessionListManupulation.listOutLastThreeTrainingsSessins(listOfTrainingSessions);
        model.addAttribute("lastThreeTrainingSessions",lastThreeTraininsSessions);

        return "index";
    }
}
