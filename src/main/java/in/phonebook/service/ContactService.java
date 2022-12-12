package in.phonebook.service;

import java.util.List;
import java.util.Optional;

import in.phonebook.binding.Contact;

public interface ContactService {
	
	public String saveContact(Contact contact);
	
	public List<Contact> getAllContacts();
	
	public Optional<Contact> getContactById(Integer contactId);
	
	public String updateContact(Contact contact);
	
	public String deleteContactById(Integer contactId);

}
