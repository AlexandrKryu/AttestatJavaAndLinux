package org.example;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Toys<Toy> toys = new Toys<>();
        Queue<Toy> queue = new PriorityQueue<>(Collections.reverseOrder());
        Save save = new Save();
        RandomDrop random = new RandomDrop();
        Toy toy1 = new Toy(1, "Машинка", 10, random.rnd());
        Toy toy2 = new Toy(2, "Фёрби", 20, random.rnd());
        Toy toy3 = new Toy(3, "Трансформер", 23, random.rnd());
        Toy toy4 = new Toy(4, "Большой плюшевый мишка", 12, random.rnd());
        toys.addToy(toy1);
        toys.addToy(toy2);
        toys.addToy(toy3);
        toys.addToy(toy4);
        System.out.println("В наличии: \n" + toys.print());
        toys.sortByDroprate();
        System.out.println("Выигранные игрушки: \n" + toys.print());
        for (Toy toy : toys) {
            queue.add(toy);
        }
        save.saveResult(queue);
    }
}