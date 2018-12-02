package com.learnfromexamples.accessspecfiers;

import com.learnfromexamples.accessspecfiers.FBprofile;

public class SamePackageAccessSpecifierApp {
	public static void main(String[] args) {
		FBprofile bprofile = new FBprofile();
		bprofile.getSchool();
		bprofile.getEmailId();
		bprofile.getEmployerName();
	}
}
