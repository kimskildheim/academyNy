package no.kds.academy.service;

import no.kds.academy.Util.TrainingSessionListManupulation;
import no.kds.academy.domain.TrainingSession;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataForMainPageService {

    Map<String, List<TrainingSession>> dataForView = new HashMap<>();

    @Autowired
    TrainingService trainingService;

    public  Map<String, List<TrainingSession>> dataForLastThreeTrainingSessions(){

        List<TrainingSession> listOfTrainingSessions = trainingService.findAllTrainingSessions();

        List<TrainingSession> lastThreeTrainingSessions = TrainingSessionListManupulation.listOutLastThreeTrainingsSessins(listOfTrainingSessions);
        dataForView.put("lastThreeTrainingSessions", lastThreeTrainingSessions);

        return dataForView;
    }
}
