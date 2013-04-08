package conf;

import com.google.inject.AbstractModule;

import etc.GreetingService;
import etc.GreetingServiceImpl;

/**
 * Well, this is the Guice module.
 *
 * see also : http://google-guice.googlecode.com/svn/trunk/javadoc/com/google/inject/AbstractModule.html
 */
public class Module extends AbstractModule {

    @Override
    protected void configure() {
        bind(GreetingService.class).to(GreetingServiceImpl.class);
    }

}
