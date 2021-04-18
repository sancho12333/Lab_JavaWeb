package entity;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Digital class: <br>
 * <pre>
 * Contructors default
 * contructors full parameter 
 * getDateConvert()
 * getId
 * setId
 * getTitle
 * setTitle
 * getDescription
 * setDescription
 * getImage
 * setImage
 * getAuthor
 * setAuthor
 * getTimePost
 * setTimePost
 * getShortDes
 * setShortDes
 * </pre>
 * @author DuyDV
 */
public class Digital {
    /**
     * Store id
     */
    private int id;
    /**
     * store title
     */
    private String title;
    /**
     * store description
     */
    private String description;
    /**
     * store image
     */
    private String image;
    /**
     * store author
     */
    private String author;
    /**
     * store timepost
     */
    private Date timePost;
    /**
     * store shortdes
     */
    private String shortDes;
/**
 * constructor default
 */
    public Digital() {
    }
    /**
     * constructor full parameter<br>
     * @param id
     * @param title
     * @param description
     * @param image
     * @param author
     * @param timePost
     * @param shortDes 
     */

    public Digital(int id, String title, String description, String image, String author, Date timePost, String shortDes) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.image = image;
        this.author = author;
        this.timePost = timePost;
        this.shortDes = shortDes;
    }
    /**
     * getDateConvert method<br>
     * <pre>
     * format date
     * </pre>
     * @return 
     */
    public String getDateConvert() {
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("MMM dd yyyy - hh:mm:");
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("a");
        String date = dateFormat1.format(this.timePost) + dateFormat2.format(this.timePost).toLowerCase();
        return date; 
    }
    /**
     * getId method<br>
     * 
     * @return id
     */
    public int getId() {
        return id;
    }
    /**
     * setId
     * @param id 
     */

    public void setId(int id) {
        this.id = id;
    }
    /**
     * getTitle
     * @return title
     */

    public String getTitle() {
        return title;
    }
/**
 * setTitle
 * @param title 
 */
    public void setTitle(String title) {
        this.title = title;
    }
    /**
     * getDescription
     * @return description
     */

    public String getDescription() {
        return description;
    }
/**
 * setDescription
 * @param description 
 */
    public void setDescription(String description) {
        this.description = description;
    }
/**
 * getImage
 * @return image
 */
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
/**
 * getAuthor
 * @return author
 */
    public String getAuthor() {
        return author;
    }
/**
 * setAuthor
 * @param author 
 */
    public void setAuthor(String author) {
        this.author = author;
    }
/**
 * getTimePost
 * @return 
 */
    public Date getTimePost() {
        return timePost;
    }
/**
 * setTimePost
 * @param timePost 
 */
    public void setTimePost(Date timePost) {
        this.timePost = timePost;
    }
/**
 * getShortDes
 * @return shortDes
 */
    public String getShortDes() {
        return shortDes;
    }
/**
 * setShortDes
 * @param shortDes 
 */
    public void setShortDes(String shortDes) {
        this.shortDes = shortDes;
    }
    
}
