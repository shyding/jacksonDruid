package cn.kiiwii;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.PropertySource;

public class ConsoleDomainPostrocessor implements EnvironmentPostProcessor, Ordered {

	@Override
	public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
		
		String port = "server.port";
		String property = environment.getProperty(port);
		System.out.println("getPort:" + property);
		
		 Map<String, Object> map = new HashMap<>(1);
         map.put("logging.level.org.apache.zookeeper", "error");
         map.put(port, "1000");
         PropertySource<?> source = new MapPropertySource("logLevelZk", map);
         environment.getPropertySources().addFirst(source);
		
	}

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return Ordered.HIGHEST_PRECEDENCE;
	}

}
