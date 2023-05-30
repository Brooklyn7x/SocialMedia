package com.faceweb.service;

import java.util.ArrayList;
import java.util.List;

import com.faceweb.enity.country;
import com.faceweb.enity.faceuser;
import com.faceweb.enity.friendlist;


public interface faceserviceinterface {

	int regsuserservice(faceuser fu);

	int loginuserservice(faceuser fu);

	int deleteuserservice(faceuser fu);

	int edituserservice(faceuser fu);

	ArrayList<faceuser> viewallprofileservice();

	ArrayList<faceuser> searchprofileService(faceuser fu);

	int checkemailservice(faceuser fu);

	List<country> loadcountryservice();

	String friendrequestserservice(friendlist f1);


	ArrayList<friendlist> acceptrequestserservice(friendlist f1);


	ArrayList<friendlist> friendlistservice1(friendlist f1);

	String confirmfriendserservice(friendlist f1);

	int deletefriendRequestservice(friendlist f1);

	ArrayList<friendlist> realfriendservice(friendlist f1);

	

	

}
