package kr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class telbook {

    private static HashMap<String, ArrayList<String>> contakt = new HashMap<>();


    public static void addContact(String name, String phoneNumber) {
       if (contakt.containsKey(name)) {
           contakt.get(name).add(phoneNumber);
       } 
       else {
           ArrayList<String> phoneNumbers = new ArrayList<>();
           phoneNumbers.add(phoneNumber);
           contakt.put(name, phoneNumbers);
            }
        }
    public static void printContacts() {
        ArrayList<Map.Entry<String, ArrayList>> list = new ArrayList(contakt.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, ArrayList>>() {
        @Override
        public int compare(Map.Entry<String, ArrayList> o1, Map.Entry<String, ArrayList> o2) {
            return o2.getValue().size() - o1.getValue().size();
            }
    }
    );

        for (Map.Entry<String, ArrayList> entry : list) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
            }
}
}

