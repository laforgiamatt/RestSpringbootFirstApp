package gwt;

import java.util.Date;

public class Greetwithtime {
	private final long id;
	private Date date = new Date();

	public Greetwithtime(long id, Date date){
		this.id = id;
		this.date = date;
	}

	public long getId(){
		return id;
	}

	public Date getDate(){
		return date;
	} 

}