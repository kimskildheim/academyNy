package no.kds.academy.Util;

import no.kds.academy.domain.TrainingSession;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TrainingSessionListManupulation {

   public static List<TrainingSession> listOutLastThreeTrainingsSessins(List<TrainingSession> allTrainingSessions) {
       if (allTrainingSessions.size() <= 0){
           return new ArrayList<>();
       }
       else if (allTrainingSessions.size() == 1) {
           return Arrays.asList(allTrainingSessions.get(0));
       }
       else if (allTrainingSessions.size() == 2) {
           return Arrays.asList(allTrainingSessions.get(0), allTrainingSessions.get(1));
       }
       else {
           return allTrainingSessions.subList(allTrainingSessions.size() - 3, allTrainingSessions.size());
       }
    }
}
