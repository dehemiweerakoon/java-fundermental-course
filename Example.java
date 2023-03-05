import java.util.*;
public class Example00 {
    public static void menu(){
      System.out.println("---------------------------------------------------------------------------------------------");
      System.out.println("|                       WELCOME TO GDSE MARKS MANAGEMENT SYSTEM                             |");
      System.out.println("---------------------------------------------------------------------------------------------\n");

      System.out.println("[1] Add New Student.                \t\t\t [2] Add New Student With Marks");
      System.out.println("[3] Add Marks.                      \t\t\t [4] Update Student Details");
      System.out.println("[5] Update Marks.                   \t\t\t [6] Delete Student.");
      System.out.println("[7] Print Student Detalis           \t\t\t [8] Print Student Ranks");
      System.out.println("[9] Best is Programming Fundermentals\t\t\t [10] Best in DataBase Managment System\n");
    }
       public static void addNewStudent(){
        
              lebal:while(true){        
               Scanner input=new Scanner(System.in);
               System.out.print("\n\nEnter Student Id:"); 
               String id=input.nextLine();//input id 
               for(int i=0;i<Studentid.length;i++){
                    if(id.equals(Studentid[i])){
                      System.out.println("\nThe Student ID already exists.");
                      continue lebal;
                    }
               }
               String temp[]=new String[Studentid.length+1];
               String temp1[]=new String[StudentName.length+1];
               int temp2[]=new int[StudentName.length+1];
               int temp3[]=new int[DataBase.length+1];
               //if id don't ger duplicated system letb user to enter the current student details:)
               
               System.out.print("Enter Student Name:");
               String name=input.nextLine();//input name
       
               for(int i=0;i<Studentid.length;i++){
                   temp[i]=Studentid[i];
               }
               for(int i=0;i<StudentName.length;i++){
                     temp1[i]=StudentName[i];
                 }
                 for(int i=0;i<pfundermentals.length;i++){
                     temp2[i]=pfundermentals[i];
                 }
                 for(int i=0;i<DataBase.length;i++){
                     temp3[i]=DataBase[i];
                 }
               temp[temp.length-1]=id;
               Studentid=temp;
       
               temp1[temp1.length-1]=name;
               StudentName=temp1;
               
               temp2[temp2.length-1]=0;
               pfundermentals=temp2;
               
               temp3[temp3.length-1]=0;
               DataBase=temp3;
               System.out.print("\nStudent has been enterd succefully.Do you want to add a new student (y/n)");
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
     //----------------------------------------------------------------------------------------------------
     public static String[] Addname(){
       Scanner input =new Scanner(System.in);
       String temp1[]=new String[StudentName.length+1];

       //if id don't ger duplicated system letb user to enter the current student details:)
       
       System.out.print("Enter Student Name:");
       String name=input.nextLine();//input name

       for(int i=0;i<StudentName.length;i++){
             temp1[i]=StudentName[i];
         }

       temp1[temp1.length-1]=name;
       StudentName=temp1;
         return StudentName;
     }
      // second option method------------>
     public static String[]  addNewStudentWithMarks(){
       lebal:while(true){        
              Scanner input=new Scanner(System.in);
              System.out.print("Enter Student Id:"); 
              String id=input.nextLine();//input id 
              for(int i=0;i<Studentid.length;i++){
                   if(id.equals(Studentid[i])){
                     System.out.println("The Student ID already exists.\n");
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
              
              //marks addition to system//
              
              System.out.print("Programming Fundermentals Marks :");
              int pmarks=input.nextInt();//if mark>100 or mark<0 then user want to enter the marks again:
                   while(pmarks>100 || pmarks<0){
                     System.out.print("Invail Marks,Please enter corrent Marks.\n\nProgramming Fundermentals Marks :");
                     pmarks=input.nextInt();
                   }
              System.out.print("DataBase Managment System Marks :");
              int dmarks=input.nextInt();
                 while(dmarks>100 || dmarks<0){
                     System.out.print("Invail Marks,Please enter corrent Marks.\n\nDataBase Managment System Marks :");
                     dmarks=input.nextInt();
                   }

              int temp2[]=new int[pfundermentals.length+1];
              int temp3[]=new int[DataBase.length+1];

              for(int i=0;i<pfundermentals.length;i++){
                     temp2[i]=pfundermentals[i];
                 }
              for(int i=0;i<DataBase.length;i++){
                     temp3[i]=DataBase[i];
                 }
                temp2[temp2.length-1]=pmarks;
                pfundermentals=temp2;

                temp3[temp3.length-1]=dmarks;
                DataBase=temp3;
              System.out.print("\nStudent has been enterd succefully.Do you want to add a new student (y/n):");
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
        return Studentid ; 
     }
      //------------------------------------------------------------------------------------------------------------------
     public static void addMarks(){
      Scanner input=new Scanner(System.in);
      Scanner scanner=new Scanner(System.in);
         if(Studentid.length<0){
            System.out.println("invalid --->");
            return;
         }else{
        prob1:while(true){
              System.out.print("Enter Student ID :"); 
                
              String id=scanner.nextLine();
              prob2  : for(int i=0;i<Studentid.length;i++){
                    if(id.equals(Studentid[i])){
                           System.out.println("Student Name:"+StudentName[i]);
                           if(pfundermentals[i]!=0 || DataBase[i]!=0){
                             System.out.println("This student's marks already has been added.\nIf you want to update marks , please use [4] Update Marks option.\n"+pfundermentals[i]);
                             System.out.print("Do you want to add marks for another student?(Y/N):");
                             char c=scanner.next().charAt(0);
                            if(c=='y' || c=='Y'){
                              scanner.nextLine();
                               continue prob1;
                            }else
                              return;
                           }
                           if(pfundermentals[i]==0){
                           System.out.print("\nProgramming Fundermental Marks:"); 
                           int pmarks=scanner.nextInt();
                              if(pmarks>100 || pmarks<0){
                                  System.out.println("Invalid marks please enter valid marks.n\nProgramming Fundermental Marks:");
                              }
                              int temp4[]=new int[Studentid.length+1];
                              for(int j=0;j<DataBase.length;j++){
                                    temp4[j]=pfundermentals[j];
                              }
                              temp4[i]=pmarks;
                              pfundermentals=temp4;
                          }
                          if(DataBase[i]==0){
                                  System.out.print("\nDataBase Managment System Marks:"); 
                                  int dmarks=scanner.nextInt();
                                     if(dmarks>100 || dmarks<0){
                                         System.out.print("Invalid marks please enter valid marks.n\nProgramming Fundermental Marks:");
                                     }
                                     int temp4[]=new int[Studentid.length];
                                     for(int j=0;j<DataBase.length;j++){
                                           temp4[j]=DataBase[j];
                                     }
                                     temp4[temp4.length-1]=dmarks;
                                     DataBase=temp4;
                                  }
                                 
                           System.out.print("Marks have been added.Do you want to add marks for another student?(Y/N):");
                           char c=scanner.next().charAt(0);
                           if(c=='y' || c=='Y'){
                                  scanner.nextLine();  
                                  continue prob1;
                            }
                              else
                                return;
                       }              
              }
               
               System.out.print("Invalid Student ID.Do you want to search again(Y/N)?"); 
               char c=scanner.next().charAt(0);
                   if(c=='y' || c=='Y'){
                         scanner.nextLine();
                         continue prob1;
                   }else
                    break;
            }
         }
        }
        //---------------------------------------------------------------------------------------------
      public static void updateStudentDetails(){
        Scanner input=new Scanner(System.in);
        Scanner scanner=new Scanner(System.in);
     lebal  : while(true){
          System.out.print("Enter Student ID:");
          String id=input.nextLine();
          for(int i=0;i<Studentid.length;i++){
             if(id.equals(Studentid[i])){
                 System.out.println("Student Name :"+StudentName[i]);
                 System.out.print("Enter the new student name:");
                 String Nname=input.nextLine();
                 StudentName[i]=Nname;
                 System.out.println("Student details has been updated succesfully.");
                 System.out.print("Do you want to update another student details?(Y/N):");
                 
                 char c=scanner.next().charAt(0); 
                   if(c=='y' || c=='Y')
                        continue lebal;
                   else
                     return;
             }
          }
          System.out.print("Invalid Student ID.Do you want to search again(Y/N)?");
          char c=scanner.next().charAt(0);
                   if(c=='y' || c=='Y')
                        continue lebal;
                   else
                       return;
        }
      }
      //-----------------------------------------------------------------------------------------------------
      public static void updateMarks(){
        Scanner scanner=new Scanner(System.in);
     lebal  : while(true){
          System.out.print("Enter Student ID:");
          String id=scanner.nextLine();
          for(int i=0;i<Studentid.length;i++){
             if(id.equals(Studentid[i])){
                 System.out.println("Student Name :"+StudentName[i]);
                 if(pfundermentals[i]!=0 && DataBase[i]!=0 ){
                  System.out.println("\nProgramming Fundermentals Marks:"+pfundermentals[i]);
                  System.out.println("\nDataBase Managment System Marks:"+DataBase[i]);
                  System.out.println();
                  System.out.print("Enter new Programming Fundermental Marks:");
                  int pmarks=scanner.nextInt();
                     while(pmarks>=100 || pmarks<=0){
                      System.out.print("Enter new Programming Fundermental Marks:");
                       pmarks=scanner.nextInt();
                     }
                  System.out.print("Enter new DataBase Managment System Marks:");
                  int dmarks=scanner.nextInt();
                     while(dmarks>=100 || dmarks<=0){
                      System.out.print("Enter new DataBase Managment System Marks:");
                      dmarks=scanner.nextInt();
                     }
                  pfundermentals[i]=pmarks;
                  DataBase[i]=dmarks;
                  System.out.println("Student details has been updated succesfully.");
                 System.out.print("Do you want to update another student MARKS?(Y/N):");
                 char c=scanner.next().charAt(0);
                   if(c=='y' || c=='Y'){
                    scanner.nextLine();
                        continue lebal;
                   }else
                     return;
                  }  else{
                    System.out.println("This student mark yet to be added.\n");
                    System.out.print("Do you want to update another student MARKS?(Y/N):");
                    char c=scanner.next().charAt(0);
                   if(c=='y' || c=='Y'){
                        scanner.nextLine();
                        continue lebal;
                   } else
                     return;
                  }
                   
             }
          }
          System.out.print("Invalid Student ID.Do you want to search again(Y/N)?");
          char c=scanner.next().charAt(0);
                   if(c=='y' || c=='Y'){
                        scanner.nextLine();
                        continue lebal;
                   }else
                       break;
        }
      }
     //---------------------------------------------------------------------------------------------------------------------------
      public static void deleteStudent(){
        Scanner scanner=new Scanner(System.in);
  lebal :while(true){
         System.out.print("Enter student ID:");
         String id=scanner.nextLine();

         for(int i=0;i<Studentid.length;i++){
           if(id.equals(Studentid[i])){
              String[]temp1=new String[Studentid.length-1];
              String[]temp2=new String[Studentid.length-1];
               int[]temp3=new int[Studentid.length-1];
               int[]temp4=new int[Studentid.length-1];
               for(int j=0;j<i;j++){
                temp1[j]=Studentid[j];
                temp2[j]=StudentName[j];
                temp3[j]=pfundermentals[j];
                temp4[j]=DataBase[j];
               }
               for(int j=i;j<temp1.length;j++){
                temp1[j]=Studentid[j+1];
                temp2[j]=StudentName[j+1];
                temp3[j]=pfundermentals[j+1];
                temp4[j]=DataBase[j+1];
               }
               Studentid=temp1;
               StudentName=temp2;
               pfundermentals=temp3;
               DataBase=temp4;

               System.out.print("Student has been delated Succesfully.\nDo  you wnat to search again: ");
               char c=scanner.next().charAt(0);
               System.out.println("\n\n");
                   if(c=='y' || c=='Y'){
                        scanner.nextLine();
                        continue lebal ;
                   }else
                       return;
           }
         }
         System.out.println("Invalid Student ID.Do you want to search again(Y/N) ?:");
         char c=scanner.next().charAt(0);
                   if(c=='y' || c=='Y'){
                        scanner.nextLine();
                        continue lebal ;
                   }else
                       return;
        }
      }

      //-------------------------------------------------------------------------------------------------------------
    public static void printStudentDetails(){
      Scanner scanner=new Scanner(System.in); 
      double avg[]=Ranks();
      System.out.println(Arrays.toString(StudentName));
      System.out.println(Arrays.toString(Studentid));
      System.out.println(Arrays.toString(pfundermentals));
      System.out.println(Arrays.toString(DataBase));
  lebal:while(true){
        System.out.print("Enter Student ID :");
        String id =scanner.nextLine();
       
        for(int i=0;i<Studentid.length;i++){
          if(id.equals(Studentid[i])){
            System.out.println("Student name    :"+StudentName[i]);
            if(pfundermentals[i]==0|| DataBase[i]==0){
              System.out.println("Marks yet to be added.");
              System.out.print("\nDo you want to search another student details(y/n):");
              char c=scanner.next().charAt(0);
                   if(c=='y' || c=='Y'){
                        scanner.nextLine();
                        continue lebal ;
                   }else
                       return;
            }else{
              System.out.println("\n\n--------------------------------------------------------+------------------------------------");
              System.out.println("|Programming Fundermental Marks                         |"+"\t\t\t"+pfundermentals[i]+"\t|");
              System.out.println("|DataBase Managment System Marks                        |"+"\t\t\t"+DataBase[i]+"\t|");
              System.out.println("|Total Marks                                            |"+"\t\t\t"+(pfundermentals[i]+DataBase[i])+"\t|");
              System.out.println("|Avg. Marks                                             |"+"\t\t\t"+((pfundermentals[i]+DataBase[i])/2.0)+"\t|");
              System.out.println("|Rank                                                   |"+"\t\t\t"+(avg.length-i)+"\t|\n\n\n");
              System.out.println("\n\n--------------------------------------------------------+------------------------------------");
              System.out.print("\n\nDo you want to search another student details(y/n):");
              char c=scanner.next().charAt(0);
                   if(c=='y' || c=='Y'){
                        scanner.nextLine();
                        continue lebal ;
                   }else
                       return;
            }
          }
        }
        System.out.println("Invalid Student Id.");
        System.out.print("\n\nDo you want to search another student details(y/n):");
        char c=scanner.next().charAt(0);
             if(c=='y' || c=='Y'){
                  scanner.nextLine();
                  continue lebal ;
             }else
                 return;
      }
    }
    //----------------------------------------------------------------------------------------------------------------------------------
    public static double[]  Ranks() {
      double []avg=new double[pfundermentals.length];
      for(int i=0;i<Studentid.length;i++){
              avg[i]=(pfundermentals[i]+DataBase[i])/2.0;
      }
     
       String temp1=Studentid[0],temp2=StudentName[0];
       int temp3=pfundermentals[0],temp4=DataBase[0];
       for(int i=avg.length-1;i>0;i--){ 
          double max=avg[0];
          int  index=0;
        for(int j=1;j<=i;j++){
          if(avg[j]>max){
            max=avg[j];
            index=j;
          }
        }
        avg[index]=avg[i];
        avg[i]=max;
        //----------------we want to change order of the array-------------------------------------------
        temp1=Studentid[i];
        Studentid[i]=Studentid[index];
        Studentid[index]=temp1;

        temp2=StudentName[i];
        StudentName[i]=StudentName[index];
        StudentName[index]=temp2;

        temp3=pfundermentals[i];
        pfundermentals[i]=pfundermentals[index];
        pfundermentals[index]=temp3;

        temp4=DataBase[i];
        DataBase[i]=DataBase[index];
        DataBase[index]=temp4;


       }
       return avg;
       
    }   
    public static void printStudentRanks(){
      Scanner scanner=new Scanner(System.in);
      while(true){
          double []avg=Ranks();
          System.out.println("--------+-------+---------------------------------------+---------------+---------------+");
          System.out.println("|Rank\t|ID\t|Name\t\t\t\t\t|Total Marks\t|Avg.Marks\t|");
          System.out.println("--------+-------+---------------------------------------+---------------+---------------+");
          for(int i=Studentid.length-1;i>=0;i--){
            if(avg[i]==0.0){
              continue;
            }
            // System.out.println("|"+(avg.length-i)+"\t|"+Studentid[i]+"\t|"+StudentName[i]+"\t\t\t\t\t|"+(pfundermentals[i]+DataBase[i])+"\t\t|"+avg[i]+"\t\t|");
               System.out.format("|%-6d |%-7s|%-39s|%15d|%15f|",(avg.length-i),Studentid[i],StudentName[i],(pfundermentals[i]+DataBase[i]),avg[i]);
               System.out.println();
          }
          System.out.println("--------+-------+---------------------------------------+---------------+---------------+");
          System.out.print("\n\n\n\n\n\nDo you want to go back yo Main menu:");
          char c=scanner.next().charAt(0);
             if(c=='y' || c=='Y'){
                 return;
             }else
                  continue;
        }
        
    }
    public static void pfundermentals() {
      Scanner scanner=new Scanner(System.in);
      while(true){
         String temp1,temp2;
         int temp3,temp4;
          for(int i=pfundermentals.length-1;i>0;i--){
            int max=pfundermentals[0];
            int index=0;
            for(int j=1;j<=i;j++){
              if(pfundermentals[j]>max){
                   max=pfundermentals[j];
                   index=j;
              }
            }
             pfundermentals[index]=pfundermentals[i];
             pfundermentals[i]=max;
            
             temp1=Studentid[index];
             Studentid[index]=Studentid[i];
             Studentid[i]=temp1;

             temp2=StudentName[index];
             StudentName[index]=StudentName[i];
             StudentName[i]=temp2;

             temp4=DataBase[index];
             DataBase[index]=DataBase[i];
             DataBase[i]=temp4;
          }
          System.out.println("+-------+---------------------------------------+---------------+---------------+---------+");
          System.out.println("|ID\t|Name\t\t\t\t\t|PF Marks\t|DBMS Marks\t|");
          System.out.println("+-------+---------------------------------------+---------------+---------------+---------+");
          for(int i=StudentName.length-1;StudentName.length-5<=i;i--){
            System.out.format("|%7s|%39s|%15d|%15d|",Studentid[i],StudentName[i],pfundermentals[i],DataBase[i]);
            System.out.println();
          }
          System.out.println("+-------+---------------------------------------+---------------+---------------+---------+");
          System.out.print("\n\n\n\n\n\nDo you want to go back yo Main menu:");
          char c=scanner.next().charAt(0);
             if(c=='y' || c=='Y'){
                 return;
             }else
                  continue;
      }
    }

    public static void bestInDBs() {
      Scanner scanner=new Scanner(System.in);
      while(true){
      String temp1,temp2;
      int temp3,temp4;
       for(int i=DataBase.length-1;i>0;i--){
         int max=DataBase[0];
         int index=0;
         for(int j=1;j<=i;j++){
           if(DataBase[j]>max){
                max=DataBase[j];
                index=j;
           }
         }
          DataBase[index]=DataBase[i];
          DataBase[i]=max;
         
          temp1=Studentid[index];
          Studentid[index]=Studentid[i];
          Studentid[i]=temp1;

          temp2=StudentName[index];
          StudentName[index]=StudentName[i];
          StudentName[i]=temp2;

          temp4=pfundermentals[index];
          pfundermentals[index]=pfundermentals[i];
          pfundermentals[i]=temp4;
       }
       System.out.println("+-------+---------------------------------------+---------------+---------------+---------+");
       System.out.println("|ID\t|Name\t\t\t\t\t|PF Marks\t|DBMS Marks\t|");
       System.out.println("+-------+---------------------------------------+---------------+---------------+---------+");
       for(int i=StudentName.length-1;StudentName.length-5<=i;i--){
         System.out.format("|%-7s|%-39s|%15d|%15d|",Studentid[i],StudentName[i],pfundermentals[i],DataBase[i]);
         System.out.println();
       }
       System.out.println("+-------+---------------------------------------+---------------+---------------+---------+");
       System.out.print("\n\n\n\n\n\nDo you want to go back yo Main menu:");
       char c=scanner.next().charAt(0);
          if(c=='y' || c=='Y'){
              return;
          }else
               continue;
      }
 }
      public final static void clearConsole() { 
                    try {
                      final String os = System.getProperty("os.name"); 
                         if (os.contains("Windows")) {
                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                         } else {
                            System.out.print("\033[H\033[2J"); 
                            System.out.flush();
                         }
                     } catch (final Exception e) {
                       e.printStackTrace();
                          // Handle any exceptions.
                     }
               }
   public static String[] Studentid=new String[0];//student id array
   public static String[] StudentName=new String[0];//student name array
   public static int[] pfundermentals=new int[0];//student programming fundermental marks
   public static int[] DataBase=new int[0];//student DataBase Managment System Marks----->6
        
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);   
       // String[] Student=new String[0];
        int option;
        while(true){ 
          clearConsole();
            menu();
            System.out.print("\n\nEnter an option to continue >");
            option=input.nextInt();

            if(option==1){
                clearConsole();
                System.out.println("---------------------------------------------------------------------------------------------");
                System.out.println("|                                    ADD NEW STUDENT                                        |");
                System.out.println("---------------------------------------------------------------------------------------------\n\n\n");
                  addNewStudent();
                  System.out.println(Studentid.length);
                }else if(option==2){
                  clearConsole();
                System.out.println("---------------------------------------------------------------------------------------------");
                System.out.println("|                                 ADD NEW STUDENT WITH MARKS                                |");
                System.out.println("---------------------------------------------------------------------------------------------\n\n\n");
                   //clearConsole();
                   addNewStudentWithMarks();
                System.out.println("std"+Studentid.length);
            }else if(option==3){
              clearConsole();
              System.out.println("---------------------------------------------------------------------------------------------");
              System.out.println("|                                 ADD MARKS                                                 |");
              System.out.println("---------------------------------------------------------------------------------------------\n\n\n");
              System.out.println("std"+Studentid.length);
                   addMarks();
            }else if(option==4){
              clearConsole();
              System.out.println("---------------------------------------------------------------------------------------------");
              System.out.println("|                            UPDATE STUDENT DETAILS                                         |");
              System.out.println("---------------------------------------------------------------------------------------------\n\n\n");
                   updateStudentDetails();
            }else if(option==5){
              clearConsole();
              System.out.println("---------------------------------------------------------------------------------------------");
              System.out.println("|                                    UPDATE MARKS                                           |");
              System.out.println("---------------------------------------------------------------------------------------------\n\n\n");
                   updateMarks();
            }else if(option==6){
              clearConsole();
              System.out.println("---------------------------------------------------------------------------------------------");
              System.out.println("|                                    DELETE STUDENT                                         |");
              System.out.println("---------------------------------------------------------------------------------------------\n\n\n");
                   deleteStudent();
            }else if(option==7){
              clearConsole();
              System.out.println("---------------------------------------------------------------------------------------------");
              System.out.println("|                                PRINT STUDENT DETAILS                                      |");
              System.out.println("---------------------------------------------------------------------------------------------\n\n\n");
                   printStudentDetails();
            }else if(option==8){
              clearConsole();
              System.out.println("---------------------------------------------------------------------------------------------");
              System.out.println("|                                PRINT STUDENTS\' RANKS                                     |");
              System.out.println("---------------------------------------------------------------------------------------------\n\n\n");
                   printStudentRanks();
            }else if(option==9){
              clearConsole();
              System.out.println("---------------------------------------------------------------------------------------------");
              System.out.println("|                             BEST IN PROGRAMMING FUNDERMENTALS                             |");
              System.out.println("---------------------------------------------------------------------------------------------\n\n\n");
                   pfundermentals();
            }else if(option==10){
              clearConsole();
              System.out.println("---------------------------------------------------------------------------------------------");
              System.out.println("|                             BEST IN DATABASE MANAGMENT SYSTEM                             |");
              System.out.println("---------------------------------------------------------------------------------------------\n\n\n");
                   bestInDBs();
            }else{
                  break;
            }
        }   
    }
}