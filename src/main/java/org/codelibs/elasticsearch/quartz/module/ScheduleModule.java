package org.codelibs.elasticsearch.quartz.module;

import org.codelibs.elasticsearch.quartz.service.ScheduleService;
import org.elasticsearch.common.inject.AbstractModule;

public class ScheduleModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(ScheduleService.class).asEagerSingleton();
    }
}