package spikejaxrssubresourcefilter;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("topolino")
@Paperoga
public class ResTopolino
{
    @Inject
    private ResPluto pluto;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String saluta()
    {
        return "ciao da ResTopolino";
    }

    @Path("pluto")
    public ResPluto pluto()
    {
        assert pluto != null;
        return pluto;
    }
}
