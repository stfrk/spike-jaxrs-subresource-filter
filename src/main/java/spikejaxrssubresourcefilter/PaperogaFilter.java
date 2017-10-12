package spikejaxrssubresourcefilter;

import java.io.IOException;
import java.util.Date;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;

@Paperoga
@Provider
public class PaperogaFilter implements ContainerRequestFilter, ContainerResponseFilter
{

    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException
    {
        System.out.println("PAPEROGA: " + new Date());
    }

    @Override
    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) throws IOException
    {
        final String mod = "[PAPEROGA] " + responseContext.getEntity();
        responseContext.setEntity(mod);
    }

}
