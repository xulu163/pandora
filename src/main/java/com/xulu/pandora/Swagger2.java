package com.xulu.pandora;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author xulu
 * @date 2018/8/2
 * @link https://github.com/xulu163
 */
@Configuration
@EnableSwagger2
public class Swagger2 {
    @Bean
    public Docket createRestApi() {

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.xulu.pandora.controller"))
                .paths(PathSelectors.any())
                .build()
                .useDefaultResponseMessages(false);

    }
    private ApiInfo apiInfo() {
        Contact contact = new Contact(" xulu163 ", "https://github.com/xulu163/pandora", "");
        ApiInfo apiInfo = new ApiInfo("pandora APIs",//大标题
                "" +
                        "【使用说明】：" +
                        "普通调用使用 try catch，" +
                        "ajax调用使用error回调函数。</br>" +
                        "【业务异常返回值(JSON)】：" +
                        " status 业务异常状态码；" +
                        " error 标准异常信息；" +
                        " message 自定义异常信息；" +
                        " exception 异常类型；" +
                        " timestamp 时间戳。" +
                        "",//小标题
                "1.0",//版本
                "https://github.com/xulu163",
                contact,//作者
                "xulu163",//链接显示文字
                "https://github.com/xulu163"//网站链接
        );
        return apiInfo;
    }
}
