package egmsa.mye.mis.core;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path(value="/mye/mis/vm")
public class VmManager {

	
	@GET
	@Path(value="/list")
	@Produces("application/json")
	public Response list(){
		String response= "{\"rc\":0}";
		return Response.ok(response, MediaType.APPLICATION_JSON).build();
	}
}
