package com.bitbrains;

public class Trainer {
	private String trainerName;

	public Trainer(String trainerName) {
		this.trainerName = trainerName;
	}
	
	public String getTrainerName() {
		return trainerName;
	}
	
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	
	@Override
	public String toString() {
		return this.trainerName;
	}
}
