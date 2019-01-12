package io.neverstoplearning.advancedandroid.model;

import com.ryanharter.auto.value.moshi.MoshiAdapterFactory;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;

@MoshiAdapterFactory
public abstract class AdapterFactory implements JsonAdapter.Factory {

    public abstract long id();
    public abstract String login();

    @Json(name = "avatar_url")
    public abstract String avatarUrl();

    public static JsonAdapter.Factory create() {
        return new AutoValueMoshi_AdapterFactory();
    }
}