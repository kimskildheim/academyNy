package no.ciber.academy.service;

import no.ciber.academy.domain.TrainingSession;

public interface TrainingService {

    Iterable<TrainingSession> findAllTrainingSessions();
}
