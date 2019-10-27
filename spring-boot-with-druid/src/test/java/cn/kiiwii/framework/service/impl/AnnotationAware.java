package cn.kiiwii.framework.service.impl;

import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;

public class AnnotationAware extends JacksonAnnotationIntrospector {

	
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	   
	/*   @Override
	    public Object findNullSerializer(Annotated a)
	    {
	        JsonSerialize ann = _findAnnotation(a, JsonSerialize.class);
	        if (ann != null) {
	            @SuppressWarnings("rawtypes")
	            Class<? extends JsonSerializer> serClass = ann.nullsUsing();
	            if (serClass != JsonSerializer.None.class) {
	                return serClass;
	            }
	        }
	        return null;
	    }*/
}
