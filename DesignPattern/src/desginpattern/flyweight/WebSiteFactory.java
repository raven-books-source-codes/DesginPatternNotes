package desginpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Raven
 * @version 1.0
 * @date 2020/4/5 10:40
 */
public class WebSiteFactory {
    // 聚合WebSite
    private Map<String, WebSite> webSiteMap = new HashMap<>();

    public WebSite getWebSite(String type){
        if(webSiteMap.containsKey(type)){
            return webSiteMap.get(type);
        }else{
            WebSite webSite = new ConcreteWebSite(type);
            webSiteMap.put(type,webSite);
            return webSite;
        }
    }

    public int webSizeCount(){
        return webSiteMap.size();
    }
}
