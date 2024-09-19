package com.fran.curso.springboot.webapp;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

/**
 * Clase ValuesConfig
 */
@Configuration
@PropertySources({ @PropertySource(value = "classpath:values.properties") })
public class ValuesConfig {

}
