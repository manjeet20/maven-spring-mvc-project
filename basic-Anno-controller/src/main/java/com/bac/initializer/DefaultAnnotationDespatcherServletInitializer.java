package com.bac.initializer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.bac.config.RootApplicationConfig;
import com.bac.config.WebMvcConfig;

public class DefaultAnnotationDespatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {RootApplicationConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {WebMvcConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"*.htm"};
	}

}
