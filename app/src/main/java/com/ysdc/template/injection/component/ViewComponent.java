package com.ysdc.template.injection.component;

import com.ysdc.template.injection.annotations.ViewScope;
import com.ysdc.template.injection.module.ViewModule;

import dagger.Subcomponent;


@ViewScope
@Subcomponent(modules = ViewModule.class)
public interface ViewComponent {

}
