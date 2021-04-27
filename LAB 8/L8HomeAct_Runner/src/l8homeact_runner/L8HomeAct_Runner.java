package l8homeact_runner;


public class L8HomeAct_Runner {

    
    public static void main(String[] args) {

        //student details
        Student std = new Student("Imtanan Mehmood", "House No 12, Street No 3, Islamabad", 23131, "imtanan002@gmail.com", "Undergraduate");
        std.display();
        
        ///faculty details
        Date d1 = new Date(02, 12, 2018);
        Faculty f = new Faculty("Muhammad Musa", "House No 13, Street No 3, Islamabad", 31231, "muhammadmusa2002@gmail.com", "Nayatel", 30000, d1, 5, "Accountant");
        f.display();
        
        //staff details
        Date d2 = new Date(17, 04, 2020);
        Staff s = new Staff("Tani", "House No 4, street No 3, Islamabad", 23123, "tani2020@gmail.com", "Touch Stone", 90000, d2, "Worker");
        s.display();
    }

}
