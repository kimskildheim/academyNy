package no.kds.academy.service;

import no.kds.academy.Util.TrainingSessionListManupulation;
import no.kds.academy.domain.TrainingSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DataForMainPageService {

    @Autowired
    TrainingService trainingService;

    Map<String, List<TrainingSession>> dataForView = new HashMap<>();

    public Map<String, List<TrainingSession>> getTrainingSessionData(){
        dataForLastThreeTrainingSessions();
        dataFromAllTrainingSessions();

        return dataForView;
    }

    private  Map<String, List<TrainingSession>> dataForLastThreeTrainingSessions(){
        List<TrainingSession> listOfTrainingSessions = trainingService.findAllTrainingSessions();
        List<TrainingSession> lastThreeTrainingSessions = TrainingSessionListManupulation.listOutLastThreeTrainingsSessins(listOfTrainingSessions);
        dataForView.put("lastThreeTrainingSessions", lastThreeTrainingSessions);

        return dataForView;
    }

    private Map<String, List<TrainingSession>> dataFromAllTrainingSessions(){
        List<TrainingSession> listOfTrainingSessions = trainingService.findAllTrainingSessions();
        dataForView.put("listOfTrainingSessions", listOfTrainingSessions);

        return dataForView;
    }

    public Map<String, String> getTodayDate(){
        Map<String, String> dateForView = new HashMap<>();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
        Calendar calendar = Calendar.getInstance();
        dateForView.put("today", dateFormat.format(calendar.getTime()));
        return dateForView;
    }

}
