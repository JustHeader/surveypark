package com.atguigu.surveypark.struts2.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.atguigu.surveypark.model.Survey;
import com.atguigu.surveypark.service.SurveyService;
@Controller
@Scope("prototype")
public class SurveyAction extends BaseAction<Survey>{

	private static final long serialVersionUID = 2438909978838628762L;
	@Resource
	private SurveyService surveyService; 

}
