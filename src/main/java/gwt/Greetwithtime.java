package gwt;

import java.util.Random;

public class Greetwithtime {
	private final String content;
	private long id;
	private String rUsername;

	public Greetwithtime(long id, String content){
		this.id = id;
		this.content = content;
	}

	public String getRUsername(){
		char letter;
		for(int i = 0; i<5; i++){ 
			letter = (char) this.id;
			rUsername = rUsername + letter;
		}
		return rUsername;
	}

	/*generates a random id for each user*/
	public long getId(){
		Random r = new Random();
		id = r.nextInt(101)+1;
		return id;
	}

	/*returns a basic string*/
	public String getContent(){
		return content;
	}

}