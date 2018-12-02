package com.learnfromexamples.access;

import com.learnfromexamples.accessspecfiers.FBprofile;

public class DifferentPackageAccessSpecifierApp {
	public static void main(String[] args) {
		FBprofile bprofile = new FBprofile();
		bprofile.getSchool();
	}
}
