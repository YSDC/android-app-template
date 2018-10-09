package com.ysdc.template.injection.component;

import com.ysdc.template.injection.annotations.ServiceScope;
import com.ysdc.template.injection.module.ServiceModule;

import dagger.Subcomponent;

/**
 * Created by david on 5/3/18.
 */
@ServiceScope
@Subcomponent(modules = {ServiceModule.class})
public interface ServiceComponent {

}
