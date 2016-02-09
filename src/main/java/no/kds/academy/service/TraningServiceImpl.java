package no.kds.academy.service;


import no.kds.academy.domain.TrainingSession;
import no.kds.academy.repository.TrainingSessionRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class TraningServiceImpl implements TrainingService{

    @Autowired
    private TrainingSessionRepository trainingSessionRepository;

    public Iterable<TrainingSession> findAllTrainingSessions() {
        return trainingSessionRepository.findAll();
    }
}
