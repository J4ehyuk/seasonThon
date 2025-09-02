package org.example.seasonthon.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI projectOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("SeasonThon Backend API")
                        .description("SeasonThon 프로젝트 REST API 문서")
                        .version("v1.0.0"));
    }
}