package io.neverstoplearning.advancedandroid.base;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {
        ApplicationModule.class,
})

public interface ApplicationComponent {

}
