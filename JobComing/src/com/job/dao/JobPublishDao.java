package com.job.dao;

import java.util.Date;
import java.util.List;

import com.job.bean.JobPublish;

public interface JobPublishDao extends QueryDao {
	//根据兼职发布对象插入一条兼职发布信息
	public int add(JobPublish jp);
	// 根据兼职信息编号删除一条兼职发布信息
	public int delete(int jobPublishId);
	//返回一条兼职信息
	public JobPublish getJobPublish(String hql, Object[] params);
	//返回一个兼职信息集合
	public List<JobPublish> getJobPublishList(String hql, Object[] params);
	//根据兼职信息编号返回一条兼职信息
	public JobPublish getJobPublish(int jobPublishId);
	//根据工作种类id返回多条兼职信息
	public List<JobPublish> getJobPublishList(int jobKindId);
	//根据用户id返回多条兼职信息
	public List<JobPublish>getJPListByUserId(int userId);
	//通过地址编号(省市区)返回多条兼职信息
	public List<JobPublish>getJPListByAddressNumber(int addressnumber);
	//根据地址编号(省市区)返回分页兼职信息
	public List<JobPublish>getJPByPage(int beginIndex,int pagesize,int addressNumber);
	//通过userId返回发布工作的集合
	public List<JobPublish>getJBListByUserId(int beginIndex,int pagesize,int userId);
	// 获取当天发布的信息
	public List<JobPublish>getJBListByToday(Date morningTime);
}
