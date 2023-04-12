package com.tamtam.learn_hibernateee;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration config = new Configuration();
            config.configure();
            config.addAnnotatedClass(Student.class);
            SessionFactory sessionFactory = config.buildSessionFactory();
            System.out.println(sessionFactory);
            
            Student stu = new Student(1,"latika", "haecdhsz");
            
            
            Session session = sessionFactory.openSession();
            Transaction tc = session.beginTransaction();
            
            
             session.save(stu);
             System.out.println(stu);
            
            tc.commit();
             
             
             
             
             
             
             
             
             
             
             
             
             session.close();
            
    }
}
