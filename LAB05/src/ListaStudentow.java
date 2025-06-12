public class ListaStudentow {

    private final Student[] studenci= new Student[100];

    public ListaStudentow(){
        for(int i =0; i<studenci.length;i++){
            studenci[i] = podstawowyStudent();
        }
    }



    private Student podstawowyStudent(){
        Osoba osoba = new Osoba("","",0);
        return new Student(osoba);
    }
}
