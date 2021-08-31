package in.career.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.career.dao.ContactRepo;
import in.career.entity.Contact;

@Service
public class ContactService {

	@Autowired
	private ContactRepo ContRepo;

	public List<Contact> getAllContacts() {
		List<Contact> allContacts= ContRepo.findAll();
		return allContacts;
	}

	public Contact saveContact(Contact cont) {
		Contact con = ContRepo.save(cont);
		return con;
		
		
	}

	public void deleteContactByID(Integer id) {
		ContRepo.deleteById(id);
		
	}
		
	public Contact findContactById(Integer id) {
		Optional<Contact> findContById = ContRepo.findById(id);
		Contact con = findContById.get();
		return con;
	}

}
