package com.ws.proxy;

import com.ws.proxy.model.UsersProxyDto;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import java.util.List;

@RegisterRestClient(configKey = "post-proxy")
public interface IUsersProxy {

    //https://gorest.co.in/public/v2/users/3221

    @GET
    @Path("users/{id}")
    UsersProxyDto getById(@PathParam("id") Long id);

    //https://gorest.co.in/public/v2/users
    @GET
    @Path("users")
    List<UsersProxyDto> getAll();
}
