public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note, sNote;


    public Course(String name, String code, String prefix){
        this.name =name;
        this.code =code;
        this.prefix =prefix;
        this.note=0;

    }
    public void addTeacher( Teacher teacher){

        if (teacher.branch.equals(this.prefix)){
            this.teacher=teacher ;
        }else{
            System.out.println(teacher + "Akademisyen bu dersi veremez!");
        }

    } public void printTeacher(){
        if (teacher != null){
            System.out.println( this.name + " dersinin Akademisyeni:" + teacher);
        }else {
            System.out.println(this.name + "dersine Akademisyen atanamamıştır.");
        }

    }

}
