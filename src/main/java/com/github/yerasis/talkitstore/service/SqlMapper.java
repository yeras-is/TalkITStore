package com.github.yerasis.talkitstore.service;

import java.util.Iterator;
import java.util.Map;

public class SqlMapper {
  public static <T> String sqlConstructor(T object, Map<String, Object> params) {
    StringBuilder builder = new StringBuilder();
    builder.append("select * from ");
    builder.append(object.getClass().getName().toLowerCase());
    if (params.isEmpty()) {
      return builder.toString();
    } else {
      builder.append(" where ");
      Iterator<String> keys = params.keySet().iterator();
      while (keys.hasNext()) {
        String temp = keys.next();
        builder.append(temp);
        builder.append("=");
        builder.append(params.get(temp));
        builder.append(" and ");
      }
      builder.replace(builder.length() - 5, builder.length(), "");
      return builder.toString();
    }
  }
}
