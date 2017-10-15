package engine;

public class Item {
	private int id;
	private String name;
	private String caption;
	private String description;
	private String Element; 
	
	
	
	public Item(int id, String name, String caption, String description, String element) {
		this.id = id;
		this.name = name;
		this.caption = caption;
		this.description = description;
		Element = element;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getCaption() {
		return caption;
	}
	public String getDescription() {
		return description;
	}
	
	
}
