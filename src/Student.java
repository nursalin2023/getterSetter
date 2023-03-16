public class Student {
    private String name ;
    private String date ;
    private int age;
    private String surname;
    public String getName(){
        return name;
    }
    public void setName (String name){
        this.name= name;
    }
    public String getDate(){
        return date;
    }
    public void setDate(String date){
        this.date = date;
    }
    public int  getAge(){
        return age;
    }
    public void setAge (int age){
        if (age>0){
            this.age = age;
        }
    }
    public String getSurname() {
        return surname;
    }
    public  void  setSurname (String surname){
        this.surname =surname;
    }
}
