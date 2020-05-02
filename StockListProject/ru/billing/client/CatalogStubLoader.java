package ru.billing.client;

import ru.billing.stocklist.Category;
import ru.billing.stocklist.FoodItem;
import ru.billing.stocklist.GenericItem;
import ru.billing.stocklist.ItemCatalog;
import ru.billing.exceptions.CatalogLoadException;
import ru.billing.exceptions.ItemAlreadyExistsException;
import java.util.Date;

public class CatalogStubLoader implements CatalogLoader {

    public void load(ItemCatalog cat){
        GenericItem item1 = new GenericItem("Sony TV&",23000, Category.GENERAL);
        FoodItem item2 = new FoodItem("Bread",12,null,new Date(),(short)10);
        /*itemCatalog.addItem(item1);
        itemCatalog.addItem(item2);*/
        try {
            cat.addItem(item1);
            cat.addItem(item2); }
            catch (ItemAlreadyExistsException e) { // TODO Auto-generated catch block
            e.printStackTrace();  
            throw new CatalogLoadException(e);
            }
    }
}