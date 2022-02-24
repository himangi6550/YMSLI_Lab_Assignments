package com.trainee.model.persistence.trainee;

import java.util.List;

import com.trainee.model.exceptions.DataAccessException;

public interface TraineeDao {
	public Trainee addTrainee(Trainee trainee) throws DataAccessException;
	public List<Trainee> getAll();
}