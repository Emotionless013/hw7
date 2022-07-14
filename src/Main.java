
public class Main {
    public static void main(String[] args) {
        //Первое задание
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + ' ' + firstName + ' ' + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
        //Второе задание
        String fullNameUp = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUp);
        //Третье задание
        String fullNameThird = "Иванов Семён Семёнович";
        if (fullNameThird.contains("ё")) {
            String fullNameThirdNew = fullNameThird.replace('ё', 'е');
            fullNameThird = fullNameThirdNew;
        }
        System.out.println("Данные ФИО сотрудника — " + fullNameThird);
        //дополнительные задания
        //пятое задание
        //К нам снова обратились за помощью, но теперь уже для того, чтобы написать алгоритм,
        // разбивающий одну строку с Ф. И. О. на три — на фамилию, имя и отчество.
        //В качестве исходных данных используйте:
        //Ф. И. О. сотрудника: “Ivanov Ivan Ivanovich”;
        //строка fullName — для хранения Ф. И. О. сотрудника в формате фамилия - имя - отчество;
        //переменная firstName — для хранения имени;
        //переменная middleName — для хранения отчества;
        //переменная lastName — для хранения фамилии.
        //Решите задание с помощью метода substring().
        //Результат программы выведите в формате:
        //“Имя сотрудника — …”
        //“Фамилия сотрудника — …”
        //“Отчество сотрудника — ...”
        String fullNameNew = "Ivanov Ivan Ivanovich";
        int firstSpace = fullNameNew.indexOf(' ');
        int secondSpace = fullNameNew.indexOf(' ', firstSpace+1);
        String lastNameNew = fullNameNew.substring(0, firstSpace);
        System.out.println("Фамилия сотрудника - " + lastNameNew);
        String firstNameNew = fullNameNew.substring(firstSpace+1, secondSpace);
        System.out.println("Имя сотрудника - " + firstNameNew);
        String middleNameNew = fullNameNew.substring(secondSpace+1);
        System.out.println("Отчество сотрудника - " + middleNameNew);

        //шестое задание
        //Периодически данные в наших регистрах заполняются неверно, и Ф. И. О. сотрудников записывают со строчных букв.
        //Такую оплошность нужно исправить, написав программу, которая преобразует написанное со строчных букв Ф. И. О.
        // в правильный формат.
        //В качестве исходных данных используйте строку fullName c данными “ivanov ivan ivanovich“, которые нужно
        // преобразовать в “Ivanov Ivan Ivanovich”.
        //Выведите результат программы в консоль в формате: “Верное написание Ф. И. О. сотрудника с заглавных букв — …”
        String fullNameSix = "ivanov ivan ivanovich";
        char[] array=fullNameSix.toCharArray();
        array[0] = Character.toUpperCase(array[0]);
        for (int i = 0; i < array.length; i++) {
        if(array[i] == ' '){
               array[i+1] = Character.toUpperCase(array[i+1]);
            }
        }
        String fullNameSixChecked = new String(array);
        System.out.println("Верное написание Ф. И. О. сотрудника с заглавных букв — " + fullNameSixChecked);

        //седьмое задание
        //Имеется две строки.
        //Первая: "135"
        //Вторая: "246"
        //Соберите из двух строк одну, содержащую данные "123456".
        //Использовать сортировку нельзя.
        //Набор чисел задан для понимания позиций, которые они должны занять в итоговой строке.
        //Выведите результат в консоль в формате: “Данные строки — ….”
        String firstString = "135";
        char[] firstToArray = firstString.toCharArray();
        String secondString = "246";
        char[] secondToArray = secondString.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < firstToArray.length; i++) {
            result.append(firstToArray[i]);
            result.append(secondToArray[i]);
        }
        System.out.println("Данные строки — " + result);

        //восьмое задание
        //Дана строка из букв английского алфавита "aabccddefgghiijjkk".
        //Нужно найти и напечатать буквы, которые дублируются в строке.
        //Обратите внимание, что строка отсортирована, т. е. дубли идут друг за другом.
        //В итоге в консоль должен быть выведен результат программы: "acdgijk".
        String newString = "aabccddefgghiijjkk";
        char[] newArray = newString.toCharArray();
        for (int i = 0; i < newArray.length-1; i++) {
            if (newArray[i]==newArray[i+1]) {
                System.out.print(newArray[i]);
            }

        }
    }
}
