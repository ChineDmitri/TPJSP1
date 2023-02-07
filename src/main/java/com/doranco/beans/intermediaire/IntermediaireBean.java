package com.doranco.beans.intermediaire;

import java.util.ArrayList;
import java.util.List;
import com.doranco.beans.resume.ResumeBean;

public class IntermediaireBean {
	public static List<ResumeBean> listResume = new ArrayList<ResumeBean>();

	public IntermediaireBean() {
		// TODO Auto-generated constructor stub
	}

	public static void addResume(ResumeBean resume) {
		listResume.add(resume);
	}

	public static void getAllResume() {
		for (ResumeBean resume : IntermediaireBean.listResume) {
			System.out.print(resume.getPlat() + " | ");
		}
	}

	public List<ResumeBean> getAllResumeForJSP() {
		return IntermediaireBean.listResume;
	}
}
