package com.trainee.web.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.trainee.model.persistence.trainee.Trainee;
import com.trainee.model.service.trainee.TraineeService;
import com.trainee.model.service.trainee.TraineeServiceImpl;

public class TraineeController {

	private static final long serialVersionUID = 1L;
	   
	private TraineeService traineeService=new TraineeServiceImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action= request.getParameter("action");
		if(action.equals("showall")) {
			List<Trainee> trainees=traineeService.getAll();
			request.setAttribute("trainees", trainees);
			request.getRequestDispatcher("showall.jsp").forward(request, response);
		}
		else if(action.equals("add")) {
			request.getRequestDispatcher("add.jsp").forward(request, response);
		}
		
			
			
			
		}
		
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		int id= Integer.parseInt(request.getParameter("id").trim());
		
		String name=request.getParameter("name");
		String branch=request.getParameter("branch");
		
		Double percentage=Double.parseDouble(request.getParameter("percentage"));
		
		Trainee trainee=new Trainee(name, branch, percentage);
		
		if(id==0) {
			traineeService.addTrainee(trainee);
		}
		
		response.sendRedirect("trainee.do?action=showall");
		
		
		
		
	}

}
