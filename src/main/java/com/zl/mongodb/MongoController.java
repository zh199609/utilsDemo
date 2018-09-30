/**
 * 
 */
package com.zl.mongodb;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.List;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.mongodb.core.DbCallback;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.mapreduce.GroupBy;
import org.springframework.data.mongodb.core.mapreduce.GroupByResults;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.BasicDBObject;
import com.mongodb.CommandResult;
import com.mongodb.DBObject;
import com.mongodb.MongoException;
import com.mongodb.client.DistinctIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.util.JSON;
import com.zl.time.TimeUtils;

/**
 * @author	zhanglei
 * @date	2018年8月23日
 * @Description	
 */
@RestController
public class MongoController {

	@Autowired
	private MongoTemplate mongoTemplate;
	
	@RequestMapping("/testmongo")
	public String test() {
		User user = new User("zl","1120");
		mongoTemplate.insert(user);
		return "SUCCESS";
	}
	
	
	@SuppressWarnings("deprecation")
	@RequestMapping("/getCount")
	public String getCount() {
		IndexDistill indexDistill = new IndexDistill();
		List distinct = mongoTemplate.getCollection("UserIdxDownloadLog").distinct("IndexCode");//指标个数
		
		LocalDate startDay = LocalDate.now().minusMonths(1).with(TemporalAdjusters.firstDayOfMonth());
		LocalDate endDay = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
		long start = TimeUtils.getTimestampByLocalDate(startDay)-1000000000;//上月第一天
		long end = TimeUtils.getTimestampByLocalDate(endDay);//该月第一天
		
		
		Query query = new Query();//指标提取量
		Criteria criteria = Criteria.where("Action").is(0).and("LastAccess").gte(start).lte(end);
		query.addCriteria(criteria);
		long count =  mongoTemplate.count(query, BasicDBObject.class,"UserIdxDownloadLog");
		
		indexDistill.setDate(LocalDate.now().minusMonths(1).toString());
		indexDistill.setNumber(distinct.size());
		indexDistill.setDistillNumber(count);
		System.out.println(indexDistill);
		return "SUCCESS";
	}
}
