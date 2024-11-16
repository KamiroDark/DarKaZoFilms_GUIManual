package co.edu.konradlorenz.model;

public enum TipoMembresia {
	REGULAR(0),   // 0% de descuento
    GOLD(10),     // 10% de descuento
    PRO(20); 
	
	private final int descuento;

    // Constructor del enum
    private TipoMembresia(int descuento) {
        this.descuento = descuento;
    }

    // Método para obtener el descuento
    public int getDescuento() {
        return descuento;
    }
}//Cierre TipoMembresia
