//package test.study.springcloud.named;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import test.study.springcloud.named.auto.CommonContextAutoConfiguration;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Configuration
//public class NamedContextFactoryCfg {
//
//    @Bean
//    public MyNamedContextFactory myNamedContextFactory() {
//        MyNamedContextFactory context = new MyNamedContextFactory();
//        MySpecification s1 = new MySpecification("test0", new Class[]{TestContextAutoConfiguration.class/*, CommonContextAutoConfiguration.class*/});
//        MySpecification s2 = new MySpecification("test1", new Class[]{Test1ContextAutoConfiguration.class/*, CommonContextAutoConfiguration.class*/});
//        MySpecification s3 = new MySpecification("default.common", new Class[]{CommonContextAutoConfiguration.class});
//        //
//        List<MySpecification> sLt = new ArrayList<>();
//        sLt.add(s1);
//        sLt.add(s2);
//        sLt.add(s3);
//        context.setConfigurations(sLt);
//        return context;
//    }
//
//}
