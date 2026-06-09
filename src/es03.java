import java.util.HashMap;

public class es03 {
    public static void main(String[] args) {

        HashMap<String, String> contacts = new HashMap<>();

        contacts.put("Arya", "+44 7706261365");
        contacts.put("Daenerys", "+56 5913450678");
        contacts.put("Tyrion", "+44 44231644361");
        contacts.put("Margaery", "+44 23423498511");
        contacts.put("Myrcella", "+89 2345912348");

        contacts.remove("Myrcella");

        System.out.println("Search name by number: " + findNameByNumber(contacts, "+44 7706261365"));

        System.out.println("Search number by name: " + findNumberByName(contacts, "Tyrion"));

        System.out.println("Contacts:");
        printAllContacts(contacts);
    }

    public static String findNameByNumber(HashMap<String, String> contacts, String number) {
        for (String name : contacts.keySet()) {
            if (contacts.get(name).equals(number)) {
                return name;
            }
        }
        return "Not found.";
    }

    public static String findNumberByName(HashMap<String, String> contacts, String name) {
        return contacts.getOrDefault(name, "Not found.");
    }

    public static void printAllContacts(HashMap<String, String> contacts) {
        for (String name : contacts.keySet()) {
            System.out.println("Name: " + name + " | Phone: " + contacts.get(name));
        }
}
