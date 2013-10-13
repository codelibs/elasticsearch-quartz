package org.codelibs.elasticsearch.quartz;

public class QuartzInterruptException extends QuartzSchedulerException {

    private static final long serialVersionUID = 1L;

    public QuartzInterruptException(final String msg, final Throwable cause) {
        super(msg, cause);
    }

}
