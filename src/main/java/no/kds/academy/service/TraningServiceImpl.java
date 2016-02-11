package no.kds.academy.service;

import no.kds.academy.domain.TrainingSession;
import no.kds.academy.repository.TrainingSessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TraningServiceImpl implements TrainingService{

    @Autowired
    private TrainingSessionRepository trainingSessionRepository;


    public List<TrainingSession> findAllTrainingSessions() {
        return trainingSessionRepository.findAll();
    }

    public void saveTrainingSession(TrainingSession trainingSession) {
        trainingSessionRepository.save(trainingSession);
    }
}
