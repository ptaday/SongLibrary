package Homework7_ExtraCredit;

import java.util.ArrayList;

public class Playlist {

    String playlistTitle;

    Playlist(String playlistTitle) {
        this.playlistTitle = playlistTitle;
    }

    public String getPlaylistTitle() {
        return playlistTitle;
    }

    public void setPlaylistTitle(String playlistTitle) {
        this.playlistTitle = playlistTitle;
    }

    public ArrayList<Song> listOfSongs = new ArrayList<Song>();

    public void addSong(Song song) {
        listOfSongs.add(song);
    }

    public void remove(String name) {
        int position = 0;
        for (int i = 0; i < listOfSongs.size(); i++) {
            if (name.equals(listOfSongs.get(i).getSongName())) {
                position = i;
                break;
            }
        }
        listOfSongs.remove(position);
    }

    public void swap(Song song1, Song song2) {
        boolean isSong1InPlaylist = false;
        boolean isSong2InPlaylist = false;

        int pos1 = -1;
        int pos2 = -1;

        for (int i = 0; i < listOfSongs.size(); i++) {
            if (song1.equals((listOfSongs).get(i))) {
                isSong1InPlaylist = true;
                pos1 = i;
            }

            if (song2.equals((listOfSongs).get(i))) {
                isSong2InPlaylist = true;
                pos2 = i;
            }
        }

        if (isSong1InPlaylist && isSong2InPlaylist) {

            Song temporary = new Song(song1.getSongName(), song1.getArtistName(), song1.getDuration());

            listOfSongs.set(pos1, song2);
            listOfSongs.set(pos2, temporary);
        } else {
            if (pos1 == -1) {
                System.out.println(song1 + " is not their in the playlist.");
            } else if (pos2 == -1) {
                System.out.println(song2 + " is not their in playlist.");
            } else {
                System.out.println("Both songs are not present of the playlist.");
            }
        }

    }

    public String getTotalTimeDuration() {
        int min = 0;
        int totalMin = 0;
        int sec = 0;
        int totalSec = 0;

        String temp = "";
        String firstHalf = "";
        String secondHalf = "";

        for (int i = 0; i < listOfSongs.size(); i++) {
            temp = listOfSongs.get(i).getDuration();
            int positionOfColon = 0;

            for (int j = 0; j <= temp.length(); j++) {
                if (temp.charAt(j) == ':') {
                    positionOfColon = j;
                    break;
                }
            }

            firstHalf = temp.substring(0, positionOfColon);
            secondHalf = temp.substring(positionOfColon + 1);

            min = Integer.parseInt(firstHalf);
            sec = Integer.parseInt(secondHalf);

            totalMin = totalMin + min;
            totalSec = totalSec + sec;

            if (totalSec > 60) {
                totalSec = totalSec - 60;
                totalMin++;
            }
        }

        return "" + totalMin + " min " + totalSec + " sec";

    }

    public void sortPlaylist() {

        for (int i = 0; i < listOfSongs.size(); i++) {

            int temp = i;
            Song temporary = new Song(listOfSongs.get(i).getSongName(), listOfSongs.get(i).getArtistName(), listOfSongs.get(i).getDuration());

            for (int j = i + 1; j < listOfSongs.size(); j++) {

                if (temporary.compareTo((listOfSongs.get(j))) < 0) {
                    continue;
                } else if (temporary.compareTo((listOfSongs.get(j))) > 0) {
                    listOfSongs.set(i, listOfSongs.get(j));
                    listOfSongs.set(j, temporary);
                } else {
                    if (temporary.getArtistName().compareTo(listOfSongs.get(j).getArtistName()) > 0) {
                        listOfSongs.set(i, listOfSongs.get(j));
                        listOfSongs.set(j, temporary);

                    }
                }

            }
        }

          /*  for(int i=0;i<listOfSongs.size();i++)
            {
                System.out.println(listOfSongs.get(i).getSongName()+ " "+listOfSongs.get(i).getArtistName());
        }*/
    }

    public String toString() {
        String s = "";

        for (int i = 0; i < this.listOfSongs.size(); i++) {

            s = s + listOfSongs.get(i).toString() + "\n";

        }


        return playlistTitle + " - " + this.getTotalTimeDuration() + "\n" + s;
    }

    public boolean equals(Object o) {

        if (o instanceof Playlist) {
            if (getPlaylistTitle().equals(((Playlist) o).getPlaylistTitle())) {
                return true;
            }
        }
        return false;
    }
}




