package no.ciber.academy;

import no.ciber.academy.domain.TrainingSession;
import no.ciber.academy.repository.TrainingSessionRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestTrainingSessionRepo {

    @Autowired
    private TrainingSessionRepository repository;


    @Test
    public void testRepo(){
        repository.saveAndFlush(new TrainingSession());
    }



//    repository. saveAndFlush(new RawData("test"));
//    System.out.println(repository.count());
}
