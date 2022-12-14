package in.phonebook.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.phonebook.binding.Contact;
@Repository
public interface ContactRepository extends JpaRepository<Contact,Integer>{
	
	public List<Contact> findByActiveStatus(String status);

}
