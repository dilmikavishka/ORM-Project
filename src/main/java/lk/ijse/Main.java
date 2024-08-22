package lk.ijse;


import lk.ijse.configer.FactoryConfiguration;
import lk.ijse.embed.FullName;
import lk.ijse.entity.Animal;
import lk.ijse.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();

        //open transaction
        Transaction transaction = session.beginTransaction();

        //student
        FullName fullName = new FullName("Dilmi","Kavishka");
        Student student = new Student();
        student.setId(2);
        student.setFullName(fullName);
        student.setAddress("Panadura");

        //predifine method thinne save update delete
        //save
        session.save(student);
        //delete
        session.delete(student);
        //get
        Student student2 = session.get(Student.class, 2);
        System.out.println(student2.toString());
        //commit
        transaction.commit();

        //animal
        Session session2 = FactoryConfiguration.getInstance().getSession();
        Transaction transaction2 = session2.beginTransaction();

        Animal animal = new Animal(1,"kity","male","white");
        //save
        session2.save(animal);
        //update
        session2.update(animal);
        //delete
        session2.delete(animal);
        //get
        Animal animal2 = session2.get(Animal.class, 1);
        System.out.println(animal2.getName()+","+animal2.getGender()+","+animal2.getColor());
        transaction2.commit();

        session.close();

    }
}