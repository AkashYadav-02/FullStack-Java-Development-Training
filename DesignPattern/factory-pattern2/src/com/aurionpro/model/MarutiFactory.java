package com.aurionpro.model;

public class MarutiFactory implements ICarFactory {
	private MarutiFactory() {
	};

//	 private 	TataFactory() {};
	private static MarutiFactory maruti;

	public static MarutiFactory getInstance() {

		if (maruti == null) {
			maruti = new MarutiFactory();
		}

		return maruti;

	}

	@Override
	public ICars makeCar() {
		// TODO Auto-generated method stub
		return new Maruti();
	}

}
