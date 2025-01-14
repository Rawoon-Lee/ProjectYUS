package com.ssafit.yus.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.OAS_30)
				// ApiSelectorBuilder
				.select()
				// ApiSelectorBuilder
				.apis(RequestHandlerSelectors.basePackage("com.ssafit.yus.controller"))
				// ApiSelectorBuilder
				.paths(PathSelectors.ant("/**"))
				// Docket
				.build()
				.apiInfo(apiInfo());
	}
	
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				//  ApiInfoBuilder
				.title("SSAFIT YUS SWAGGER")
				.description("YUS에 필요한 api")
				.version("1.0")
				.build();
	}
}










