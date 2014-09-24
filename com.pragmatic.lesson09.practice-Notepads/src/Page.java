
public class Page {
	private String title ="";
	private String text ="";
	private int pageNumber; 
	
	public int getPageNumber() {
		return pageNumber;
	}
	
	public void setPageNumber(int pageNumber) {
		if(pageNumber < 0) {
			System.out.println("vavel si otricatelen page number za stranica s zaglavie " + this.title);
		} else {
			this.pageNumber = pageNumber;
		}
	}
	
	public void changeText(String text){
		this.text = text;
	}
	
	public void addText(String title, String text){
		this.text = this.text + text;
		this.title = this.title + title;
	}
	
	public void removeText(){
		this.text = "";
	}
	
	
	public String readPageText(){
		return this.title + " \n" + this.text;
	}
	
	
}
