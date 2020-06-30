package com.company;

import com.company.finalProduct.Constructor;

/**
 * Создать консольное приложение, удовлетворяющее следующим требованиям:
 * Корректно спроектируйте и реализуйте предметную область задачи.
 * Для создания объектов из иерархии классов продумайте возможность использования порождающих шаблонов
 * проектирования.
 * Реализуйте проверку данных. вводимых пользователем. но не на стороне клиента.
 * Для проверки корректности переданных данных можно применить регулярные выражения.
 * Меню выбора действия пользователем МОЖНО не реализовывать, ИСПОЛЬЗУЙТЕ ЗАГЛУШКУ.
 * Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().
 *
 * Вариант В. Подарки. Реализовать приложение, позволяющее создавать подарки (объект, представляющий собой
 * подарок). Составляющими целого подарка являются сладости и упаковка.
 *
 * Применены шаблоны проектирования:
 * - в основной логике программы - Декоратор.
 * - в выборе создания классов (Тип упаковки, сладости, компонента) - Фабричный метод.
 * В итоге структура программы имеет обилиек классов, но в программе решил использовать данные
 * шаблоны с целью простого их использования.
 *
 * Логика (структура) программы:
 * Есть продукт (Подарок).
 * Продукт состоит из элементов (Сладости, Упаковка).
 */


public class Main {

    public static void main(String[] args) {
        Constructor product = new Constructor();
        product.start();
    }
}
