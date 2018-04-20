package com.example.quartz.dao;


import com.example.quartz.entity.JobAndTrigger;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobAndTriggerMapper {
	public List<JobAndTrigger> getJobAndTriggerDetails();
}
