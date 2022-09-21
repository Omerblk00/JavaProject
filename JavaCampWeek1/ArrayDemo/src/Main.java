public class Main {
    public static void main(String[] args) {
        //String array
        String[] students= new String[5];
        students[0]="Ömer";
        students[1]="Emre";
        students[2]="Ali ";
        students[3]="..... ";
        students[4]="..... ";

        //The first and more commonly used method
        for(String student:students){
            System.out.println(student);
        }
        //The second method
        for(int i=0;i<students.length;i++){
            System.out.println(students[i]);
        }
    }
}