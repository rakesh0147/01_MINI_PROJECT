package in.phonebook.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import in.phonebook.binding.Contact;
import in.phonebook.repository.ContactRepository;
import in.phonebook.service.ContactService;

public class ContactServiceImpl implements ContactService{

	@Autowired
	private ContactRepository repo;
	
	@Override
	public String saveContact(Contact contact) {
        contact=repo.save(contact);
        if(contact.getContactId()!=null) {
        	return "Conatct Saveed Successfully";
        }else {
		return "Contact Not Saved";
        }
	}

	@Override
	public List<Contact> getAllContacts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact getContactById(Integer contactId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateContact(Contact contact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteContactById(Integer contactId) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
