package no.kds.academy.service;

import no.kds.academy.domain.TrainingSession;

public interface TrainingService {

    Iterable<TrainingSession> findAllTrainingSessions();
}
