package com.faceweb.doa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.faceweb.enity.country;
import com.faceweb.enity.faceuser;
import com.faceweb.enity.friendlist;



public class facedoa implements facedoainterface {

	public int regsuserdoa(faceuser fu) {
		
		int i =0;
		/*
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/userdata","root","Shubham@1");
			PreparedStatement ps=con.prepareStatement("insert into userdata values(?,?,?)");
			ps.setString(1,fu.getName());
			ps.setString(2,fu.getEmail());
			ps.setString(3,fu.getPassword());
			
			i=ps.executeUpdate();
			
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}*/
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session ss=sf.openSession();
		EntityTransaction et=ss.getTransaction();
		et.begin();
		
			ss.save(fu);
	
	et.commit();
	i=1;
		
		
		
		return i;
	}

	
	public int loginuserdoa(faceuser fu) {
		int i =0;
		/*try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/userdata","root","Shubham@1");
			PreparedStatement ps=con.prepareStatement("select * from userdata where email=? and password=?");
			ps.setString(1,fu.getEmail());
			ps.setString(2,fu.getPassword());
			
			ResultSet  res = ps.executeQuery();
			if (res.next()) {
				i=1;
			}
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}*/
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session ss=sf.openSession();
		
		
		//faceuser ff = ss.load(faceuser.class,fu.getEmail());
		Query q=ss.createQuery("from com.faceweb.enity.faceuser f where f.email=:em and f.password=:pw");//select * from myfacebookuser f where f.email=? and f.password=?
		q.setParameter("em", fu.getEmail());
		q.setParameter("pw", fu.getPassword());
		
		List<faceuser> ff=q.getResultList();
		if(ff.size()>0) {
			i=1;
		}
		
		return i;
			
}

		



	
	public int deleteuserdoa(faceuser fu) {
		int i=0;
		/*	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
				
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/userdata","root","Shubham@1");
		PreparedStatement ps=con.prepareStatement("delete from userdata where email=?");
		ps.setString(1,fu.getEmail());
		 i = ps.executeUpdate();
		
	} catch(Exception e) {
		e.printStackTrace();
	}*/
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session ss=sf.openSession();
		EntityTransaction et=ss.getTransaction();
		et.begin();
		
			ss.delete(fu);
			
			et.commit();
			i=1;
				
				
		
	
		
	
			return i;
			}


	
	public int edituserdoa(faceuser fu) {
		int i=0;
		/*try {
			Class.forName("com.mysql.cj.jdbc.Driver");
					
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/userdata","root","Shubham@1");
			PreparedStatement ps=con.prepareStatement("update userdata set name=?, password=? where email=?");
			ps.setString(1,fu.getName());
			ps.setString(2,fu.getEmail());
			ps.setString(3,fu.getPassword());
			 i = ps.executeUpdate();
			
		} catch(Exception e) {
			e.printStackTrace();
		}*/
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session ss=sf.openSession();
		
		
		//faceuser ff = ss.load(faceuser.class,fu.getEmail());
		Query q=ss.createQuery("from com.faceweb.enity.faceuser f set f.name=:n and f.password=:pw where f.email=:=em");
		
		q.setParameter("n", fu.getName());
		q.setParameter("em", fu.getEmail());
		q.setParameter("pw", fu.getPassword());
		
		List<faceuser> ff=q.getResultList();
		if(ff.size()>0) {
			i=1;
		}
	
		
		return i;
}


	public ArrayList<faceuser> viewallprofiledoa() {
		/*ArrayList<faceuser> stl= new ArrayList<faceuser>();
		faceuser st1=null;
		
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/userdata","root","Shubham@1");
					PreparedStatement ps=con.prepareStatement("select * from userdata");
					
					ResultSet res=ps.executeQuery();
					
					while(res.next()) 
					{
					   st1 = new faceuser(); 
					   
					   String n = res.getString(1);
					   String e = res.getString(2);
					   String p = res.getString(3);
					  
					   
					   st1.setName(n);
					   st1.setEmail(e);
					   st1.setPassword(p);
					  
					   stl.add(st1);
					}
				}
				
				catch(Exception e) {
					e.printStackTrace();
				}*/
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session ss=sf.openSession();
		Query q=ss.createQuery("from com.faceweb.enity.faceuser f");//select * from myfacebookuser f where f.email=? and f.password=?
		
		
		List<faceuser>ff=q.getResultList();
		return (ArrayList<faceuser>) ff;
	}


	
	public ArrayList<faceuser> searchprofiledoa(faceuser fu) {
		/*ArrayList<faceuser> stl= new ArrayList<faceuser>();
		faceuser st1=null;
		
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shubham","root","Shubham@1");
					PreparedStatement ps=con.prepareStatement("select * from subhamfacebookuser where name=?");
					
					ps.setString(1, fu.getName());
					ResultSet res=ps.executeQuery();
	
					
					while(res.next()) 
					{
					   st1 = new faceuser(); 
					   
					   String n = res.getString(1);
					   String e = res.getString(2);
					   String p = res.getString(3);
					  
					   
					   st1.setName(n);
					   st1.setEmail(e);
					   st1.setPassword(p);
					  
					   stl.add(st1);
					}
				}
				
				catch(Exception e) {
					e.printStackTrace();
				}
				return stl;*/
			
				SessionFactory sf=new Configuration().configure().buildSessionFactory();
				Session ss=sf.openSession();
				Query q=ss.createQuery("from com.faceweb.enity.faceuser f where f.name=:name");;//select * from myfacebookuser f where f.email=? and f.password=?
				q.setParameter("name", fu.getName());
				
				List<faceuser>ff=q.getResultList();
				return (ArrayList<faceuser>) ff;
	}
			
	

	
	public int checkemaildoa(faceuser fu) {
		int i =0;
		/*try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/userdata","root","Shubham@1");
			PreparedStatement ps=con.prepareStatement("select * from  userdata where email=?");
			ps.setString(1,fu.getEmail());
			
			
			
			ResultSet  res = ps.executeQuery();
			if (res.next()) {
				i=1;
			}
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}*/
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session ss=sf.openSession();
		
		
		
		Query q=ss.createQuery("from com.faceweb.enity.faceuser f where f.email=:em");
		q.setParameter("em",fu.getEmail());
		
	
		
		return i;
	}


	
	public List<country> loadcountrydoa() {
		 List<country> ff = new ArrayList();
		
		/*try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/userdata","root","Shubham@1");
			PreparedStatement ps=con.prepareStatement("select * from counties");
			
			
			ResultSet res=ps.executeQuery();

			while(res.next()) {
				country ff1=new country();
				ff1.setId(res.getInt(1));
				ff1.setName(res.getString(2));
				
				ff.add(ff1);
		}
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}*/
		 
		 	SessionFactory sf=new Configuration().configure().buildSessionFactory();
			Session ss=sf.openSession();
			Query q=ss.createQuery("from com.faceweb.enity.country");
			ff = q.getResultList();
		
			return ff;

	}


