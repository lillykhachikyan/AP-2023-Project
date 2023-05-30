import java.util.Scanner;

public class CareerSearch{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to CareerSearch");
        System.out.println("Enter four subjects you're interested in:");
        
        System.out.print("Subject 1: ");
        String subject1 = scanner.nextLine();
        
        System.out.print("Subject 2: ");
        String subject2=scanner.nextLine();
        
        System.out.print("Subject 3: ");
        String subject3 = scanner.nextLine();
        
        System.out.print("Subject 4: ");
        String subject4=scanner.nextLine();
        
        String findCareer=findCareer(subject1,subject2,subject3,subject4);
        System.out.println("Your four interests say possible career options include:" + findCareer);
        String recomCollege=recommendCollege(findCareer);
        System.out.println("A college perfect for the career you chose is:"+ recomCollege);
        
        System.out.println("Do you want to view application requirements for a college that was suggested? Yes/No?");
        String choice=scanner.nextLine();
        if(choice.equalsIgnoreCase("Yes")){
            System.out.print("Enter the name of the college: ");
            String selectedCollege = scanner.nextLine();
            viewApplicationRequirements(selectedCollege);
        }
    }
    
     public static String findCareer(String subject1,String subject2,String subject3,String subject4){
        if(subject1.equalsIgnoreCase("Math")||subject2.equalsIgnoreCase("Math")||subject3.equalsIgnoreCase("Math")||subject4.equalsIgnoreCase("Math")){
            return "Economist, Statistician,Data Scientist,Financial analyst";
        } else if (subject1.equalsIgnoreCase("Biology")||subject2.equalsIgnoreCase("Biology")||subject3.equalsIgnoreCase("Biology")||subject4.equalsIgnoreCase("Biology")){
            return "Pharmaceutical marketing, Microbiologist, Medical laboratory scientist, Environmental scientist";
        } else if (subject1.equalsIgnoreCase("Computer Science")||subject2.equalsIgnoreCase("Computer Science")||subject3.equalsIgnoreCase("Computer Science")||subject4.equalsIgnoreCase("Computer Science")){
            return "Software Engineer,web developer, network administrator, software tester, product manager, and engineering manager";
        } else if (subject1.equalsIgnoreCase("Art")||subject2.equalsIgnoreCase("Art")||subject3.equalsIgnoreCase("Art")||subject4.equalsIgnoreCase("Art")){
            return "Artist,Architecture, Art professor, Web Designer ";
        }else{
            return "undecided";
        }
    }
    
    public static String recommendCollege(String career){
        if(career.equalsIgnoreCase("Economist, Statistician,Data Scientist,Financial analyst")){
            return "UCLA, Harvard, Oxford, Stanford";
        }else if(career.equalsIgnoreCase("Pharmaceutical marketing, Microbiologist, Medical laboratory scientist, Environmental scientist")){
            return "Cornell, Columbia,UCLA, USC, University of Central Florida";
        }else if(career.equalsIgnoreCase("Software Engineer,web developer, network administrator, software tester, product manager, and engineering manager")){
            return "University of Chicago, UCLA, Rochester Institute of Technology,University of California, Davis, University of California Riverside";
        }else if(career.equalsIgnoreCase("Artist,Architecture, Art professor, Web Designer ")){
            return " School of the Art Institute of Chicago,Rhode Island School of Design, California College of the Arts, UCLA";
        }else{
            return "no recommendation";
            
    
        }
    }
    public static void viewApplicationRequirements(String college){
        if(college.equalsIgnoreCase("UCLA")){
            System.out.println("Application requirements for UCLA:");
            System.out.println("- High school transcript");
            System.out.println("- above a 4.0 GPA");
            System.out.println("- 670 - 760. SAT Mathematics");
            System.out.println("- 690 - 790. SAT Essay");
            System.out.println ("You can access the link to the application through https://admission.ucla.edu/apply");
        }else if(college.equalsIgnoreCase("Harvard")){
            System.out.println("Application requirements for Harvard:");
            System.out.println("- suggest a 1580 SAT or a 35 ACT");
            System.out.println("- suggested a GPA above a 3.9 ");
            System.out.println ("You can access the link to the application through https://college.harvard.edu/admissions/apply");
        }else if(college.equalsIgnoreCase("Oxford")){
            System.out.println("Application requirements for Oxford:");
            System.out.println("- High school transcript");
            System.out.println("- above a 3.7 GPA");
            System.out.println("- good SAT/ACT score, if applying for bachelor's ");
            System.out.println ("You can access the link to the application through https://www.ox.ac.uk/admissions/undergraduate/applying-to-oxford");
        }else if(college.equalsIgnoreCase("Stanford")){
            System.out.println("Application requirements for Stanford:");
            System.out.println("- High school transcript");
            System.out.println("- above a 3.96 GPA");
            System.out.println("- 1550 SAT or a 35 ACT");
            System.out.println ("You can access the link to the application through https://admission.stanford.edu/apply/");
        }else if(college.equalsIgnoreCase("Cornell")){
            System.out.println("Application requirements for Cornell:");
            System.out.println("- High school transcript");
            System.out.println("- above a 3.5 GPA");
            System.out.println("- SAT score between 1155 and 1405 or an ACT score of 24 and 30");
            System.out.println ("You can access the link to the application through http://admissions.cornell.edu/apply");
        }else if(college.equalsIgnoreCase("Columbia")){
            System.out.println("Application requirements for Columbia:");
            System.out.println("- High school transcript");
            System.out.println("- above a 3.0 GPA");
            System.out.println("- 21 ACT or 1060 SAT score or rank in the top half of their graduating class");
            System.out.println ("You can access the link to the application through https://undergrad.admissions.columbia.edu/apply");
        }else if(college.equalsIgnoreCase("USC")){
            System.out.println("Application requirements for USC:");
            System.out.println("- High school transcript");
            System.out.println("- above a 3.79 GPA");
            System.out.println("- 1530 SAT or a 34 ACT");
            System.out.println ("You can access the link to the application through https://admission.usc.edu/apply/");
        }else if(college.equalsIgnoreCase("University of Central Florida")){
            System.out.println("Application requirements for University of Central Florida:");
            System.out.println("- High school transcript");
            System.out.println("- above a 4.0 GPA");
            System.out.println("- SAT: 1270 – 1390");
            System.out.println("- ACT: 26 – 30");
            System.out.println ("You can access the link to the application through https://www.ucf.edu/admissions/undergraduate/apply/");
        }else if(college.equalsIgnoreCase("University of Chicago")){
            System.out.println("Application requirements for University of Chicago:");
            System.out.println("- High school transcript");
            System.out.println("- SAT score between 1510–1560");
            System.out.println("- ACT score of 34–35");
            System.out.println ("You can access the link to the application through https://admission.ucla.edu/apply");
        }else if(college.equalsIgnoreCase("Rochester Institute of Technology")){ 
            System.out.println("Application requirements for Rochester Institute of Technology:");
            System.out.println("- High school transcript");
            System.out.println("- above a 3.0 GPA");
            System.out.println("- average SAT score between 1270-1450 or an average ACT score of 28-33");
            System.out.println ("You can access the link to the application through https://www.rit.edu/admissions/apply");
        }else if(college.equalsIgnoreCase("University of California, Davis")){
            System.out.println("Application requirements for University of California, Davis:");
            System.out.println("- High school transcript");
            System.out.println("- above a 2.4 GPA");
            System.out.println("- 610-710. SAT Mathematics");
            System.out.println("- 620-780 SAT Essay");
            System.out.println ("You can access the link to the application through https://www.ucdavis.edu/admissions/apply");
        }else if(college.equalsIgnoreCase("University of California Riverside")){
            System.out.println("Application requirements for University of California Riverside:");
            System.out.println("- High school transcript");
            System.out.println("- above a 3.0 GPA");
            System.out.println("- 560 - 670. SAT Mathematics");
            System.out.println("- 570 - 730. SAT Essay");
            System.out.println ("You can access the link to the application through https://www.ucr.edu/apply");
        }else if(college.equalsIgnoreCase("School of the Art Institute of Chicago")){
            System.out.println("Application requirements for School of the Art Institute of Chicago:");
            System.out.println("- High school transcript");
            System.out.println("- above a 3.0 GPA");
            System.out.println("- SAT score between 1120-1360 or an average ACT score of 22-29");
            System.out.println ("You can access the link to the application through https://www.saic.edu/admissions/freshmen/how-to-apply");
        }else if(college.equalsIgnoreCase("Rhode Island School of Design")){
            System.out.println("Application requirements for Rhode Island School of Design:");
            System.out.println("- High school transcript");
            System.out.println("- 688 on the SAT math and 655 English");
            System.out.println("- above a 3.6 GPA");
            System.out.println ("You can access the link to the application through https://www.risd.edu/admissions/first-year/apply-risd");
        }else if(college.equalsIgnoreCase("California College of the Arts")){
            System.out.println("Application requirements for California College of the Arts:");
            System.out.println("- High school transcript");
            System.out.println("- above a 4.0 GPA");
            System.out.println("- An online application and nonrefundable application fee of $70.");
            System.out.println("- Personal essay");
            System.out.println("- High school/college transcripts");
            System.out.println("- One letter of recommendation");
            System.out.println ("You can access the link to the application through https://www.cca.edu/admissions/apply/");
        }
    }
}