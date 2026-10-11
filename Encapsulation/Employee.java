class Employee{
	private int age;
	private String name;

	public void setAge(int age){
		if(age>18 && age<65)
		this.age=age;
	
		else{
			System.out.println("Invalid Age");
		}
	}

	public int getAge(){
		
	return age;
	}

	public void setName(String name){
		if(name.matches("[A-Za-z\s]+"))
		this.name=name;

		else{
			System.out.println("Invalid name");
		}
	}


	public String getName(){

	return name;
	}


			

}
	
		