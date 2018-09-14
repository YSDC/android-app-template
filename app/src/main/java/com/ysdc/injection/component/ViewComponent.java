package com.ysdc.injection.component;

import com.ysdc.injection.annotations.ViewScope;
import com.ysdc.injection.module.ViewModule;

import dagger.Subcomponent;


@ViewScope
@Subcomponent(modules = ViewModule.class)
public interface ViewComponent {

}
