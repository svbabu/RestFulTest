package com.java4s;
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
 
@Path("/customers")
public class RestServicePathParamJava4s {
	
	@GET
	@Path("{name}/{country}")
	@Produces("text/html")
	public Response getResultByPassingValue(
					@PathParam("name") String name,
					@PathParam("country") String country) {
		
		String output = "Customer name - "+name+", Country - "+country+""; 
		return Response.status(200).entity(output).build();
 
	}
}
//****By Sivateja _ www.Java4s.com******/