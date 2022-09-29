package ad211.dolgih;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello my friend. Are u Regular customer?");
        System.out.println("1.Yes\n2.No");

        Scanner console = new Scanner(System.in);

        boolean isRegular=true;
        byte answer = console.nextByte();

        if(answer==2){
            isRegular=false;
        }

        //создаем массив объектов на товары для обычных покупателей
        Item[] menu = new Item[9];
        Item.setMenu(menu);
        //создаем массив объектов на товары для вип-покупателей
        ItemForRegulars[] vipMenu = new ItemForRegulars[9];
        ItemForRegulars.setMenuForRegulars(vipMenu);
        //создаем класс для обычного чека
        Bill bill = new Bill();
        //создаем класс для вип-чека
        BillForRegulars vipBill = new BillForRegulars();
        while (answer!=4){
            System.out.println("1.Show menu");
            System.out.println("2.Add a new Item");
            System.out.println("3.Delete Item");
            System.out.println("4.Show Bill and Exit");

            answer = console.nextByte();
            switch (answer){
                case 1:{
                    if(isRegular==false){
                        Item.showMenu(menu);
                    }else{
                        ItemForRegulars.showMenuForRegulars(vipMenu);
                    }
                    break;
                }
                case 2:{
                    if(isRegular==false) {
                        bill.addItem();
                    }else{
                       vipBill.addVipItem();
                    }
                    break;
                }
                case 3:{
                    if(isRegular==false) {
                        bill.deleteItem();
                    }else{
                        vipBill.deleteVipItem();
                    }
                    break;
                }
                case 4:{
                    if(isRegular==false) {

                        bill.showBill(menu);

                    }else{
                        vipBill.showVipBill(vipMenu);
                    }
                    break;
                }
                default:{
                    System.out.println("Error");
                }
            }
        }
    console.close();
    }

}

