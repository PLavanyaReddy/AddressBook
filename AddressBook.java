import java.util.*;
public class AddressBook {
	static Scanner sc=new Scanner(System.in);
	ArrayList<Contact> contacts_list;
	public AddressBook()
	{
		contacts_list=new ArrayList<Contact>();
	}
    public void addContact()
    {
    	System.out.println("Enter the FirstName");
    	String firstName=sc.next();
    	System.out.println("Enter the LastName");
    	String lastName=sc.next();
    	System.out.println("Enter the City");
    	String city=sc.next();
    	System.out.println("Enter the State");
    	String state=sc.next();
    	System.out.println("Enter the ZIP");
    	String ZIP=sc.next();
    	System.out.println("Enter the PhoneNumber");
    	String phoneNumber=sc.next();
    	Contact contact=new Contact(firstName,lastName,city,state,ZIP,phoneNumber);
    	contacts_list.add(contact);
    	System.out.println("The contact is added");
    }
    public void deleteContact()
    {
    	if(contacts_list.size()==0)
    		System.out.println("The address book is empty");
    	System.out.println("Enter the FirstName of contact to be deleted:");
    	String delete_obj=sc.next();
    	boolean contactFound=false;
    	for(int i=0;i<contacts_list.size();i++)
    	{
    		if(contacts_list.get(i).firstName.equals(delete_obj))
    		{
    			contacts_list.remove(i);
    			contactFound=true;
    			System.out.println("Contact deleted");
    		}
    	}
    	if(contactFound==false)
    		System.out.println("No such contact exists");
    }
    public void searchContact()
    {
    	if(contacts_list.size()==0)
    		System.out.println("The address book is empty");
    	System.out.println("Enter the FirstName of the contact to be searched");
    	String search_contact=sc.next();
    	boolean contactFound=false;
    	for(Contact c:contacts_list)
    	{
    		if(c.firstName.equals(search_contact))
    		{
    			contactFound=true;
    			System.out.println(c);
    		}
    	}
    	if(contactFound==false)
    		System.out.println("No such contact exists");
    }
    public void editContact()
    {
        System.out.println("Enter the Firstname of the contact to be edited");
        String search_contact=sc.next();
        Contact contact; 
        int edit_field;
        String edit_content;
    	boolean contactFound=false;
    	for(Contact c:contacts_list)
    	{
    		if(c.firstName.equals(search_contact))
    		{
    			contactFound=true;
    			contact=c;
    			while(true)
            	{
        			System.out.println("Select the field to be edited:");
            		System.out.println("1.FirstName\n2.LastName\n3.City\n4.State\n5.ZIP\n6.PhoneNumber\n7.Done editing");
            		edit_field=sc.nextInt();
            		switch(edit_field)
            		{
            		   case 1:System.out.println("Enter the FirstName:");
            			      edit_content=sc.next();
            			      contact.firstName=new String(edit_content);
            			      break;
            		   case 2:System.out.println("Enter the LastName:");
     			              edit_content=sc.next();
     			              contact.lastName=new String(edit_content);
     			              break;
            		   case 3:System.out.println("Enter the City:");
			                  edit_content=sc.next();
			                  contact.city=new String(edit_content);
			                  break;
            		   case 4:System.out.println("Enter the State:");
		                      edit_content=sc.next();
		                      contact.state=new String(edit_content);
		                      break;
            		   case 5:System.out.println("Enter the ZIP:");
	                          edit_content=sc.next();
	                          contact.ZIP=new String(edit_content);
	                          break;
            		   case 6:System.out.println("Enter the PhoneNumber:");
                              edit_content=sc.next();
                              contact.phoneNumber=new String(edit_content);
                              break;
                       default:break;
            		}
            		if(edit_field==7)
            			break;
            	}
    		}
    	}
    	if(contactFound==false)
    		System.out.println("No such contact exists");
    }
    public void sortByLastName()
    {
    	Collections.sort(contacts_list,new LastNameComparator());
    }
    public void sortByZIP()
    {
    	Collections.sort(contacts_list,new ZIPComparator());
    }
    public void display()
    {
    	System.out.println("FirstNmae\tLastName\tCity\t\tState\t\tZIP\t\tPhoneNumber");
    	for(Contact c:contacts_list)
    		System.out.println(c.firstName+"\t\t"+c.lastName+"\t\t"+c.city+"\t\t"+c.state+"\t\t"+c.ZIP+"\t\t"+c.phoneNumber);
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddressBook addressBook=new AddressBook();
		int choice;
        outerloop:while(true)
        {
        	System.out.println("1.Add a contact\n2.Delete a contact\n3.Search a contact\n4.Edit a contact\n5.Sort by LastName\n6.Sort by ZIP\n7.Display\n8.Quit");
        	choice=sc.nextInt();
        	switch(choice)
        	{
        	  case 1:addressBook.addContact();
        	  		 break;
        	  case 2:addressBook.deleteContact();
        	         break;
        	  case 3:addressBook.searchContact();
        	         break;
        	  case 4:addressBook.editContact();
        	         break;
        	  case 5:addressBook.sortByLastName();
        	         addressBook.display();
                     break;
        	  case 6:addressBook.sortByZIP();
 	                 addressBook.display();
                     break;
        	  case 7:addressBook.display();
        	         break;
        	  default:break outerloop;
        	  		 
        	} 
        }
		
	}

}
