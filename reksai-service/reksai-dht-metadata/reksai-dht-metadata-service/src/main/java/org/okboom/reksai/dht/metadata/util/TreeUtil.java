package org.okboom.reksai.dht.metadata.util;


import org.okboom.reksai.dht.metadata.domain.Node;

import java.util.List;

/**
 *
 */
public class TreeUtil {

	public static Node createTree(List<Node> nodes) {
		Node root = new Node(0, -1);
		nodes.forEach(node -> {
			if(node.getPid() == root.getNid()) {
				root.addChild(node);
			} else {
				Node parent = findParent(root, node.getPid());
				if (parent != null) {
					parent.addChild(node);
				}
			}
		});
		return root;
	}
	
	private static Node findParent(Node node, int pid) {
		Node result = null;
		for (Node n : node.getChildren()) {
			if (n.getNid() == pid) {
				return n;
			} else {
				//递归搜索
				if (n.getChildren() != null) {
					result = findParent(n, pid);
				}
			}
		}
		return result;
	}
}
