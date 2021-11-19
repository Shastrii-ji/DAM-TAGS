package com.mysite.core.utils;

        import org.apache.sling.api.resource.LoginException;
        import org.apache.sling.api.resource.ResourceResolver;
        import org.apache.sling.api.resource.ResourceResolverFactory;

        import java.util.HashMap;
        import java.util.Map;

public class ResolverUtil {
    private ResolverUtil(){

    }
    public static final String ANIKA_SERVICE_USER = "anikaserviceuser";
    public static ResourceResolver newResolver(ResourceResolverFactory resourceResolverFactory) throws LoginException{
        Map<String, Object> param = new HashMap<>();
        param.put(resourceResolverFactory.SUBSERVICE, ANIKA_SERVICE_USER);
        ResourceResolver resourceResolver = resourceResolverFactory.getServiceResourceResolver(param);
        return resourceResolver;
    }
}