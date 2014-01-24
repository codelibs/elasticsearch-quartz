package org.codelibs.elasticsearch.quartz;

import org.elasticsearch.ElasticsearchException;
import org.quartz.SchedulerException;

public class QuartzSchedulerException extends ElasticsearchException {

    private static final long serialVersionUID = 1L;

    public QuartzSchedulerException(final String msg, final Throwable cause) {
        super(msg, cause);
    }

    public QuartzSchedulerException(final SchedulerException cause) {
        this("Scheduler has an exception on this process.", cause);
    }

}
