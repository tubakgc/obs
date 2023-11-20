public class Student {
    String name,  stuNo;
    Course mate;
    Course fizik;
    Course kimya;
    int classes;
    double avarage;
    boolean isPass;

    Student (String name,String stuNo,Course mate,Course fizik ,Course kimya,int classes) {
        this.name=name;
        this.stuNo=stuNo;
        this.mate=mate;
        this.kimya=kimya;
        this.fizik=fizik;
        this.classes=classes;
        this.isPass=false;

    }
    public void addBulkExamNote(int mate, int kimya, int fizik){
        if (mate>=0 && mate <=100 ){
            this.mate.note=mate;

        }
        if (fizik>=0 && fizik <=100 ){
            this.fizik.note=fizik;
        }
        if (kimya>=0 && kimya <=100 ){
            this.kimya.note=kimya;
        }

    }

    public void isPass(){
        this.avarage=(this.fizik.note + this.kimya.note + this.mate.note)/3.0;

        if (this.avarage>55){

            System.out.println("Hababam sınıfı mezun: " + this.avarage);
        }else {
            System.out.println("hababam sınıfı sınıfta kaldı.");
        }
        printNote();
    }
    public void printNote(){

        System.out.println("Öğrenci ismi: " + this.name);
        System.out.println("Matematik notu: " + this.mate.note);
        System.out.println("Kimya notu :"+ this.kimya.note);
        System.out.println("fizik notu: " + this.fizik.note);
        System.out.println("ortalamanız: " + this.avarage);
        System.out.println("=================");
    }



}
