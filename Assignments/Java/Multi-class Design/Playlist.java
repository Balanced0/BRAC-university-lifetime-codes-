public class Playlist{
    public String name;
    public Song head;
    public Song tail;
    public int size = 0;
    public Playlist(String name){
        this.name = name;
        System.out.println(name + " created");
    }
    public void info(){
        System.out.println(name + " has the following songs:");
        if(head == null){
            System.out.println("No songs in First Playlist.");
        }
        else{
            Song temp = head;
            int n = 1;
            while(temp != null){
                System.out.println("Song-" + n);
                temp.songInfo();
                temp = temp.nextSong;
                n++;
            }
        }
    }
    public void addSong(Song s){
        if(head == null){
            head = s;
            tail = s;
            System.out.println(s.title + " added to " + name);
            size++;
        }
        else{
            tail.nextSong = s;
            tail = s;
            System.out.println(s.title + " added to " + name);
            size++;
        }
    }
    public void addSong(Song s, int index){
        if(index == 10){
            System.out.println("Cannot add song to Index 10.");
        }
        else if(index == 0){
            s.nextSong = head;
            head = s;
            System.out.println(s.title + " added to " + name);
            size++;
        }
        else{
            Song temp = head;
            Song target = head;
            for(int i = 1; i <= index; i++){
                target = target.nextSong; 
            }
            for(int i = 1; i < index; i++){
                temp = temp.nextSong; 
            }
            s.nextSong = target;
            temp.nextSong = s;
            System.out.println(s.title + " added to " + name);
            size++;
        }
    }
    public void playSong(String title){
        Song temp = head;
        boolean flag = false;
        while(temp != null){
            if(title.equals(temp.title)){
                System.out.println("Playing " + title + " by " + temp.artist);
                flag = true;
            }
            temp = temp.nextSong;
        }
        if(flag == false){
            System.out.println(title + " not found in playlist " + name);
        }
    }
    public void playSong(int index){
        Song temp = head;
        boolean flag = false;
        for(int i = 0; i < size; i++){
            if(index == i){
                System.out.println("Playing " + temp.title + " by " + temp.artist);
                flag = true;
            }
            temp = temp.nextSong;
        }
        if(flag == false){
            System.out.println("Song at Index " + index + " not found in " + name);
        }
    }
    public void deleteSong(String title){
        Song temp = head;
        boolean flag = false;
        Song prev = null;
        int count = 0;
        while(temp != null){
            if(title.equals(temp.title)){
                if(count == 0){
                    System.out.println(temp.title + " deleted from " + name);
                    head = temp.nextSong;
                    temp.nextSong = null;
                    size--;
                    flag = true;
                    break;
                }
                else{
                    System.out.println(temp.title + " deleted from " + name);
                    prev.nextSong = temp.nextSong;
                    temp.nextSong = null;
                    size--;
                    flag = true;
                    break;
                }
            }
            prev = temp;
            temp = temp.nextSong;
            count++;
        }
        if(flag == false){
            System.out.println(title + " not found in " + name);
        }
    }
    public int totalSong(){
        return size;
    }
    public void merge(Playlist p){
        tail.nextSong = p.head;
        System.out.println("Merge Completed!");
    }
}