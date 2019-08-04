package com.yin.springboot.user.center.dialect;

import org.thymeleaf.dialect.AbstractProcessorDialect;
import org.thymeleaf.processor.IProcessor;
import org.thymeleaf.standard.StandardDialect;

import java.util.HashSet;
import java.util.Set;

public class Dialect extends AbstractProcessorDialect {
    private static final String DIALECT_NAME = "first Dialect";

    public Dialect() {
        super(DIALECT_NAME, "dia", StandardDialect.PROCESSOR_PRECEDENCE);
    }

    @Override
    public Set<IProcessor> getProcessors(String dialectPrefix) {
        Set<IProcessor> processors = new HashSet<IProcessor>();
        processors.add(new DiaProcessor(dialectPrefix));
        return processors;

    }
}
