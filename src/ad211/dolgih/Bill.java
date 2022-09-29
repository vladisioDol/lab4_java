package ad211.dolgih;

import java.util.ArrayList;
import java.util.Scanner;

public class Bill {
    protected double quantity;

    protected int numberOfItem;


    Scanner console = new Scanner(System.in);

    //Создаем колекцию для хранения индексов товара
    protected ArrayList<Integer> list = new ArrayList<>();

    //Создаем колекцию для хранения количества товара
    protected ArrayList<Double> listQuantity = new ArrayList<>();

    //добавляем товар в чек
    protected void addItem(){

        System.out.println("Input number of vegetables");
        numberOfItem = console.nextInt()-1;  //отнимаем 1,чтобы корректно добавлялись товары и пользователю было легче
        list.add(numberOfItem);  //добавляем индекс в колекцию

        System.out.println("How many kg do you need?");
        quantity=console.nextDouble();
        listQuantity.add(quantity); //добавляем количество в колекцию

    }
    //удаляем товар из чека
    protected void deleteItem(){
        System.out.println("Input number of vegetables to delete from Bill");
        numberOfItem = console.nextInt()-1;
        listQuantity.remove(numberOfItem); //удаляем количество из колекции
        list.remove(numberOfItem); //удаляем индекс из колекции
    }
    //выводим чек(без скидок)
    protected void showBill(Item [] _menu){
        for(int i=0;i<list.size();i++){
            System.out.println((i+1)+". "+_menu[list.get(i)].name + "\t"+listQuantity.get(i)+" kg" + " -- "+ _menu[list.get(i)].price*listQuantity.get(i));
        }
    }

}

