package org.quizgame;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/packet")
@Produces(MediaType.APPLICATION_JSON)
public class PacketResource {

    @GET
    public Response testResponse() {
        return Response.ok()
                .entity("Hello, im a Quarkus Server with Angular Frontend")
                .header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
                .allow("OPTIONS").build();
    }
}
