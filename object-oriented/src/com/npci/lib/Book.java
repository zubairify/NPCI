package com.npci.lib;

public class Book {
	private String title;
	private Member mbr;
	
	public Book() {
	}

	public Book(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public Member getMbr() {
		return mbr;
	}
	public void setMbr(Member mbr) {
		this.mbr = mbr;
	}
	
	public void status() {
		if(mbr == null)
			System.out.println(title + " is not issued to anyone");
		else
			System.out.println(title + " is issued to " + mbr.getName());
	}
	
	public void issueBook(Member mbr) {
		if(this.mbr == null && mbr.getBook() == null) {
			this.mbr = mbr;
			mbr.setBook(this);
			System.out.println(title + " is issued to " + mbr.getName());
		} else if(this.mbr != null)
			System.out.println(title + " is already issued");
		else if(mbr.getBook() != null)
			System.out.println(mbr.getName() + " has already issued a book");
	}
	
	public void returnBook(Member mbr) {
		if(this.mbr == null || !this.mbr.getName().equals(mbr.getName()))
			System.out.println(title + " is not issued to " + mbr.getName());
		else if(mbr.getBook() == null || !mbr.getBook().getTitle().equals(this.getTitle()))
			System.out.println(mbr.getName() + " has not issued " + title);
		else {
			this.mbr = null;
			mbr.setBook(null);
			System.out.println(title + " is retured by " + mbr.getName());
		}
	}
}
