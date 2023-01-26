package org.example1;


import org.example.CourseProgramme;
import org.example.Lecturer;
import org.example.Module;
import org.example.Student;
import org.joda.time.LocalDate;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CourseProgramme computerScience = new CourseProgramme("Computer Science", 1);

        Module sniperTraining = new Module("Sniper Training", 325);
        Module dataBase2 = new Module("Database Systems 2", 124);
        Module Software2 = new Module("Software Engineering 2", 415);

        Lecturer simoHäyhä = new Lecturer("Simo Häyhä", new LocalDate(1905,12,17),16);
        Lecturer ismoLeikola = new Lecturer("Ismo Leikola", new LocalDate(1979,1,22),31);

        Student peterJackson = new Student("Peter Jackson", new LocalDate(1961,10,31),69);
        Student stevenSpielberg = new Student("Steven Spielberg", new LocalDate(1946,12,18),25);
        Student quentinTarantino = new Student("Quentin Tarantino", new LocalDate(1963,3,27),12);

        computerScience.setModuleAvailable(sniperTraining);
        computerScience.setModuleAvailable(dataBase2);
        computerScience.setModuleAvailable(Software2);

        sniperTraining.setAssociatedCourses(computerScience);
        sniperTraining.setLecturerResponsible(simoHäyhä);
        sniperTraining.setNoOfStudents(peterJackson);
        sniperTraining.setNoOfStudents(stevenSpielberg);
        sniperTraining.setNoOfStudents(quentinTarantino);

        dataBase2.setAssociatedCourses(computerScience);
        dataBase2.setLecturerResponsible(ismoLeikola);
        dataBase2.setNoOfStudents(peterJackson);
        dataBase2.setNoOfStudents(stevenSpielberg);
        dataBase2.setNoOfStudents(quentinTarantino);

        Software2.setAssociatedCourses(computerScience);
        Software2.setLecturerResponsible(ismoLeikola);
        Software2.setNoOfStudents(peterJackson);
        Software2.setNoOfStudents(stevenSpielberg);
        Software2.setNoOfStudents(quentinTarantino);

        computerScience.setStudentsEnrolled(peterJackson);
        computerScience.setStudentsEnrolled(stevenSpielberg);
        computerScience.setStudentsEnrolled(quentinTarantino);

        peterJackson.setCourses(computerScience);
        peterJackson.setModules(sniperTraining);
        peterJackson.setModules(dataBase2);
        peterJackson.setModules(Software2);

        stevenSpielberg.setCourses(computerScience);
        stevenSpielberg.setModules(sniperTraining);
        stevenSpielberg.setModules(dataBase2);
        stevenSpielberg.setModules(Software2);

        quentinTarantino.setCourses(computerScience);
        quentinTarantino.setModules(sniperTraining);
        quentinTarantino.setModules(dataBase2);
        quentinTarantino.setModules(Software2);

        CourseProgramme Arts = new CourseProgramme("Arts", 2);

        Module math = new Module("Math", 78);
        Module childCare = new Module("Child Care", 865);
        Module classics = new Module("Classics", 222);

        Lecturer reneDescartes = new Lecturer("René Descartes", new LocalDate(1596,3,31),76);
        Lecturer friedrichNietzsche = new Lecturer("Friedrich Nietzsche", new LocalDate(1844,10,15),53);

        Student tedKaczynski = new Student("Ted Kaczynski", new LocalDate(1942,5,22),69);
        Student tedBundy = new Student("Ted Bundy", new LocalDate(1946,11,24),66);
        Student johnWayneGacy = new Student("John Wayne Gacy", new LocalDate(1942,3,17),87);

        Arts.setModuleAvailable(math);
        Arts.setModuleAvailable(childCare);
        Arts.setModuleAvailable(classics);

        math.setAssociatedCourses(Arts);
        math.setLecturerResponsible(friedrichNietzsche);
        math.setNoOfStudents(tedKaczynski);
        math.setNoOfStudents(tedBundy);
        math.setNoOfStudents(johnWayneGacy);

        childCare.setAssociatedCourses(Arts);
        childCare.setLecturerResponsible(reneDescartes);
        childCare.setNoOfStudents(tedKaczynski);
        childCare.setNoOfStudents(tedBundy);
        childCare.setNoOfStudents(johnWayneGacy);

        classics.setAssociatedCourses(Arts);
        classics.setLecturerResponsible(friedrichNietzsche);
        classics.setNoOfStudents(tedKaczynski);
        classics.setNoOfStudents(tedBundy);
        classics.setNoOfStudents(johnWayneGacy);

        Arts.setStudentsEnrolled(tedKaczynski);
        Arts.setStudentsEnrolled(tedBundy);
        Arts.setStudentsEnrolled(johnWayneGacy);

        tedKaczynski.setCourses(Arts);
        tedKaczynski.setModules(math);
        tedKaczynski.setModules(childCare);
        tedKaczynski.setModules(classics);

        tedBundy.setCourses(Arts);
        tedBundy.setModules(math);
        tedBundy.setModules(childCare);
        tedBundy.setModules(classics);

        johnWayneGacy.setCourses(Arts);
        johnWayneGacy.setModules(math);
        johnWayneGacy.setModules(dataBase2);
        johnWayneGacy.setModules(classics);

        ArrayList<CourseProgramme> course = new ArrayList<>();
        course.add(computerScience);
        course.add(Arts);

        ArrayList<Student> students = new ArrayList<>();
        students.add(peterJackson);
        students.add(stevenSpielberg);
        students.add(quentinTarantino);
        students.add(tedKaczynski);
        students.add(tedBundy);
        students.add(johnWayneGacy);

        System.out.println("\n***************************\n");
        System.out.println("Courses available:\n");
        for(int i = 0; i < course.size(); i++){
            System.out.println(course.get(i));
        }
        System.out.println("\n***************************");
        for(int i = 0; i < course.size(); i++){
            System.out.println("\nModules available for " + course.get(i) + "\n");
            for (int j = 0; j < course.get(i).getModuleAvailable().size(); j++) {
                System.out.println(course.get(i).getModuleAvailable().get(j));
            }
        }
        System.out.println("\n***************************");
        for(int i = 0; i < course.size(); i++) {
            System.out.println("\nStudents Enrolled in " + course.get(i) + "\n");
            for (int j = 0; j < course.get(i).getStudentsEnrolled().size(); j++) {
                System.out.println(course.get(i).getStudentsEnrolled().get(j));
            }
        }
        System.out.println("\n***************************\n");
        System.out.println("Usernames of each student: \n");
        for(int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getUsername());
        }
        System.out.println("\n***************************\n");
        for(int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getName() + " is registered in: "+ students.get(i).getCourse());
        }
        System.out.println("\n***************************");
        for(int i = 0; i < students.size(); i++) {
            System.out.println("\n" + students.get(i).getName() + " is registered in:\n");
            for(int j = 0; j < students.get(i).getModules().size(); j++){
                System.out.println(students.get(i).getModules().get(j));
            }
        }
        System.out.println("\n***************************");
    }
}