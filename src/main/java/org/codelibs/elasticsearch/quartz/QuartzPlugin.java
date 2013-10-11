package org.codelibs.elasticsearch.quartz;

import java.util.Collection;

import org.codelibs.elasticsearch.quartz.module.ScheduleModule;
import org.codelibs.elasticsearch.quartz.service.ScheduleService;
import org.elasticsearch.common.collect.Lists;
import org.elasticsearch.common.component.LifecycleComponent;
import org.elasticsearch.common.inject.Module;
import org.elasticsearch.plugins.AbstractPlugin;

public class QuartzPlugin extends AbstractPlugin {
    @Override
    public String name() {
        return "QuartzPlugin";
    }

    @Override
    public String description() {
        return "This is a elasticsearch-quartz plugin.";
    }


    // for Service
    @Override
    public Collection<Class<? extends Module>> modules() {
        final Collection<Class<? extends Module>> modules = Lists
                .newArrayList();
        modules.add(ScheduleModule.class);
        return modules;
    }

    // for Service
    @SuppressWarnings("rawtypes")
    @Override
    public Collection<Class<? extends LifecycleComponent>> services() {
        final Collection<Class<? extends LifecycleComponent>> services = Lists
                .newArrayList();
        services.add(ScheduleService.class);
        return services;
    }
}
