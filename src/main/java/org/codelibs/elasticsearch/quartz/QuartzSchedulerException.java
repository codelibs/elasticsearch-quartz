package org.codelibs.elasticsearch.quartz;

import org.elasticsearch.ElasticSearchException;
import org.quartz.SchedulerException;

public class QuartzSchedulerException extends ElasticSearchException {

    private static final long serialVersionUID = 1L;

    public QuartzSchedulerException(final String msg, final Throwable cause) {
        super(msg, cause);
    }

    public QuartzSchedulerException(final SchedulerException cause) {
        this("Scheduler has an exception on this process.", cause);
    }

}
