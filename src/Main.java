public class Main {
    public static void main(String[] args) {
        System.out.println("Первое задание");
        testFirstTask();
        System.out.println("Второе задание");
        System.out.println("---------------------");
        testSecondTask();

    }

    private static void testFirstTask() {
        Words words = new Words();
        words.testWords();

    }

    private static void testSecondTask() {
        System.out.println("Создаем телефонную книгу");
        PhoneBook phonebook = new PhoneBook();

        System.out.println("Наполняем справочник");
        phonebook.add("Рубинштейн", "123123");//Иванов
        phonebook.add("Рубинштейн", "124124");//Иванов
        phonebook.add("Клинтон", "22334499");//Петров
        phonebook.add("Новгородцев", "22334488");//Сидоров
        phonebook.add("Рубинштейн", "125125");//Иванов
        System.out.println("-----------------");

        System.out.println("Получаем номера");
        System.out.println("Рубинштейн");//Иванов
        System.out.println(phonebook.get("Рубинштейн"));//Иванов
        System.out.println("Клинтон");//Петров
        System.out.println(phonebook.get("Клинтон"));//Петров
        System.out.println("Новогородцев");//Сидоров
        System.out.println(phonebook.get("Новгородцев"));//Сидоров
        System.out.println("-----------------");

        System.out.println("Случай отсутствия записи");
        System.out.println("Кузнецов");//Кузнецов
        System.out.println(phonebook.get("Кузнецов"));//Кузнецов
        System.out.println("-----------------");

        System.out.println("Пробуем записать существующий номер");
        phonebook.add("Рубинштейн", "123123");//Иванов
        System.out.println("Рубинштейн");//Иванов
        System.out.println(phonebook.get("Рубинштейн"));//Иванов
    }
}

