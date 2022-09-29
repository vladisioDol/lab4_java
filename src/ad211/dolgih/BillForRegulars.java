package ad211.dolgih;

public class BillForRegulars extends Bill{
    private double sumDiscount; //поле для подсчета общей скидки

    //добавляем товар в вип-чек
    public void addVipItem(){

        System.out.println("Input number of vegetables");
        numberOfItem = console.nextInt()-1;
        list.add(numberOfItem);

        System.out.println("How many kg do you need?");
        quantity=console.nextDouble();
        listQuantity.add(quantity);

    }

    //удаляем товар из вип-чека
    public void deleteVipItem(){
        System.out.println("Input number of vegetables to delete from Bill");
        numberOfItem = console.nextInt()-1;
        listQuantity.remove(numberOfItem);
        list.remove(numberOfItem);
    }

    //выводим вип-чек(со скидкой)
    public void showVipBill(ItemForRegulars [] _menu){

        for(int i=0;i<list.size();i++){
            System.out.println((i+1)+". "+_menu[list.get(i)].name + "\t"+listQuantity.get(i)+" kg" + " -- "+ (_menu[list.get(i)].price-_menu[list.get(i)].discount)*listQuantity.get(i));
            sumDiscount+=_menu[list.get(i)].discount*listQuantity.get(i);
        }
        System.out.println("You managed to save: "+ sumDiscount); //выводим общию скидку

    }
}
