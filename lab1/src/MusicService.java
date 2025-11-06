import java.util.List;
import java.util.stream.Collectors;

public class MusicService {
    public List<Song> findSongsByAuthor(List<Song> songs, String authorName){
        return songs.stream()
                .filter(song -> song.getAuthor().getName().equalsIgnoreCase(authorName))
                .collect(Collectors.toList());
    }

    public List<Album> filterAlbumsByYear(List<Album> albums, int year){
        return albums.stream()
                .filter(album -> album.getYear() == year)
                .collect(Collectors.toList());
    }
}
