package com.ustglobal.lms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.lms.dao.LibrarianDAO;
import com.ustglobal.lms.dto.BookBean;
import com.ustglobal.lms.dto.LibrarianBean;
import com.ustglobal.lms.dto.StudentBean;
import com.ustglobal.lms.dto.TransactionBean;

@Service
public class LibrarianServiceImpl implements LibrarianService {

	@Autowired
	private LibrarianDAO dao;
	
	
	@Override
	public boolean addBook(BookBean bean) {
		return dao.addBook(bean);
	}

	@Override
	public boolean updateBook(BookBean bean) {
		return false;
	}

	@Override
	public LibrarianBean loginLibrarian(int lid, String lpassword) {
		return dao.loginLibrarian(lid, lpassword);
	}

	@Override
	public List<TransactionBean> getAllReceivedRequestedBook() {
		return dao.getAllReceivedRequestedBook();
	}

	@Override
	public int actionOnRequestedBook(int tid, int sValue, int bid) {
		return dao.actionOnRequestedBook(tid, sValue, bid);
	}

	@Override
	public List<TransactionBean> getAllApprovedRejectedBook() {
		return dao.getAllApprovedRejectedBook();
	}

}
