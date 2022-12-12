package in.phonebook.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.phonebook.binding.Contact;
import in.phonebook.repository.ContactRepository;
import in.phonebook.service.ContactService;

@Service
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
		List<Contact> contacts=repo.findAll();
		return contacts;
	}

	@Override
	public Optional<Contact> getContactById(Integer contactId) {
		Optional<Contact> contact=repo.findById(contactId);
		if(contact.isPresent()){
			return contact;
		}else {
	        return null;		
		}
	
	}

	@Override
	public String updateContact(Contact contact) {
		if(repo.existsById(contact.getContactId())) {
			repo.save(contact);
		return "Update Success";
	}else {
		return "Record Not Updated";
	}
}

	@Override
	public String deleteContactById(Integer contactId) {
		if(repo.existsById(contactId)) {
			repo.deleteById(contactId);
			return "Record Deleted";
		}else {
		return "Record Not Available";
		}
		
	}

	
}
