package in.phonebook.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
//@CrossOrigin
//@Api("Contact Rest Api")
public class ContactRestController {
	@Autowired
	private ContactService service;
     @GetMapping("/welcome")
     public String welcome(){
       return "Welcome";
     }
	
	//@ApiOperation("This API Save Contact Information")
	@PostMapping("/contact")//http://localhost:8080/contact
	public ResponseEntity<String> saveContact(@RequestBody Contact contact) {
		String saveContact = service.saveContact(contact);
		return new ResponseEntity<String>(saveContact,HttpStatus.CREATED);
	}
	//@ApiOperation("This API Get All Contact Information")
	@GetMapping("/contacts")//http://localhost:8080/contacts
	public List<Contact> getAllContacts(){
		return service.getAllContacts();
	}
	//@ApiOperation("This API Get Contact Information based on Given Id")
	@GetMapping("/contact/{contactId}")//http://localhost:8080/contact/2
	public Contact GetContactById(@PathVariable Integer contactId) {
		return service.getContactById(contactId);
	}
	//@ApiOperation("This API Update Contact Information")
	@PutMapping("/contact")//http://localhost:8080/contact
	public ResponseEntity<String> updateContact(@RequestBody Contact contact) {
		String updateContact = service.updateContact(contact);
		return new ResponseEntity<String>(updateContact,HttpStatus.CREATED);
	}
	//@ApiOperation("This API Delete Contact Information based on id")
	@DeleteMapping("/contact/{contactId}")//http://localhost:8080/contact/1
	public String deleteContactById(@PathVariable Integer contactId) {
		return service.deleteContactById(contactId);
	}

}
