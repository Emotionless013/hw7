
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
    }
}
