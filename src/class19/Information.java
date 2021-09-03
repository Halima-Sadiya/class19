package class19;

public class Information {
    public static void main(String[] args) {
        //OBJECT DECLARE & OBJECT CREAT
        
        Student student1= new Student(); 
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();
        
        
        
        System.out.println("-----Student Information-----"); 
        
           //--------Student no.1 information--------
           
        System.out.println("Student 1:");  
        student1.name = "Halima";
        student1.group ="A";
        student1.roll = 147183;
        student1.phn_number = 01234567;
        
        System.out.println(" Name : "+student1.name);
        System.out.println(" Group : "+student1.group);
        System.out.println(" Roll : "+student1.roll);
        System.out.println(" Phone Number : "+student1.phn_number);
        
        
        //-----------Student no.2 information-------
        System.out.println("");
        System.out.println("Student 2:");
        student2.name = "Sadia";
        student2.group = "A";
        student2.roll = 147183;
        student2.phn_number = 12345678;
        
        System.out.println(" Name : "+student2.name);        
        System.out.println(" Group : "+student2.group);
        System.out.println(" Roll : "+student2.roll);
        System.out.println(" Phone Number : "+student2.phn_number);

        //-----------Student no.3 information-------
        System.out.println("");
        System.out.println("Student 3:");
        student3.name = "Mim";
        student3.group = "A";
        student3.roll = 147183;
        student3.phn_number = 12323232;
        
        System.out.println(" Name : "+student3.name);        
        System.out.println(" Group : "+student3.group);
        System.out.println(" Roll : "+student3.roll);
        System.out.println(" Phone Number : "+student3.phn_number);
        
       //-----------Student no.4 information-------
        System.out.println("");
        System.out.println("Student 4:");
        student4.name = "Shanta";
        student4.group = "A";
        student4.roll = 147173;
        student4.phn_number = 012323232;
        
        System.out.println(" Name : "+student4.name);        
        System.out.println(" Group : "+student4.group);
        System.out.println(" Roll : "+student4.roll);
        System.out.println(" Phone Number : "+student4.phn_number);   
        
         //-----------Student no.5 information-------
        System.out.println("");
        System.out.println("Student 5:");
        student5.name = "Sami";
        student5.group = "B";
        student5.roll = 147214;
        student5.phn_number = 987654321;
        
        System.out.println(" Name : "+student5.name);        
        System.out.println(" Group : "+student5.group);
        System.out.println(" Roll : "+student5.roll);
        System.out.println(" Phone Number : "+student5.phn_number);   
        
        
    }
}
