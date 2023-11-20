
public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut hoca","MATE","555");
        Teacher t2= new Teacher("kül yutmaz","FZK","000");
        Teacher t3=new Teacher("Uykucu kamil","KMY","111");

        Course mate= new Course("Matematik","101","MATE");
        Course fizik= new Course("Fizik","111","FZK");
        Course kimya= new Course("Kimya","123","KMY");

        mate.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1= new Student("inek şaban","1231",mate,fizik,kimya,4);
        s1.addBulkExamNote(100,50,60);
        s1.isPass();

        Student s2= new Student("güdük necmi", "13", mate,fizik,kimya,4);
        s2.addBulkExamNote(50,60,100);
        s2.isPass();

        Student s3= new Student("dört göz necmi","145",mate,fizik,kimya,4);
        s3.addBulkExamNote(40,60,20);
        s3.isPass();



    }
}