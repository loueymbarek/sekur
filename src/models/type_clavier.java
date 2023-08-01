package models;

public class type_clavier {
	private String language;
	public type_clavier(String language) {
		this.language=language;
	}

	public String getLanguage() {
		return language;
	}

	public void setNom(String ln) {
		language = ln;
	}
	 @Override
	    public String toString() {
	        return language;
	    }
	
	

}
