package org.okboom.reksai.transfer.util;




import org.okboom.reksai.transfer.domain.FileNode;

import java.util.List;

/**
 *
 */
public class TreeUtil {

	public static FileNode createTree(List<FileNode> nodes) {
		FileNode root = new FileNode(0, -1);
		nodes.forEach(node -> {
			if(node.getPid() == root.getNid()) {
				root.addChild(node);
			} else {
				FileNode parent = findParent(root, node.getPid());
				if (parent != null) {
					parent.addChild(node);
				}
			}
		});
		return root;
	}
	
	private static FileNode findParent(FileNode node, int pid) {
		FileNode result = null;
		for (FileNode n : node.getChildren()) {
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
