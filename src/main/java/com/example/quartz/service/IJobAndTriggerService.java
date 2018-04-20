package com.example.quartz.service;

import com.example.quartz.entity.JobAndTrigger;
import com.github.pagehelper.PageInfo;

public interface IJobAndTriggerService {

    public PageInfo<JobAndTrigger> getJobAndTriggerDetails(int pageNum, int pageSize);

}
