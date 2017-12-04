package br.com.caelum.contas.config;

import br.com.caelum.contas.interceptor.AutorizadorInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author wagner on 04/12/17
 */

@Configuration
public class AppConfig extends WebMvcConfigurerAdapter {

    @Autowired
    AutorizadorInterceptor autorizadorInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(autorizadorInterceptor);
    }
}