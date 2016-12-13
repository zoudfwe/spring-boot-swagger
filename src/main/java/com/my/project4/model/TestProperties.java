package com.my.project4.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix="test")
@Component
public class TestProperties {
	//要使用properties中的定义属性，名称必须一样
	//properties中存在属性，则下面的属性值会被替换，可查看
	//application-dev.properties 中 定义  test.propertiesInApplication=MyTestDate
	public static String propertiesInApplication = "MyExampleDate";
	
	public static String getPropertiesInApplication(){
		return propertiesInApplication;
	}
	public void setPropertiesInApplication(String propertiesInApplication){
		TestProperties.propertiesInApplication = propertiesInApplication;
	}
}
