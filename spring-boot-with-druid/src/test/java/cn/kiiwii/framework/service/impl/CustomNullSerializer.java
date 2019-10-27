package cn.kiiwii.framework.service.impl;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class CustomNullSerializer extends StdSerializer<Object> {

   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public CustomNullSerializer() {
        this(null);
   }

   public CustomNullSerializer(Class<Object> t) {
        super(t);
   }

   @Override
   public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeString("N/A");
   }
}
