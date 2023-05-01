package com.example.hundeklub.Repository;

import com.example.hundeklub.Model.TrainingTeamModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainingTeamRepository extends JpaRepository<TrainingTeamModel, String> {
}
