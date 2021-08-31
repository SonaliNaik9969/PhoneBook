package in.career.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.career.entity.Contact;

public interface ContactRepo extends JpaRepository<Contact, Integer> {

}
