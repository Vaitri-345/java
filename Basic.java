class Mobile{
    String brand;
    double price;
    boolean isAvailable;

    public void show(){
        System.out.print("Brand "+brand+" Price: "+price);
        if(isAvailable){
            System.out.println(" is Available");
        }
        else{
            System.out.println(" is not Available");
        }
    }

}




public class basic {
    public static void main(String[]args){

        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1_00_00.00;
        obj1.isAvailable = true;
        
        Mobile obj2 = new Mobile();
        obj2.brand = "Mokhbhbh";
        obj2.price =(int)(Math.random()*100000);
        obj2.isAvailable = false;

        obj2.show();
        obj1.show();
        int a = 1;

        switch (a) {
            case 1 -> System.out.println("idk");
        }
    }
}