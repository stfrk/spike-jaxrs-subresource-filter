package spikejaxrssubresourcefilter;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public class ResPluto
{
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String saluta()
    {
        return "ciao 2 da ResPluto";
    }

}
