package com.trainee.model.service.trainee;

import java.util.List;

import com.trainee.model.persistence.trainee.Trainee;
import com.trainee.model.persistence.trainee.TraineeDao;
import com.trainee.model.persistence.trainee.TraineeDaoImpl;

public class TraineeServiceImpl implements TraineeService{

	
	private TraineeDao traineeDao;
	public TraineeServiceImpl(){
		traineeDao=new TraineeDaoImpl();
	}
	
	
	public Trainee addTrainee(Trainee trainee) {
		return traineeDao.addTrainee(trainee);
	}

	public List<Trainee> getAll() {
		return traineeDao.getAll();
	}

	
}
