/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.teradata.prestomanager.agent.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.inject.Singleton;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import static javax.ws.rs.core.Response.Status;

@Path("/config")
@Api(description = "the config API")
@javax.annotation.Generated(
        value = "io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen",
        date = "2017-06-23T09:53:13.549-04:00")
@Singleton
public final class ConfigApi
{
    @GET
    @Produces({"text/plain"})
    @ApiOperation(value = "Get available configuration files")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Retrieved configuration", response = String.class)})
    public Response getConfig()
    {
        return Response.status(Status.NOT_IMPLEMENTED).build();
    }

    @GET
    @Path("/{file}")
    @Produces({"text/plain"})
    @ApiOperation(value = "Get configuration by file")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Retrieved file", response = String.class),
            @ApiResponse(code = 404, message = "Resource not found")})
    public Response getConfigFile(
            @PathParam("file") @ApiParam("The name of a file") String file)
    {
        return Response.status(Status.NOT_IMPLEMENTED).build();
    }

    @POST
    @Path("/{file}")
    @ApiOperation(value = "Replace this file with the file at the given URL")
    @ApiResponses(value = {
            @ApiResponse(code = 202, message = "Acknowledged request"),
            @ApiResponse(code = 409, message = "Request conflicts with current state")})
    public Response setConfigFileByURL(
            @PathParam("file") @ApiParam("The name of a file") String file,
            String url)
    {
        return Response.status(Status.NOT_IMPLEMENTED).build();
    }

    @DELETE
    @Path("/{file}")
    @ApiOperation(value = "Delete a configuration file")
    @ApiResponses(value = {
            @ApiResponse(code = 202, message = "Acknowledged request"),
            @ApiResponse(code = 404, message = "Resource not found"),
            @ApiResponse(code = 409, message = "Request conflicts with current state")})
    public Response deleteConfigFile(
            @PathParam("file") @ApiParam("The name of a file") String file)
    {
        return Response.status(Status.NOT_IMPLEMENTED).build();
    }

    @GET
    @Path("/{file}/{property}")
    @Produces({"text/plain"})
    @ApiOperation(value = "Get specific configuration property")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Retrieved property", response = String.class),
            @ApiResponse(code = 404, message = "Resource not found")})
    public Response getConfigProperty(
            @PathParam("file") @ApiParam("The name of a file") String file,
            @PathParam("property") @ApiParam("A specific property") String property)
    {
        return Response.status(Status.NOT_IMPLEMENTED).build();
    }
}
