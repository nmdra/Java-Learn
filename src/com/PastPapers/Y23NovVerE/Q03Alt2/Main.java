package PastPapers.Y23NovVerE.Q03Alt2;

public class Main {

	public static void main(String[] args) {
		int  TResources=3;
		int  TUsers=5;
		ResourceManager rm = new ResourceManager(TResources) ;
		for   (int   i   =   1;   i   <=   TUsers;   i++){
			UserThread user  =  new  UserThread(i,   rm) ;
			user.start ( ) ;
		}
	}
}
