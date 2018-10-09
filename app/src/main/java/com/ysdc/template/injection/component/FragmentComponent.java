package com.ysdc.template.injection.component;

import com.ysdc.template.injection.annotations.FragmentScope;
import com.ysdc.template.injection.module.FragmentModule;

import dagger.Subcomponent;

@FragmentScope
@Subcomponent(modules = FragmentModule.class)
public interface FragmentComponent {

}
