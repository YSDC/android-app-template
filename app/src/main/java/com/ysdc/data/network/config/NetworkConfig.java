package com.ysdc.data.network.config;


import androidx.annotation.NonNull;

/**
 * Created by david on 2/7/18.
 */

public interface NetworkConfig {

    @NonNull
    String getBaseUrl();

    void updateBaseUrl();

    String getAuthUsername();

    String getAuthPassword();
}
