//package com.example.ext.config;
//
//import org.springframework.context.annotation.Bean;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//
///**
// * @author zhouxiaotao
// * @Description: swagger2配置文件 用时解开注释 @Configuration  @EnableOpenApi
// * @date 2023-11-15 9:20
// */
////@Configuration
////@EnableOpenApi
//public class SwaggerConfig {
//    /**
//     * Swagger文档扫描路径
//     */
//    public static final String SWAGGER_SCAN_BASE_PACKAGE = "com.example";
//
//    /**
//     * 创建Swagger文档Bean
//     *
//     * @return Swagger文档Bean
//     */
//    @Bean
//    public Docket api() {
//        return new Docket(DocumentationType.OAS_30).apiInfo(apiInfo()).select()
//                .apis(RequestHandlerSelectors.basePackage(SWAGGER_SCAN_BASE_PACKAGE))
//                .paths(PathSelectors.any()).build();
//    }
//
//    /**
//     * Swagger文档基本信息
//     *
//     * @return 基本信息
//     */
//    private ApiInfo apiInfo() {
//        return new ApiInfoBuilder().title("管理系统服务接口文档").version("0.0.1-SNAPSHOT").build();
//    }
//    /**
//     * swagger文档枚举校验
//     */
//    //@Bean
//    //public SwaggerDisplayEnumConfig swaggerDisplayEnumConfig() {
//    //    return new SwaggerDisplayEnumConfig();
//    //}
//
//}
