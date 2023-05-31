public class Contact {
    private Integer number;
    private String name;
    public Contact(int number, String name){
        this.name=name;
        this.number=number;

    }

    public String getName() {
        return name;
    }
    public Integer getNumber(){
        return number;
    }
}
