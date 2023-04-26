
package YoutubeManager;

/**
 *
 * @author Juan Carlos Rios Fonseca
 */
public abstract interface ThirdPartyYouTubeLib {
    
    
    public void listVideos();
    
    public void getVideoInfo(String id);
    
    public void downloadVideo(String id);
           
}
