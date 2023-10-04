package inheritance_encapsulation;

public class Car extends vehical {

	private int straring;
	private String braks;
	
	public Car() {
		// TODO Auto-generated constructor stub
		
		this.braks="yes";
		this.setStraring(1);
	}

	public int getStraring() {
		return straring;
	}

	public void setStraring(int straring) {
		this.straring = straring;
	}
	
	public void setbrake(String braks) {
		this.braks=braks;
	}

	public String getBraks() {
		return braks;
	}

	public void carmeth()
	{
		System.out.println("call car");
	}
}
