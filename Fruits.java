public class Fruits{
    private String fruit = "Mango";
    private String price = "$5";
    private String quantity = "1kg";

// public String toString(){
//     return "quantity: " + quantity + "of" + fruit + " costs " + price;

// } fruits fruits = new Fruits();
//     S.O.P(fruites.toString());

public String getFruit(){
    return fruit;
}

public String getPrice(){
    return price;
}

public String getQuantity(){
    return quantity;
}

public void setFruit(String a){
    fruit = a;
}

public void setPrice(String a){
    price = a;
}

public void setQuantity(String a){
    quantity = a;
}

public boolean isEqual(Fruits object1, Fruits object2){
    return ((object1.getFruit().equals(object2.getFruit())) && (object1.getPrice().equals(object2.getPrice())) && (object1.getQuantity().equals(object2.getQuantity())));
    
}

public Fruits(String a, String b, String c){

    fruit = a;
    price = b;
    quantity = c;
}

    public static void main(String[] args){
        Fruits fruit1 = new Fruits("apple", "$2", "1lb");
        Fruits fruit2 = new Fruits("apple", "$1", "1lb");
        System.out.println(fruit1.isEqual(fruit1, fruit2));
    }
}
