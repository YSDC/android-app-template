package com.ysdc.injection.component;

import com.ysdc.injection.annotations.ServiceScope;
import com.ysdc.injection.module.ServiceModule;

import dagger.Subcomponent;

/**
 * Created by david on 5/3/18.
 */
@ServiceScope
@Subcomponent(modules = {ServiceModule.class})
public interface ServiceComponent {

}
