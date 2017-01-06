package hu.schonherz.training.jpa.web;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "hu.schonherz.training.jpa" })
public class SpringWebContext extends WebMvcConfigurerAdapter {
    @Override
    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/WEB-INF/resources/");
    }

    @Override
    public void configureViewResolvers(final ViewResolverRegistry registry) {
        registry.viewResolver(new InternalResourceViewResolver("/WEB-INF/jsp/", ".jsp"));
    }
}
