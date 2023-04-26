
package YoutubeManager;

/**
 *
 * @author Juan Carlos Rios Fonseca
 */
public class CachedYouTubeClass implements ThirdPartyYouTubeLib{
    
    private ThirdPartyYouTubeLib service;
       
    public ThirdPartyYouTubeLib CachedYouTubeClass(ThirdPartyYouTubeLib s){
    return s;
}
  
    @Override
    public void listVideos() {
        
     }

    @Override
    public void getVideoInfo(String id) {
       
    }

    @Override
    public void downloadVideo(String id) {
        
    }
    
}
