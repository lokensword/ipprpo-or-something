public class Song {
    private String title;
    private Author author;
    private int duration;
    private Album album;

    public Song(String title, Author author, int duration, Album album){
        this.title = title;
        this.author = author;
        this.duration = duration;
        this.album = album;
    }

    public String getTitle() {return this.title;}
    public void setTitle(String title){this.title = title;}

    public Author getAuthor() {return author;}
    public void setAuthor(Author author) {this.author = author;}

    public Album getAlbum() {return album;}
    public void setAlbum(Album album) {this.album = album;}

    public int getDuration() {return duration;}
    public void setDuration(int duration) {this.duration = duration;}
}
