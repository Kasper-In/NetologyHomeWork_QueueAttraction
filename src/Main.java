import java.util.*;

public class Main {

    public static List<Person> generateClients (){
        List<Person> listClients = new LinkedList<>();
        listClients.add(new Person("Иван", "Иванов", 2));
        listClients.add(new Person("Мария", "Удалова", 3));
        listClients.add(new Person("Илья", "Сурков", 4));
        listClients.add(new Person("Ольга", "Пименова", 0));
        listClients.add(new Person("Екатерина", "Маркова", 6));

        return listClients;
    }

    public static void main(String[] args) {

        Queue<Person> queueAttraction = new LinkedList<>();
        queueAttraction.addAll(generateClients());

        while (!queueAttraction.isEmpty()){
            Person person = queueAttraction.poll();
            //проверка, если изначально клиент был без билетов
            if (person.getTicket() > 0 ) {
                System.out.println(person.getFullName() + " прокатился на аттракционе");
                person.decreaseTicket();
                if (person.getTicket() > 0) {
                    queueAttraction.offer(person);
                }
            }
        }

    }
}
