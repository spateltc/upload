package com.deloitte.twb.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.deloitte.twb.bean.PDefectsFinal;
import com.deloitte.twb.bean.PcommentsBean;
import com.deloitte.twb.dao.PcommentsDao;


@Repository
public class PcommentsDaoImpl  implements PcommentsDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List getCommentDetails(String planName) throws Exception {
		Session currentSession = this.sessionFactory.getCurrentSession();
		String hql = "select r.firstName||' '||r.lastName , p.createdOn , p.comments , p.id from PcommentsBean p,PresourcesBean r where p.planName = :pName and p.userName = r.userName and p.taskId is null order by p.createdOn desc ";
		Query query = currentSession.createQuery(hql);
		query.setParameter("pName", planName);
	//	List resultList = new ArrayList();
	//	resultList = query.list();
		return  query.list();
	}
	
	
	
	/**
	 * 	Author: Shasahank
	 *	Description: Update and Insert to CommentDetails   
	 */
	
	@Override
	@Transactional
	public void insertUpdateCommentDetails(PcommentsBean pcommentsBean)throws Exception{
		Session currentSession = this.sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(pcommentsBean);
	}

}
