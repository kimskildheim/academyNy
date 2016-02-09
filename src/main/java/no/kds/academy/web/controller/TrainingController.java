package no.kds.academy.web.controller;

import no.kds.academy.domain.TrainingSession;
import no.kds.academy.repository.TrainingSessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import javax.validation.Valid;

@Controller
@RequestMapping("/training")
public class TrainingController {

        @Autowired
        TrainingSessionRepository trainingSessionRepository;

        @RequestMapping("/addTrainingSession")
        public String addTrainingSession(Model trainingSession) {
            trainingSession.addAttribute("trainingSession", new TrainingSession());
            return "/training/addTraining";
        }

        @RequestMapping("/save")
        public String save(@Valid TrainingSession newTrainingSession, BindingResult result, Model trainingSessionModel, RedirectAttributes redirect) {
            if (result.hasErrors()) {
                return "training/addTraining";
            }

            trainingSessionRepository.save(newTrainingSession);

            redirect.addFlashAttribute("globalMessage", String.format(
                    "Successfully created a new training session  with the title '%s'.", newTrainingSession.getTitle()));
            return "redirect:/";
        }
}


