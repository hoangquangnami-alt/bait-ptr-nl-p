class Book {
    private String bookId;
    private String title;
    private double price;
    private double discount;

    // Constructor 1
    public Book(String bookId, String title) {
        this.bookId = bookId;
        this.title = title;
    }

    // Constructor 2
    public Book(String bookId, String title, double price, double discount) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
        this.discount = discount;
    }

    // Getter & Setter
    public String getBookId() { return bookId; }
    public void setBookId(String bookId) { this.bookId = bookId; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public double getDiscount() { return discount; }
    public void setDiscount(double discount) { this.discount = discount; }

    // Tính giá bán
    public double getSalePrice() {
        return price - discount;
    }

    public void displayInfo() {
        System.out.println("Thong tin quyen sach:");
        System.out.println("- Ma so sach: " + bookId);
        System.out.println("- Ten sach: " + title);
        System.out.println("- Gia sach: " + price);
        System.out.println("- Giam gia: " + discount);
        System.out.println("Gia ban: " + getSalePrice());
    }

    public static void main(String[] args) {
        Book book = new Book("B1234", "Mindset", 70000, 7000);
        book.displayInfo();

        book.setDiscount(24000);
        book.displayInfo();
    }
}
