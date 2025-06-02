package com.fourati.vanilla.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;

@Configuration
public class OpenApiConfig {

	private final String moduleName;
	private final String apiVersion;

	public OpenApiConfig(@Value("${application.title}") String moduleName, @Value("${application.version}") String moduleVersion) {
		this.moduleName = moduleName;
		this.apiVersion = moduleVersion;
	}

	@Bean
	OpenAPI customOpenAPI() {
		final String jwtSecuritySchemeName = "Bearer authorization";
		final String apiTitle = String.format("%s API", StringUtils.capitalize(moduleName));
		// Define JWT security scheme
		return new OpenAPI().addSecurityItem(new SecurityRequirement().addList(jwtSecuritySchemeName))
			.addSecurityItem(new SecurityRequirement())
			.components(new Components()
				.addSecuritySchemes(jwtSecuritySchemeName, new SecurityScheme().name(jwtSecuritySchemeName).type(SecurityScheme.Type.HTTP).scheme("bearer").bearerFormat("JWT"))
				).info(new Info().title(apiTitle).version(apiVersion));
	}

}
