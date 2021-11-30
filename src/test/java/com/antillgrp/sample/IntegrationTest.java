package com.antillgrp.sample;

import com.antillgrp.sample.JhipsterJSbootReactApp;
import com.antillgrp.sample.config.TestSecurityConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { JhipsterJSbootReactApp.class, TestSecurityConfiguration.class })
public @interface IntegrationTest {
}
