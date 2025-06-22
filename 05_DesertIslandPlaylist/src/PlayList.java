import java.util.ArrayList;
import java.util.Arrays;

public class PlayList
{
    public static void main(String[] args)
    {
        String[] favoriteSongs = {
                "2Pac - Runnin",
                "2Pac - California Love",
                "Coolio - Gangsta's Paradise",
                "Cypress Hill - Insane in the Brain",
                "The Notorious B.I.G. - Juicy",
                "Dr. Dre - Nuthin' but a 'G' Thang",
                "Snoop Dogg - Gin and Juice",
                "Ice Cube - It Was a Good Day",
                "MC Hammer - U Can't Touch This",
                "Wu-Tang Clan - C.R.E.A.M."
        };

        //System.out.println(favoriteSongs[0]);
        //System.out.println(favoriteSongs[1]);
        //System.out.println(favoriteSongs[2]);

        ArrayList<String> desertIslandPlaylist = new ArrayList<>();
        /*desertIslandPlaylist.add(favoriteSongs[0]);
        desertIslandPlaylist.add(favoriteSongs[1]);
        desertIslandPlaylist.add(favoriteSongs[2]);
        desertIslandPlaylist.add(favoriteSongs[3]);
        desertIslandPlaylist.add(favoriteSongs[4]);*/

        desertIslandPlaylist.addAll(Arrays.asList(favoriteSongs));

        for (int i = 0; i < desertIslandPlaylist.size(); i++){
            System.out.println(desertIslandPlaylist.get(i));
        }

        desertIslandPlaylist.remove("MC Hammer - U Can't Touch This");
        desertIslandPlaylist.remove("The Notorious B.I.G. - Juicy");
        desertIslandPlaylist.remove("Cypress Hill - Insane in the Brain");
        desertIslandPlaylist.remove("2Pac - Runnin");

        for (int i = 0; i < desertIslandPlaylist.size(); i++){
            System.out.println(desertIslandPlaylist.get(i));
        }
        
    }
}
