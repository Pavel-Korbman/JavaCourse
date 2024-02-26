package Seminars;

import java.util.HashMap;
import java.util.Map;


public class Passport {
    private Map<String, String> map = new HashMap<>();

    public void add(String passNum, String lastName){
        map.put(passNum, lastName);
    }

    public String getByPassNum(String passNum){
        if (!map.containsKey(passNum)) return passNum + " - Такого номера нет";
        else return passNum + ":" + map.get(passNum);
    }

    public String getByLastName(String lastName){
        StringBuilder stringBuilder = new StringBuilder();
        if (!map.containsValue(lastName)) stringBuilder.append(lastName).append(" - Такой фамилии нет");
        else {
        for (var val : map.entrySet()){
            if (val.getValue().equals(lastName)){
                stringBuilder.append(val.getKey())
                        .append(":")
                        .append(val.getValue())
                        .append("\n");
            }
        }
        }
        return stringBuilder.toString();
    }

    public String getAll(){
        if (map.isEmpty()) return "Список пуст";
        return map.toString();
    }


}
