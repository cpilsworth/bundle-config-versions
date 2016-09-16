package bndlversion.core.service.impl;

import bndlversion.core.service.DataEndpointConfiguration;
import org.apache.felix.scr.annotations.Activate;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Properties;
import org.apache.felix.scr.annotations.Property;
import org.apache.felix.scr.annotations.Service;
import org.osgi.service.component.ComponentContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service(DataEndpointConfiguration.class)
@Component(
        metatype = true,
        immediate = true,
        name = "bndlversion.core.service.impl.PlatformConfiguration",
        description = "Provides some property configurable on AEM"
)
@Properties({
        @Property(name = "prop", value = "a")
})
public class PlatformConfiguration implements DataEndpointConfiguration {

    private static final Logger log = LoggerFactory.getLogger(PlatformConfiguration.class);

    private String property;

    @Override
    public String getProperty() {
        log.error("Getting property = {}", property);
        return property;
    }

    @Activate
    final void activate(final ComponentContext componentContext) {
        log.error("Activating the platform configuration component");
        this.property = (String) componentContext.getProperties().get("prop");
    }
}
