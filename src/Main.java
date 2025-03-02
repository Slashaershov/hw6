public class Main
{
    public static void main(String[] args)
    {
        //ex1
        byte clientOS = 0;
        if (clientOS == 0)
        {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientOS == 1)
        {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println();

        //ex2
        short clientDeviceYear = 2015;
        if (clientOS == 1)
        {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else if (clientDeviceYear >= 2015)
        {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else
        {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        System.out.println();

        //ex 3
        short year = 2021;
        if (year >= 1584 && year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
        {
            System.out.println(year + " год является високосным");
        }
        else
        {
            System.out.println(year + " год не является високосным");
        }
        System.out.println();

        //ex 4
        int deliveryDistance = 95;
        int deliveryDaysCount = 0;
        if (deliveryDistance <= 100)
        {
            if (deliveryDistance <= 20)
            {
                deliveryDaysCount = 1;
            }
            else if (deliveryDistance <= 60)
            {
                deliveryDaysCount = 2;
            }
            else if (deliveryDistance <= 100)
            {
                deliveryDaysCount = 3;
            }
            System.out.println("Потребуется дней: " + deliveryDaysCount);
        }
        System.out.println();

        //ex 5
        byte monthNumber = 12;
        switch (monthNumber)
        {
            case 1, 2, 12:
                System.out.println("Зима. Холода. Одинокие дома");
                break;
            case 3, 4, 5:
                System.out.println("Весна");
                break;
            case 6, 7, 8:
                System.out.println("Лето,яркими лучами согрето");
                break;
            case 9, 10, 11:
                System.out.println("Осень. ю в дождливый серый день пробежал по городу олень");
                break;
            default:
                System.out.println("Ты значит у нас тестировщик?!");
                break;
        }
    }
}