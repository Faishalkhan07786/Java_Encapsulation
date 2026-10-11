class BankDriver{
	public static void main(String[] args){
		Bank b1=new Bank();
		b1.setName("Union Bank Of India");
		b1.setIfscCode("UBIN123");
		b1.setContact(8);

		System.out.println(b1.getName());
		System.out.println(b1.getIfscCode());
		System.out.println(b1.getContact());
	}
}
