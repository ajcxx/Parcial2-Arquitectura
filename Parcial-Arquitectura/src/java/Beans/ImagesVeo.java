/**
 *
 * @author Dennise
 */


package Beans;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
 
@ManagedBean
public class ImagesVeo {
     
    private List<String> images;
     
    @PostConstruct
    public void init() {
        images = new ArrayList<String>();
        for (int i = 1; i <= 8; i++) {
            images.add("depo" + i + ".jpg");
        }
    }
 
    public List<String> getImages() {
        return images;
    }
}
