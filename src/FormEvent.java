import java.util.EventObject;

public class FormEvent extends EventObject{
	private String name;
	private String occupation;
	private int ageCategory;
	
	public FormEvent(Object source){
		super(source);
	}
	
	public FormEvent(Object source, String name, String occupation, int ageCat){
		super(source);
		this.name = name;
		this.ageCategory = ageCat;
		this.occupation = occupation;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return ageCategory;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOppucation() {
		return occupation;
	}
	public void setOppucation(String occupation) {
		this.occupation = occupation;
	}
	
}
