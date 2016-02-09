package no.ciber.academy.service;


import no.ciber.academy.domain.TrainingSession;
import no.ciber.academy.repository.TrainingSessionRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class TraningServiceImpl implements TrainingService{

    @Autowired
    private TrainingSessionRepository trainingSessionRepository;

    public Iterable<TrainingSession> findAllTrainingSessions() {
        return trainingSessionRepository.findAll();
    }
}
