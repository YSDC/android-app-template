package com.ysdc.injection.module;

import android.app.Activity;
import android.content.Context;

import com.ysdc.injection.annotations.ActivityScope;

import androidx.fragment.app.Fragment;
import dagger.Module;
import dagger.Provides;

@Module
public class FragmentModule {
    private Fragment fragment;

    public FragmentModule(Fragment fragment) {
        this.fragment = fragment;
    }

    @Provides
    Fragment providesFragment() {
        return fragment;
    }

    @Provides
    Activity provideActivity() {
        return fragment.getActivity();
    }

    @Provides
    @ActivityScope
    Context providesContext() {
        return fragment.getActivity();
    }

}
