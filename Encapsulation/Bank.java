class Bank{
	private String name;
	private String ifscCode;
	private int contact;

	public void setName(String name){
		if(name.matches("[A-Za-z\s]+"))
		this.name=name;

		else{
			System.out.println("Invalid Name");
		}
	}

	public String getName(){

	return name;
	}

	public void setIfscCode(String ifscCode){
		if(ifscCode.matches("[A-Z0-9]+$"))
		this.ifscCode=ifscCode;
		
		else{
			System.out.println("Invalid Ifsc Code");
		}
	}

	public String getIfscCode(){
		
	return ifscCode;
	}

	public void setContact(int contact){
		if(contact>=0 && contact<=9)
		this.contact=contact;

		else{
			System.out.println("Invalid Contact");
		}
	}

	public int getContact(){

	return contact;
	}


}