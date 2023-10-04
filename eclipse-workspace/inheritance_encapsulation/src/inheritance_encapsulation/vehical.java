package inheritance_encapsulation;

public class vehical<protect> {

	public String wheels;
	protected String fuel_tanck;
	public String light;
	
	
	public vehical() {
this.wheels="Four";
this.fuel_tanck="Full";
this.light="ON";
	}

	public static void main(String[] args) {
		
	Car c1=new Car();
	c1.getBraks();
	c1.carmeth();
	System.out.println(c1.getFuel_tanck());
	
	Bike b1=new Bike();
	System.out.println(b1.getLight());
	
		
		// TODO Auto-generated method stub

	}

	public String getWheels() {
		return wheels;
	}

	public void setWheels(String wheels) {
		this.wheels = wheels;
	}

	public String getFuel_tanck() {
		return fuel_tanck;
	}

	public void setFuel_tanck(String fuel_tanck) {
		this.fuel_tanck = fuel_tanck;
	}

	public String getLight() {
		return light;
	}

	public void setLight(String light) {
		this.light = light;
	}

}
