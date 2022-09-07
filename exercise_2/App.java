import java.util.LinkedList;

class Main {
    public static void main(String[] args) {

        LinkedList<String> myPlaylist = new LinkedList<>();
        
        ///// My Music PlayLIST //////
        myPlaylist.add("Young and Inlove");                              // 1st song
        myPlaylist.add("13");                                            // 2nd song
        myPlaylist.add("I still talk to Jesus");                         // 3rd song
        myPlaylist.add("Kahit Kailan");                                  // 4th song
        myPlaylist.add("Mean It");                                       // 5th song

        myPlaylist.addFirst("You'll be in my heart");                    // Additional at the front of the Playlist
        myPlaylist.addLast("Dito, Sa ilalim ng buwan");                  // Additional song at the end of the Playlist

        System.out.println(myPlaylist.get(0));                           // Displaying the song at the front using get() and printl() method 
        myPlaylist.set(6, "Magasin");                                    // Replacing the last song using set() method
        myPlaylist.remove(1);                                            // Removing the first song using remove() method
        System.out.println("Updated playlist: " + myPlaylist);           // Displaying all songs in Playlist using the println method 
    }
}
