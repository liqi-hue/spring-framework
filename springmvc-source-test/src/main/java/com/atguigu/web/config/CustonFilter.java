package com.atguigu.web.config;

import org.springframework.core.annotation.MergedAnnotation;
import org.springframework.core.annotation.MergedAnnotations;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;
import java.lang.annotation.Annotation;

/**
 * @author: liqi
 * @create 2021-07-09 8:13
 */

public class CustonFilter implements TypeFilter {
	@Override
	public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
		MergedAnnotations annotations = metadataReader.getAnnotationMetadata().getAnnotations();
		for (MergedAnnotation<Annotation> annotation : annotations) {
		}
		return false;
	}
}
