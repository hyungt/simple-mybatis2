package com.sample.todo.vo;

public class Todo {

	private Long no;
	private String title;
	private String dates;
	private String contents;
	private String completed;
	private String deleted;
	
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDates() {
		return dates;
	}
	public void setDates(String dates) {
		this.dates = dates;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getCompleted() {
		return completed;
	}
	public void setCompleted(String completed) {
		this.completed = completed;
	}
	public String getDeleted() {
		return deleted;
	}
	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	@Override
	public String toString() {
		return "Todo [no=" + no + ", title=" + title + ", dates=" + dates + ", contents=" + contents + ", completed="
				+ completed + ", deleted=" + deleted + "]";
	}
}