	public String friendrequestdoa(friendlist f1) {
		String ss1 = null;
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session ss=sf.openSession();
		EntityTransaction et=ss.getTransaction();
		et.begin();
		
			ss.save(f1);
	
	et.commit();
	ss1 ="scesss";
	return ss1;
	}
	
	
	
	public ArrayList<friendlist> friendlistsdoa() {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session ss=sf.openSession();
		Query q=ss.createQuery("from com.faceweb.enity.friendlist");
		
		
		ArrayList<friendlist>ff11= (ArrayList<friendlist>) q.getResultList();
		return ff11;
	}


	/*public List<faceuser> friendlistdoa() {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session ss=sf.openSession();
		Query q=ss.createQuery("from com.faceweb.enity.friendlist f1 where f1.f1=:em");
		q.setParameter("em", f1.getF1());
		
		List<faceuser>ff1=q.getResultList();
		return ff1;
	}*/

	


	public String acceptrequestdoa(friendlist f1) {
		String ss1 = null;
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session ss=sf.openSession();
		Query q=ss.createQuery("from com.faceweb.enity.friendlist f1 where f1.f1=:em");;//select * from myfacebookuser f where f.email=? and f.password=?
		q.setParameter("em", f1.getF1());
		
		//ss1 = q.getResultList();
		
		return ss1;
		
	}


	/*public ArrayList<friendlist> friendlistdoa(friendlist f1) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session ss=sf.openSession();
		Query q=ss.createQuery("from com.faceweb.enity.friendlist f1 where f1.f1=:em");
		q.setParameter("em", f1.getF1());
		
		List<friendlist>ff=q.getResultList();
		return (ArrayList<friendlist>) ff;

	}*/


	
	public ArrayList<friendlist> friendslistdoa(friendlist f1) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session ss=sf.openSession();
		Query q=ss.createQuery("from com.faceweb.enity.friendlist f1 where f1.f1=:em ");
		q.setParameter("em", f1.getF1());
		q.setParameter("inactive", f1.getStatus());
		
		List<friendlist>ff=q.getResultList();
		return (ArrayList<friendlist>) ff;
	}


	public ArrayList<friendlist> acceptfriendsdoa(friendlist f1) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session ss=sf.openSession();
		Query q=ss.createQuery("from com.faceweb.enity.friendlist f1 where f1.f1=:em and f1.status=:inactive");
		
		q.setParameter("em", f1.getF1());
		q.setParameter("inactive", f1.getStatus());
		List<friendlist>ff=q.getResultList();
		return (ArrayList<friendlist>) ff;
	}


	public String confirmrequestdoa(friendlist f1) {
		String ss1 = null;
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session ss=sf.openSession();
		EntityTransaction et=ss.getTransaction();
		et.begin();
		Query q=ss.createQuery("update com.faceweb.enity.friendlist f1 set f1.status=:confirm  where f1.f1=:em  and f1.receiverfrinend=:rm");
		q.setParameter("confirm", f1.getStatus());
		q.setParameter("em", f1.getF1());
		q.setParameter("rm", f1.getReceiverfrinend());
		int i = q.executeUpdate();
		et.commit();
		if(i>0) {
			
			ss1="updated";
		}
		return ss1;
	}


	public int deletefriendRequestdoa(friendlist f1) {
		int i=0;
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session ss=sf.openSession();
		EntityTransaction et=ss.getTransaction();
		et.begin();
		Query q=ss.createQuery("delete from com.faceweb.enity.friendlist f1 where  f1.f1=:em and f1.receiverfrinend=:rm");
		q.setParameter("rm", f1.getReceiverfrinend());
		q.setParameter("em", f1.getF1());
		
		int deletedCount = q.executeUpdate();
		et.commit();
		
		return deletedCount;
		}

			



	public ArrayList<friendlist> realfriendslistdoa(friendlist f1) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session ss=sf.openSession();
		Query q=ss.createQuery("from com.faceweb.enity.friendlist f1 where f1.f1=:em and f1.status=:confirm");
		q.setParameter("em", f1.getF1());
		q.setParameter("confirm", f1.getStatus());
		List<friendlist>ff=q.getResultList();
		return (ArrayList<friendlist>) ff;
	}
	




	


	



	

	

	}

   

