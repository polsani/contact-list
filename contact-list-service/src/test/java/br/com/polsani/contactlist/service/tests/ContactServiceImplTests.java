package br.com.polsani.contactlist.service.tests;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

import br.com.polsani.contactlist.core.contracts.store.ContactStore;
import br.com.polsani.contactlist.core.domain.Contact;
import br.com.polsani.contactlist.service.ContactServiceImpl;;

public class ContactServiceImplTests {
	private final Contact CONTACT = new Contact(); 
	
	private List<Contact> contacts;
	private ContactServiceImpl subject;
	private ContactStore contactStore;

	@Before
	public void setup(){
		contacts = mock(List.class);
		
		contactStore = mock(ContactStore.class);
		when(contactStore.getAll()).thenReturn(contacts);
		
		subject = new ContactServiceImpl(contactStore);
	}
	
	@Test
	public void addMovie() {
		subject.addContact(CONTACT);

		verify(contactStore).addContact(CONTACT);
	}
	
	@Test
	public void getAll(){
		List<Contact> contacts = subject.getAll();

		verify(contactStore).getAll();
		Assert.assertEquals(contacts, this.contacts);		
	}
	
	@Test
	public void deleteContact() {
		subject.deleteContact(CONTACT);
		
		verify(contactStore).deleteContact(CONTACT);
	}
}
