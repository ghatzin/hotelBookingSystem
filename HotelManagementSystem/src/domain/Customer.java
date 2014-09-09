package domain;

/*
 * This class represents the customer entity and has all 
 * set and get methods for each field.
 */
public class Customer
{
	 private String customerId;
	 private String firstName;
	 private String lastName;
	 private String mobilePhone;
	 private String email;
	 private String address;

	 
	public Customer(String _customerId,String _firstName,String _lastName,String _mobilePhone,String _email,String _address)
	 {
		 
		
		 customerId=_customerId;
		 firstName=_firstName;
		 lastName=_lastName;
		 mobilePhone=_mobilePhone;
		 email=_email;
		 address=_address;
		
	 
	 }
	 
	 
	 public void setCustomerId(String _customerId)
	 {
		 customerId=_customerId;
	 }
	 
	 
	 public void setFirstname(String _firstName)
	 {
		
		 firstName=_firstName;
	 }
	 
	 public void setLastName(String _lastName)
	 {
		 
		 lastName=_lastName;
	 }
	 
	 public void setMobilePhone(String _mobilePhone)
	 {	 
		 mobilePhone=_mobilePhone;
	 }
	 
	 public void setEmail(String _email)
	 {
		 email=_email;
     
	 }
	 
	 public String getCustomerId()
	 {
		 return customerId;
	 }
	 
	 public String getFirstName()
	 {
		 return firstName;
	 }
	 
	 public String getLastName()
	 {
		 
		 return lastName;
	 }
	 
	 public String getMobilePhone()
	 {
		 
		 return mobilePhone;
	 }
	 
	 public String getAddress()
	 {
		 return address;
	 }
	 
	 public String getEmail()
	 {
		 
		 return email;
	 }
	 
	
}
