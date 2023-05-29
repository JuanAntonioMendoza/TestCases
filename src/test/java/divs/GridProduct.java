package divs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;
import resources.AttributeInput;
import resources.DriverFactory;
import io.cucumber.datatable.DataTable;
import resources.SoftAssertError;
import resources.genkiresources.DataTableGridGenki;

import java.util.*;

interface MiInterfaz {
    void ejecutar();
}
public class GridProduct {

    WebDriver driver = DriverFactory.getDriver();
    SoftAssert softAssert = new SoftAssert();
    private boolean existInSearch = false;

    public boolean isExistInSearch() {
        return existInSearch;
    }

    public void setExistInSearch(boolean existInSearch) {
        this.existInSearch = existInSearch;
    }

    public static GridProduct getGridProduct() {
        return new GridProduct();
    }

    public static Map<String, List<AttributeInput>> labels_Product = new HashMap() {
        {
            Collection<AttributeInput> listPicture = new ArrayList<>();

            AttributeInput picture1 = new AttributeInput("a","","href","",false);
            AttributeInput picture2 = new AttributeInput("a","","title","",false);
            AttributeInput picture3 = new AttributeInput("img","","alt","",false);
            AttributeInput picture4 = new AttributeInput("img","","src","",false);
            AttributeInput picture5 = new AttributeInput("img","","title","",false);
            listPicture.add(picture1);
            listPicture.add(picture2);
            listPicture.add(picture3);
            listPicture.add(picture4);
            listPicture.add(picture5);

            put("picture",listPicture);

            Collection<AttributeInput> listDetails = new ArrayList<>();

            AttributeInput detail1 = new AttributeInput("h2","product-title","","",false);
            AttributeInput detail2 = new AttributeInput("a","","href","",false);
            AttributeInput detail3 = new AttributeInput("div","product-rating-box","title","",false);
            AttributeInput detail4 = new AttributeInput("div","rating","","",false);
            AttributeInput detail5 = new AttributeInput("div","","style","",false);
            AttributeInput detail6 = new AttributeInput("div","description","data-short-description","",false);
            AttributeInput detail7 = new AttributeInput("div","add-info","","",false);
            AttributeInput detail8 = new AttributeInput("div","prices","","",true);
            AttributeInput detail9 = new AttributeInput("span","price old-price","","",false);
            AttributeInput detail10 = new AttributeInput("span","price actual-price","","",true);
            AttributeInput detail11 = new AttributeInput("div","buttons","","",true);
            AttributeInput detail12 = new AttributeInput("button","button-2 product-box-add-to-cart-button","type","Add to cart",true);
            AttributeInput detail13 = new AttributeInput("button","button-2 product-box-add-to-cart-button","onclick","Add to cart",true);
            AttributeInput detail14 = new AttributeInput("button","button-2 add-to-compare-list-button","type","Add to compare list",false);
            AttributeInput detail15 = new AttributeInput("button","button-2 add-to-compare-list-button","title","Add to compare list",false);
            AttributeInput detail16 = new AttributeInput("button","button-2 add-to-compare-list-button","onclick","Add to compare list",false);
            AttributeInput detail17 = new AttributeInput("button","button-2 add-to-wishlist-button","type","Add to wishlist",true);
            AttributeInput detail18 = new AttributeInput("button","button-2 add-to-wishlist-button","title","Add to wishlist",true);
            AttributeInput detail19 = new AttributeInput("button","button-2 add-to-wishlist-button","onclick","Add to wishlist",true);

            listDetails.add(detail1);listDetails.add(detail2);listDetails.add(detail3);
            listDetails.add(detail4);listDetails.add(detail5);listDetails.add(detail6);
            listDetails.add(detail7);listDetails.add(detail8);listDetails.add(detail9);
            listDetails.add(detail10);listDetails.add(detail11);listDetails.add(detail12);
            listDetails.add(detail13);listDetails.add(detail14);listDetails.add(detail15);
            listDetails.add(detail16);listDetails.add(detail17);listDetails.add(detail18);
            listDetails.add(detail19);

            put("details",listDetails);

        }
    };

