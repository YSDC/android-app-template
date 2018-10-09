package com.ysdc.template.injection.module;

import android.content.Context;

import com.ysdc.template.data.ErrorHandler;
import com.ysdc.template.injection.annotations.ActivityContext;
import com.ysdc.template.injection.annotations.ActivityScope;
import com.ysdc.template.ui.base.BaseActivity;
import com.ysdc.template.ui.splash.SplashMvpPresenter;
import com.ysdc.template.ui.splash.SplashMvpView;
import com.ysdc.template.ui.splash.SplashPresenter;

import dagger.Module;
import dagger.Provides;


@Module
public class ActivityModule {
    private BaseActivity activity;

    public ActivityModule(BaseActivity activity) {
        this.activity = activity;
    }

    @Provides
    @ActivityContext
    Context provideActivityContext() {
        return activity;
    }

    @Provides
    @ActivityScope
    SplashMvpPresenter<SplashMvpView> provideSplashPresenter(ErrorHandler errorHandler) {
        return new SplashPresenter<>(errorHandler);
    }
}