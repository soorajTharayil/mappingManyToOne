package manytoone;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Train {
    @Id
	String trainName;

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
    
}
