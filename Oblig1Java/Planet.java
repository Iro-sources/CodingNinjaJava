public class Planet {
	private String name;
	private int radius;
	private double mass;
	

	//Constructor
	Planet(String name, int radius, double mass){
	this.name = name;
	this.radius = radius;
	this.mass = mass;
} 

//Getters and setters
public String getName() {
		return name; }

public void setName(String name) {
	this.name = name;
}

public int getRadius() {
	return radius;
}
public void setRadius(int radius) {
	this.radius = radius;
}

public double getMass() {
	return mass;
}
public void setMass(double mass) {
	this.mass = mass;
}
}

