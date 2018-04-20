package com.example.quartz.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

public class NewJob implements BaseJob{

    private static Logger _log = LoggerFactory.getLogger(NewJob.class);

    public NewJob() {

    }

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        _log.error("New Job执行时间: " + new Date());
    }
}
