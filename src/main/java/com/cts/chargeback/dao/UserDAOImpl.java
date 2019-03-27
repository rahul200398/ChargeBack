package com.cts.chargeback.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.chargeback.entity.User;


import javassist.compiler.ast.Symbol;

@Repository("userDAO")
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("In DAO");
		sessionFactory.getCurrentSession().save(user);
		/*Session session=sessionFactory.getCurrentSession();
	String userID="fdbgvdf";
	User user1=session.get(User.class, userID);
	System.out.println(user1);
		*/
		
		
	}

	


}
