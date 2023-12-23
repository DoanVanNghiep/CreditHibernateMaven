package hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
 
public class AppMain {
 
	static Student studentObj;
    static Session sessionObj;
    static SessionFactory sessionFactoryObj;
 
     
    public static void main(String[] args) {
        System.out.println(".......Hibernate Maven Example.......\n");
        try {
            sessionObj = HibernateUtil2.getSessionFactory().openSession();
            sessionObj.beginTransaction();
 
 //           for(int i = 101; i <= 105; i++) {
//                userObj = new User();
//                userObj.setUserid(i);
//                userObj.setUsername("Editor " + i);
//                userObj.setCreatedBy("Administrator");
//                userObj.setCreatedDate(new Date());
            	studentObj = new Student();
            	studentObj.setFirstName("Đoàn Văn");
            	studentObj.setLastName("Nghiệp");
            	studentObj.setBrithDay(null);
            	studentObj.setGender("Nam");
            	studentObj.setIdClass("CNPMB");
 
            	sessionObj.save(studentObj);
 //          }	
//                sessionObj.save(userObj);
            
            System.out.println("\n.......Records Saved Successfully To The Database.......\n");
 
            // Committing The Transactions To The Database
            sessionObj.getTransaction().commit();
        } catch(Exception sqlException) {
            if(null != sessionObj.getTransaction()) {
                System.out.println("\n.......Transaction Is Being Rolled Back.......");
                sessionObj.getTransaction().rollback();
            }
            sqlException.printStackTrace();
        } finally {
            if(sessionObj != null) {
                sessionObj.close();
            }
        }
    }
}