package com.ysdc.template.injection.module;

import android.app.Application;

import com.google.gson.Gson;
import com.ysdc.template.app.GeneralConfig;
import com.ysdc.template.data.network.DefaultNetworkServiceCreator;
import com.ysdc.template.data.network.config.AppNetworkConfig;
import com.ysdc.template.data.network.config.NetworkConfig;
import com.ysdc.template.data.prefs.MyPreferences;
import com.ysdc.template.utils.NetworkUtils;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by david on 2/8/18.
 */

@Module
public class NetworkModule {

    @Provides
    @Singleton
    NetworkConfig provideNetworkConfig(MyPreferences appPrefs) {
        return new AppNetworkConfig(appPrefs);
    }

    @Provides
    @Singleton
    DefaultNetworkServiceCreator provideDefaultNetworkServiceCreator(Gson gson, NetworkConfig networkConfig, GeneralConfig generalConfig, Application
            application, NetworkUtils networkUtils) {
        return new DefaultNetworkServiceCreator(gson, networkConfig, generalConfig, application, networkUtils);
    }

}
