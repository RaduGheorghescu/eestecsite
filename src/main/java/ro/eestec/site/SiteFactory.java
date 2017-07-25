package ro.eestec.site;

import org.springframework.stereotype.Component;

/**
 * Created by Radu.Gheorghescu on 7/25/2017.
 */
@Component
public class SiteFactory {
    public Site generateSite(SiteTypes siteType){
        if(siteType == SiteTypes.EVENT)
            return new EventSite();
        if(siteType == SiteTypes.STANDALONE)
            return new StandaloneSite();
        return null;
    }
}
