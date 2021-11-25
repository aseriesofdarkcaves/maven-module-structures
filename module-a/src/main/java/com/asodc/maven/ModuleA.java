package com.asodc.maven;

import org.apache.camel.builder.endpoint.EndpointRouteBuilder;

public class ModuleA extends EndpointRouteBuilder {
    @Override
    public void configure() {
        from(timer("myTimer").fixedRate(true).period(5000))
                .log("This is Module A, using EndpointBuilder Endpoint-DSL!");
    }
}
