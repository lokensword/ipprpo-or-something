import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Author beatles = new Author("The Beatles", new ArrayList<>(), sdf.parse("1960-01-01"));
        Author queen = new Author("Queen", new ArrayList<>(), sdf.parse("1970-06-27"));

        Album album1 = new Album("Abbey Road", beatles, new ArrayList<>(), 1969);
        Album album2 = new Album("A Night at the Opera", queen, new ArrayList<>(), 1975);
        Album album3 = new Album("Help!", beatles, new ArrayList<>(), 1965);

        Song song1 = new Song("Come Together", beatles, 259, album1);
        Song song2 = new Song("Bohemian Rhapsody", queen, 354, album2);
        Song song3 = new Song("Yesterday", beatles, 125, album3);

        album1.AddSong(song1);
        album2.AddSong(song2);
        album3.AddSong(song3);

        List<Song> allSongs = Arrays.asList(song1, song2, song3);
        List<Album> allAlbums = Arrays.asList(album1, album2, album3);

        MusicService service = new MusicService();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1 - Найти песни по автору");
            System.out.println("2 - Фильтр альбомов по году");
            System.out.println("3 - Выход");
            System.out.print("Выберите действие: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Введите имя автора: ");
                    String authorName = scanner.nextLine();
                    List<Song> foundSongs = service.findSongsByAuthor(allSongs, authorName);
                    System.out.println("Найденные песни: " + foundSongs.size());
                    for (Song song : foundSongs) {
                        System.out.println("- " + song.getTitle() + " (" + song.getDuration() + " сек)");
                    }
                    break;

                case 2:
                    System.out.print("Введите год: ");
                    int year = scanner.nextInt();
                    List<Album> filteredAlbums = service.filterAlbumsByYear(allAlbums, year);
                    System.out.println("Найденные альбомы: " + filteredAlbums.size());
                    for (Album album : filteredAlbums) {
                        System.out.println("- " + album.getTitle() + " - " + album.getAuthor().getName());
                    }
                    break;

                case 3:
                    System.out.println("Выход...");
                    return;

                default:
                    System.out.println("Неверный выбор");
            }
        }
    }
}