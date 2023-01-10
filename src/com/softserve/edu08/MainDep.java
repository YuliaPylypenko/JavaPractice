package com.softserve.edu08;

public class MainDep {
    public static void main(String[] args) throws CloneNotSupportedException {

        Department d1 = new Department("Managers", new Department.Address("Kharkiv", "Nauky", 125));
        Department cloneD1 = (Department) d1.clone();
        /*Add some more detail about what you print, for example: Original department + d1*  DONE*/
        System.out.println("Original department: " + d1);
        System.out.println("Clone of the original department: " + cloneD1);
        cloneD1.getAddress().setCity("Odessa");
        System.out.println("Original department: " + d1);
        System.out.println("Changed clone: " + cloneD1);

    }
}


