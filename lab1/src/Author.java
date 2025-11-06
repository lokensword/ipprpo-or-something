import java.util.Date;
import java.util.List;

public class Author {
    private String name;
    private List<Album> albums;
    private Date birthdate;

    public Author(String name, List<Album> albums, Date birthdate) {
        this.name = name;
        this.albums = albums;
        this.birthdate = birthdate;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public List<Album> getAlbums() {return albums;}
    public void setAlbums(List<Album> albums) {this.albums = albums;}

    public Date getBirthdate() {return birthdate;}
    public void setBirthdate(Date birthdate) {this.birthdate = birthdate;}
}
