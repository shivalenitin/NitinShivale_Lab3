package com.nitin.driver;

import com.nitin.bst.FindSumPair;
import com.nitin.bst.Node;

public class Driver {

	public static void main(String[] args) {
		
		int sum =130;
		
		Node root = null;
		FindSumPair fsp = new FindSumPair();
		root = fsp.insert(root,40);
		root = fsp.insert(root,20);
		root = fsp.insert(root,60);
		root = fsp.insert(root,10);
		root = fsp.insert(root,30);
		root = fsp.insert(root,50);
		root = fsp.insert(root,70);
		fsp.findPairWithGivenSum(root,sum);
	}

}
