public class Song{
    public String title;
    public String artist;
    public int duration;
    public Song nextSong;
    public Song(String title, String artist, int duration){
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.nextSong = null;
    }
    public void songInfo(){
        System.out.println("Title: " + title);
        System.out.println("Artist: " + artist);
        System.out.println("Length: " + duration + " minutes");
    }
}