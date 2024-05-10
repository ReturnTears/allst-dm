package com.allst.dm.combat.example1;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Hutu
 * @since 2024-05-10 下午 10:32
 */
@Configuration
public class ParserConfig {
    @Bean("parserFactory")
    public FactoryBean serviceLocationFactoryBean() {
        ServiceLocatorFactoryBean factoryBean = new ServiceLocatorFactoryBean();
        factoryBean.setServiceLocatorInterface(ParserFactory.class);
        return factoryBean;
    }
}
