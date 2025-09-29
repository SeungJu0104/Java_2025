package ch15.sec02.exam01;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Board {
	private String subject;
	private String content;
	private String writer;
//
//	public Board(String subject, String content, String writer) { // 게시글 생성
//		this.subject = subject;
//		this.content = content;
//		this.writer = writer;
//	}
//
//	public String getSubject() { return subject; }
//	public void setSubject(String subject) { this.subject = subject; }
//	public String getContent() { return content; }
//	public void setContent(String content) { this.content = content; }
//	public String getWriter() { return writer; }
//	public void setWriter(String writer) { this.writer = writer; }
	
	public  void print() {
		System.out.println(this.subject + "\t" + this.content + "\t" + this.writer);
	}
}