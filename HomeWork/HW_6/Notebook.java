//Notebook: 
//parameters: id, name, manufacture, size, color, processor, screenSize, RAM, diskSize, videoCard
//metods: specPrint, changeStatus, installOperationSystem

package HomeWork.HW_6;

import java.util.Locale;

public class Notebook {
    String name;
    String manufacture;
    int weight;
    String color;
    String processor;
    int screenSize;
    int RAM;
    int diskSize;
    int year;
    String operationSystem;
    String status;
    double price;
    int discont;

    public Notebook(String manufacture, String name, String color, int screenSize, int weight, String processor, int RAM, int diskSize, int year) {
        this.manufacture = manufacture;
        this.name = name;
        this.color = color;
        this.screenSize = screenSize;
        this.weight = weight;
        this.processor = processor;
        this.RAM = RAM;
        this.diskSize = diskSize;
        this.year = year;
    }

    public void printSpecification() {
        System.out.println(String.format(Locale.FRANCE, "Ноутбук %s %s %d\" (память %d Гб / диск %d Гб / %d год / %s, вес %d г) - %,.2f ₽", manufacture, name, screenSize, RAM, diskSize, year, color, weight, price - (discont*price/100)));
    }

    public void changeStatus(String newStatus) {
        this.status = newStatus;
    }

    public void installOperationSystem( String newOS) {
        this.operationSystem = newOS;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscont( int discont) {
        this.discont = discont;
    }

    public void printPrice() {
        System.out.println(String.format(Locale.FRANCE, "цена со скидкой %,.2f ₽", price - (discont*price/100)));
    }
}
