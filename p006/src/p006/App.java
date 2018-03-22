package p006;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String performer, title;
		int length;
		Music longestMusic;
		System.out.println("How many disks: ");
		Music[] music = new Music[scanner.nextInt()];
		
		for (int i = 0; i < music.length; i++) {
			System.out.println(i+1 + ". Disk:\n");
			System.out.println("Performer: ");
			performer = scanner.next();
			System.out.println("Title: ");
			title = scanner.next();
			System.out.println("Length: ");
			length = scanner.nextInt();
			music[i] = new Music(performer, title, length);
		}
		
		longestMusic = music[0];
		for (int i = 1; i < music.length; i++) {
			if(music[i].isLongerThan(longestMusic) == 1){
				longestMusic = music[i];
			}
		}
		System.out.println("Longest Disk:\n");
		System.out.println(longestMusic.toString());
		
		System.out.println("Disk Performer: ");
		performer = scanner.next();
		for (int i = 0; i < music.length; i++) {
			if(music[i].isSamePerformer(performer)){
				music[i].toString();
				System.out.println("\n");
			}
		}
		
		scanner.close();
	}

}
