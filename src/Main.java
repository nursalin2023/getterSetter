public class Main {
    public static void main(String[] args) {
        Kurs kurs = new Kurs();
        kurs.setName("IT,KG");
        kurs.setNumber("+996 554 455 335");
        kurs.setTeacher("Nursalin Musaev");
        kurs.setDate("01,02,2023");
        System.out.println("Name: "+kurs.getName()+ "\n" + "Number: "+ kurs.getNumber() +"\n"+ "Teacher:  " +kurs.getTeacher() + "\n"+
               " Date: " + kurs.getDate());
        System.out.println();
        Student student = new Student();
        student.setName("Nurdolot");
        student.setDate("15,03,2006");
        student.setAge(15);
        student.setSurname("Mamasabirov");
        System.out.println("mane: "+ student.getName() + "\n" + "DateP: "+ student.getDate()+ "\n" +
                "Age: "+ student.getAge()+"\n"+ "Surname: "+ student.getSurname());
    }
}