package cn.kiiwii.framework.service.impl;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class MyNullArrayJsonSerializer extends JsonSerializer<Object> {

  

	@Override
	public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers)
			throws IOException, JsonProcessingException {
		 if (value == null) {
	            gen.writeStartArray();
	            gen.writeEndArray();
	        } else {
	            gen.writeObject(value);
	        }
	}
}