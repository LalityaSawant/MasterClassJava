package com.classes.lsawant;

public class Car {
	
	/*state
	 * member/class variables
	 * field variables or feilds
	 */
	private int doors;
	private int wheels;
	public String color; // just for example but not a good way to have it public
	private String engine;
	private String model;
	
	public void setModel (String model) { // String model here is called parameter
		//adding some prevalidation in setter is how we use setter and getter
		String validModel = model.toLowerCase();
		if (validModel.equals("sentra") || validModel.equals("altima")) {
		this.model = model; // this is the key words which means field variable
		} else {
			this.model = "Unknown";
		}
	}
	
	public String getModel() {
		return this.model; // "return is the key word and we are returning String variable here which is this.model"
	}
	
}
