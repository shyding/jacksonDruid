package cn.kiiwii.framework.druid;

import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.JdkRegexpMethodPointcut;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.alibaba.druid.support.spring.stat.DruidStatInterceptor;

@Configuration
public class DruidAspectConfig {
	
	
	@Bean
	public DruidStatInterceptor druidStatInterceptor() {
		return new DruidStatInterceptor();
	   // return dsInterceptor;
	}
	@Bean
	public JdkRegexpMethodPointcut druidStatPointcut() {
	    JdkRegexpMethodPointcut pointcut = new JdkRegexpMethodPointcut();
	    pointcut.setPatterns("cn.kiiwii.framework.*.*.*");
	    return pointcut;
	}
	@Bean
	public DefaultPointcutAdvisor druidStatAdvisor(DruidStatInterceptor druidStatInterceptor, JdkRegexpMethodPointcut druidStatPointcut) {
	    DefaultPointcutAdvisor defaultPointAdvisor = new DefaultPointcutAdvisor();
	    defaultPointAdvisor.setPointcut(druidStatPointcut);
	    defaultPointAdvisor.setAdvice(druidStatInterceptor);
	    return defaultPointAdvisor;
	}

}
