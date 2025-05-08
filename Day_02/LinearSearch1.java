public class LinearSearch1 {

    public static int linearSearch(String Menu[], String Key){
        for(int i = 0; i < Menu.length; i++){
            if (Menu[i].equals(Key))
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        String Menu[] = {"Dosa", "Pao Bhaji", "Samosa", "Cold Drink", "Rasmalai", "Paneer Roll"};
        String Key = "Paneer Roll";

        int index = linearSearch(Menu, Key);
        if(index == -1) {
            System.out.println("Key not found in the array.");
        } else {
            System.out.println("Key found at index: " + index);
        }
    }
}
