package ad211.dolgih;

public class ItemForRegulars extends Item {

    public double discount;


    public ItemForRegulars(String name,double price,double discount){
        super(name,price);
        this.discount = discount;


    }

    //заполняем меню для вип-покупателей(со скидкой)
    public static void setMenuForRegulars(ItemForRegulars[] _menu){
        String[] name ={"Tomato","Eggplant","Potato","Cucumber","Onion","Cabbage","Carrot","Parsley","Pumpkin"};
        double[] price = {2.2,3.3,1.8,2.5,4.5,5,3,1,11.5};
        double[] discount = {0.2,0.3,0,0,0.1,0,0.3,0.2,0.5};
        for(int i=0;i<9;i++){
            _menu[i]=new ItemForRegulars(name[i],price[i],discount[i]); //заполняем ранее созданный массив объектов
        }


    }
    //выводим меню для вип-покупателей(со скидкой)
    public static void showMenuForRegulars(ItemForRegulars[] _menu){
        System.out.println("\t\t\t\t\tMenu\n");
        System.out.println("|--Name--|\t\t|\t--Price--\t|\t\t|--Discount--|");
        for(int i = 0;i<9;i++){
            if(i==1 || i==3){
                System.out.println((i+1)+". "+_menu[i].name+"\t\t\t"+_menu[i].price+"$  per kg"+"\t\t\t  "+_menu[i].discount);
            } else if (i==7 || i==8 || i==9) {
                System.out.println((i+1)+". "+_menu[i].name + "\t\t\t" + _menu[i].price + "$  per kg"+"\t\t\t  "+_menu[i].discount);
            } else {
                System.out.println((i+1)+". "+_menu[i].name + "\t\t\t" + _menu[i].price + "$  per kg"+"\t\t\t  "+_menu[i].discount);
            }
        }
    }

}
