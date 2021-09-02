package Part5;

public class Book {
	private String Author, bookName;
	private int Pages, publicationYear;
	public Book(String author, String name, int pages, int publicationYear) {
		this.Author = author;
		this.bookName = name;
		this.Pages = pages;
		this.publicationYear = publicationYear;
	}
	public String getAuthor() {
		return Author;
	}
	public String getName() {
		return bookName;
	}
	public int getPages() {
		return Pages;
	}
	public int getYear() {
		return publicationYear;
	}
	public String toString() {
		return Author + ", " + bookName + ", " + Pages + " pages" ;
	}
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Book)) {
            return false;
        }

        Book comparedBook = (Book) compared;

        if (this.bookName.equals(comparedBook.bookName)
                && this.publicationYear == comparedBook.publicationYear) {
            return true;
        }

        return false;
    }

}
