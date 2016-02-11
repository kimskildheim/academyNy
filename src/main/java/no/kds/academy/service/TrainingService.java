package no.kds.academy.service;

import no.kds.academy.domain.TrainingSession;

import java.util.List;

public interface TrainingService {

    List<TrainingSession> findAllTrainingSessions();

    void saveTrainingSession(TrainingSession trainingSession);
}
