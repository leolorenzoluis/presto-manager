// Temporary file to add directory to git.
package com.teradata.prestomanager.controller;

import io.airlift.bootstrap.Bootstrap;
import io.airlift.discovery.client.DiscoveryModule;
import io.airlift.event.client.HttpEventModule;
import io.airlift.http.server.HttpServerModule;
import io.airlift.jaxrs.JaxrsModule;
import io.airlift.json.JsonModule;
import io.airlift.log.Logger;
import io.airlift.node.NodeModule;

class ControllerServer
{
    private static final Logger LOG = Logger.get(ControllerServer.class);

    private ControllerServer() {}

    public static void main(String[] args)
            throws Exception
    {
        // TODO: Replace placeholder properties with proper configuration
        System.setProperty("node.environment", "test");
        System.setProperty("http-server.http.port", "8081");
        System.setProperty("log.levels-file", "etc/log.properties");

        Bootstrap bootstrap = new Bootstrap(
                new NodeModule(),
                new DiscoveryModule(),
                new HttpServerModule(),
                new JsonModule(),
                new JaxrsModule(true), // requireExplicitBindings = true
                new HttpEventModule(),
                new ControllerServerModule()
        );

        try {
            bootstrap.strictConfig().initialize();
        }
        catch (Exception e) {
            LOG.error(e, "Error starting server");
        }
    }
}