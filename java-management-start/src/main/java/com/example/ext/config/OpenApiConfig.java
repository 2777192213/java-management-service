package com.example.ext.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhouxiaotao
 * @Description: swagger3配置文件
 * @date 2023-11-15 9:20
 */
@Configuration
public class OpenApiConfig {
    /**
     * swagger3
     */
    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("管理系统服务 API")
                        .description("Management system Service")
                        .version("v1.0.0")
                        .license(new License().name("").url("http://springdoc.org")))
                .externalDocs(new ExternalDocumentation()
                        .description("Management system Documentation")
                        .url("https://springshop.wiki.github.org/docs"));
    }

    /**
     * swagger文档枚举校验
     */
    //@Bean
    //public SwaggerDisplayEnumConfig swaggerDisplayEnumConfig() {
    //    return new SwaggerDisplayEnumConfig();
    //}

}
