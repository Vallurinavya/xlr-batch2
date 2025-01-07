class Employee {

	protected int id;
	protected String firstName;
	protected String lastName;
	protected String address;
	
	public Employee(){}
	
	public Employee(int id, String firstName, String lastName, String address) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}
	
	public String getFullName(){
		return firstName+" "+lastName;
	}
	
	public void sendMessage(){
		System.out.println("Salary added successfully...");
	}	
}
