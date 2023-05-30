package com.faceweb.service;

import java.util.ArrayList;
import java.util.List;

import com.faceweb.doa.facedoa;
import com.faceweb.doa.facedoafactory;
import com.faceweb.doa.facedoainterface;
import com.faceweb.enity.country;
import com.faceweb.enity.faceuser;
import com.faceweb.enity.friendlist;
import com.faceweb.service.faceserviceinterface;

public class faceserivce implements faceserviceinterface {

	public int regsuserservice(faceuser fu) {
		facedoainterface fd = facedoafactory.creatObject();
		return fd.regsuserdoa(fu);
	}


	public int loginuserservice(faceuser fu) {
		facedoainterface fd = facedoafactory.creatObject();
		return fd.loginuserdoa(fu);
	}


	public int deleteuserservice(faceuser fu) {
		facedoainterface fd = facedoafactory.creatObject();
		return fd.deleteuserdoa(fu);
	}

	
	public int edituserservice(faceuser fu) {
		facedoainterface fd = facedoafactory.creatObject();
		return fd.edituserdoa(fu);
	}

	
	public ArrayList<faceuser> viewallprofileservice() {
		facedoainterface fd = facedoafactory.creatObject();
		ArrayList<faceuser> fv = fd.viewallprofiledoa();
		return fv;
	}


	public ArrayList<faceuser> searchprofileService(faceuser fu) {
		facedoainterface fd = facedoafactory.creatObject();
		ArrayList<faceuser> fv = fd.searchprofiledoa(fu);
		return fv;
	}


	public int checkemailservice(faceuser fu) {
		facedoainterface fd = facedoafactory.creatObject();
		return fd.checkemaildoa(fu);
	}

	
	public List<country> loadcountryservice() {
		facedoainterface fd = facedoafactory.creatObject();
		return fd.loadcountrydoa();
	}


	public String friendrequestserservice(friendlist f1) {
		facedoainterface fd = facedoafactory.creatObject();
		return fd.friendrequestdoa(f1);
	}




	public ArrayList<friendlist> acceptrequestserservice(friendlist f1) {
		facedoainterface fd = facedoafactory.creatObject();
		ArrayList<friendlist> fv = fd.acceptfriendsdoa(f1);
		return fv;
	}



	


	

	public ArrayList<friendlist> friendlistservice1(friendlist f1) {
		facedoainterface fd = facedoafactory.creatObject();
		ArrayList<friendlist> fv = fd.friendslistdoa(f1);
		return fv;
	}


	public ArrayList<friendlist> friendlisteservice(friendlist f1) {
		// TODO Auto-generated method stub
		return null;
	}


	public String confirmfriendserservice(friendlist f1) {
		facedoainterface fd = facedoafactory.creatObject();
		return fd.confirmrequestdoa(f1);
	}


	public int deletefriendRequestservice(friendlist f1) {
		facedoainterface fd = facedoafactory.creatObject();
		return fd.deletefriendRequestdoa(f1);
	}


	public ArrayList<friendlist> realfriendservice(friendlist f1) {
		facedoainterface fd = facedoafactory.creatObject();
		ArrayList<friendlist> fv = fd.realfriendslistdoa(f1);
		return fv;
	}


	


	


	




	
	

}
