public class Pizza {
    private String type;
    private String size;
    private boolean servida;
    private static int totalPedidas = 0;
    private static int totalServidas = 0;


    public Pizza(String type, String size) {
        this.type = type;
        this.size = size;
        this.servida = false;
        totalPedidas++;
    }

    public void sirve() {
        if (!this.servida) {
            this.servida = true;
            totalServidas++;
        } else {
            System.out.println("esa pizza ya se ha servido");
        }
    }

    public static int getTotalPedidas() {
        return totalPedidas;
    }

    public static int getTotalServidas() {
        return totalServidas;
    }

    @Override
    public String toString() {
        return "pizza " + type + " " + size + ", " + (servida ? "servida" : "pedida");
    }



}

