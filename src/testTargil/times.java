package testTargil;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/counter")
public class times {
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHtmlNumTimes(@QueryParam("num") int num, @QueryParam("text") String text) {
		String out = "<html> <body>";
		for (int i = 0; i < num; i++) {
			 out = out + "<h1>" + text + "</h1>";
		}
		out = out + "</body> </html>";
		return out;
	}
	
	
	

}
