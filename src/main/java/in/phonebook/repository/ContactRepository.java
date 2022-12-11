package in.phonebook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.phonebook.binding.Contact;

public interface ContactRepository extends JpaRepository<Contact,Integer>{

}
