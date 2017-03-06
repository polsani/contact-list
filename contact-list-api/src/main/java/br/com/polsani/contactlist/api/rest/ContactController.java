package br.com.polsani.contactlist.api.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.polsani.contactlist.core.contracts.services.ContactService;
import br.com.polsani.contactlist.core.domain.Contact;
import br.com.polsani.contactlist.service.ContactServiceImpl;

@Path("/api/v1/contacts")
public class ContactController {

	private ContactService contactService;
	
	public ContactController() {
		contactService = new ContactServiceImpl();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addContact(Contact contact){
		this.contactService.addContact(contact);
		return Response.ok().build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Contact> getAll(){
		return this.contactService.getAll();
	}
	
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	public Response deleteContact(Contact contact) {
		this.contactService.deleteContact(contact);
		return Response.ok().build();
	}
}
