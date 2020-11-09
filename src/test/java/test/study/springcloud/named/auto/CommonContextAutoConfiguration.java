//package test.study.springcloud.named.auto;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
//import org.springframework.boot.context.properties.EnableConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import test.study.springcloud.named.context.IContext;
//
//@Configuration
//@EnableConfigurationProperties
//public class CommonContextAutoConfiguration {
//
//    String client = "test0";
//
//    @Value("${testcontext.name:hello}")
//    String name;
//
//    @Bean
//    @ConditionalOnMissingBean
//    public IContext getTestContext() {
//        return new MyContextBean(client + ":" + name);
//    }
//}