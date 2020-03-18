package org.okboom.reksai.dht.metadata.domain;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@ToString
public class Node implements Serializable {

	/**
	 * id
	 */
	private int nid;
	/**
	 * 父id
	 */
	private int pid;
	/**
	 * 文件名
	 */
	private String filename = "";
	/**
	 * 文件大小
	 */
	private Long fileSize;

	private int index;

	private List<Node> children;
	
	public void addChild(Node node) {
		if (children == null) {
			children = new ArrayList<>();
		}
		children.add(node);
	}

	public Node(int nid, int pid) {
		super();
		this.nid = nid;
		this.pid = pid;
	}
	
	public Node(int nid, int pid, String filename, Long filesize, int index) {
		super();
		this.nid = nid;
		this.pid = pid;
		this.filename = filename;
		this.fileSize = filesize;
		this.index = index;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((filename == null) ? 0 : filename.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Node other = (Node) obj;
		if (filename == null) {
			if (other.filename != null)
				return false;
		} else if (!filename.equals(other.filename)) {
			return false;
		}
		return true;
	}
}
