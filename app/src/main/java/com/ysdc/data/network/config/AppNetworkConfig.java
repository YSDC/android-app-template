package com.ysdc.data.network.config;

import android.support.annotation.NonNull;

import com.ysdc.BuildConfig;
import com.ysdc.data.prefs.MyPreferences;

import static com.ysdc.data.prefs.MyPreferences.BASE_URL;


/**
 * Created by david on 2/7/18.
 */

public class AppNetworkConfig implements NetworkConfig {

    private static final String REPLACEMENT_PATTERN = "%s";

    private final MyPreferences appPrefs;

    public AppNetworkConfig(MyPreferences appPrefs) {
        this.appPrefs = appPrefs;
    }

    @NonNull
    @Override
    public String getBaseUrl() {
        if(appPrefs.contains(BASE_URL)){
            return appPrefs.getAsString(BASE_URL);
        }
        appPrefs.set(BASE_URL, BuildConfig.BASE_URL);
        return BuildConfig.BASE_URL;
    }

    @Override
    public void updateBaseUrl(){
        appPrefs.set(BASE_URL, BuildConfig.BASE_URL);
    }

    @Override
    public String getAuthUsername() {
        //TODO
        return null;
    }

    @Override
    public String getAuthPassword() {
        //TODO
        return null;
    }
}
