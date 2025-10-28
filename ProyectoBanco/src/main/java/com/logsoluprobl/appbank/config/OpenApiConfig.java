package com.logsoluprobl.appbank.config;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpenApiConfig {
    public OpenAPI bankOpenAPI(){
        return new OpenAPI()
            .info(new Info()
                .title("Mi app de banco")
                .description("Esta es la descripcion del proyecto")
                .version("1.0.0")
                .contact(new Contact()
                    .name("Juan Camilo")
                    .email("correo@ejemplo.com")
                    .url("https://url.de.proyecto.com"))
                .license(new License()
                    .name("Nombre de la licencia")
                    .url("https://urle.de.la.licencia.com")));
    }
}
