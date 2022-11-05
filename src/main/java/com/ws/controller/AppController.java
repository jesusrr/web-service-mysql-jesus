package com.ws.controller;

import com.ws.business.IUsersBusiness;
import com.ws.model.dto.ErrorResponse;
import lombok.RequiredArgsConstructor;
import org.apache.http.HttpStatus;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/v1")
@RequiredArgsConstructor
public class AppController {

    @Inject
 //   @Named("PostBusiness")
    private final IUsersBusiness userBusiness;

    @GET
    @Path("/users/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response getUsersById(@PathParam("id") Long id) {
        try {
            return Response.ok().entity(userBusiness.finById(id)).build();
        }catch (Exception e){
            return Response.status(HttpStatus.SC_CONFLICT).entity(new ErrorResponse(e.getMessage())).build();
        }
    }
}