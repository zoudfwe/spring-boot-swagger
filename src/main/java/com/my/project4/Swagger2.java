package com.my.project4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/*通过 @Configuration 注解，让Spring来加载该类配置。再通过 @EnableSwagger2 注解来启用Swagger2。*/
@Configuration
@EnableSwagger2
public class Swagger2 {
	/*通过 createRestApi 函数创建 Docket 的Bean之后， apiInfo() 用来创建该Api的基本信息（这些基本信息会展现在文档页面中）。
	 *  select() 函数返回一个 ApiSelectorBuilder 实例用来控制哪些接口暴露给Swagger来展现，
	 *  本例采用指定扫描的包路径来定义，Swagger会扫描该包下所有Controller定义的API，
	 *  并产生文档内容（除了被 @ApiIgnore 指定的请求）
	 */
	
	@Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.my.project4.apiController"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Spring Boot中使用Swagger2构建RESTful APIs")
                .description("更多Spring Boot相关文章请关注：http://blog.didispace.com/")
                .termsOfServiceUrl("http://blog.didispace.com/")
                .contact("程序猿DD")
                .version("1.0")
                .build();
    }
    
    /**
     * 可以定义多个组，比如本类中定义把test和demo区分开了
     * （访问页面就可以看到效果了）
     *
     */
   
   /* @SuppressWarnings("unchecked")
    @Bean
    public Docket testApi(){
       Docket docket = new Docket(DocumentationType.SWAGGER_2)
              .groupName("test")
              .genericModelSubstitutes(DeferredResult.class)
              .useDefaultResponseMessages(false)
                .forCodeGeneration(true)
                .pathMapping("/")// base，最终调用接口后会和paths拼接在一起
                .select()
                .paths(Predicates.or(PathSelectors.regex("/api/.*")))//过滤的接口
                .build()
                .apiInfo(testApiInfo());
              ;
       return docket;
    }
   
    @SuppressWarnings("unchecked")
    @Bean
    public Docket demoApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("demo")
                .genericModelSubstitutes(DeferredResult.class)
//              .genericModelSubstitutes(ResponseEntity.class)
                .useDefaultResponseMessages(false)
                .forCodeGeneration(false)
                .pathMapping("/")
                .select()
                .paths(Predicates.or(PathSelectors.regex("/demo/.*")))//过滤的接口
                .build()
                .apiInfo(demoApiInfo());
    }
   
     private ApiInfo testApiInfo() {
            ApiInfo apiInfo = new ApiInfo("Test相关接口",//大标题
                    "Test相关接口，主要用于测试.",//小标题
                    "1.0",//版本
                    "http://412887952-qq-com.iteye.com/",
                    "Angel",//作者
                    "北京知远信息科技有限公司",//链接显示文字
                    "http://www.kfit.com.cn/"//网站链接
            );
 
            return apiInfo;
        }
 
        private ApiInfo demoApiInfo() {
            ApiInfo apiInfo = new ApiInfo("Demo相关接口",//大标题
                    "Demo相关接口，获取个数，获取列表，注意：",//小标题
                    "1.0",//版本
                    "http://412887952-qq-com.iteye.com/",
                    "Angel",//作者
                    "北京知远信息科技有限公司",//链接显示文字
                    "http://www.kfit.com.cn/"//网站链接
            );
 
            return apiInfo;
        }*/
}
