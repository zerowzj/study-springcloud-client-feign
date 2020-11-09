package study.springcloud.named;

import org.springframework.cloud.context.named.NamedContextFactory;

public class MySpecification implements NamedContextFactory.Specification {

    private String name;

    private Class<?>[] configuration;

    public MySpecification(String name, Class<?>[] configuration){
        this.name = name;
        this.configuration = configuration;
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Class<?>[] getConfiguration() {
        return this.configuration;
    }
}
