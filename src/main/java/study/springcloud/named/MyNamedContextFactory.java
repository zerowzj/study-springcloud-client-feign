package study.springcloud.named;

import org.springframework.cloud.context.named.NamedContextFactory;

public class MyNamedContextFactory extends NamedContextFactory<MySpecification> {

    public MyNamedContextFactory() {
        super(TestContextAutoConfiguration.class, "testcontext", "testcontext.name");
    }
}
