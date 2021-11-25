package com.asodc.maven;

import org.apache.camel.builder.RouteBuilder;

public class ModuleB extends RouteBuilder {
    @Override
    public void configure() {
        from("timer:mytimer?fixedRate=true&period=5000")
                .log("This is Module A, using RouteBuilder Java DSL!");
    }
}
