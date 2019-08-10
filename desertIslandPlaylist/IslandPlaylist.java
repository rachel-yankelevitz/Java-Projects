import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    desertIslandPlaylist.add("Maria Bethania");
    desertIslandPlaylist.add("Rodeo");
    desertIslandPlaylist.add("Girl");
    desertIslandPlaylist.add("Ophelia");
    desertIslandPlaylist.add("Michigan");
    desertIslandPlaylist.add("Primitive");
    desertIslandPlaylist.add("Freedom!");
    
    desertIslandPlaylist.remove("Girl");
        
    desertIslandPlaylist.remove("Rodeo");
    System.out.println(desertIslandPlaylist.size());
        //index of songs I want to swap
    int a = desertIslandPlaylist.indexOf("Maria Bethania");
    int b =  desertIslandPlaylist.indexOf("Michigan");
        
    String one = desertIslandPlaylist.get(a);
    String two = desertIslandPlaylist.get(b);
    desertIslandPlaylist.set(a, two);
    desertIslandPlaylist.set(b, one);
    
    System.out.println("new playlist! " + desertIslandPlaylist);
  }
  
}