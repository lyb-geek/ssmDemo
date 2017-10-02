package com.ssm.demo.common.model;

import java.io.Serializable;

public class PageResult<T> implements Serializable {

	private static final long serialVersionUID = 3120191790566079357L;
	public static final int PAGE_SIZE = 20;
	private int currentPage;
	private int size = PAGE_SIZE;
	private int count;
	private int allCount;
	private T data;

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getAllCount() {
		return allCount;
	}

	public void setAllCount(int allCount) {
		this.allCount = allCount;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