    public GridProduct findValue(DataTable table, String item) {

        List<List<String>> cucumberCSV = table.asLists();

        if (!cucumberCSV.isEmpty()) {
            Deque<List<String>> deque = new ArrayDeque<>(cucumberCSV);
            deque.removeFirst();
            cucumberCSV = new ArrayList<>(deque);
        }else{
            softAssert.fail("Don't exist data");
            softAssert.assertAll();
        }

        Collection<DataTableGridGenki> collection = new ArrayList<>();
        for (List<String> row : cucumberCSV) {
            String[] array = row.toArray(new String[0]);
            DataTableGridGenki dataTableGridGenki = new DataTableGridGenki(array[0], array[1], array[2], array[3], array[4],array[5]);
            collection.add(dataTableGridGenki);
        }
        int contLap = 0;
        int contPass = 0;
        List<WebElement> elementsDiv = driver.findElements(By.className(item));
//        System.out.println(elementsDiv.size());
        for (DataTableGridGenki element : collection) {
            for (WebElement elementDiv : elementsDiv) {
                //Declarar variables
                boolean existValueClass = false;
                boolean existValueText = false;
                boolean existValueLabel = false;
                List<WebElement> elements = elementDiv.findElements(By.cssSelector("*"));
                for (WebElement elementLabel : elements) {
                    existValueLabel = elementLabel.getTagName().equals(element.getLabel_name());



                    if (element.getClass_input() == null)
                        element.setClass_input("");
                    existValueClass = element.getClass_input().equals(elementLabel.getAttribute("class"));

                    if (element.getText_value() == null)
                        element.setText_value("");

//                    if(elementLabel.getTagName().equals("span") && element.getClass_input().equals("price actual-price") ){
//                        System.out.println(elementLabel.getText());
//                        System.out.println(element.getText_value());
//                    }
                    switch (element.getText_value()){
                        case "NotNull":
                            if(elementLabel.getText().equals("") || elementLabel.getText().equals(null))
                                existValueText = false;
                            else
                                existValueText = true;
                            break;
                        default:
//                            existValueText = elementLabel.getText().equals(element.getText_value());
                            existValueText = true;
                    }


                    if(existValueLabel && existValueClass && existValueText) {
                        contPass++;
                        break;
                    }
                }

                contLap++;
                if(contLap == elementsDiv.size()){
                    System.out.println("Contador de pasado " + contPass + " Contador de vueltas " + contLap);
                    contLap = 0;
                    if(contPass < elementsDiv.size()){
                        softAssert.fail("Don't exist data: " + element.toString());
                        softAssert.assertAll();
                    }
                    contPass = 0;
                }
            }
        }
        return  this;
    }
    public GridProduct findValue1(DataTable table) throws Exception {

        List<List<String>> cucumberCSV = table.asLists();

        if (!cucumberCSV.isEmpty()) {
            Deque<List<String>> deque = new ArrayDeque<>(cucumberCSV);
            deque.removeFirst();
            cucumberCSV = new ArrayList<>(deque);
        }else{
            softAssert.fail("Don't exist data");
            softAssert.assertAll();
        }

        Collection<DataTableGridGenki> collection = new ArrayList<>();
        for (List<String> row : cucumberCSV) {
            String[] array = row.toArray(new String[0]);
            DataTableGridGenki dataTableGridGenki = new DataTableGridGenki(array[0], array[1], array[2], array[3], array[4],array[5]);
            collection.add(dataTableGridGenki);
        }

        boolean haveIssues = false;
        for (DataTableGridGenki element : collection) {
            if(!contentValue1(element.getSection(),element)){
                haveIssues = true;
                softAssert.fail("I couldn't find this item : "  + element.toString());
            }
        }

        if(haveIssues)
            softAssert.assertAll();

        return this;
    }

    public Boolean contentValue1(String section, DataTableGridGenki value) {
        boolean existValue = false;
        Collection<AttributeInput> collectionPicture = labels_Product.get(section);
//        System.out.println("Busca esto: " + value.toString());
        for (AttributeInput element : collectionPicture) {
            boolean existValueLabel = element.getInputName().equals(value.getLabel_name());

            if (value.getClass_input() == null)
                value.setClass_input("");
            boolean existValueClass = element.getClassName().equals(value.getClass_input());

            boolean existValueText = false;
            if (value.getText_value() == null)
                value.setText_value("");

            switch (value.getText_value()){
//                case "":
//                    existValueText = element.getTextValue().equals("");
                case "NotNull":
                    if (element.getTextValue().equals(value.getText_value()))
                        existValueText = false;
                    else
                        existValueText = true;
                break;
                default:
                    existValueText = element.getTextValue().equals(value.getText_value());

            }
            if(value.getLabel_name().equals("span") && element.getClassName().equals("price actual-price")){
                System.out.println( value.getLabel_name() + " " + existValueLabel + " " + existValueClass + " " + existValueText );
                System.out.println("getText_value " + value.getText_value());
                System.out.println("element " + element.getTextValue());
            }


            if(existValueLabel && existValueClass && existValueText) {
                existValue = true;
                break;
            }
        }
        System.out.println("Value: " + existValue);
        return existValue;
    }


}
