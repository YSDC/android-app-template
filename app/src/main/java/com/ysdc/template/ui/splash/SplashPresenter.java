package com.ysdc.template.ui.splash;

import com.ysdc.template.data.ErrorHandler;
import com.ysdc.template.ui.base.BasePresenter;

/**
 * Created by david on 1/25/18.
 */

public class SplashPresenter<V extends SplashMvpView> extends BasePresenter<V> implements SplashMvpPresenter<V> {


    public SplashPresenter(ErrorHandler errorHandler) {
        super(errorHandler);
    }

}