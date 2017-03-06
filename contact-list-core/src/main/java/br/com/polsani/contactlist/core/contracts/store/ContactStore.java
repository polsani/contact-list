package br.com.polsani.contactlist.core.contracts.store;

import java.util.List;

import br.com.polsani.contactlist.core.domain.Contact;

public interface ContactStore {
	void addContact(Contact contact);
	List<Contact> getAll();
	void deleteContact(Contact contact);
}
