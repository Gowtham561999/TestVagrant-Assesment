package APITesting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestVagrant  {

	public static void main(String args[]) {
		
		/* Creating a PlayList with songs */
		List<String> myPlayList = new ArrayList<>();
		myPlayList.add("S1");
		myPlayList.add("S2");
		myPlayList.add("S3");
		myPlayList.add("S4");
		myPlayList.add("S5");
		myPlayList.add("S6");
		myPlayList.add("S7");
		myPlayList.add("S8");
		myPlayList.add("S9");
		myPlayList.add("S10");

		Scanner sc = new Scanner(System.in);
		String toPlay = "1";
		printPlayList(myPlayList);
		
		/* Taking the input from user on which song to play */
		System.out.println("This is your PlayList, Choose a song to play from the Playlist");
		toPlay = sc.nextLine();
		
		while (!toPlay.equals("0")) {
			
			/* Playing the song if it is present in the PlayList 
			 * else asking the user to enter a valid input */
			
			if (myPlayList.contains(toPlay)) {
				myPlayList.remove(toPlay);
				myPlayList.add(0, toPlay);
				
				/* Displaying the 3 recently played songs */
				System.out.println("Your last 3 recently played songs are ");
				printRecentlyPlayed(myPlayList);
				
				/* Asking the user if he wants to exit or to play another song */
				System.out.println("This is your PlayList, Choose a song to play from the Playlist or Enter \"0\" to exit");
				printPlayList(myPlayList);
				toPlay = sc.nextLine();
			}
			else {
				System.out.println("Choosen song is not in the PlayList");
				System.out.println("This is your PlayList, Choose a song to play from the Playlist or Enter \"0\" to exit");
				printPlayList(myPlayList);

				toPlay = sc.nextLine();
			}
		}
		sc.close();
	}
	
	public static void printPlayList(List<String> mySongList)
	{
		for (String song : mySongList) {
			System.out.println(song);
		}
	}
	
	public static void printRecentlyPlayed(List<String> mySongList)
	{
		int i=0;
		while (i<3) {
			System.out.println(mySongList.get(i));
			i++;
		}
	}
}
