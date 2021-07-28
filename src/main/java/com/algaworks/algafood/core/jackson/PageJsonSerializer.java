package com.algaworks.algafood.core.jackson;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.springframework.boot.jackson.JsonComponent;
import org.springframework.data.domain.Page;

import java.io.IOException;

@JsonComponent
public class PageJsonSerializer extends JsonSerializer<Page<?>> {
    @Override
    public void serialize(Page<?> objects, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeStartObject();

        jsonGenerator.writeObjectField("content", objects.getContent());
        jsonGenerator.writeObjectField("size", objects.getSize());
        jsonGenerator.writeObjectField("totalElements", objects.getTotalElements());
        jsonGenerator.writeObjectField("totalPages", objects.getTotalPages());
        jsonGenerator.writeObjectField("number", objects.getNumber());

        jsonGenerator.writeEndObject();
    }
}
