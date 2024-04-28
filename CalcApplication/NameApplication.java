package CalcApplication;

public class NameApplication {

	private String name;
	
	public void setName(String myName) {
		this.name = myName;
	}
	
	public String getName() {
		return name;
	}
	
	public String showName() {
		System.out.println("\nOlá " + this.name);
		return name;
	}
	
	
	
}
