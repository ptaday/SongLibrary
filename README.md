Description

A library containing songs of all different genres has recently been created. Because of the popularity of this new library, users have been creating many playlists on this new platform. This library is called the SongLibrary. Inside the SongLibrary class, there is an ArrayList keeping track of all Users. The User class contains the user’s username and an ArrayList of all of the user’s Playlists. The Playlist class contains the playlist title and an ArrayList of Songs. Finally, the Song class contains songName, artistName, and duration of the song, all stored as Strings and all of which should have get methods.

Write the SongLibrary, User, Playlist, and Song classes.

In SongLibrary, you should be able to add and remove users. You should also be able to get all playlists of a specific user. 

In User,  you should be able to:
get the user’s username
add playlists
remove that specific playlist when given a String title of a playlist
get all playlists belonging to the user
get a playlist given the playlist title
make a collaborative playlist by writing the method void makeCollaborativePlaylist(String playlistTitle, User friend), which allows a user to add a playlist of theirs to a friend’s list of playlists. Keep in mind that it should be the same object and not a copy. If the user or their friend updates the playlist, it should update on both the user’s end and their friend’s end. 

 
 
In Playlist, you should be able to:
get and set the playlist title 
add a song to the playlist
remove a song given the song title (which will remove the first instance of the song title’s appearance)
swap the position of two songs in the playlist by writing the method void swapSongs(Song song1, Song song2). If one or both of the songs do not exist in the playlist, then the swap does not occur.
get the total time duration of the playlist, which is calculated by adding up the duration of all the songs and returns a String in the format of “totalMinutes min, totalSeconds sec”. You do not have to convert minutes to hours.
sort songs in the playlist by songName, which should be done by implementing the Comparable interface in the Song class. If both songs have the same name, then sort based on artistName.

 
Lastly, the User, Playlist, and Song classes should also include toString() methods in order to produce the printed format shown in the example below.

 
