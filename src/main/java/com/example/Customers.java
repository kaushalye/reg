package com.example;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.example.model.Customer;
import com.example.model.PhoneNumber;

/**
 * Root resource (exposed at "customer" path)
 */
 
@Path("customers")
public class Customers {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    @Path("{id}")
    public Customer read(@PathParam("id") int id) {
        Customer customer = new Customer();
        customer.setId(id);
        customer.setName("Jane Doe");
         
        PhoneNumber pn = new PhoneNumber();
        pn.setType("work");
        pn.setValue("5551111");
        customer.getPhoneNumbers().add(pn);
         
        return customer;
     }
    
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String getThat() {
        return "Got post customers!";
    }
}
