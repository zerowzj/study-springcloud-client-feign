package test.study.springcloud.named;

import org.springframework.cloud.context.named.NamedContextFactory;

public class MyNamedContextFactory extends NamedContextFactory<MySpecification> {

    public MyNamedContextFactory() {
        //Class<?> defaultConfigType
        //String propertySourceName
        //String propertyName
        super(Context1AutoConfiguration.class, "testcontext", "testcontext.name");
    }
}
