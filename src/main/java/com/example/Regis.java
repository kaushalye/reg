package com.example;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.example.regis.model.AuthContext;

@Path("regis")
public class Regis {
	
	@GET
    @Produces({MediaType.APPLICATION_JSON})  
    public AuthContext read(){ 
		return new AuthContext("malinda", "pass", false);
	}
	
//	@POST
//    @Consumes(MediaType.APPLICATION_JSON)
//    @Produces({MediaType.APPLICATION_JSON}) 
//    public AuthContext auth(AuthContext ctx){
//		System.out.println("user="+ctx.getUser());
//		if(ctx.getUser().equals("malinda")){
//			ctx.setAuthenticated(true);
//		}else{
//			ctx.setAuthenticated(false);
//		}
//		return new AuthContext(ctx.getUser(), ctx.getPass(), ctx.isAuthenticated());
//	}
	
	@POST 
	@Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON}) 
    public AuthContext auth(AuthContext ctx){
		System.out.println("auth call");
 
		return new AuthContext("malinda", "pass", false);
	}
}
