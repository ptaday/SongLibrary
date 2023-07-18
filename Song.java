package Homework7_ExtraCredit;

public class Song implements Comparable {

    private String songName;
    private String artistName;
    private String duration;

    Song(String songName, String artistName, String duration) {
        this.songName = songName;
        this.artistName = artistName;
        this.duration = duration;
    }

    public String getSongName() {
        return songName;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return this.songName + " by " + this.artistName + " (" + duration + ")";
    }

    public boolean equals(Object o) {

        if (o instanceof Song)
            return songName.equals(((Song) o).getSongName()) && artistName.equals(((Song) o).getArtistName()) && duration.equals(((Song) o).getDuration());

        return false;
    }

    @Override
    public int compareTo(Object o) {

        if (this.getSongName().compareTo(((Song) o).getSongName()) > 0)
            return 1;

        else if (this.getSongName().compareTo(((Song) o).getSongName()) < 0)
            return -1;

        else
            return 0;
    }
}
