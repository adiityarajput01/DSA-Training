import java.util.Arrays;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class hello {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       int age = 30;
       int physics = 97;
       int chem = 98;
       int eng = 95;

       int[]  marks= new int[3];
       marks[0] = 97;
       marks[1] = 98;
       marks[2] = 95;

       System.out.println(marks.length);
       System.out.println(marks[0]);
       Arrays.sort(marks);
       System.out.println(marks[0]);
    }
}