package com.ysdc.injection.component;

import com.ysdc.injection.annotations.FragmentScope;
import com.ysdc.injection.module.FragmentModule;

import dagger.Subcomponent;

@FragmentScope
@Subcomponent(modules = FragmentModule.class)
public interface FragmentComponent {

}
