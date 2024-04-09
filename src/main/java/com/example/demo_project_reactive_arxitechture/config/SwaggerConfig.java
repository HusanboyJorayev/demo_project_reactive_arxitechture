package com.example.demo_project_reactive_arxitechture.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(info = @Info(
        license = @License(
                url = "/student/**"
        )

),
        servers = @Server(
                url = "http://localhost:9090",
                description = "Reactive Demo Project"
        )
)
public class SwaggerConfig {
}
