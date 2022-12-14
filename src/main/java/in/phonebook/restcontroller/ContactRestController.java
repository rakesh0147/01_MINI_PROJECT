package in.phonebook.restcontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.phonebook.binding.Contact;
import in.phonebook.service.ContactService;

@RestController
public class ContactRestController {
	@Autowired
	private ContactService service;
	
	@PostMapping("/contact")//http://localhost:8080/contact
	public String saveContact(@RequestBody Contact contact) {
		return service.saveContact(contact);
	}
	
	@GetMapping("/contacts")//http://localhost:8080/contacts
	public List<Contact> getAllContacts(){
		return service.getAllContacts();
	}
	@GetMapping("/contact/{contactId}")//http://localhost:8080/contact/2
	public Optional<Contact> GetContactById(@PathVariable Integer contactId) {
		return service.getContactById(contactId);
	}
	@PutMapping("/contact")//http://localhost:8080/contact
	public String updateContact(@RequestBody Contact contact) {
		return service.updateContact(contact);
	}
	@DeleteMapping("/contact/{contactId}")//http://localhost:8080/contact/1
	public String deleteContactById(@PathVariable Integer contactId) {
		return service.deleteContactById(contactId);
	}

}
