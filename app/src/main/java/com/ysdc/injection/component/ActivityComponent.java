package com.ysdc.injection.component;

import com.ysdc.injection.annotations.ActivityScope;
import com.ysdc.injection.module.ActivityModule;
import com.ysdc.ui.splash.SplashActivity;

import dagger.Subcomponent;

/**
 * Created by david on 1/25/18.
 */
@ActivityScope
@Subcomponent(modules = {ActivityModule.class})
public interface ActivityComponent {

    void inject(SplashActivity splashActivity);
}
