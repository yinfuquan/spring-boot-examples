package com.yin.springbootswagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.servlet.http.HttpServletRequest;

@Configuration
@EnableSwagger2
public class Swagger2Config {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)

                //忽略参数
                .ignoredParameterTypes(HttpServletRequest.class)
                //组名，，，配置不同的组可以通过   再配置一个bean
                .groupName("测试")
                .apiInfo(apiInfo())
                .select()

                //.apis(RequestHandlerSelectors.withClassAnnotation(Controller.class))
                //.apis(RequestHandlerSelectors.withMethodAnnotation(RequestMapping.class))
                // .apis(RequestHandlerSelectors.any())
                .apis(RequestHandlerSelectors.basePackage("com.yin.springbootswagger.ctl"))
                // .paths(PathSelectors.ant("/test/**"))   一个*代表一级目录，**代表多级目录
                .paths(PathSelectors.any())
                .build();
    }


    @Bean
    public Docket createRestApi2() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("默认配置");
    }

        private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("swagger API 文档")
                .description("first API 网关接口")
                .termsOfServiceUrl("http://localhost:8012")
                .version("1.0.0")
                .build();
    }
}