package com.trainee.model.service.trainee;

import java.util.List;

import com.trainee.model.persistence.trainee.Trainee;

public interface TraineeService {
	public Trainee addTrainee(Trainee trainee);
	public List<Trainee> getAll();
}
