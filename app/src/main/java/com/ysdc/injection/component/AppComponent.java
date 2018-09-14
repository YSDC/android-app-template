package com.ysdc.injection.component;

import com.ysdc.app.MyApplication;
import com.ysdc.injection.module.ActivityModule;
import com.ysdc.injection.module.AnalyticsModule;
import com.ysdc.injection.module.AppModule;
import com.ysdc.injection.module.FragmentModule;
import com.ysdc.injection.module.NetworkModule;
import com.ysdc.injection.module.RepositoryModule;
import com.ysdc.injection.module.ServiceModule;
import com.ysdc.injection.module.UtilsModule;
import com.ysdc.injection.module.ViewModule;

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
