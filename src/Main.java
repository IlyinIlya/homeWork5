public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        //У банка появилось мобильное приложение. Поэтому теперь, когда пользователь заходит на сайт с телефона,
        //ему предлагается скачать приложение с учетом того, какая операционная система у пользователя.
        //Напишите программу, которая определяет, чем пользуется клиент (iOS или Android), и выдает соответствующее сообщение:
        //Для iOS — «Установите версию приложения для iOS по ссылке».
        //Для Android — «Установите версию приложения для Android по ссылке».
        //Объявите переменную clientOS, которая равна 0 или 1 (0 — iOS, 1 — Android).
        int clientOS = 1;
        System.out.println(clientOS == 1 ? "Установите версию приложения для Android по ссылке" :
                    "Установите версию приложения для iOS по ссылке");

        System.out.println("Задача №2");
        //Усложним предыдущую задачу. Теперь нам нужно знать не только операционную систему телефона, но и год его создания.
        //Ваша задача — написать программу, которая выдает соответствующее сообщение клиенту при наличии двух условий.
        //Если год выпуска ранее 2015 года, то к сообщению об установке нужно добавить информацию об облегченной версии:
        //Для iOS оно будет звучать так: «Установите облегченную версию приложения для iOS по ссылке».
        //Для Android: «Установите облегченную версию приложения для Android по ссылке».
        //Для пользователей телефонов 2015 года выпуска и позже нужно вывести обычное предложение об установке приложения.
        //Для года создания телефона используйте переменную clientDeviceYear, в которой необходимо указать 2015 год.
        //Важно: вложенность больше двух этажей не допускается (условный оператор внутри условного оператора).
        int clientDeviceYear = 2015;
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else if (clientOS == 0 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        System.out.println("Задача №3");
        //Напишите программу, которая определяет, является ли год високосным или нет.
        //Переменную года назовите year, в которую можно подставить значение интересующего нас года. Например, 2021.
        //Программа должна определять, високосный год или нет, и выводить соответствующее сообщение: « …. год является
        //високосным» или «... год не является високосным».
        //Небольшая справка: високосным является каждый четвертый год, но не является каждый сотый. Также високосным
        //является каждый четырехсотый год. Год должен быть больше, чем 1584 (в котором был введен високосный год).
        int year = 2021;
        boolean leapYearNo = (year % 100 == 0 && year % 4 == 0);
        boolean leapYearYes = (year % 4 == 0 || year % 400 == 0);
        if (year > 1584) {
            System.out.println(leapYearYes && !leapYearNo ? "Год " + year + " високосный" : "Год " + year + " невисокосный");
            }
        else {
            System.out.println("Високосный год был введен в 1584 году");
        }

        System.out.println("Задача №4");
        //В банке для клиентов организовывается доставка карт на дом. Чтобы известить клиента о том, когда будет
        //доставлена его карта, нужно знать расстояние от офиса до адреса доставки.
        //Правила доставки такие:
        //Доставка в пределах 20 км занимает сутки.
        //Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
        //Доставка в пределах 60 км до 100 км добавляет еще одни сутки.
        //Свыше 100 км доставки нет.
        //То есть с каждым следующим интервалом доставки срок увеличивается на 1 день.
        //Напишите программу, которая выдает сообщение в консоль: "Потребуется дней: " + срок доставки.
        //Объявите целочисленную переменную deliveryDistance = 95, которая содержит дистанцию до клиента.
        int deliveryDistance = 95;                                                      ;
        int deliveryTime = 1;
        if (deliveryDistance <= 20 && deliveryDistance <=100) {
            System.out.println("Потребуется дней: " + deliveryTime);
        }
        if (deliveryDistance > 20 && deliveryDistance <=100) {
            deliveryTime = deliveryTime + 1;
                if (deliveryDistance <= 60) {
                    System.out.println("Потребуется дней: " + deliveryTime);
                }
        }
        if (deliveryDistance > 60 && deliveryDistance <=100) {
            deliveryTime = deliveryTime + 1;
            System.out.println("Потребуется дней: " + deliveryTime);
        }
        else {
            System.out.println("Доставки нет");
        }

        System.out.println("Задача №5");
        //Напишите программу, которая определяет по номеру месяца в году, к какому сезону этот месяц принадлежит.
        //Например, 1-й месяц (он же январь) принадлежит к сезону зима.
        //Для написания программы используйте оператор switch. Для обозначения номера месяца используйте
        //переменную monthNumber = 12.
        //Пропишите условие, при котором программа не будет выполняться (номер месяца больше 12).
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
                System.out.println("Декабрь");
                break;
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            default:
                System.out.println("Всего 12 месяцев в году");
        }
        if (monthNumber == 12 || monthNumber == 1 || monthNumber == 2) {
            System.out.println("Сейчас Зима");
        }
        if (monthNumber == 3 || monthNumber == 4 || monthNumber == 5) {
                System.out.println("Сейчас Весна");
        }
        if (monthNumber == 6 || monthNumber == 7 || monthNumber == 8) {
            System.out.println("Сейчас Лето");
        }
        if (monthNumber == 9 || monthNumber == 10 || monthNumber == 11) {
                System.out.println("Сейчас Осень");
        }
    }
}