package com.ysdc.injection.module;

import android.content.Context;

import com.ysdc.data.ErrorHandler;
import com.ysdc.injection.annotations.ActivityContext;
import com.ysdc.injection.annotations.ActivityScope;
import com.ysdc.ui.base.BaseActivity;
import com.ysdc.ui.splash.SplashMvpPresenter;
import com.ysdc.ui.splash.SplashMvpView;
import com.ysdc.ui.splash.SplashPresenter;

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