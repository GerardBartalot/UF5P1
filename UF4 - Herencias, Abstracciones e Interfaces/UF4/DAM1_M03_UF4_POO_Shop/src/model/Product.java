package model;

public class Product {
    private int id;
    private String name;
    private Amount publicPrice;
    private Amount wholesalerPrice;
    private boolean available;
    private int stock;
    private static int totalProducts;

    final static double EXPIRATION_RATE = 0.60;

    public Product(String name, Amount wholesalerPrice, boolean available, int stock) {
        super();
        this.id = totalProducts + 1;
        this.name = name;
        this.wholesalerPrice = wholesalerPrice;
        this.publicPrice = new Amount(0.0, "");
        this.publicPrice.setValue(getWholesalerPrice().getValue() * 2);
        this.available = available;
        this.stock = stock;
        totalProducts++;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Amount getPublicPrice() {
		return publicPrice;
	}

	public void setPublicPrice(Amount publicPrice) {
		this.publicPrice = publicPrice;
	}

	public Amount getWholesalerPrice() {
		return wholesalerPrice;
	}

	public void setWholesalerPrice(Amount wholesalerPrice) {
		this.wholesalerPrice = wholesalerPrice;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public int getStock() {
		return stock;
	}

	public int setStock(int stock) {
		return this.stock = stock;
	}

	public static int getTotalProducts() {
		return totalProducts;
	}

	public static void setTotalProducts(int totalProducts) {
		Product.totalProducts = totalProducts;
	}
	
	public void expire() {
	    double newValue = this.publicPrice.getValue() * EXPIRATION_RATE;
	    this.publicPrice = new Amount(newValue, this.publicPrice.getCurrency());
	}

	@Override
	public String toString() {
		return "Product --> [Name = " + name + ", Public Price = " + publicPrice + ", Wholesaler Price = " + wholesalerPrice
				+ ", \n             Available = " + available + ", Stock = " + stock + "]";
	}

	  
}
