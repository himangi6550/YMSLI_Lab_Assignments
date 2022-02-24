package com.trainee.model.persistence.trainee;

import java.sql.*;
import java.util.*;

import org.hibernate.*;

import com.trainee.model.exceptions.DataAccessException;
import com.trainee.model.persistence.factory.HibernateSessionFactory;

public class TraineeDaoImpl implements TraineeDao {

	
	private SessionFactory factory;

	public TraineeDaoImpl() {
		factory = HibernateSessionFactory.getSessionFactory();
	}

	public Trainee addTrainee(Trainee trainee){
		Session session = factory.openSession();
		
				Transaction tx = session.getTransaction();
				try {
					tx.begin();
					session.save(trainee);
		
					tx.commit();
				} catch (HibernateException ex) {
					tx.rollback();
					throw new DataAccessException(ex);
				}
				session.close();
				return trainee;
	}

	public List<Trainee> getAll() {
		Session session = factory.openSession();
		List<Trainee> trainees=session
				.createQuery("select t from trainee t", Trainee.class)
				.getResultList();
		session.close();
		return trainees;
	}


}
