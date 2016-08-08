package com.kdo.boot;

import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;

/**
 * Created by kdo on 16. 7. 29.
 */
public class SiteMeshConfigFilter extends ConfigurableSiteMeshFilter {
    /**
     * contentPath에 해당하는 decorator 설정
     *
     * @param builder
     */
    @Override
    protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
        builder.addDecoratorPath("/*", "/WEB-INF/layout/decorator.jsp");
    }
}
