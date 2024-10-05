import java.util.*;
class FoodOrder{
    //declaring variables for prices of food items
    int chickenBiryani=180;
    int paneerBiryani=150;
    int vegExtravaganze=249;
    int butterChicken = 300;
    int arabianShawarma = 150;
    int dalMakhani = 169;
    int choleyBhatura =  249;
    int mixVegetable = 279;
    int ch;
    int quantity;
    static int total;
    String again;
    HashMap<String,Integer> mp = new HashMap<>();

    Scanner sc=new Scanner(System.in);

    //creating a method for displaying food menu

    public void displayMenu()
    {
        System.out.println("***********Welcome to our Restaurant***********");
        System.out.println("===============================================");
        System.out.println("        0. Reset Order");
        System.out.println("        1. Chicken Biryani           180/-");
        System.out.println("        2. Paneer Biryani            150/-");
        System.out.println("        3. Veg Extravaganza          249/-");
        System.out.println("        4. Butter Chicken            300/-");
        System.out.println("        5. Arabian Shawarma          150/-");
        System.out.println("        6. Dal Makhani Rice Bowl     169/-");
        System.out.println("        7. Choley Bhatura            249/-");
        System.out.println("        8. Mix Vegetable             279/-");
        System.out.println("        9. Remove Item ");
        System.out.println("        10. Exit ");
        System.out.println("        11. Get Item Price ");
        System.out.println("==============================================");
        System.out.println("        What do you want to order today ? ");
    }

    //method to generate bill

    public void generateBill()
    {
        System.out.println();
        if(total<0)
        {
            total=0;
            System.out.println("************Order Unsuccessful************");
            System.out.println("************Thankyou******************");
        }
        else
        {
            System.out.println("************Thankyou for ordering*************");
        }
        System.out.println();
        displayOrderSummary();
        System.out.println("************Your Bill is "+total+" **************");
        System.out.println();
        System.out.println();
    }

    //method for displaying the order summary

    public void displayOrderSummary() 
    {
        System.out.println("*************Order Summary*************");
        for (var i:mp.entrySet()) 
        {
            String itemName = i.getKey();
            int itemQuantity = i.getValue();
            System.out.println(itemName + " x " + itemQuantity);
        }
        System.out.println("**************************************");
    }

    //method for reseting the order

    public void reset()
    {
        total=0;
    }

    //creating a method to remove an item

