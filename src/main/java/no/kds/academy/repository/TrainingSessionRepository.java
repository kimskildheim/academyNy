package no.kds.academy.repository;

import no.kds.academy.domain.TrainingSession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface TrainingSessionRepository extends JpaRepository<TrainingSession,Long>{
}
