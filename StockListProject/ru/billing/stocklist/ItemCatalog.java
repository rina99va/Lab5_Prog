package ru.billing.stocklist;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import ru.billing.exceptions.ItemAlreadyExistsException;

//import sun.net.www.content.text.Generic;

public class ItemCatalog extends GenericItem {
    private HashMap<Integer, GenericItem> catalog = new Hashmap<Integer, GenericItem> ();
    private ArrayList<GenericItem> ALCatalog = new Arraylist<GenericItem>();
    public void addItem(GenericItem item) throws ItemAlreadyExistsException{
        if (catalog.containsKey(item.getID())) {
           throw new ItemAlreadyExistsException();
        }
        catalog.put(item.getID(), item); // Добавляем товар в HashMap
        ALCatalog.add(item); // Добавляем тот же товар в ArrayList
   }
    public void printItems() {
        for (GenericItem i : ALCatalog) {
            System.out.println(i);
        }
    }
    public GenericItem findItemByID(int id) {
        if(!catalog.containsKey(id)) {
            return null;
        } else {
            return catalog.get(id);
        }
    }
    public GenericItem findItembyIDAL (int id) {
        for (GenericItem i : ALCatalog) {
            if (i.getID() == id) return i;
        }
        return null;
    }
}
