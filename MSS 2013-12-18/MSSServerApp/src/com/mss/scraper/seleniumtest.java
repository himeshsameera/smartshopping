/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mss.scraper;

    
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Himesh_2
 */
public class seleniumtest {

    public static void main(String[] args) {
        // Create a new instance of the html unit driver
        // Notice that the remainder of the code relies on the interface, 
        // not the implementation.
        WebDriver driver = new HtmlUnitDriver(true);      
        JavascriptExecutor js;
        driver.get("https://www.keellssuper.com/defaultnew.asp");
        WebElement sel_1 = driver.findElement(By.name("MainDeliCity"));
        selectValueFromDropDownList(sel_1, "1");
        WebElement sel_2 = driver.findElement(By.name("DeliCity"));
        selectValueFromDropDownList(sel_2, "1");
        String pageSource = driver.getPageSource();
        HashMap<String, ArrayList<String>> mapping = new HashMap<String, ArrayList<String>>();
            ArrayList<String> Athurugiriya = new ArrayList<String>(){{
                add("119"); add("64"); add("123"); add("120"); add("122"); add("121"); add("321");
            }};//"214"
             mapping.put("214",Athurugiriya);
            
            ArrayList<String> Attidiya = new ArrayList<String>() {{
                add("45"); add("146"); add("159"); add("161"); add("168");
            }};//"45"
            mapping.put("45",Attidiya);
            
            ArrayList<String> Battaramulla = new ArrayList<String> (){{
                add("16"); add("67") ;add("38");
            }};//"16"
            
            mapping.put("16",Battaramulla);
            
            ArrayList<String> Biyagama = new ArrayList<String> (){{
                add("98");
            }};//"215"
            mapping.put("215",Biyagama);
            
            ArrayList<String> Boralesgamuwa = new ArrayList<String> (){{
                add("33"); add("137");
            }};//"33"
            mapping.put("33",Boralesgamuwa);
            
            ArrayList<String> Colombo_1 = new ArrayList<String>() {{
                add("1"); add("215");
            }};//"1"
            mapping.put("1",Colombo_1);
                        
            ArrayList<String> Colombo_2 = new ArrayList<String> (){{
                add("2"); add("227"); add("272"); add("216");
            }};//"2"
            mapping.put("2",Colombo_2);
            
            ArrayList<String> Colombo_3 = new ArrayList<String> (){{
                add("3"); add("217");
            }};//"3"
            mapping.put("3",Colombo_3
                    );
            ArrayList<String> Colombo_4 = new ArrayList<String>() {{
                add("145"); add("4"); add("187");
            }};//"4"
            mapping.put("4", Colombo_4);

            ArrayList<String> Colombo_5 = new ArrayList<String> (){{
                add("5");add("218"); add("192"); add("200"); add("205"); add("207");
            }};//"5"
            mapping.put("5", Colombo_5);
            
            ArrayList<String> Colombo_6 = new ArrayList<String> (){{
                add("6"); add("69");       
            }};//"6"
            mapping.put("6", Colombo_6);
            
            ArrayList<String> Colombo_7 = new ArrayList<String> (){{
                add("219"); add("14"); add("208");
            }};//"14"
            mapping.put("14", Colombo_7);
            
            ArrayList<String> Colombo_8 = new ArrayList<String> (){{
                add("108"); add("17");
            }};//"17"
            mapping.put("17", Colombo_8);
            
            ArrayList<String> Colombo_9 = new ArrayList<String> (){{
                add("220");
            }};//"239"
            mapping.put("220", Colombo_9);
            
            ArrayList<String> Colombo_10 = new ArrayList<String> (){{
                add("19"); add("221");
            }};//"19"
            mapping.put("19", Colombo_10);
            
            ArrayList<String> Colombo_11 = new ArrayList<String> (){{
                add("20"); add("222");}};//"20"
            mapping.put("20", Colombo_11);
            
            ArrayList<String> Colombo_12 = new ArrayList<String> (){{
                add("274");
            }};//"21"
            mapping.put("21", Colombo_12);
            
            ArrayList<String> Colombo_13 = new ArrayList<String> (){{
                add("22"); add("223");
            }};//"22"
            mapping.put("22", Colombo_13);
            ArrayList<String> Colombo_14 = new ArrayList<String> (){{
                add("23"); add("224");
            }};//"23"
            mapping.put("23", Colombo_14);
            
            ArrayList<String> Colombo_15 = new ArrayList<String> (){{
                add("24"); add("226"); add("225");
            }};//"24"
            mapping.put("24", Colombo_15);
            
            ArrayList<String> Dehiwala = new ArrayList<String> (){{
                add("28"); add("47");
            }};//"28"
            mapping.put("28",Dehiwala);
            
            ArrayList<String> Galle = new ArrayList<String> (){{
                add("294"); add("289"); add("297"); add("281"); add("293");
                add("275"); add("278"); add("300"); add("291"); add("296");
                add("277"); add("295"); add("280"); add("285"); add("288");
                add("276"); add("287"); add("292"); add("299"); add("301");
                add("283"); add("279"); add("286"); add("284"); add("298");
                add("290"); add("282");
            }};//"263"
            mapping.put("263",Galle);
            
            ArrayList<String> Gampaha = new ArrayList<String>() {{
                add("81");  add("79");  add("103"); add("85");  add("83"); 
                add("82");  add("84");  add("76");  add("77");  add("80");
                add("78");
            }};//"103"
            mapping.put("103",Gampaha);
            
            ArrayList<String> Ja_Ela = new ArrayList<String> (){{
                add("90");  add("91");  add("93");  add("11");  add("94"); 
                add("92");
            }};//"11"
            mapping.put("11",Ja_Ela);
            
            ArrayList<String> Jawatta = new ArrayList<String> (){{ 
                add("164");
            }};//"216"
            mapping.put("216",Jawatta);
            
            ArrayList<String> Jayawardanapura = new ArrayList<String> (){{
                add("124");
            }};//"217"
            mapping.put("217",Jayawardanapura);
            
            ArrayList<String> Kadawatha = new ArrayList<String> (){{
                add("37");
            }};//"218"
            mapping.put("218",Kadawatha);
            
            ArrayList<String> Kalalgoda = new ArrayList<String> (){{
                add("270");
            }};//"262"  
            mapping.put("262",Kalalgoda);
            
            ArrayList<String> Kalapaluwawa = new ArrayList<String> (){{
                add("134");
            }};//"219"
            mapping.put("219",Kalapaluwawa);
            
            ArrayList<String> Kalubowila = new ArrayList<String> (){{
                add("140");
            }};//"238"
            mapping.put("238",Kalubowila);
            
            ArrayList<String> Kandana = new ArrayList<String> (){{ 
                add("88"); add("86"); add("190"); add("250"); add("87");
            }};//"221"
            mapping.put("221",Kandana);
            
            ArrayList<String> Kandy = new ArrayList<String> (){{ 
                add("240"); add("243"); add("231"); add("252"); add("249");
                add("253"); add("254"); add("236"); add("255"); add("256"); 
                add("257"); add("258"); add("259"); add("237"); add("260"); 
                add("261"); add("247"); add("230"); add("235"); add("239");
                add("262"); add("263"); add("242"); add("228"); add("248"); 
                add("241"); add("264"); add("233"); add("265"); add("266"); 
                add("267"); add("268");
            }};//"261"_________________Akurana;Ambatanna;Ampitiya;Aniwaththa Balagolla Bowala Boyagama Boyagoda Dangolla
                        ////Dodanwala  Elugoda Galaha Gatabe Gurudeniya Hanthana Heerassagala Kandy Katugastota Kiribathkumbura Kundasale Madabowala
                            ///Mahakanda Panwila Penideniya Pilimatalawa Peradeniya Polgahamula Polgolla Rajawaththa Suduhumpola Udabowala Yatiyalagala
            mapping.put("261",Kandy);
            
            ArrayList<String> Katunayaka = new ArrayList<String> (){{
                add("170");
            }};//"222"
            mapping.put("222", Katunayaka);
            ArrayList<String> Kelaniya = new ArrayList<String> (){{
                add("34");add("100");
            }};//"34"       
            mapping.put("34",Kelaniya);
            
            ArrayList<String> Kiribathgoda = new ArrayList<String> (){{
                add("36");  add("99");
            }};//"223"_________//Kiribathgoda;Waragoda
            mapping.put("223",Kiribathgoda);
            
            ArrayList<String> Kirulapone = new ArrayList<String> (){{
                add("269");
            }};//"10"   //Kirulapone
            mapping.put("10",Kirulapone);
            
            ArrayList<String> Kohuwala = new ArrayList<String> (){{
                add("139");add("141"); 
            }};//"224"_______Kohuwala;Pamankada
            mapping.put("224",Kohuwala);
            
            ArrayList<String> Kolonnawa = new ArrayList<String> (){{
                add("127");
            }};//"225"________Wellampitiya
            mapping.put("225",Kolonnawa);
            
            ArrayList<String> Kottawa = new ArrayList<String> (){{
                add("58"); add("53"); add("68"); add("59"); add("60"); 
                add("51"); add("55"); add("52");
            }};//"226"______Arawwala;Dollekada;Kottawa;Liyanagoda;Makumbura;Pinhena;Polkotuwa;Siddamulla
            mapping.put("226",Kottawa);
            
            ArrayList<String> Kotte = new ArrayList<String> (){{
                add("25"); add("107"); add("61");
            }};//"227"_______Ethul Kotte;Madiwela - kotte;Pitakotte
            mapping.put("227",Kotte);
            
            ArrayList<String> Kurunegala = new ArrayList<String> (){{
                add("151"); add("163"); add("212"); add("183"); add("184"); 
                add("186"); add("188"); add("196"); add("197"); add("201");
                add("206"); add("213"); add("211"); 
            }};
            //"228"______Dambokka;Hanhamuna;Kurunegala;Mallawapitiya;Maspotha;Mawathagama;Millawa;Piduruwella;Pilassa;Pothuhara;Thorayaya;Wanduragala;Wellawa
            mapping.put("228",Kurunegala);
            
            ArrayList<String> Mahabage = new ArrayList<String> (){{
                add("181"); add("32");
            }};//"229"_____Mahabage;Welisara
            mapping.put("229", Mahabage);
            
            ArrayList<String> Maharagama = new ArrayList<String> (){{
                add("26"); add("138");
            }};//"26"_______Maharagama;Nawinna
            mapping.put("26", Maharagama);
            
            ArrayList<String> Malabe = new ArrayList<String> (){{
                add("273"); add("44"); add("63"); add("66");
            }};//"44"____Kothalawala;Malabe;Pittugala;Talahena
            mapping.put("44", Malabe);
            
            ArrayList<String> Matara = new ArrayList<String> (){{
                add("310"); add("305"); add("317"); add("307"); add("306"); 
                add("308"); add("303"); add("315"); add("314"); add("309"); 
                add("313"); add("302"); add("304"); add("316"); add("312");
                add("311");
            }};//"23"________Devinuwara;Kabumrugamuwa;Labeema;Maddawaththa;Madiha;Nupe;Paburana;Paramulla;Polhena;Thalaraba;Thotamuna;Uyanwaththa;Walgama;Walgoda;Walpola;Weragampita
            mapping.put("23", Matara);
            
            ArrayList<String> Moratuwa = new ArrayList<String> (){{
                add("40");  add("322"); add("320"); add("42");  add("7"); 
                add("323"); add("41");  add("318"); add("319"); add("324");
            }};//"7"  ________Angulana; Katubedda;Laxapathiya;Lunawa;Moratuwa;Piliyandala;Rawathawatta;Soysapura;Suwarapola
            mapping.put("7", Moratuwa);
            
            ArrayList<String> Mount_Lavinia = new ArrayList<String> (){{
                add("29");
            }};//"29"______Mount Lavinia
            mapping.put("29", Mount_Lavinia);
            
            ArrayList<String> Mulleriyawa = new ArrayList<String> (){{
                add("132"); add("133");
            }};//"230"______Aggona;Angoda
            mapping.put("230",Mulleriyawa);
            
            ArrayList<String> Nawala = new ArrayList<String> (){{
                add("31");
            }};//"31"____Nawala
            mapping.put("31",Nawala);
            
            ArrayList<String> Negombo = new ArrayList<String> (){{
                add("142"); add("149"); add("150"); add("154"); add("156"); 
                add("157"); add("166"); add("167"); add("172"); add("173"); 
                add("174"); add("175"); add("177"); add("178"); add("194"); 
                add("199"); add("203");
            }};//"231"__________Adiambalama;Dalupotha;Daluwakotuwa;Demanhandiya;Eththukala;Galmankada;Kadirana;Kadol Kale;Kimbulapitiya;Kochchikade;Kovinna;Kurana;Kurunda;Lellama;Negombo;Pitipana;Ruckaththana
            mapping.put("231",Negombo);
            
            ArrayList<String> Nugegoda = new ArrayList<String> (){{
                add("105"); add("135"); add("189"); add("15"); add("195");
                add("209"); add("136");
            }};//"15"___________Ambuldeniya;Delkanda;Mirihana;Nugegoda;Pagoda;Udahamulla;Wijerama
            mapping.put("15",Nugegoda);
            
            ArrayList<String> Panadura = new ArrayList<String> (){{
                add("162");  add("182"); add("191"); add("35"); add("198"); 
                add("210");
            }};//"35"___________Gorakana;Mahawilla;Naluruwa;Panadura;Pinwaththa;Walana
            mapping.put("35",Panadura);
            
            ArrayList<String> Pannipitiya = new ArrayList<String> (){{
                add("57");
            }};//"232"___________Pannipitiya
            mapping.put("232",Pannipitiya);
            
            ArrayList<String> Peliyagoda = new ArrayList<String> (){{
                add("12");
            }};//"12"___________Peliyagoda
            mapping.put("12", Peliyagoda);
            
            ArrayList<String> Pepiliyana = new ArrayList<String> (){{
                add("48");
            }};//"219"___________Pepiliyana
            mapping.put("219", Pepiliyana);
            
            ArrayList<String> Polgasowita = new ArrayList<String> (){{
                add("54"); add("50");
            }};//"234"___________Kudamaduwa;Mattegoda
            mapping.put("234",Polgasowita);
            ArrayList<String> Rajagiriya = new ArrayList<String> (){{
                add("30"); add("62");
            }};//"30"___________Rajagiriya;Welikada
            mapping.put("30", Rajagiriya);
            
            ArrayList<String> Ratmalana = new ArrayList<String> (){{
                add("214");
            }};//"27"___________Ratmalana
            mapping.put("27",Ratmalana);
            
            ArrayList<String> Seeduwa = new ArrayList<String> (){{
                add("202");add("89");
            }};//"236"__________Raddolugama;Seeduwa
            mapping.put("236",Seeduwa);
            
            ArrayList<String> Thalawatugoda = new ArrayList<String> (){{
                add("65");add("271");
            }};//"237"________Hokandara;Thalawatugoda
            mapping.put("237",Thalawatugoda);
            
            ArrayList<String> Union_Place = new ArrayList<String> (){{
                add("251");
            }};//"260"_______Union Place
            mapping.put("260",Union_Place);
            
            ArrayList<String> Wattala = new ArrayList<String> (){{
                add("96"); add("102"); add("171"); add("180"); add("8");
            }};//"8"_______Enderamulla;Hendala;Kerawalapitiya;Mabole;Wattala
            mapping.put("8",Wattala);
      
        String selectedValue = "String";
        System.out.println("Page title is: " + driver.getTitle());
        Iterator<Map.Entry<String, ArrayList<String>>> iterator = mapping.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            String key = (String) entry.getKey();
            ArrayList<String> subList = (ArrayList<String>) entry.getValue();
            driver.get("https://www.keellssuper.com/defaultnew.asp");
            WebElement select_1 = driver.findElement(By.name("MainDeliCity"));
            selectValueFromDropDownList(select_1, key);
            for(String sub : subList){
                WebElement select_2 = driver.findElement(By.name("DeliCity"));
                selectValueFromDropDownList(select_2, sub);
                try{
                    String [] productTypes = new String[]{"A","B","C","S","D","F","G","H","L","M","V","W"};
                    String [] productTypeName = new String[]{"Bakery","Beverages","Chilled","Fish"
                            ,"Frozen Foods","Fruits","Grocery","Household","Liquor","Meats","Vegetables","Homeware"};
                    for(int i = 0; i<productTypes.length;i++){
                        if (driver instanceof JavascriptExecutor) {
                            js = (JavascriptExecutor)driver;
                            //js.executeScript("return CheckCity('"+type+"');");
                        }
                        WebElement element = driver.findElement(By.xpath("//a[contains(text(),'"+productTypeName[i]+"')]"));/////href='javascript:CheckCity('"+productTypes[i]+"')'
                        element.click();
                        pageSource = (driver.getPageSource());
                        File newTextFile = new File(key+"_"+sub+"_"+productTypes[i]+".html");
                        FileWriter fileWriter = new FileWriter(newTextFile);
                        fileWriter.write(pageSource);
                        fileWriter.close();  
                    } 
                }catch (IOException ex) {
                    Logger.getLogger(seleniumtest.class.getName()).log(Level.SEVERE, null, ex);
                }
                    
                
            }
        }
        
    }
    
    
    // credit goes to 
    // http://stackoverflow.com/questions/16458538/how-to-select-value-from-dropdown-using-java-selenium-web-driver
    public static void selectValueFromDropDownList(WebElement dropDownList, final String value) {
        List<WebElement> options = dropDownList.findElements(By.tagName("option"));

        for (WebElement option : options) {
            if (value.equals(option.getText())) {
                option.click();
                break;
            }
        }
    }
    
}

