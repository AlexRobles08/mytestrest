package com.alexrobles.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/healthcheck")
public class HealthCheck {

    @GET
    public Response check()
    {
        return Response.status(Response.Status.OK).entity("REST is alive").build();
    }
}
