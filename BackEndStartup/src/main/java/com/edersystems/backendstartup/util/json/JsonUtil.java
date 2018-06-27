/*
 *  Projeto.......: BackEndStartup
 *  Developer.....: Éder Luciano da Costa
 *  Copyright.....: 2018
 *  Criação.......: 26/06/2018, 22:16:49
 *  Revisao.......: $Rev:$, $Id:$
 *  Codificacão...: UTF-8 (Utilizado na criação do arquivo)
 *  @author.......: Luciano
 *  .....................................................................................
 *  Éder L. Costa - © Copyright 2018 - All Rights Reserved
 *  .....................................................................................
 */
package com.edersystems.backendstartup.util.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collection;

/**
 *
 * @author Luciano
 */
public final class JsonUtil
{
    private JsonUtil()
    {
    }

    public static ObjectMapper getObjectMapper()
    {
        ObjectMapper mapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        module.addSerializer(java.sql.Date.class, new DateSerializer());
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        mapper.canSerialize(Boolean.class);
        mapper.registerModule(module);
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, true);
        AnnotationIntrospector primary = new JacksonAnnotationIntrospector();
        AnnotationIntrospector secondary = new JacksonAnnotationIntrospector();
        AnnotationIntrospector pair = AnnotationIntrospectorPair.create(primary, secondary);
        mapper.setAnnotationIntrospector(pair);
        return mapper;
    }

    public static <T extends Serializable> T convertStringToObject(String stringJson, Class<T> clazz)
    {
        try
        {
            ObjectMapper mapper = getObjectMapper();
            mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
            return (T)mapper.readValue(stringJson, clazz);
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
            return null;
        }
    }

    public static <T extends Serializable> T convertJsonToObject(JsonNode node, Class<T> clazz)
    {
        try
        {
            ObjectMapper mapper = getObjectMapper();
            return (T)mapper.convertValue(node, clazz);
        }
        catch(IllegalArgumentException ex)
        {

            return null;
        }
    }

    public static JsonNode convertObjectToJson(final Object object)
    {
        try
        {
            ObjectMapper mapper = getObjectMapper();
            JsonNode node = mapper.valueToTree(object);
            return node;
        }
        catch(IllegalArgumentException ex)
        {

            return null;
        }
    }

    public static String convertObjectToStringJson(final Object object)
    {
        try
        {
            return getObjectMapper().writeValueAsString(object);
        }
        catch(JsonProcessingException | NullPointerException ex)
        {
            return null;
        }

    }

    public static boolean isListValid(final Collection<?> listObjects)
    {
        return listObjects != null && !listObjects.isEmpty();
    }

}
