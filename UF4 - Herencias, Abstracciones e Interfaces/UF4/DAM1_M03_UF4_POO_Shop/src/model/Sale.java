package model;

import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Sale {
    private Client client;
    private ArrayList<Product> products;
    private Amount amount;
    private LocalDateTime saleDateTime;

    public Sale(Client client, ArrayList<Product> products, Amount amountValue, LocalDateTime saleDateTime) {
        this.client = client;
        this.products = new ArrayList<>(products);
        this.amount = amountValue;
        this.saleDateTime = saleDateTime;
    }
	
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public ArrayList<Product> getProducts() {
		return products;
	}
	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}
	public Amount getAmount() {
		return amount;
	}
	public void setAmount(Amount amount) {
		this.amount = amount;
	}
    public LocalDateTime getSaleDateTime() {
        return saleDateTime;
    }
    public void setSaleDateTime(LocalDateTime saleDateTime) {
        this.saleDateTime = saleDateTime;
    }

    
	// Método para Obtener la Fecha y la Hora Modificadas
    
    public String getFormattedSaleDateTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return saleDateTime.format(formatter);
    }
    
    
	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("\nClient Name = ").append(client);
	    sb.append(",\nProducts = ");
	    boolean firstProduct = true;
	    for (Product product : products) {
	        if (product != null) {
	            if (!firstProduct) {
	                sb.append(", ");
	            } else {
	                firstProduct = false;
	            }
	            sb.append(product.getName());
	        }
	    }
	    sb.append(",\nAmount = ").append(amount);
	    return sb.toString();
	}
	
	
}
