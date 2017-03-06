package br.com.polsani.contactlist.core.contracts.services;

import java.util.List;
import br.com.polsani.contactlist.core.domain.Contact;;

public interface ContactService {
	void addContact(Contact contact);
	List<Contact> getAll();
	void deleteContact(Contact contact);
}
