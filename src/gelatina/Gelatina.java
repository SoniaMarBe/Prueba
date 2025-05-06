package gelatina;
public class Gelatina {
    //Atributos
    String color;
    String sabor;

    //Metodos Getter
    public String getColor() {
        return this.color;
    }
    public String getSabor(){
        return this.sabor;
    }
    //Metodos Setter
    public void setColor(String c) {
        this.color = c;
    }

    public void setSabor(String s) {
        this.sabor = s;
    }
    //metodo para obtener toda la info de nuestros atributos
    public void mostrarInfo(){
        System.out.println("La info de la gelatina es:");
        System.out.println("Sabor: " + getSabor());
        System.out.println("Color: "+ getColor());
    }
}
