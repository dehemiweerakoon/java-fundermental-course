import java.util.*;
public class Example {
     public static void addNewStudent(String[] Studentid,String[] StudentName){
        
       lebal:while(true){        
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Student Id:"); 
        String id=input.nextLine();//input id 
        for(int i=0;i<Studentid.length;i++){
             if(id.equals(Studentid[i])){
               System.out.println("The Student ID already exists.");
               continue lebal;
             }
        }
        String temp[]=new String[Studentid.length+1];
        String temp1[]=new String[StudentName.length+1];

        //if id don't ger duplicated system letb user to enter the current student details:)
        
        System.out.print("Enter Student Name:");
        String name=input.nextLine();//input name

        for(int i=0;i<Studentid.length;i++){
            temp[i]=Studentid[i];
        }
        for(int i=0;i<StudentName.length;i++){
              temp1[i]=StudentName[i];
          }
        temp[temp.length-1]=id;
        Studentid=temp;

        temp1[temp1.length-1]=name;
        StudentName=temp1;

        System.out.print("Student has been enterd succefully.Do you want to add a new student (y/n)");
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);
         if(c=='Y'|| c=='y'){
            continue;
         }else
           break;
       }
         for(int i=0;i<StudentName.length;i++){
              System.out.println(Studentid[i]);
         }    
     }
  
     public static void addNewStudentWithMarks(){
       lebal:while(true){        
              Scanner input=new Scanner(System.in);
              System.out.print("Enter Student Id:"); 
              String id=input.nextLine();//input id 
              for(int i=0;i<Studentid.length;i++){
                   if(id.equals(Studentid[i])){
                     System.out.println("The Student ID already exists.");
                     continue lebal;
                   }
              }
              String temp[]=new String[Studentid.length+1];
              String temp1[]=new String[StudentName.length+1];
      
              //if id don't ger duplicated system letb user to enter the current student details:)
              
              System.out.print("Enter Student Name:");
              String name=input.nextLine();//input name
      
              for(int i=0;i<Studentid.length;i++){
                  temp[i]=Studentid[i];
              }
              for(int i=0;i<StudentName.length;i++){
                    temp1[i]=StudentName[i];
                }
              temp[temp.length-1]=id;
              Studentid=temp;
      
              temp1[temp1.length-1]=name;
              StudentName=temp1;
      
              System.out.print("Student has been enterd succefully.Do you want to add a new student (y/n)");
              Scanner scanner = new Scanner(System.in);
              char c = scanner.next().charAt(0);
               if(c=='Y'|| c=='y'){
                  continue;
               }else
                 break;
             }
               for(int i=0;i<StudentName.length;i++){
                    System.out.println(Studentid[i]);
               }    
     }
     
      
   public static String[] Studentid=new String[0];//student id array
   public static String[] StudentName=new String[0];//student name array
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("                        WELCOME TO GDSE MARKS MANAGEMENT SYSTEM                          ");
        System.out.println("---------------------------------------------------------------------------------------------\n");

        System.out.println("[1] Add New Student.                \t\t\t [2] Add New Student With Marks");
        System.out.println("[3] Add Marks.                      \t\t\t [4] Update Student Details");
        System.out.println("[5] Update Marks.                   \t\t\t [6] Delete Student.");
        System.out.println("[7] Print Student Detalis           \t\t\t [8] Print Student Ranks");
        System.out.println("[9] Best is Programming Fundermentals\t\t\t [10] Best in DataBase Managment System\n");
       // String[] Student=new String[0];
        int option;
        while(true){ 
            System.out.print("Enter an option to continue >");
            option=input.nextInt();

            if(option==1){
                System.out.println("---------------------------------------------------------------------------------------------");
                System.out.println("ADD NEW STUDENT");
                System.out.println("---------------------------------------------------------------------------------------------");
                   addNewStudent(Studentid,StudentName);//print(Student);
                   
                }else if(option==2){
                System.out.println("---------------------------------------------------------------------------------------------");
                System.out.println("ADD NEW STUDENT WITH MARKS");
                System.out.println("---------------------------------------------------------------------------------------------");
                   //clearConsole();
                   addNewStudentWithMarks();
            }/*else if(option==3){
                   addMarks();
            }else if(option==4){
                   updateStudentDetails();
            }else if(option==5){
                   updateMarks();
            }else if(option==6){
                   deleteStudent();
            }else if(option==7){
                   printStudentDetails();
            }else if(option==8){
                   printStudentRanks();
            }else if(option==9){
                   pfundermentals();
            }else if(option==10){
                   bestInDBs();
            }else{
                  break;
            }*/
        }   
    }
}
