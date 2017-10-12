package spikejaxrssubresourcefilter;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("app")
public class MyApplication extends Application
{
    @Override
    public Set<Class<?>> getClasses()
    {
        HashSet<Class<?>> r = new HashSet<>();
        r.add(ResTopolino.class);
        r.add(ResPluto.class);
        r.add(PaperogaFilter.class);
        return r;
    }
}
