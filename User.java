

import java.util.ArrayList;

public class User {

    private String userName;

    User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }


    public ArrayList<Playlist> listOfPlaylist = new ArrayList<Playlist>();

    public void addPlaylist(Playlist playlist) {
        listOfPlaylist.add(playlist);
    }

    public void removePlaylist(String playlistName) {
        for (int i = 0; i < listOfPlaylist.size(); i++) {
            if (playlistName.equals(listOfPlaylist.get(i).getPlaylistTitle())) {
                listOfPlaylist.remove(i);
            }
        }
    }

    public ArrayList getAllPlaylistForAUser() {
        return listOfPlaylist;
    }

    public Playlist getPlaylist(String playlistName) {

        for (int i = 0; i < listOfPlaylist.size(); i++) {
            if (playlistName.equals(listOfPlaylist.get(i).getPlaylistTitle())) {
                Playlist returnPlayList = listOfPlaylist.get(i);
                return returnPlayList;
            }

        }

        return null;
    }
    public void makeCollaborativePlaylist(String playlistTitle, User friend) {

        Playlist toAddPlaylist = this.getPlaylist(playlistTitle);

        if (toAddPlaylist == null)
            System.out.println("This playlist doesn't exist hence cannot be made collaborated");

        else
            friend.listOfPlaylist.add(toAddPlaylist);
    }

    public String toString() {
        return userName;
    }

    public boolean equals(Object o) {

        if (o instanceof User) {
            if (userName.equals(((User) o).getUserName()))
                return true;
        }
        return false;
    }
}
