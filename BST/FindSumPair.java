package com.nitin.bst;

import java.util.HashSet;

public class FindSumPair {
	
	public Node insert(Node root,int key)
	{
		if (root == null)
			return new Node(key);
		if (key < root.data) 
			root. left = insert (root. left, key);
		else
			root.right = insert(root.right, key);
		return root;

	}
	public boolean findpairUtil1 (Node root, int sum,HashSet<Integer> set)
	{
		if (root == null)
			return false;

		if (findpairUtil1(root.left, sum, set))
			return true;
		if (set.contains(sum - root.data)) { 
			System.out.println("Pair is found (" 
					+(sum- root.data) + ","
							+ root.data + ")"); 
			return true;
		}
		else
			set.add(root.data); 
		return findpairUtil1(root.right, sum, set);
	}
	public void findPairWithGivenSum (Node root, int sum)
	{
		HashSet<Integer> set = new HashSet<Integer>();
		if (!findpairUtil1(root, sum, set))
			System.out.print ("Pairs do not exit" + "\n"); findpairUtil1(root, sum, set);


	}
	
	}
