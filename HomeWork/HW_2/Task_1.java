/* Дана строка sql-запроса "select * from students where ". 
Сформируйте часть WHERE этого запроса, используя StringBuilder. 
Данные для фильтрации приведены ниже в виде json-строки.
Если значение null, то параметр не должен попадать в запрос.
Параметры для фильтрации: 
{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"} 
результат:
select * from students where name='Ivanov' and coutry='Russia' and city='Moscow'
*/

package HomeWork.HW_2;

public class Task_1 {
    public static void main(String[] args) 
    {
        String req = "select * from students where ";
        String json = "\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"";
        String textReplace = json.replaceAll("\"", "");
        String[] textArray = textReplace.split(",");
        StringBuilder requestText = new StringBuilder(req);
        for (String word : textArray) {
            int position = word.indexOf(":");
            if (!word.substring(position + 1).equals("null")) {
                requestText.append(word.substring(0, position)).append("=\'").append(word.substring(position + 1))
                        .append("\' AND");
            }
        }
        requestText.replace(requestText.lastIndexOf(" AND"), requestText.length(), "");
        System.out.println(requestText);
    }
}