package com.ysdc.template.injection.component;

import com.ysdc.template.app.MyApplication;
import com.ysdc.template.injection.module.ActivityModule;
import com.ysdc.template.injection.module.AnalyticsModule;
import com.ysdc.template.injection.module.AppModule;
import com.ysdc.template.injection.module.FragmentModule;
import com.ysdc.template.injection.module.NetworkModule;
import com.ysdc.template.injection.module.RepositoryModule;
import com.ysdc.template.injection.module.ServiceModule;
import com.ysdc.template.injection.module.UtilsModule;
import com.ysdc.template.injection.module.ViewModule;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = {AppModule.class, NetworkModule.class, RepositoryModule.class, AnalyticsModule.class, UtilsModule.class})
@Singleton
public interface AppComponent {
    ActivityComponent childActivityComponent(ActivityModule activityModule);

    FragmentComponent childFragmentComponent(FragmentModule fragmentModule);

    ServiceComponent childServiceComponent(ServiceModule serviceModule);

    ViewComponent childViewComponent(ViewModule viewModule);

    void inject(MyApplication propertyFinderApplication);

}
