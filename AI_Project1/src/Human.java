/*
 * Human class.
 * @params: int weight
 * tldr its 5 lines.
 * 
 * 
 */
public class Human {
	private int weight; 
	private int height;
	private String gender = "";
	
	Human(int h, int w, String gender){
		this.weight = w; 
		this.height = h;
		this.gender = gender;
	}
	public int getHeight(){
		return height;
	}
	public int getWeight(){
		return height;
	}
	public String getGender(){
		return gender;
	}
	public String toString(){
		return "Height: " + height + " Weight: " + weight + " Gender: " + gender;
	}
	
	public double[] getArray(){
		int gen = 0; 
		
		if(gender == "male"){ gen = -1;}
		if(gender == "female"){gen =1;}
		
		double[] arrayOfHuman = {height, weight, gen};
		return arrayOfHuman; 
		
	}
}
