package no.kds.academy;

import no.kds.academy.domain.TrainingSession;
import no.kds.academy.repository.TrainingSessionRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestTrainingSessionRepo {

    @Autowired
    private TrainingSessionRepository repository;


    @Test
    public void testRepo(){
        repository.saveAndFlush(new TrainingSession());
    }

}
