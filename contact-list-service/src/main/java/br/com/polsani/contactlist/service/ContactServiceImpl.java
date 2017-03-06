package br.com.polsani.contactlist.service;

import java.util.List;

import br.com.polsani.contactlist.core.contracts.services.ContactService;
import br.com.polsani.contactlist.core.contracts.store.ContactStore;
import br.com.polsani.contactlist.core.domain.Contact;

public class ContactServiceImpl implements ContactService {
	
	ContactStore contactStore;
	
	public ContactServiceImpl(ContactStore contactStore) {
		this.contactStore = contactStore;
	}
	
	@Override
	public void addContact(Contact contact) {
		this.contactStore.addContact(contact);
	}

	@Override
	public List<Contact> getAll() {
		return this.contactStore.getAll();
	}

	@Override
	public void deleteContact(Contact contact) {
		this.contactStore.deleteContact(contact);
	}

}