    public void removeItem(int itemNumber,int quantity)
    {
        switch(itemNumber)
        {
            case 1:
                System.out.println("Removing chickenBiryani from the menu");
                if(mp.get("Chicken Biryani")>=quantity) total -= quantity*chickenBiryani;
                else System.out.println("Removal failed");
                break;

            case 2:
                System.out.println("Removing Paneer Biryani from the menu");
                if(mp.get("Paneer Biryani")>=quantity) total -= quantity*paneerBiryani;
                else System.out.println("Removal failed");
                break;

            case 3:
                System.out.println("Removing Veg Extravaganza from the menu");
                if(mp.get("Veg Extravaganza")>=quantity) total -= quantity*vegExtravaganze;
                else System.out.println("Removal failed");
                break;

            case 4:
                System.out.println("Removing Butter Chicken from the menu");
                if(mp.get("Butter Chicken")>=quantity) total -= quantity*butterChicken;
                else System.out.println("Removal failed");
                break;

            case 5:
                System.out.println("Removing Arabian Shawarma from the menu");
                if(mp.get("Arabian Shawarma")>=quantity) total -= quantity*arabianShawarma;
                else System.out.println("Removal failed");
                break;

            case 6:
                System.out.println("Removing Dal Makhani Rice Bowl from the menu");
                if(mp.get("Dal Makhani Rice Bowl")>=quantity) total -= quantity*dalMakhani;
                else System.out.println("Removal failed");
                break;

            case 7:
                System.out.println("Removing Choley Bhatura from the menu");
                if(mp.get("Choley Bhatura")>=quantity) total -= quantity*choleyBhatura;
                else System.out.println("Removal failed");
                break;

            case 8:
                System.out.println("Removing Mix Vegetable from the menu");
                if(mp.get("Mix Vegetable")>=quantity) total -= quantity*mixVegetable;
                else System.out.println("Removal failed");
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }

    //get the price of given item

    public int getItemPrice(String itemName) 
    {
        switch (itemName) 
        {
            case "Chicken Biryani":
                return chickenBiryani;
            case "Paneer Biryani":
                return paneerBiryani;
            case "Veg Extravaganza":
                return vegExtravaganze;
            case "Butter Chicken":
                return butterChicken;
            case "Arabian Shawarma":
                return arabianShawarma;
            case "Dal Makhani Rice Bowl":
                return dalMakhani;
            case "Choley Bhatura":
                return choleyBhatura;
            case "Mix Vegetable":
                return mixVegetable;
            default:
                System.out.println("Currently Unavailable");
                return 0;
        }
    }

    //creating a method for ordering a food item

    public void order()
    {
        while(true)
        {
            System.out.println("Enter your choice: ");
            ch=sc.nextInt();
            switch(ch)
            {
                case 0:
                    reset();
                    System.out.println("Order reset Successfully");
                    break;

                case 1: //Chicken Biryani
                    System.out.println("You have selected Chicken Biryani");
                    System.out.println();
                    System.out.println("Enter the desired Quantity ");
                    quantity=sc.nextInt();
                    total += quantity*chickenBiryani;

                    if(!mp.containsKey("Chicken Biryani"))
                    {
                        mp.put("Chicken Biryani",quantity);
                    }
                    else
                    {
                        mp.put("Chicken Biryani",mp.get("Chicken Biryani")+quantity);
                    }
                    break;

                case 2: //Paneer Biryani
                    System.out.println("You have selected Paneer Biryani");
                    System.out.println();
                    System.out.println("Enter the desired Quantity ");
                    quantity=sc.nextInt();
                    total= total + quantity*paneerBiryani;

                    if(!mp.containsKey("Paneer Biryani"))
                    {
                        mp.put("Paneer Biryani",quantity);
                    }
                    else
                    {
                        mp.put("Paneer Biryani",mp.get("Paneer Biryani")+quantity);
                    }
                    break;

                case 3: //Veg Extravaganza 
                    System.out.println("You have selected Veg Extravaganza ");
                    System.out.println();
                    System.out.println("Enter the desired Quantity ");
                    quantity=sc.nextInt();
                    total= total + quantity*vegExtravaganze;

                    if(!mp.containsKey("Veg Extravaganza"))
                    {
                        mp.put("Veg Extravaganza",quantity);
                    }
                    else
                    {
                        mp.put("Veg Extravaganza",mp.get("Veg Extravaganza")+quantity);
                    }
                    break;

                case 4: //Butter Chicken 
                    System.out.println("You have selected Butter Chicken ");
                    System.out.println();
                    System.out.println("Enter the desired Quantity ");
                    quantity=sc.nextInt();
                    total= total + quantity*butterChicken;

                    if(!mp.containsKey("Butter Chicken"))
                    {
                        mp.put("Butter Chicken",quantity);
                    }
                    else
                    {
                        mp.put("Butter Chicken",mp.get("Butter Chicken")+quantity);
                    }
                    break;

                case 5: //Arabian Shawarma 
                    System.out.println("You have selected Arabian Shawarma ");
                    System.out.println();
                    System.out.println("Enter the desired Quantity ");
                    quantity=sc.nextInt();
                    total= total + quantity*arabianShawarma;

                    if(!mp.containsKey("Arabian Shawarma"))
                    {
                        mp.put("Arabian Shawarma",quantity);
                    }
                    else
                    {
                        mp.put("Arabian Shawarma",mp.get("Arabian Shawarma")+quantity);
                    }
                    break;

                case 6: //Dal Makhani Rice Bowl
                    System.out.println("You have selected Dal Makhani Rice Bowl");
                    System.out.println();
                    System.out.println("Enter the desired Quantity ");
                    quantity=sc.nextInt();
                    total= total + quantity*dalMakhani;

                    if(!mp.containsKey("Dal Makhani Rice Bowl"))
                    {
                        mp.put("Dal Makhani Rice Bowl",quantity);
                    }
                    else
                    {
                        mp.put("Dal Makhani Rice Bowl",mp.get("Dal Makhani Rice Bowl")+quantity);
                    }
                    break;

                case 7: //Choley Bhatura   
                    System.out.println("You have selected Choley Bhatura   ");
                    System.out.println();
                    System.out.println("Enter the desired Quantity ");
                    quantity=sc.nextInt();
                    total= total + quantity*choleyBhatura;

                    if(!mp.containsKey("Choley Bhatura"))
                    {
                        mp.put("Choley Bhatura",quantity);
                    }
                    else
                    {
                        mp.put("Choley Bhatura",mp.get("Choley Bhatura")+quantity);
                    }
                    break;

                case 8: //Mix Vegetable   
                    System.out.println("You have selected Chicken Biryani(Single)");
                    System.out.println();
                    System.out.println("Enter the desired Quantity ");
                    quantity=sc.nextInt();
                    total= total + quantity*mixVegetable;

                    if(!mp.containsKey("Mix Vegetable"))
                    {
                        mp.put("Mix Vegetable",quantity);
                    }
                    else
                    {
                        mp.put("Mix Vegetable",mp.get("Mix Vegetable")+quantity);
                    }
                    break;

                case  9: //removing an item
                    System.out.println("Enter the food item to remove : ");
                    int toRemove=sc.nextInt();
                    System.out.println("Enter the desired Quantity to remove : ");
                    quantity=sc.nextInt();
                    if(total<=0)
                    {
                        System.out.println("You have to select first to remove :");
                    }
                    else
                    {
                        removeItem(toRemove,quantity);
                    }
                    break;

                case 10:
                    System.exit(1);
                    break;

                case 11:
                    sc.nextLine();
                    System.out.println("Enter the name of the item : ");
                    String itemName=sc.nextLine();
                    int price=getItemPrice(itemName);
                    System.out.println("The price of "+itemName+" is "+price);
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
            System.out.println();

            System.out.println("Do you wish to order anything else (Y/N) : ");
            again = sc.next();
            if(again.equalsIgnoreCase("Y")){
                order();
            }
            else if(again.equalsIgnoreCase("N")){
                generateBill();
                System.exit(1);
            }
            else{
                System.out.println("Invalid Choice");
            }
        }
    }
}


public class TestFoodOrder
{
    public static void main(String[] args)
    {
        FoodOrder fo=new FoodOrder();

        fo.displayMenu();

        fo.order();
    }
}