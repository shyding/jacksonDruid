package cn.kiiwii.framework.service.impl;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.SerializerFactory;

//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(webEnvironment= WebEnvironment.DEFINED_PORT)
public class Mytest {

	ObjectMapper op = new ObjectMapper();
	
//	@BeforeClass
//	public static void init() {
//		System.setProperty("local.server.port", "222");
//	}
	@Value("${local.server.port}")
	private String port;
	
	@Value("${spring.aop.auto22:22}")
	private String aopAuto;
	
	{
		
	
		
		AnnotationAware aware = new AnnotationAware();
		
		op.setAnnotationIntrospector(aware);
		op.setSerializerFactory(op.getSerializerFactory().withSerializerModifier(new MyBeanSerializerModifier()));
		op.getSerializerProvider().setNullValueSerializer(new CustomNullSerializer());
		//op.getSerializerFactory().withSerializerModifier(new MyBeanSerializerModifier());
	}
	
	
	@Test
	public void test() throws JsonProcessingException {
		System.out.println("port:" + port);
		
		System.out.println("aopAuto:" + aopAuto);
		
		TestVo value  = new TestVo();
		String writeValueAsString = op.writeValueAsString(value);
		
		System.out.println("<<<<<<<==========>>>>>>:" + writeValueAsString);
	}

}
