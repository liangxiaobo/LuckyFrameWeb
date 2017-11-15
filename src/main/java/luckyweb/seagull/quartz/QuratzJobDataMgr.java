package luckyweb.seagull.quartz;

import org.apache.log4j.Logger;

import luckyweb.seagull.spring.entity.TestClient;
import luckyweb.seagull.spring.entity.TestJobs;

public class QuratzJobDataMgr
{
	private static final Logger	logger	= Logger.getLogger(QuratzJobDataMgr.class);

	public void addJobRunTime(TestJobs tj, int id) throws Exception
	{
		// 比较任务的开始时间和当前时间。如果是返回1，说明任务的开始时间是还没有过，如果返回2 说明任务的开时间应过去
		try
		{
			String startTime = tj.getStartTimestr();
			// String startTime=setStartTime(tj);
			QuartzManager.addJob(id + "*JOB", QuartzJob.class, startTime);
		}
		catch (Exception e)
		{
			logger.error(e);
			throw e;
		}
	}

	public void addTestClient(TestClient tc, int id) throws Exception
	{
		// 比较任务的开始时间和当前时间。如果是返回1，说明任务的开始时间是还没有过，如果返回2 说明任务的开时间应过去
		try
		{
			int checkTime = tc.getCheckinterval();
			String startTime="0/"+checkTime+" * * * * ?";
			QuartzManager.addJob(id + "*CLIENT", QuartzJob.class, startTime);
		}
		catch (Exception e)
		{
			logger.error(e);
			throw e;
		}
	}
	
}
