package seminar_3;

import java.io.FileWriter;
import java.io.IOException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.Scanner;

import static java.lang.StringTemplate.STR;


public class HomeWork {
    public static int getLength(int num) throws ArrayException {
        if (num < 6) throw new ArrayException("Вы ввели менее 6 элементов!");
        else if (num > 6) {
            throw new ArrayException("Вы ввели более 6 элементов!");
        }
        return num;
    }

    public static String getGender(String gender) throws MaleFemaleException {
        if (!Objects.equals(gender, "f") & !Objects.equals(gender, "m")){
            throw new MaleFemaleException("Вы не ввели f или m!");
        }
        return gender;
    }

    public static String getDate(String birthday) throws LegalDateException {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd.MM.uuuu");
        LocalDate date = LocalDate.parse(birthday, f);
        String bday = date.format(f);
        LocalDate today_date = LocalDate.now();
        if (date.isAfter(today_date)) {
            throw new LegalDateException("Ваша дата рождения не может быть больше текущей!");
        }
        return bday;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("""
                Необходимо ввести следующие данные (6 элементов) через пробел:\s
                1. Фамилия
                2. Имя
                3. Отчество
                4. Дата рождения в формате дд.мм.гггг
                5. Номер телефона без знаков!
                6. Пол: f или m (т.е.женский или мужской)""");
        System.out.print("Введите данные: ");
        String name = in.nextLine();
        in.close();
        String[] data = name.split(" ");

        try {
            System.out.println(STR."\{HomeWork.getLength(data.length)} элементов введено.");
        } catch (ArrayException e) {
            System.out.println(e.getMessage());
            return;
        }

        try {
            String birthday = HomeWork.getDate(data[3]);
            System.out.println(STR."Дата рождения: \{birthday}");
        } catch (DateTimeException | LegalDateException e2) {
            System.out.println(STR."Ошибка: \{e2.getMessage()}");
            return;
        }

        try {
            long num_check = Long.parseLong(data[4]);
            System.out.println(STR."Ваш телефонный номер: \{num_check}");
        } catch (NumberFormatException e) {
            System.out.println("Номер телефона введен некорректно!");
            return;
        }
        try {
            String gender = HomeWork.getGender(data[5]);
            if (Objects.equals(gender, "f")) {
                System.out.println("Вы женского пола");
            } else if (Objects.equals(gender, "m")) {
                System.out.println("Вы мужского пола");
            }
        } catch (MaleFemaleException e) {
            System.out.println(e.getMessage());
            return;
        }

        try(FileWriter writer = new FileWriter(data[0], true)) {
            for(String elem : data)
                if(Objects.equals(elem, data[3])) {
                    writer.write(STR."<\{elem}> ");
                } else {
                    writer.write(STR."<\{elem}>");
                }
            writer.write("\n");
            writer.flush();
        } catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
