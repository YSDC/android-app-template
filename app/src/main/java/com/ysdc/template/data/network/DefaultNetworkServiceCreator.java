package com.ysdc.template.data.network;

import android.app.Application;

import com.google.gson.Gson;
import com.ysdc.template.app.GeneralConfig;
import com.ysdc.template.data.network.config.NetworkConfig;
import com.ysdc.template.data.network.service.NetworkBasicService;
import com.ysdc.template.utils.NetworkUtils;

/**
 * Created by david on 2/8/18.
 */

public class DefaultNetworkServiceCreator extends NetworkServiceCreator {
    private NetworkBasicService networkConfigurationService;

    public DefaultNetworkServiceCreator(Gson gson, NetworkConfig networkConfig, GeneralConfig generalConfig, Application application, NetworkUtils networkUtils) {
        super(gson, networkConfig, generalConfig, application, networkUtils);
    }

    public NetworkBasicService getNetworkBasicService() {
        if (networkConfigurationService == null) {
            networkConfigurationService = buildRetrofit().create(NetworkBasicService.class);
        }
        return networkConfigurationService;
    }
}
