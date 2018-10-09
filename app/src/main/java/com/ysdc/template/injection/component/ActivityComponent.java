package com.ysdc.template.injection.component;

import com.ysdc.template.injection.annotations.ActivityScope;
import com.ysdc.template.injection.module.ActivityModule;
import com.ysdc.template.ui.splash.SplashActivity;

import dagger.Subcomponent;

/**
 * Created by david on 1/25/18.
 */
@ActivityScope
@Subcomponent(modules = {ActivityModule.class})
public interface ActivityComponent {

    void inject(SplashActivity splashActivity);
}
