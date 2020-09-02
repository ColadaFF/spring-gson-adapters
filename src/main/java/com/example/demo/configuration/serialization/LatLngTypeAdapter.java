package com.example.demo.configuration.serialization;

import com.example.demo.domain.LatLng;
import com.google.gson.*;

import java.lang.reflect.Type;

public class LatLngTypeAdapter implements JsonSerializer<LatLng>, JsonDeserializer<LatLng> {
    @Override
    public LatLng deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonArray jsonArray = jsonElement.getAsJsonArray();
        double lat = jsonArray.get(0).getAsDouble();
        double lng = jsonArray.get(1).getAsDouble();
        return new LatLng(lat, lng);
    }

    @Override
    public JsonElement serialize(LatLng latLng, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonArray jsonArray = new JsonArray();
        jsonArray.add(latLng.getLat());
        jsonArray.add(latLng.getLng());
        return jsonArray;
    }
}
