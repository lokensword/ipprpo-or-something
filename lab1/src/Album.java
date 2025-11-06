import java.util.Date;
import java.util.List;

public class Album {
    private String title;
    private Author author;
    private List<Song> songs;
    private int year;

    public Album(String title, Author author, List<Song> songs, int year){
        this.title = title;
        this.author = author;
        this.songs = songs;
        this.year = year;
    }

    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}

    public Author getAuthor() {return author;}
    public void setAuthor(Author author) {this.author = author;}

    public List<Song> getSongs() {return songs;}
    public void setSongs(List<Song> songs) {this.songs = songs;}

    public int getYear() {return year;}
    public void setYear(int year) {this.year = year;}

    public void AddSong(Song s){
        songs.add(s);
        s.setAlbum(this);
    }
}

