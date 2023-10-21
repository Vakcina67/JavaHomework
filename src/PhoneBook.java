import java.util.*;


public class PhoneBook {
    private static final HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();
    public void addnum(String name, Integer phoneNum) {
        if (phoneBook.containsKey(name)) {
            phoneBook.get(name).add(phoneNum);
        } else {
            ArrayList<Integer> values = new ArrayList<>();
            values.add(phoneNum);
            phoneBook.put(name, values);
        }
    }

    public void findnum(String name) {
        if (phoneBook.containsKey(name)) {
            System.out.printf("Имя: %s  Телефоны: %s \n", name, phoneBook.get(name));
        } else {
            System.out.println("Контакт отсутствует");
        }
    }
    public HashMap<String, ArrayList<Integer>> getPhoneBook() {
        return phoneBook;
    }
    public void viewPhonebook() {
        TreeMap<Integer, String> pb = new TreeMap<>();
        for(Map.Entry<String, ArrayList<Integer>> item : phoneBook.entrySet()){
            pb.put(item.getValue().size(), item.getKey());
        }
        Collection<String> values = pb.values();
        for (String item:
             values) {
            System.out.printf("Имя: %s  Телефоны: %s \n", item, phoneBook.get(item));
        }
    }

    public static void main(String[] args) {
        PhoneBook myPhonebook = new PhoneBook();
        String name1 = "Evgeniy";
        String name2 = "Vladimir";
        String name3 = "Oleg";
        int num1 = 1111111;
        int num2 = 8888888;
        int num3 = 5555555;
        int num4 = 6666666;
        int num5 = 3333333;
        myPhonebook.addnum(name1, num1);
        myPhonebook.addnum(name2, num2);
        myPhonebook.addnum(name1, num4);
        myPhonebook.addnum(name3, num3);
        myPhonebook.addnum(name3, num4);
        myPhonebook.addnum(name3, num5);
        System.out.println(myPhonebook.getPhoneBook());
        myPhonebook.findnum("Oleg");
        myPhonebook.findnum("Alexey");
        myPhonebook.viewPhonebook();
    }
}