package Assignment0.dto;

public class Assignment0DTO {
	private int NameID;
	private String Year;
	private String Major;
	private String description;
	
	
	public int getNameID() {
		return NameID;
	}
	public void setName(int NameID) {
		this.NameID = NameID;
	}
	public String getYear() {
		return Year;
	}
	public void setYear(String Year) {
		this.Year = Year;
	}
	public String getMajor() {
		return Major;
	}
	public void setMajor(String Major) {
		this.Major = Major;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return NameID + " " + Year + " " + Major + " " + description ;
	}
	
}
