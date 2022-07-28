package homework.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {
    private static final List<FootballTeamMember> footballTeam = new ArrayList<>();
    private static final HashMap<Integer, String> hashMap = new HashMap<>();

    public static void main(String[] args) {
        FootballTeamMember ftm = new FootballTeamMember(10, "poxos");
        FootballTeamMember ftm2 = new FootballTeamMember(11, "petros");
        FootballTeamMember ftm3 = new FootballTeamMember(12, "martiros");
        footballTeam.add(ftm);
        footballTeam.add(ftm2);
        footballTeam.add(ftm3);
//        System.out.println(createFootballTeam(footballTeam));
//        System.out.println(removeFromMap(hashMap, 8));
//        printAllMemberNames(hashMap);
        printAllMembers(hashMap);
    }

    //Ունենք FootballTeamMember-ի լիստ, պետք է ստանանք HashMap որտեղ կեյ-ը կլինի խաղացողի համարը, իսկ վելյուն իրա անունը։
    static Map<Integer, String> createFootballTeam(List<FootballTeamMember> members) {
        for (FootballTeamMember member : members) {
            hashMap.put(member.getNumber(), member.getName());

        }


        return hashMap;
    }

    //Մեթոդի մեջ պետք է տրված մապ-ից ջնջենք removedNumber համար ը եթե կա, ու վերադարձնենք true, եթե չկա վերադարձնենք false
    static boolean removeFromMap(Map<Integer, String> memberMap, Integer removedNumber) {
        hashMap.put(1, "poxos");
        hashMap.put(2, "poxos");
        hashMap.put(3, "poxos");
        hashMap.put(4, "poxos");
        hashMap.put(5, "poxos");

        for (Integer integer : memberMap.keySet()) {
            if (integer.equals(removedNumber)) {
                hashMap.remove(removedNumber);
                return true;
            }
        }
        return false;
    }

    //Մեթոդով տպելու ենք միայն անունները
    static void printAllMemberNames(Map<Integer, String> memberMap) {
        hashMap.put(1, "poxos");
        hashMap.put(2, "poxosik");
        hashMap.put(3, "poxos");
        hashMap.put(4, "poxos");
        hashMap.put(5, "poxos");
        for (String value : memberMap.values()) {
            System.out.println(value);
        }

    }

    //Մեթոդով տպելու ենք թե համարը, թե խաղացողի անունը հետյալ ձև՝
    // 11 - Poxos Poxosyan
    // 12 - Petros Petrosyan
    static void printAllMembers(Map<Integer, String> memberMap) {
        hashMap.put(1, "poxos");
        hashMap.put(2, "poxos");
        hashMap.put(3, "poxos");
        hashMap.put(4, "poxos");
        hashMap.put(5, "poxos");
        for (Map.Entry<Integer, String> integerStringEntry : memberMap.entrySet()) {
            System.out.println(integerStringEntry.getKey() + " - " + integerStringEntry.getValue() );
        }

    }


    static class FootballTeamMember {
        private int number;
        private String name;

        public FootballTeamMember(int number, String name) {
            this.number = number;
            this.name = name;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
