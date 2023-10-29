package org.group06.view.components.search;

/**
 *
 * @author Le Minh Bao
 */
public class Data {
    private String title;
    private String subTitle;
    
    public Data(String title, String subTitle) {
        this.title = title;
        this.subTitle = subTitle;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getSubTitle() {
        return subTitle;
    }
}
