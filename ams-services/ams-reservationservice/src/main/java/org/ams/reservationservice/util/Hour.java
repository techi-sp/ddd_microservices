package org.ams.reservationservice.util;

public enum Hour {

	ONE("1AM"), TWO("2AM"), THREE("3AM"), FOUR("4AM"), FUVE("5AM"), SIX("6AM"), SEVEN("7AM"), EIGHT("8AM"), 
	NINE("9AM"), TEN("10AM"), ELEVEN("11AM"), TWELEVE("12AM"), THIRTEEN("1PM"), FOURTEEN("2PM"), 
	FIFTEEN("3PM"), SIXTEEN("4PM"), SEVENTEEN("5PM"), EIGHTEEN("6PM"), NINETEEN("7PM"), 
	TWENTY("8PM"), TWENTYONE("9PM"), TWENTYTWO("10PM"), TWENTYTHREE("11PM"), TWENTYFOUR("12AM");
	
	private final String time;
	
	private Hour(String time) {
		this.time = time;
	}
	
	public String getTime() {
		return this.time;
	}

}
