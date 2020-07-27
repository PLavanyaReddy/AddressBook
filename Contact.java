class Contact
{
	String firstName;
	String lastName;
	String city;
	String state;
	String ZIP;
	String phoneNumber;
	public Contact(String firstName,String lastName,String city,String state,String ZIP,String phoneNumber)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.city=city;
		this.state=state;
		this.ZIP=ZIP;
		this.phoneNumber=phoneNumber;
	}
	public String toString()
	{
		return "FirstName:"+firstName+" LastName:"+lastName+" City:"+city+" State:"+state+" ZIP:"+ZIP+" PhoneNumber:"+phoneNumber;
	}
	
}