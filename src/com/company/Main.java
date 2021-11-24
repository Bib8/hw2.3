package com.company;

public class Main {

    public static void main(String[] args) {
        //Объявите переменные всех типов, что мы изучили на уроке, и присвойте им любые значения (инициализируйте их).

        byte a = 1;
        short b = 129;
        int c = 300;
        long l = 7000L;
        double d = 2.89;
        float f = 2.4f;
        char ch = 'a';
        boolean bln = true;

        /*В боксе, перед каждым боем, спортсменов взвешивают – это делают для того, чтобы убедиться,
        что боксеры соответствуют своей весовой категории, и бой будет честным.
        Вес одного боксера – 78,2 кг
        Вес второго боксера – 82,7 кг
        Подсчитайте и выведите в консоль общий вес двух бойцов.
        Подсчитайте и выведите в консоль разницу между весами бойцов.*/

        double firstBoxerWeigth = 78.2; //boxer 1 weigth
        double secondBoxerWeigth = 82.7; //boxer 2 weigth
        double sumWeigth = firstBoxerWeigth + secondBoxerWeigth; // sum of both boxers
        double difWeigth = secondBoxerWeigth - firstBoxerWeigth; //dif of 2 boxers
        System.out.println("Summary weigth of both boxers is " + (sumWeigth) + "kg");
        System.out.println("Diffirance weigth of both boxers is " + (difWeigth) + "kg");

        /*За весом спортсмена следит не только сам спортсмен, но и его тренер.
        Он достигается и поддерживается упорными тренировками и сбалансированным питанием.
        Вот один из рецептов завтрака перед тренировкой, который получил наш спортсмен для поддержания формы:
        Бананы – 5 штук (1 банан - 80 грамм);
        Молоко – 200 мл (100 мл = 105 грамм);
        Мороженое пломбир – 2 брикета по 100 грамм;
        Яйца сырые – 4 яйца (1 яйцо - 70 грамм).
        Смешать всё в блендере и готово.
        Подсчитайте вес (количество грамм) такого спорт-завтрака, а затем переведите его в килограммы.
        Результат напечатайте в консоль.*/

        int bananaWeight = 80; // grams per 1 banana
        int milkWeightPer100Ml = 105; // grams in 100ml of milk
        int icecreamWeight = 100;
        int eggWeight = 70;
        int bananasQty = 5;
        int milkQty = 200;
        int icecreamQty = 2;
        int eggsQty = 4;
        int milkMlToGr = milkQty/100*milkWeightPer100Ml;
        int milkShake = bananaWeight * bananasQty + milkMlToGr + icecreamWeight * icecreamQty + eggWeight * eggsQty; // weigth of milk shake
        double milkShakeWeigth = milkShake/1000d;

        System.out.println("your milkshake in gramms " + (milkShake) + " in kilo " + milkShakeWeigth + "kg");


        System.out.println();

        /*Правила соревнований обновились, и теперь нашему спортсмену нужно сбросить 7 кг, чтобы оставаться в своей весовой категории.
        Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе от 250 до 500 грамм в день.
        Посчитайте, сколько дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм и сколько,
         если каждый день будет худеть на 500 грамм.
        Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться результата похудения.
        Результаты подсчетов выведите в консоль.*/

        int totalWeightless = 7000;
        int quarterLostPerDay = 250;
        int halfLostPerDay = 500;
        double avgResult = (quarterLostPerDay + halfLostPerDay)/2f;
        int firstRes = totalWeightless/quarterLostPerDay;
        int secRes = totalWeightless/halfLostPerDay;
        float avgRes = (float) (totalWeightless/avgResult);
        System.out.println("if loose 250gr per day? it takes: " + (firstRes));
        System.out.println("if loose 500gr per day? it takes: " + (secRes));
        System.out.println("if loose the average per day? it takes: " + (avgRes));




        /*Отойдем от спорта и представим, что мы работаем в большой компании, штат которой состоит из нескольких сотен сотрудников.
         В компании есть правило, что чем дольше сотрудник работает в компании, тем ценнее он для бизнеса. Поэтому сотрудники,
          которые работают в компании дольше 3 лет, получают повышение зарплаты раз в год. Каждый год повышение составляет 10% от текущей зарплаты.
        К вам пришел руководитель с задачей автоматизировать повышение зарплаты, а также провести расчет для следующих сотрудников:
        Маша получает 67 760 рублей в месяц
        Денис получает 83 690 рублей в месяц
        Кристина получает 76 230 рублей в месяц
        Каждому нужно увеличить зарплату на 10% от текущей месячной. Дополнительно руководитель попросил посчитать разницу,
         между годовым доходом с нынешней зарплатой и после повышения. Посчитайте, сколько будет получать каждый из сотрудников,
          а также разницу между годовым доходом до и после повышения.
        Выведите в консоль информацию по каждому сотруднику.
        Например, “Маша теперь получает **** рублей. Годовой доход вырос на **** рублей”.*/

        double percent = 1.1;

        float marySalary = 67_760;
        float denSalary = 83_690;
        float crisSalary = 76_230;

        int marySalaryPromo = (int) (marySalary*percent);
        int denSalaryPromo = (int) (denSalary*percent);
        int crisSalaryPromo = (int) (crisSalary*percent);

        float difmarySalary = marySalaryPromo - marySalary;
        float difdenSalary = denSalaryPromo - denSalary;
        float difcrisSalary = crisSalaryPromo - crisSalary;

        float marySalaryDifPerYear = difmarySalary * 12;
        float denSalaryDifPerYear = difdenSalary * 12;
        float crisSalaryDifPerYear = difcrisSalary * 12;

        System.out.println("Маша теперь получает " + (marySalaryPromo) + "рублей. Годовой доход вырос на " + (marySalaryDifPerYear) + "рублей");
        System.out.println("Денис теперь получает " + (denSalaryPromo) + "рублей. Годовой доход вырос на " + (denSalaryDifPerYear) + "рублей");
        System.out.println("Кристина теперь получает " + (crisSalaryPromo) + "рублей. Годовой доход вырос на " + (crisSalaryDifPerYear) + "рублей");

    }
}
