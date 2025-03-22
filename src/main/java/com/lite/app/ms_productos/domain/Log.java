package com.lite.app.ms_productos.domain;

import java.util.HashMap;

import lombok.Data;
import net.logstash.logback.argument.StructuredArgument;
import static net.logstash.logback.argument.StructuredArguments.entries;

@Data
public class Log {
    private String idProducto;
    private String description;

    public Log(String idProducto, String description) {
        this.idProducto = idProducto;
        this.description = description;
    }
   

   public StructuredArgument getValues() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("idProducto", idProducto);
        map.put("description", description);
		return entries(map);
   }
    
}
