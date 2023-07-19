

import java.util.ArrayList;

public class SongLibrary {

    public static ArrayList<User> listOfUser = new ArrayList<User>();

    public static void addUser(User user) {
        listOfUser.add(user);
    }

    public static void removeUser(User User) {
        for (int i = 0; i < listOfUser.size(); i++) {

            if (User.equals(listOfUser.get(i))) {
                listOfUser.remove(i);
            }
        }
    }

    public static Playlist[] getUserPlaylists(User user) {

        User temp = null;

        for (int i = 0; i < listOfUser.size(); i++) {

            if (user.equals(listOfUser.get(i))) {
                temp = listOfUser.get(i);
            }

        }
        Playlist[] playlists = new Playlist[temp.listOfPlaylist.size()];

        for (int i = 0; i < temp.listOfPlaylist.size(); i++) {

            playlists[i] = temp.listOfPlaylist.get(i);
        }
        return playlists;
    }
}
