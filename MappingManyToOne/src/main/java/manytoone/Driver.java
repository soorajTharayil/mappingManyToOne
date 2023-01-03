package manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {

	public static void main(String[] args) {
	  
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Train train=new Train();
		train.setTrainName("Kanyakumari express");
		
		Passenger passenger=new Passenger();
		passenger.setPassengerName("Sooraj");
		passenger.setTrain(train);
		
		Passenger passenger2=new Passenger();
		passenger2.setPassengerName("Athul");
		passenger2.setTrain(train);
		
		Passenger passenger3=new Passenger();
		passenger3.setPassengerName("Arjun");
		passenger3.setTrain(train);
		
		entityTransaction.begin();
		entityManager.persist(train);
		entityManager.persist(passenger);
		entityManager.persist(passenger2);
		entityManager.persist(passenger3);
		entityTransaction.commit();

	}

}
