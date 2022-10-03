package models;

public class Description {
	private String pno;
	private String langCode;
	private String text;
	
	
	public Description(String pno, String langCode, String text) {
		super();
		this.pno = pno;
		this.langCode = langCode;
		this.text = text;
	}


	public String getPno() {
		return pno;
	}


	public void setPno(String pno) {
		this.pno = pno;
	}


	public String getlangCode() {
		return langCode;
	}


	public void setlangCode(String langCode) {
		this.langCode = langCode;
	}


	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}


	@Override
	public String toString() {
		return "Description [pno=" + pno + ", langCode=" + langCode + ", text=" + text + "]";
	}
	
	
	
	
}