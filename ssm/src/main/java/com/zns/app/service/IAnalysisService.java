package com.zns.app.service;

import java.util.LinkedHashMap;
import java.util.List;

public interface IAnalysisService {
	/**��Ŀ�������ݵ�json*/
	public String analysisData(); 
	
	/**��Ŀ�������ݵ�json*/
	public String analysisData(String userNo , Integer examId); 
	
	/**����*/
	public List<LinkedHashMap<String, Object>> orderFrom(Integer examId); 
	
	/**������Ϣ*/
	public List<LinkedHashMap<String, Object>> goodsVo(Integer examId);
	
	/**�ͻ���Ϣ*/
	public List<LinkedHashMap<String, Object>> customer(Integer examId); 
	
	/**·����Ϣ*/
	public LinkedHashMap<String, Object> line(Integer examId);
	
	/**·�߿ͻ���Ϣ*/
	public List<LinkedHashMap<String, Object>> lineCustom(Integer examId);
	
	/**��Ŀ�������*/
	public String analysisResult(String json);
	
	
	
}