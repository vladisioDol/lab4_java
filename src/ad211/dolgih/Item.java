package ad211.dolgih;

public class Item {
    protected String name;
    protected double price;

    public Item(String name,double price){
        this.name = name;
        this.price = price;

    }

    //заполняем меню для обычных покупателей
    protected static void setMenu(Item [] _menu){
        String[] name ={"Tomato","Eggplant","Potato","Cucumber","Onion","Cabbage","Carrot","Parsley","Pumpkin"};
        double[] price = {2.2,3.3,1.8,2.5,4.5,5,3,1,11.5};
        for(int i=0;i<9;i++){
            _menu[i]=new Item(name[i],price[i]); //заполняем ранее созданный массив объектов
        }


    }
    //выводим меню для обычных покупателей(без скидки)
    protected static void showMenu(Item[] _menu){
        System.out.println("\t\t\t\t\tMenu\n");
        System.out.println("|--Name--|\t\t|\t--Price--\t|");
        for(int i = 0;i<9;i++){
            if(i==1 || i==3){
                System.out.println((i+1)+". "+_menu[i].name+"\t\t  "+_menu[i].price+"$  per kg");
            } else if (i==7 || i==8 || i==9) {
                System.out.println((i+1)+". "+_menu[i].name + "\t\t  " + _menu[i].price + "$  per kg");
            } else {
                System.out.println((i+1)+". "+_menu[i].name + "\t\t  " + _menu[i].price + "$  per kg");
            }
        }
        System.out.println();
    }

}
