Elasticsearch Quartz
=======================

## Overview

Elasticsearch Quartz Plugin is a scheduler for Elasticsearch plugins.
In your Elasticsarch plugin, you can register a job and start it at a specified time.

## Installation

### Install Quartz Plugin

    $ $ES_HOME/bin/plugin -url file:$DOWNLOAD_DIR/elasticsearch-quartz-*.zip -install quartz

## Usage

Quartz plugin provides ScheduleService instance to DI container(Guice) of Elasticsearch.
Therefore, you can use scheduleService in your Service or River class as below:

    @Inject
    public WebRiver(final RiverName riverName, final RiverSettings settings,
        final Client client, final ScheduleService scheduleService) {
        ...

### Register Job

ScheduleService allows you to register your Job and Trigger of Quartz.

    scheduleService.schedule(job, trigger);

### Unregister Job

You can remove your job by group and job ID.

    scheduleService.unschedule(groupId, jobId);


