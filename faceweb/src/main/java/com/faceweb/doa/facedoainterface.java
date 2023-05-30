package com.faceweb.doa;

import java.util.ArrayList;
import java.util.List;

import com.faceweb.enity.country;
import com.faceweb.enity.faceuser;
import com.faceweb.enity.friendlist;


public interface facedoainterface {

	int regsuserdoa(faceuser fu);

	

	int loginuserdoa(faceuser fu);



	int deleteuserdoa(faceuser fu);



	int edituserdoa(faceuser fu);



	ArrayList<faceuser> viewallprofiledoa();





	ArrayList<faceuser> searchprofiledoa(faceuser fu);



	int checkemaildoa(faceuser fu);



	List<country> loadcountrydoa();



	String friendrequestdoa(friendlist f1);







	String acceptrequestdoa(friendlist f1);





	ArrayList<friendlist> friendslistdoa(friendlist f1);



	ArrayList<friendlist> acceptfriendsdoa(friendlist f1);



	String confirmrequestdoa(friendlist f1);



	int deletefriendRequestdoa(friendlist f1);



	ArrayList<friendlist> realfriendslistdoa(friendlist f1);



	
	



}
