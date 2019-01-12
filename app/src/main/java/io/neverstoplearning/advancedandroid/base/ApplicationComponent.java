package io.neverstoplearning.advancedandroid.base;

import javax.inject.Singleton;

import dagger.Component;
import io.neverstoplearning.advancedandroid.data.RepoServiceModule;
import io.neverstoplearning.advancedandroid.networking.ServiceModule;

@Singleton
@Component(modules = {
        ApplicationModule.class,
        ActivityBindingModule.class,
        ServiceModule.class,
        RepoServiceModule.class
})

public interface ApplicationComponent {

    void inject(MyApplication myApplication);

}
