public class Person {
    private String name;
    private String lastName;
    private int ticket;

    public Person (String name, String lastName, int ticket){
        this.name = name;
        this.lastName = lastName;
        if (ticket >= 0) {
            this.ticket = ticket;
        } else {
            this.ticket = 0;
        }
    }

    public String getFullName() {
        return lastName + " " + name;
    }

    public int getTicket(){
        return ticket;
    }

    public void decreaseTicket(){
        ticket--;
    }
}
