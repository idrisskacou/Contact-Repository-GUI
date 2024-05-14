import java.io.Serializable;
// By Idriss Kacou
// Project: Contact Repository GUI interface 
// Create a Contact class 
public class Contact implements Serializable {

	// Define the information need it/ First name, last name, email address, phone number, home address, web-site, and note box
	public String firstName;
	public String lastName;
	public String email;
	public String phoneNumber;
	public String address;
	public String webAddress;
	public String notes;

	// Create the contract to pass the information 
	public Contact(String firstName, String lastName, String email, String phoneNumber, String address, String webAddress, String notes) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.webAddress = webAddress;
		this.notes = notes;
	}

	// Setting up my Set and Get 
	// Get first name 
	public String getFirstName() {
		return firstName;
	}

	// Set first name 
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	// Get last name 
	public String getLastName() {
		return lastName;
	}

	// Set last name 
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	// Get the email 
	public String getEmail() {
		return email;
	}

	// Set the email 
	public void setEmail(String email) {
		this.email = email;
	}

	// Get the phone number
	public String getPhoneNumber() {
		return phoneNumber;
	}

	// set phone number 
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	// get home address
	public String getAddress() {
		return address;
	}

	// set home address
	public void setAddress(String address) {
		this.address = address;
	}

	// get website
	public String getWebAddress() {
		return webAddress;
	}

	// set website 
	public void setWebAddress(String webAddress) {
		this.webAddress = webAddress;
	}

	// get notes
	public String getNotes() {
		return notes;
	}

	// set Notes
	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Override
	public String toString() {
		return firstName + " " + lastName;
	}

}
