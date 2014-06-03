package pizzashop;
import java.net.URL;
import java.util.Date;
 
import javax.jdo.annotations.*;
 
@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class LinkData2 {
    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Long id;
     
    @Persistent
    private String title;
     
    @Persistent
    private int price;
     
    @Persistent
    private String comment;
     
    @Persistent
    private Date datetime;
    
    @Persistent
    private int haitatu;
 //配達済み(2)と注文しただけのやつ(1)と今注文したやつ(0)を分けるやつを作る
    public LinkData2(String title, int price, String comment, Date datetime,int haitatu) {
        super();
        this.title = title;
        this.price = price;
        this.comment = comment;
        this.datetime = datetime;
        this.haitatu = haitatu;
    }
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getTitle() {
        return title;
    }
 
    public void setTitle(String title) {
        this.title = title;
    }
 
    public int getPrice() {
        return price;
    }
 
    public void setPrice(int price) {
        this.price = price;
    }
 
    public String getComment() {
        return comment;
    }
 
    public void setComment(String comment) {
        this.comment = comment;
    }
 
    public Date getDatetime() {
        return datetime;
    }
 
    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }
    
    public int getHaitatu(){
    	return haitatu;
    }
    public  void setHaitatu(int haitatu){
    	this.haitatu=haitatu;
    }
}